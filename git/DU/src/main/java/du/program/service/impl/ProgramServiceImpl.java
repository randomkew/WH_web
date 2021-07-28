package du.program.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import du.program.dao.ProgramDAO;
import du.program.domain.ProgramVO;
import du.program.service.ProgramService;

@Service
public class ProgramServiceImpl implements ProgramService{
	@Autowired
	private ProgramDAO programDAO;
	
	@Override
	public List<ProgramVO> selectProgramList() {
		return programDAO.selectProgramList();
	}

	@Override
	public void insertProgram(ProgramVO program) {
		programDAO.insertProgram(program);
	}

	@Override
	public void deleteProgram(String idx) {
		programDAO.deleteProgram(idx);
	}

}