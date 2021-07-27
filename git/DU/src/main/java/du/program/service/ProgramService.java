package du.program.service;

import java.util.List;

import du.program.domain.ProgramVO;

public interface ProgramService {
	public List<ProgramVO> selectProgramList();
	public void insertProgram(ProgramVO program);
	public void deleteProgram(String idx);
}