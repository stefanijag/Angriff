package myprojects.angriff.ui;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import myprojects.angriff.service.bean.ProjectBean;

@Controller
public class ProjectController {
	
	@RequestMapping(value = "/overview")
	public String index() {
		return "/project/overviewProject";
	}
	
	@RequestMapping(value="/project")
	public String displayCreateProjectForm(@Valid@ModelAttribute("project")ProjectBean projectBean, BindingResult result) {
		return "/project/viewCreateProject";
	}
}
