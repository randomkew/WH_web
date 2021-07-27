package du.program.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import du.program.dao.ProgramDAO;
import du.program.domain.ProgramVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository
public class ProgramDAOImpl extends EgovAbstractMapper implements ProgramDAO {

	@Override
	public List<ProgramVO> selectProgramList() {
		return selectList("Program.selectProgramList");
	}

	@Override
	public void insertProgram(ProgramVO program) {
		insert("Program.insertProgram", program);
		
	}

	@Override
	public void deleteProgram(String idx) {
		delete("Program.deleteProgram", idx);
	}

}