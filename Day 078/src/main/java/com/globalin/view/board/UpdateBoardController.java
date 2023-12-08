package com.globalin.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.globalin.biz.board.BoardVO;
import com.globalin.biz.board.impl.BoardDAO;

@Controller
public class UpdateBoardController {

//	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO dao) {
		System.out.println("글 수정 처리");

		dao.updateBoard(vo);

		return "getBoardList.do";
	}

}
