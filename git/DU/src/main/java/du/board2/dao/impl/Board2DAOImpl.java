package du.board2.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import du.board2.dao.Board2DAO;
import du.board2.domain.Board2VO;
import du.common.Pagination;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class Board2DAOImpl extends EgovAbstractMapper implements Board2DAO {

//	@Override
//	public List<Board2VO> selectBoard2List(HashMap<String, Object> map) {
//		return selectList("Board2.selectBoard2List", map);
//	}
	@Override
	public List<Board2VO> selectBoard2List(HashMap<String, Object> map) {
		return selectList("Board2.selectBoard2List", map);
	}

	@Override
	public int selectBoard2ListCnt(String title) {
		return selectOne("Board2.selectBoard2ListCnt",title);
	}

	@Override
	public void insertBoard2(Board2VO board2) {
		insert("Board2.insertBoard2", board2);
		
	}

	

}
