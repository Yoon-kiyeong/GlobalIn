package com.globalin.view.board;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.globalin.biz.board.BoardVO;
import com.globalin.biz.board.impl.BoardDAO;

@Controller
@SessionAttributes("board")
public class BoardController {

	// 검색 조건 설정
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");

		return conditionMap;
	}

	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO dao) {
		System.out.println("글 등록 처리");

		dao.insertBoard(vo);

		return "getBoardList.do";
	}

	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board")BoardVO vo, BoardDAO dao, Model model) {
		System.out.println("글 수정 처리");
		System.out.println("번호 : " + vo.getSeq());
		System.out.println("제목 : " + vo.getTitle());
		System.out.println("작성자 이름 : " + vo.getWriter());
		System.out.println("내용 : " + vo.getContent());
		System.out.println("작성일 : " + vo.getRegDate());
		System.out.println("조회수 : " + vo.getCnt());
		dao.updateBoard(vo);

		return "getBoardList.do";
	}

	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO dao) {
		System.out.println("글 삭제 처리");

		dao.deleteBoard(vo);
		return "getBoardList.do";
	}

	@RequestMapping("getBoard.do")
//	public ModelAndView getBoard(BoardVO vo, BoardDAO dao, ModelAndView mav) { // 반환형을 통일시키기 위해 String으로 변경
	public String getBoard(BoardVO vo, BoardDAO dao, Model model) {
		System.out.println("글 상세보기 처리");
		model.addAttribute("board", dao.getBoard(vo));
		return "getBoard.jsp";

//		mav.addObject("board", dao.getBoard(vo)); // model 정보 저장
//		mav.setViewName("getBoard.jsp"); // view 정보 저장
//		return mav;
	}
/*	public ModelAndView getBoardList(BoardVO vo, BoardDAO dao, ModelAndView mav) { // 반환형을 통일시키기 위해 String으로 변경
//	public String getBoardList(
//			@RequestParam(value = "searchCondition", defaultValue = "TITLE", required = false) String condition,
//			@RequestParam(value = "searchKeyword", defaultValue = "", required = false) String keyword, 
//			value : 화면에 전달해주는 파라미터 이름
//			defaultValue : 화면으로부터 전달될 파라미터 정보가 없을때 설정할 기본 값
//			required : 파라미터의 생략 여부 설정
//		System.out.println("검색 조건 : " + condition);
//		System.out.println("검색 단어 : " + keyword);

//			BoardVO vo,
//			BoardDAO dao, Model model) {
*/
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, BoardDAO dao, Model model) {
		System.out.println("글 목록 보기 처리");
		model.addAttribute("boardList", dao.getBoardList(vo));

		return "getBoardList.jsp";
		// DB 연동 처리
//		mav.addObject("boardList", dao.getBoardList(vo)); // model 정보 저장
//		mav.setViewName("getBoardList.jsp");
//		return mav;		
	}
}
