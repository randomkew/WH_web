package du.notice.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import du.board.domain.BoardVO;
import du.common.Pagination;
import du.notice.domain.NoticeVO;

public interface NoticeService {
	public List<NoticeVO> selectNoticeList(Pagination pagination,String title);
	public int selectNoticeListCnt(String title);
	public NoticeVO selectNotice(long idx);
	public void insertNotice(NoticeVO notice, HttpSession session) throws Exception;
	public void deleteNotice(long idx);
}
