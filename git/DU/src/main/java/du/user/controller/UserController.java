package du.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import du.user.domain.UserVO;
import du.user.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/userInfoConfirmPage.do")
	public String userInfoConfirmPage() {
		return "user/userInfoConfirm.jsp";
	}
	
	@RequestMapping("/userInfoConfirm.do")
	public ModelAndView userInfoConfirm(UserVO user) {
		if(userService.selectPwd(user.getUserId(), user.getPwd())) {
			ModelAndView mav = new ModelAndView("user/userInfo.jsp");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("main.jsp");
			return mav;
		}
	}
	
	@RequestMapping("/signUpPage.do")
	public String signUpPage() {
		return "user/signUp.jsp";
	}
	
	@RequestMapping("/signUp.do")
	public String signUp(HttpServletRequest request, UserVO user) {
		try {
			userService.insertUser(user);
			
			if(userService.loginProcess(request, user)){
				return "redirect:/signUpConfirmPage.do";
			}
		}
		catch (Exception e) {
			return "redirect:/mainPage.do";
		}
		return "redirect:/mainPage.do";
	}
	
	@RequestMapping("/signUpConfirmPage.do")
	public String signUpConfirmPage() {
		return "user/signUpConfirm.jsp";
	}
	
	@RequestMapping("/userModify.do")
	public String userModify(UserVO user) {
		userService.updateUser(user);
		return "redirect:/mainPage.do";
	}
	
	@RequestMapping("/userDelete.do")
	public String userDelete(HttpSession session) {
//		userService.deleteUser(userId);
		userService.deleteUser(session);
		return "redirect:/loginPage.do";
	}
}