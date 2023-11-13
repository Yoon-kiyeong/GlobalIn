package com.boardone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {

	private static BoardDAO instance = null;

	private BoardDAO() {
	}

	public static BoardDAO getInstance() {
		if (instance == null) {
			synchronized (BoardDAO.class) {
				instance = new BoardDAO();
			}
		}
		return instance;
	}

	// 이곳에 게시판 작업에 필요한 기능을 하나하나 메소드로 작성해서 추가해 나가면 됨
	// 실제 데이터베이스에 글을 추가하는 메소드 구현
	public void insertArticle(BoardVO article) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int num = article.getNum();
		int ref = article.getRef();
		int step = article.getStep();
		int depth = article.getDepth();

		int number = 0;
		String sql = "";

		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement("select max(num) from board");
			rs = pstmt.executeQuery();

			if (rs.next())
				number = rs.getInt(1) + 1;
			else
				number = 1;

			if (num != 0) { // 답변글인 경우
				sql = "update board set step = step + 1 where ref =? and step > ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, ref);
				pstmt.setInt(2, step);
				pstmt.executeUpdate();

				step = step + 1;
				depth = depth + 1;
			} else { // 새 글일 경우
				ref = number;
				step = 0;
				depth = 0;
			}
			// 글을 추가하는 쿼리문 작성
			sql = "insert into board(num,writer,email,subject,pass,regdate,ref,step,depth,content,ip) values(board_seq.nextval,?,?,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, article.getWriter());
			pstmt.setString(2, article.getEmail());
			pstmt.setString(3, article.getSubject());
			pstmt.setString(4, article.getPass());
			pstmt.setTimestamp(5, article.getRegdate());
			pstmt.setInt(6, article.getRef());
			pstmt.setInt(7, article.getStep());
			pstmt.setInt(8, article.getDepth());
			pstmt.setString(9, article.getContent());
			pstmt.setString(10, article.getIp());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	} // endinsertArticle

	// 전체 글의 개수를 가져올 메소드를 BoardDAO에 메소드 추가 구현
	public int getArticleCount() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = 0;

		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement("select count(*) from board");
			rs = pstmt.executeQuery();

			if (rs.next()) {
				x = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return x;
	} // end getArticleCount

	/*
	 * Board table에서 데이터를 가져올 메소드 구현 전체 목록을 가져와야 하므로 List에 저장됨
	 */

	public List<BoardVO> getArticle(int start, int end) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardVO> articleList = null;

		try {
			con = ConnUtil.getConnection();
//			pstmt = con.prepareStatement("select * from board order by num desc");
			String sql = 
				"select * from (select rownum rnum, num, writer, email, subject, "
				+ "pass, regdate, readcount, ref, step, depth, content, ip "
				+ "from (select * from board order by ref desc, step asc)) "
				+ "where rnum >= ? and rnum <= ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				articleList = new ArrayList<BoardVO>(end-start + 1);
			}
			do {
				BoardVO article = new BoardVO();
				article.setNum(rs.getInt("num"));
				article.setWriter(rs.getString("writer"));
				article.setEmail(rs.getString("email"));
				article.setSubject(rs.getString("subject"));
				article.setPass(rs.getString("pass"));
				article.setRegdate(rs.getTimestamp("regdate"));
				article.setReadcount(rs.getInt("readcount"));
				article.setRef(rs.getInt("ref"));
				article.setStep(rs.getInt("step"));
				article.setDepth(rs.getInt("depth"));
				article.setContent(rs.getString("content"));
				article.setIp(rs.getString("ip"));
				articleList.add(article);
			} while (rs.next());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return articleList;
	} // end getArticels

	/*
	 * 글 상세보기 list.jsp에서 글 제목을 클릭하면 글 내용을 보여주는 작업을 수행한다.
	 * 
	 * 글의 번호를 매개변수로 해서 하나의 글을 가져와서 세부정보를 보여줘야함 데이터베이스에서 글 하나의 정보를 가져오는 메소드를 구현
	 */

	public BoardVO getArticle(int num) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVO article = null;
		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement("update board set readcount = readcount + 1 where num=?");
			pstmt.setInt(1, num);
			pstmt.executeUpdate();

			pstmt = con.prepareStatement("select * from board where num = ?");
			pstmt.setInt(1, num);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				article = new BoardVO();
				article.setNum(rs.getInt("num"));
				article.setWriter(rs.getString("writer"));
				article.setEmail(rs.getString("email"));
				article.setSubject(rs.getString("subject"));
				article.setPass(rs.getString("pass"));
				article.setRegdate(rs.getTimestamp("regdate"));
				article.setReadcount(rs.getInt("readcount"));
				article.setRef(rs.getInt("ref"));
				article.setStep(rs.getInt("step"));
				article.setDepth(rs.getInt("depth"));
				article.setContent(rs.getString("content"));
				article.setIp(rs.getString("ip"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return article;
	} // end BoardVO getArticle

	/*
	 * 글 상세보기 화면에서 글 수정 버튼을 클릭했을 경우 updateForm.jsp 페이지로 이동하도록 링크되어 있음, 그래서 우선적으로 글
	 * 수정화면이 필요함 글 수정시에는 글 목록 보기와 다르게 조회수를 증가시킬 필요가 없음 그러므로, 조회수 증가를 제외한 글 번호에 대한
	 * 게시글만 가져오는 메소드를 구현함
	 * 
	 */

	public BoardVO updateGetArticle(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVO article = null;

		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement("select * from board where num =?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				article = new BoardVO();
				article.setNum(rs.getInt("num"));
				article.setWriter(rs.getString("writer"));
				article.setEmail(rs.getString("email"));
				article.setSubject(rs.getString("subject"));
				article.setPass(rs.getString("pass"));
				article.setRegdate(rs.getTimestamp("regdate"));
				article.setReadcount(rs.getInt("readcount"));
				article.setRef(rs.getInt("ref"));
				article.setStep(rs.getInt("step"));
				article.setDepth(rs.getInt("depth"));
				article.setContent(rs.getString("content"));
				article.setIp(rs.getString("ip"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return article;
	} // end updateGetArticle

	/*
	 * updateForm.jsp 페이지에서 비밀번호를 입력하고 글 수정을 클릭하면 데이터베이스에 있는 실제 글이 수정되어야 함 그러므로
	 * BoardDAO에 글 수정을 처리해 줄 메소드를 구현하면 됨
	 */
	
	public int updateArticle(BoardVO article) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String dbPassword = "";
		String sql = "";

		int result = -1;

		try {
			con = ConnUtil.getConnection();

			pstmt = con.prepareStatement("select pass from board where num =?");
			pstmt.setInt(1, article.getNum());

			rs = pstmt.executeQuery();

			if (rs.next()) {
				dbPassword = rs.getString("pass");
				if (dbPassword.equals(article.getPass())) { // 비밀번호가 일치하면 수정
					// 게시글 수정
					// 작성자, 제목, 이메일, 내용을 수정하면 됨
					// 글 번호를 조건으로
					sql = "update board set writer=?, email=?, subject=?, content=? where num=?";

					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, article.getWriter());

					pstmt.setString(2, article.getEmail());
					pstmt.setString(3, article.getSubject());
					pstmt.setString(4, article.getContent());
					pstmt.setInt(5, article.getNum());
					pstmt.executeUpdate();
					result = 1; // 수정 성공
				} else {
					result = 0; // 수정 실패
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
	/* 글 삭제 처리
	 * 글 삭제 처리 화면이 나오면 비밀번호를 입력하고, 글 삭제를 수행함
	 * 이때 데이터베이스에 저장되어 있는 비밀번호와 입력한 비밀번호를 비교하여 맞으면 삭제처리를 수행하는 메소드 구현
	 */
	
	public int deleteArticle(int num, String pass) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String dbpasswd="";
		
		int result = -1;
		
		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement("select pass from board where num =?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dbpasswd = rs.getString("pass");
				if(dbpasswd.equals(pass)) {
					pstmt = con.prepareStatement("delete from board where num=?");
					pstmt.setInt(1, num);
					pstmt.executeUpdate();
					result = 1;
				} else {
					result = 0;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	} // end deleteArticle
	
	// 검색한 내용이 몇개인지를 반환하는 메소드(what(검색조건), content(검색내용))
	public int getArticleCount(String what, String content) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = 0;

		try {
			con = ConnUtil.getConnection();
//			pstmt = con.prepareStatement("select count(*) from board");
			pstmt = con.prepareStatement("select count(*) from board where " + what + " like '%" + content + "%'");
			rs = pstmt.executeQuery();

			if (rs.next()) {
				x = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return x;
	} // end getArticleCount
	
	public List<BoardVO> getArticle(int start, int end, String what, String content) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardVO> articleList = null;

		try {
			con = ConnUtil.getConnection();
//			pstmt = con.prepareStatement("select * from board order by num desc");
//			String sql = 
//				"select * from (select rownum rnum, num, writer, email, subject, "
//				+ "pass, regdate, readcount, ref, step, depth, content, ip "
//				+ "from (select * from board order by ref desc, step asc)) "
//				+ "where rnum >= ? and rnum <= ? ";
			
			String sql = 
					"select * from (select rownum rnum, num, writer, email, subject, "
					+ "pass, regdate, readcount, ref, step, depth, content, ip "
					+ "from (select * from board where " + what + " like '%" + content + "%' order by ref desc, step asc)) "
					+ "where rnum >= ? and rnum <= ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				articleList = new ArrayList<BoardVO>(end-start + 1);
			}
			do {
				BoardVO article = new BoardVO();
				article.setNum(rs.getInt("num"));
				article.setWriter(rs.getString("writer"));
				article.setEmail(rs.getString("email"));
				article.setSubject(rs.getString("subject"));
				article.setPass(rs.getString("pass"));
				article.setRegdate(rs.getTimestamp("regdate"));
				article.setReadcount(rs.getInt("readcount"));
				article.setRef(rs.getInt("ref"));
				article.setStep(rs.getInt("step"));
				article.setDepth(rs.getInt("depth"));
				article.setContent(rs.getString("content"));
				article.setIp(rs.getString("ip"));
				articleList.add(article);
			} while (rs.next());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return articleList;
	} // end getArticels
}
