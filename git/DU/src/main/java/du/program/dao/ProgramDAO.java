package du.program.dao;

import java.util.List;

import du.program.domain.ProgramVO;

public interface ProgramDAO {
	public List<ProgramVO> selectProgramList();
	public void insertProgram(ProgramVO dept);
	public void deleteProgram(String Programs);//이게 아까봤던 deptcd네 programs으로바꿈
}