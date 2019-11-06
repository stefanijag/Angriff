package myprojects.angriff.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;
import javax.validation.Valid;

import myprojects.angriff.service.bean.LoginBean;
import myprojects.angriff.service.bean.RegisterUIBean;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login")
	public String index(@Valid@ModelAttribute("login")LoginBean loginBean, BindingResult result){
		return "/login/viewLogin";
	}
	
	@RequestMapping(value="/register")
	public String register(@Valid@ModelAttribute("register")RegisterUIBean regiterUIBean, BindingResult result) {
		return "/login/viewRegister";
	}
	
	@RequestMapping(value="/login/submit")
	public ModelAndView loginCheck(@Valid@ModelAttribute("login")LoginBean loginBean, BindingResult result, ModelMap model) {
		result.getAllErrors();
		return new ModelAndView();
	}
	
	//TODO: Bitte name vo de Methode aendere
	@RequestMapping(value="/register/check")
	public ModelAndView verarbeiteRegistrierung(@Valid@ModelAttribute("register")RegisterUIBean registerUIBean, BindingResult result) {
		return new ModelAndView();
	}
}
