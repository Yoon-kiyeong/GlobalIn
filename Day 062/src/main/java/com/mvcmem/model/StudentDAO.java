package com.mvcmem.model;

import java.sql.*;
import javax.sql.*;
import com.memberone.StudentVO;
import com.memberone.ZipcodeVO;
import java.util.*;
import javax.naming.*;

public class StudentDAO {
	private static StudentDAO instance = null;
	private StudentDAO() {}
	
	public static StudentDAO getInstance() {
		if(instance == null) {
			synchronized(StudentDAO.class) {
				instance = new StudentDAO();
			}
		}
		return instance;
	}
	
	private Connection getConnection() {
		Connection con = null;
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/myoracle");
			con = ds.getConnection();
		}  catch(NamingException e) {
			System.out.println("Connection 생성 실패");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("Connection 생성 실패");
			e.printStackTrace();
		}
		return con;
	}
	
	// 입력받은 id값을 데이터베이스에 저장되어 있는 id값과 베교해서 중복이 되는지를 확인함
	public boolean idCheck(String id) {

		boolean result = true;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();
			pstmt = con.prepareStatement("select * from student where id=?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (!rs.next()) {
				result = false;
			}
		} catch (SQLException s) {
			s.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException ss) {
				}
			}

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException ss) {
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException ss) {
				}
			}
		}
		return result;
	} // end idCheck

	// 우편번호를 데이터베이스에서 검색해서 Vector에 저장해서 리턴해주는 메소드 구현
	public Vector<ZipCodeVO> zipcodeRead(String dong) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Vector<ZipCodeVO> vecList = new Vector<ZipCodeVO>();
		
		try {
			con = getConnection();
			// 동으로 검색하여 데이터 획득
			String sql ="select * from zipcode where dong  like '"+dong+"%'";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ZipCodeVO tempZipcode = new ZipCodeVO();
				tempZipcode.setZipcode(rs.getString("zipcode"));
				tempZipcode.setSido(rs.getString("sido"));
				tempZipcode.setGugun(rs.getString("gugun"));
				tempZipcode.setDong(rs.getString("dong"));
				tempZipcode.setRi(rs.getString("ri"));
				tempZipcode.setBunji(rs.getString("bunji"));
				vecList.addElement(tempZipcode);
			}
			
		}catch(SQLException s){
	    	s.printStackTrace();
	    }catch(Exception e){
	    	e.printStackTrace();
	    }finally {
	    	
	    	if(rs != null) try {rs.close();}catch(SQLException ss){}
	    	if(pstmt != null) try {pstmt.close();}catch(SQLException ss){}
	    	if(con != null) try {con.close();}catch(SQLException ss){}
	    }
		
		return vecList;
	}// end zipcodeRead

	// 회원가입 폼에서 회원가입 버튼을 누르면 실제 데이터베이스로 회원정보가 저장될 수 있는 기능을 구현
	public boolean memberInsert(StudentVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean flag = false;

		try {
			con = getConnection();
			String sql = "insert into student values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPass());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getPhone1());
			pstmt.setString(5, vo.getPhone2());
			pstmt.setString(6, vo.getPhone3());
			pstmt.setString(7, vo.getEmail());
			pstmt.setString(8, vo.getZipcode());
			pstmt.setString(9, vo.getAddress1());
			pstmt.setString(10, vo.getAddress2());

			int count = pstmt.executeUpdate();
			if (count > 0)
				flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
				}
		}
		return flag;
	} // end memberInsert

	/*
	 * 로그인 버튼을 클릭하면 데이터베이스에 저장된 id/pass와 입력된 데이터와 비교하여 같으면 성공, 다르면 로그인 실패처리를 하는 메소드
	 * 구현 정보를 비교하여 그 결과를 정수형으로 리턴 1: 로그인 성공, 0: 비밀번호 오류, -1: 아이디가 존재하지 않음
	 */
	public int loginCheck(String id, String pass) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int check = -1;

		try {
			con = getConnection();

			// DB 조회문
			String sql = "select pass from student where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				String dbPass = rs.getString("pass");

				// 사용자가 입력한 비밀번호와 데이터베이스에 저장된 비밃번호를 비교
				if (pass.equals(dbPass))
					check = 1;
				else
					check = 0;
			}
		} catch (SQLException s) {
			s.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {

				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {

				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

				}
			}
		}
		return check;
	}

	/*
	 * 정보수정 보튼을 클릭하면 현재 로그인한 회원의 정보를 수정할 수 있도록 화면에 보여줘야 함
	 * 
	 * 세션에 저장된 아이디로 회원정보를 가져오는 메소드 구현
	 * 
	 */

	public StudentVO getMember(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentVO vo = null;

		try {
			con = getConnection();
			String sql = "select * from student where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();
			if (rs.next()) { // 아이디가 회원정보가 존재한다면
				vo = new StudentVO();
				vo.setId(rs.getString("id"));
				vo.setPass(rs.getString("pass"));
				vo.setName(rs.getString("name"));
				vo.setPhone1(rs.getString("phone1"));
				vo.setPhone2(rs.getString("phone2"));
				vo.setPhone3(rs.getString("phone3"));
				vo.setEmail(rs.getString("email"));
				vo.setZipcode(rs.getString("zipcode"));
				vo.setAddress1(rs.getString("address1"));
				vo.setAddress2(rs.getString("address2"));
			}
		} catch (Exception e) {

		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {

				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {

				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

				}
			}
		}

		return vo;
	}

	/*
	 * 정보수정 버튼을 클릭하면 데이터베이스에 정보가 수정되어 저장된다.
	 * 
	 */
	public void updateMemeber(StudentVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = getConnection();
			String sql = "update student set pass=?, phone1=?, phone2=?, phone3=?, email=?, zipcode=?, address1=?, address2=? where id=?";
			// 수정 쿼리문 작성
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getPass());
			pstmt.setString(2, vo.getPhone1());
			pstmt.setString(3, vo.getPhone2());
			pstmt.setString(4, vo.getPhone3());
			pstmt.setString(5, vo.getEmail());
			pstmt.setString(6, vo.getZipcode());
			pstmt.setString(7, vo.getAddress1());
			pstmt.setString(8, vo.getAddress2());
			pstmt.setString(9, vo.getId());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {

				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

				}
			}
		}
	} // end updateMember

	/*
	 * 회원 탈퇴 회원의 비밀번호를 입력받아서 데이터베이스의 비밀번호와 일치하는지를 먼저 비교해야 함 만약 일치한다면 회원탈퇴 처리하고, 그렇지
	 * 않으면 비밀번호가 틀렸다고 알려주어야 함
	 */

	public int deleteMember(String id, String pass) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String dbPass = "";
		int result = -1; // 회원정보 등록

		try {
			con = getConnection();
			String sql = "select pass from student where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {

				dbPass = rs.getString("pass");

				if (dbPass.equals(pass)) { // 비밀번호가 일치하면
					pstmt = con.prepareStatement("delete from student where id = ?");

					pstmt.setString(1, id);
					pstmt.executeUpdate();
					result = 1; // 회원탈퇴 성공
				} else { // 비밀번호가 일치하지 않을 경우
					result = 0;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				}
			}
		}
		return result;
	}

	public boolean memberInsert(com.mvcmem.model.StudentVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean flag = false;

		try {
			con = getConnection();
			String sql = "insert into student values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPass());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getPhone1());
			pstmt.setString(5, vo.getPhone2());
			pstmt.setString(6, vo.getPhone3());
			pstmt.setString(7, vo.getEmail());
			pstmt.setString(8, vo.getZipcode());
			pstmt.setString(9, vo.getAddress1());
			pstmt.setString(10, vo.getAddress2());

			int count = pstmt.executeUpdate();
			if (count > 0)
				flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
				}
		}
		return flag;
	}
}
