package collegeWeb.controller;

import java.util.List;

import org.collegeServeur.entities.Departement;
import org.collegeServeur.entities.Matiere;

import org.collegeServeur.service.IServiceDepartement;
import org.collegeServeur.service.IServiceMatiere;
import org.collegeServeur.service.IServiceNoter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerSuiviCollege {

	@Autowired
	private IServiceNoter serviceNoter;
	@Autowired
	private IServiceDepartement serviceDep;
	@Autowired
	private IServiceMatiere serviceMat;
	
	
	
	@RequestMapping("/user/suiviCollege")
	public ModelAndView infosCollege() {
		ModelAndView view = new ModelAndView("suiviCollege","moyenne",new Matiere());
		List<Departement> departements=serviceDep.display();
		List<Matiere> matieres = serviceMat.display();
	
		view.addObject("matieres",matieres);
		view.addObject("departements",departements);
		return view;
		
	}
	
	@RequestMapping("/user/GetMoyMat")
	public ModelAndView CalculMoyMat (@ModelAttribute("moyenne")Matiere mat) {
		double moyenne = serviceNoter.getMoyenneParMatiere(mat.getIdMatiere());
		ModelAndView view=new ModelAndView();
		List<Matiere> matieres = serviceMat.display();
		
		
		view.addObject("moyenne",moyenne);
		view.addObject("matieres",matieres);
		return view;
	}
	
	@RequestMapping("/user/GetMoyGen")
	public ModelAndView CalculMoyGen (@ModelAttribute("moyenne")Departement dep) {
		double moyenneG = serviceDep.getMoyenneParDepartement(dep.getIdDepartement());
		ModelAndView view=new ModelAndView();
		List<Departement> departements=serviceDep.display();
		
		
		view.addObject("moyenneG",moyenneG);
		view.addObject("departements",departements);
		return view;
}
}



