package collegeWeb.controller;

import org.collegeServeur.service.IService;
import org.collegeServeur.service.IServiceEtudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Control {
	
	@Autowired
	private IServiceEtudiant serviceEtud;
	
	@RequestMapping("/hello")
	public ModelAndView hello() { 
		
		return new ModelAndView("hello");
	}
	

	
}
