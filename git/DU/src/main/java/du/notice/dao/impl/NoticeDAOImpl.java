package du.notice.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import du.board.domain.BoardVO;
import du.common.Pagination;
import du.notice.dao.NoticeDAO;
import du.notice.domain.NoticeVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class NoticeDAOImpl extends EgovAbstractMapper implements NoticeDAO {

//	@Override
//	public List<NoticeVO> selectNoticeList(HashMap<String, Object> map) {
//		return selectList("Notice.selectNoticeList", map);
//	}
	@Override
	public List<NoticeVO> selectNoticeList(HashMap<String, Object> map) {
		return selectList("Notice.selectNoticeList", map);
	}

	@Override
	public int selectNoticeListCnt(String title) {
		return selectOne("Notice.selectNoticeListCnt",title);
	}

	@Override
	public void insertNotice(NoticeVO notice) {
		insert("Notice.insertNotice", notice);
		
	}

	@Override
	public NoticeVO selectNotice(long idx) {
			return selectOne("Notice.selectNotice", idx);
		
	}

	@Override
	public void deleteNotice(long idx) {
		delete("Notice.deleteNotice", idx);
		
	}

	

}
