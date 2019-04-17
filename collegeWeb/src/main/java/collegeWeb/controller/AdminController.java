package collegeWeb.controller;

import java.util.List;

import org.collegeServeur.entities.College;
import org.collegeServeur.entities.Departement;
import org.collegeServeur.entities.Enseignant;
import org.collegeServeur.entities.Matiere;
import org.collegeServeur.service.IServiceCollege;
import org.collegeServeur.service.IServiceDepartement;
import org.collegeServeur.service.IServiceEnseignant;
import org.collegeServeur.service.IServiceEtudiant;
import org.collegeServeur.service.IServiceMatiere;
import org.collegeServeur.service.ServiceCollege;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	@Autowired
	private IServiceDepartement serviceDep;
	@Autowired
	private IServiceEnseignant serviceEns;
	@Autowired
	private IServiceCollege ServiceCol;
	@Autowired
	private IServiceEtudiant ServiceEtu;
	@Autowired
	private IServiceMatiere ServiceMat;
	
	@RequestMapping(value = "/login")
	public String Authentif() {
		return "Authentification";
	}

	@RequestMapping(value = "/admin/home")
	public String adminHome() {
		return "GestionCollege";
	}
	
	@RequestMapping(value = "/admin/GestionDepartement")
	public ModelAndView gestDep() {
		ModelAndView view = new ModelAndView("GestionDepartement","departement",new Departement());
		List<College> colleges = ServiceCol.display();
		List<Enseignant> enseignants = serviceEns.display();
		view.addObject("colleges",colleges);
		view.addObject("enseignants",enseignants);
		return view ;
	}
	
	@RequestMapping(value = "/admin/GestionEnseignant")
	public ModelAndView gestEns() {
		ModelAndView view = new ModelAndView("gestionEnseignant","enseignant",new Enseignant());
		List<Departement> departements = serviceDep.display();
		List<Matiere> matieres = ServiceMat.display();
		view.addObject("departements",departements);
		view.addObject("matieres",matieres);
		return view ;
	}
	
	@RequestMapping(value = "/admin/GestionEtudiant")
	public String gestEtu() {
		return "GestionEtudiant";
	}
	
	@RequestMapping(value = "/admin/GestionSalles")
	public String gestSalle() {
		return "GestionEtudiant";
	}
	
	@RequestMapping(value = "/admin/GestionMatiere")
	public String gestMat() {
		return "GestionMatiere";
	}
	
}
