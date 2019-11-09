package myprojects.angriff.ui;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import myprojects.angriff.database.impl.ApiPersistenceDBImpl;
import myprojects.angriff.service.api.ApiPersistenceAPI;
import myprojects.angriff.service.bean.LoginBean;
import myprojects.angriff.service.bean.RegisterUIBean;
import myprojects.angriff.service.hibbean.LoginHIBBean;

@Controller
public class LoginController {
	
	ApiPersistenceAPI api = new ApiPersistenceDBImpl();
	private static Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value="/login")
	public String index(@Valid@ModelAttribute("login")LoginBean loginBean, BindingResult result){
		return "/login/viewLogin";
	}
	
	@RequestMapping(value="/register")
	public String register(@Valid@ModelAttribute("register")RegisterUIBean regiterUIBean, BindingResult result) {
		return "/login/viewRegister";
	}
	
	@RequestMapping(value="/login/check")
	public ModelAndView loginCheck(@Valid@ModelAttribute("login")LoginBean loginBean, BindingResult result, ModelMap model) {
		String role = api.login(new LoginHIBBean(loginBean.getUsername(), loginBean.getPassword()));
		if(role.isEmpty()) {
			model.addAttribute("error", "Benutzername oder Passwort ist nicht korrekt!");
			LOGGER.error("Username: " +loginBean.getUsername()+ " or Password: " +loginBean.getPassword() +" were not correct");
			return new ModelAndView("/login/viewLogin");
		}else if(role.equals("AD")) {
			LOGGER.info("Successfully logged in as an admin");
			return new ModelAndView("/project/overviewProject");
		}
		LOGGER.info("Successfully logged in as an user");
		return new ModelAndView("/project/overviewProject");
	}
	
	@RequestMapping(value="/register/submit")
	public ModelAndView registration(@Valid@ModelAttribute("register")RegisterUIBean registerUIBean, BindingResult result, ModelMap model) {
		if(registerUIBean.getPassword().equals(registerUIBean.getConfirmPassword())){
			LoginHIBBean loginBean = new LoginHIBBean(registerUIBean.getUsername(), registerUIBean.getPassword(), registerUIBean.getEmail(),
					registerUIBean.getName(), registerUIBean.getLastname());
			api.register(loginBean);
			LOGGER.info("Successfully registered as an user");
			return new ModelAndView("/login/viewRegister");
		}
		model.addAttribute("error", "Passwort und Passwort bestätigen stimmt nicht überein");
		LOGGER.debug("Password and confirm password does not match");
		return new ModelAndView("/login/viewRegister");
	}
	
	
}
