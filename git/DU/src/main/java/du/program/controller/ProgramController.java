package du.program.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import du.program.domain.ProgramVO;
import du.program.service.ProgramService;

@Controller
public class ProgramController {
	@Autowired
	private ProgramService programService;
	
	@RequestMapping("/programPage.do")
	public ModelAndView programPage() {
		ModelAndView mav = new ModelAndView("program/programList.jsp");
		List<ProgramVO> program = programService.selectProgramList();
		mav.addObject("program", program);
		return mav;
	}
	
	@RequestMapping("/programInsertPage.do")
	public String programInsertPage() {
		return "program/programInsert.jsp";
	}
	
	@RequestMapping("/programInsert.do")
	public String programInsert(ProgramVO program) {
		programService.insertProgram(program);
		return "redirect:/programPage.do";
	}
	//이거 밑에DEPT가 아닌 DEPTCD이다 문제 가 없을까 일단 적어놈
	@RequestMapping("/deleteProgram.do")
	public String deleteProgram(String programs) {
		programService.deleteProgram(programs);
		return "redirect:/programPage.do";
	}
}