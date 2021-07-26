package du.board2.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import du.board2.dao.Board2DAO;
import du.board2.domain.Board2VO;
import du.board2.service.Board2Service;
import du.common.Pagination;

@Service
public class Board2ServiceImpl implements Board2Service {
	
	@Autowired
	private Board2DAO board2DAO;

//	@Override
//	public List<Board2VO> selectBoard2List(Pagination pagination, String title) {
//		HashMap<String, Object> map = new HashMap<>();
//		
//		map.put("startList", pagination.getStartList());
//		map.put("listSize", pagination.getListSize());
//		map.put("title", title);
//		
//		return board2DAO.selectBoard2List(map);
//	}
	@Override
	public List<Board2VO> selectBoard2List(Pagination pagination) {
		return board2DAO.selectBoard2List(pagination);
	}

	@Override
	public int selectBoard2ListCnt() {
		return board2DAO.selectBoard2ListCnt();
	}

}
