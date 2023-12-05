package com.globalin.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.globalin.biz.board.BoardVO;
import com.globalin.biz.board.impl.BoardDAO;

@Controller
public class GetBoardController {

//	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO dao, ModelAndView mav) {

		System.out.println("글 상세보기 처리");

		mav.addObject("board", dao.getBoard(vo)); // model 정보 저장
		mav.setViewName("getBoard.jsp"); // view 정보 저장
		return mav;
	}

}
