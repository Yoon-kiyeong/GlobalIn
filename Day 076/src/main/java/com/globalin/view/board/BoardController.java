package com.globalin.view.board;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.globalin.biz.board.BoardService;
import com.globalin.biz.board.BoardVO;

@Controller
@SessionAttributes("board")
public class BoardController {

	@Autowired // 필요한 의존 객체의 "타입"에 해당하는 빈을 찾아 주입
	private BoardService boardService;
	
	// 검색 조건 설정
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");

		return conditionMap;
	}

	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo) throws IOException {
		System.out.println("글 등록 처리");
		MultipartFile uploadFile = vo.getUploadFile();
		
		if(!uploadFile.isEmpty()) { // isEmpty() : 파일의 존재여부 리턴 (없으면 true 리턴)
			String fileName = uploadFile.getOriginalFilename();
			uploadFile.transferTo(new File("C:\\upload/" + fileName));
		}
		boardService.insertBoard(vo);		
		return "getBoardList.do";
	}

	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board")BoardVO vo) {
//		System.out.println("글 수정 처리");
//		System.out.println("번호 : " + vo.getSeq());
//		System.out.println("제목 : " + vo.getTitle());
//		System.out.println("작성자 이름 : " + vo.getWriter());
//		System.out.println("내용 : " + vo.getContent());
//		System.out.println("작성일 : " + vo.getRegDate());
//		System.out.println("조회수 : " + vo.getCnt());
//		dao.updateBoard(vo);
		boardService.updateBoard(vo);
		return "getBoardList.do";
	}

	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		System.out.println("글 삭제 처리");

		boardService.deleteBoard(vo);
		return "getBoardList.do";
	}

	@RequestMapping("getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		System.out.println("글 상세보기 처리");
		model.addAttribute("board", boardService.getBoard(vo));
		return "getBoard.jsp";

	}
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, Model model) {
		System.out.println("글 목록 보기 처리");
		
		//null 체크
		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
		
		model.addAttribute("boardList", boardService.getBoardList(vo));

		return "getBoardList.jsp";
	}
}
