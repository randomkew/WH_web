package du.board2.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import du.board.domain.BoardVO;
import du.board2.domain.Board2VO;
import du.common.Pagination;

public interface Board2Service {
	public List<Board2VO> selectBoard2List(Pagination pagination,String title);
	public int selectBoard2ListCnt(String title);
	public Board2VO selectBoard2(long idx);
	public void insertBoard2(Board2VO board2, HttpSession session) throws Exception;
	public void deleteBoard2(long idx);
}
