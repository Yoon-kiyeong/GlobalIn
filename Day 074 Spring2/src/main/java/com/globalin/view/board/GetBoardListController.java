package com.globalin.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.globalin.biz.board.BoardVO;
import com.globalin.biz.board.impl.BoardDAO;

@Controller
public class GetBoardListController {

//	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO dao, ModelAndView mav) {
		System.out.println("글 목록 보기 처리");

		// DB 연동 처리
		mav.addObject("boardList", dao.getBoardList(vo)); // model 정보 저장
		mav.setViewName("getBoardList.jsp");

		return mav;
	}

}
