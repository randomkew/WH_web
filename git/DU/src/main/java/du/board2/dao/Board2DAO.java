package du.board2.dao;

import java.util.HashMap;
import java.util.List;

import du.board2.domain.Board2VO;

public interface Board2DAO {
	public List<Board2VO> selectBoard2List(HashMap<String, Object> map);

	public int selectBoard2ListCnt(String title);
	public void insertBoard2(Board2VO board2);
}
