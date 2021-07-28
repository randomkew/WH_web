package du.notice.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import du.board.domain.BoardVO;
import du.common.Pagination;
import du.notice.domain.NoticeVO;
import du.notice.service.NoticeService;
import du.reply.domain.ReplyVO;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
//	@RequestMapping("/noticeListPage.do")
//	public ModelAndView noticeListPage(
//			@RequestParam(required = false, defaultValue = "1") int page,
//			@RequestParam(required = false, defaultValue = "1") int range,
//			@RequestParam(required = false, defaultValue = "") String title) 
//		{ModelAndView mav = new ModelAndView("notice/noticeList.jsp");
//		
//		int listCnt = noticeService.selectNoticeListCnt(title);
//		
//		Pagination pagination = new Pagination();
//		pagination.pageInfo(page, range, listCnt);
//		mav.addObject("pagination", pagination);
//		
//		List<NoticeVO> boardList = noticeService.selectNoticeList(pagination, title);
//		List<NoticeVO> noticeList = noticeService.selectNoticeList();
//		mav.addObject("noticeList", noticeList);
//		
//		mav.addObject("title", title);
//		
//		return mav;
//	}
	@RequestMapping("/noticeListPage.do")
	public ModelAndView noticeListPage(
			@RequestParam(required = false, defaultValue = "1") int page,
			@RequestParam(required = false, defaultValue = "1") int range,
			@RequestParam(required = false, defaultValue = "") String title) {
		ModelAndView mav = new ModelAndView("notice/noticeList.jsp");
		
		int listCnt = noticeService.selectNoticeListCnt(title);
		
		Pagination pagination = new Pagination();
		pagination.pageInfo(page, range, listCnt);
		mav.addObject("pagination", pagination);
		
		List<NoticeVO> noticeList = noticeService.selectNoticeList(pagination,title);
		mav.addObject("noticeList", noticeList);
		
		mav.addObject("title", title);
		
		return mav;
	}
	@RequestMapping("/noticeWritePage.do")
	public String noticeWritePage(HttpSession session) {
		if(session.getAttribute("USER") != null) {
		return "notice/noticeWrite.jsp";
		}
		return "main.jsp";
	}
	@RequestMapping("/noticeWrite.do")
	public String noticeWrite(HttpSession session, @ModelAttribute NoticeVO notice) throws Exception {
		noticeService.insertNotice(notice, session);
		
		return "redirect:/noticeListPage.do";
	}
	@RequestMapping("/noticeInfoPage/{idx}.do")
	public ModelAndView noticeInfoPage(@PathVariable("idx") long idx) {
		
		System.out.println(idx);
		ModelAndView mav = new ModelAndView("notice/noticeInfo.jsp");
		
		NoticeVO notice = noticeService.selectNotice(idx);
		mav.addObject("notice", notice);
	
		return mav;
	}
	@RequestMapping("/noticeDelete.do")
	public String noticeDelete(long idx) {
		noticeService.deleteNotice(idx);
		
		return "redirect:/noticeListPage.do";
	}
	
}
