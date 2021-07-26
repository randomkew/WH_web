package du.board2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import du.board2.domain.Board2VO;
import du.board2.service.Board2Service;
import du.common.Pagination;

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
	public ModelAndView board2ListPage(){
		System.out.println("----------------------------");
		ModelAndView mav = new ModelAndView("board2/board2List.jsp");
		
		List<Board2VO> board2List = board2Service.selectBoard2List();
		mav.addObject("board2List", board2List);
		
		return mav;
	}

}
