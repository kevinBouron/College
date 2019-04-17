package collegeWeb.controller;

import org.collegeServeur.service.IService;
import org.collegeServeur.service.IServiceEtudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Control {
	
	@Autowired
	private IServiceEtudiant serviceEtud;
	

}
