package du.board2.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import du.board.domain.BoardVO;
import du.board2.domain.Board2VO;
import du.board2.service.Board2Service;
import du.common.Pagination;
import du.reply.domain.ReplyVO;

@Controller
public class Board2Controller {
	
	@Autowired
	private Board2Service board2Service;
	
//	@RequestMapping("/board2ListPage.do")
//	public ModelAndView board2ListPage(
//			@RequestParam(required = false, defaultValue = "1") int page,
//			@RequestParam(required = false, defaultValue = "1") int range,
//			@RequestParam(required = false, defaultValue = "") String title) 
//		{ModelAndView mav = new ModelAndView("board2/board2List.jsp");
//		
//		int listCnt = board2Service.selectBoard2ListCnt(title);
//		
//		Pagination pagination = new Pagination();
//		pagination.pageInfo(page, range, listCnt);
//		mav.addObject("pagination", pagination);
//		
//		List<Board2VO> boardList = board2Service.selectBoard2List(pagination, title);
//		List<Board2VO> board2List = board2Service.selectBoard2List();
//		mav.addObject("board2List", board2List);
//		
//		mav.addObject("title", title);
//		
//		return mav;
//	}
	@RequestMapping("/board2ListPage.do")
	public ModelAndView board2ListPage(
			@RequestParam(required = false, defaultValue = "1") int page,
			@RequestParam(required = false, defaultValue = "1") int range,
			@RequestParam(required = false, defaultValue = "") String title) {
		ModelAndView mav = new ModelAndView("board2/board2List.jsp");
		
		int listCnt = board2Service.selectBoard2ListCnt(title);
		
		Pagination pagination = new Pagination();
		pagination.pageInfo(page, range, listCnt);
		mav.addObject("pagination", pagination);
		
		List<Board2VO> board2List = board2Service.selectBoard2List(pagination,title);
		mav.addObject("board2List", board2List);
		
		mav.addObject("title", title);
		
		return mav;
	}
	@RequestMapping("/board2WritePage.do")
	public String board2WritePage(HttpSession session) {
		if(session.getAttribute("USER") != null) {
		return "board2/board2Write.jsp";
		}
		return "main.jsp";
	}
	@RequestMapping("/board2Write.do")
	public String board2Write(HttpSession session, @ModelAttribute Board2VO board2) throws Exception {
		board2Service.insertBoard2(board2, session);
		
		return "redirect:/board2ListPage.do";
	}
	@RequestMapping("/board2InfoPage/{idx}.do")
	public ModelAndView board2InfoPage(@PathVariable("idx") long idx) {
		
		System.out.println(idx);
		ModelAndView mav = new ModelAndView("board2/board2Info.jsp");
		
		Board2VO board2 = board2Service.selectBoard2(idx);
		mav.addObject("board2", board2);
	
		return mav;
	}
}
