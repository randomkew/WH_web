package du.board2.service;

import java.util.List;

import du.board2.domain.Board2VO;
import du.common.Pagination;

public interface Board2Service {
	public List<Board2VO> selectBoard2List();
}
