package du.notice.dao;

import java.util.HashMap;
import java.util.List;

import du.board.domain.BoardVO;
import du.notice.domain.NoticeVO;

public interface NoticeDAO {
	public List<NoticeVO> selectNoticeList(HashMap<String, Object> map);

	public int selectNoticeListCnt(String title);
	public NoticeVO selectNotice(long idx);
	public void insertNotice(NoticeVO notice);
	public void deleteNotice(long idx);
}
