package com.globalin.view.shine;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.globalin.biz.shine.BoardVO;
import com.globalin.biz.shine.impl.BoardDAO;

@Controller
public class DeleteBoardController {

//	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO dao) {
		System.out.println("글 삭제 처리");

		dao.deleteBoard(vo);
		return "getBoardList.do";
	}

}
