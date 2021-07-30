package du.notice.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import du.common.Pagination;
import du.notice.dao.NoticeDAO;
import du.notice.domain.NoticeVO;
import du.notice.service.NoticeService;
import du.user.domain.UserVO;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;

	@Override
	public List<NoticeVO> selectNoticeList(Pagination pagination, String title) {
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("startList", pagination.getStartList());
		map.put("listSize", pagination.getListSize());
		map.put("title", title);
		
		return noticeDAO.selectNoticeList(map);
	}

	@Override
	public int selectNoticeListCnt(String title) {
		return noticeDAO.selectNoticeListCnt(title);
	}

	@Override
	public void insertNotice(NoticeVO notice, HttpSession session) throws Exception {
		UserVO user = (UserVO) session.getAttribute("USER");
		
		if(user != null) {
			notice.setWriterId(user.getUserId());
				
		noticeDAO.insertNotice(notice);
	}
		
	}

	@Override
	public NoticeVO selectNotice(long idx) {
		return noticeDAO.selectNotice(idx);
	}

	@Override
	public void deleteNotice(long idx) {
		noticeDAO.deleteNotice(idx);
		
	}


}
