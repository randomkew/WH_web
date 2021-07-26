package du.board2.dao;

import java.util.HashMap;
import java.util.List;

import du.board2.domain.Board2VO;
import du.common.Pagination;

public interface Board2DAO {
	
//	public List<Board2VO> selectBoard2List(HashMap<String, Object> map);
	public List<Board2VO> selectBoard2List(Pagination pagination);
	public int selectBoard2ListCnt();
}
