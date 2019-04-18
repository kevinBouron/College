package collegeWeb.controller;

import java.util.List;

import org.collegeServeur.entities.Etudiant;
import org.collegeServeur.entities.Matiere;
import org.collegeServeur.entities.Noter;
import org.collegeServeur.service.IServiceEtudiant;
import org.collegeServeur.service.IServiceMatiere;
import org.collegeServeur.service.IServiceNoter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class ControlUser {

	@Autowired
	IServiceNoter serviceNoter;
	@Autowired
	IServiceEtudiant serviceEtudiant;
	@Autowired
	IServiceMatiere serviceMatiere;
	
	
	@RequestMapping("/user/home")
	public String userHome() {
		return "GestionNote";
	}
	
	@RequestMapping("/user/GestionNote")
	public ModelAndView gestNote() {
		ModelAndView view=new ModelAndView("GestionNote","noter",new Noter());
		List<Noter> notes=serviceNoter.display();
		List<Etudiant> etudiants=serviceEtudiant.display();
		List<Matiere> matieres=serviceMatiere.display();
		view.addObject("ListeNotes",notes);
		view.addObject("ListeEtuds",etudiants);
		view.addObject("ListeMats",matieres);
		return view;
}

	@RequestMapping("/user/addNote")
	public ModelAndView ajout(@ModelAttribute("noter")Noter noter) {
		serviceNoter.create(noter);
		ModelAndView view=new ModelAndView();
		List<Noter> notes=serviceNoter.display();
		List<Etudiant> etudiants=serviceEtudiant.display();
		List<Matiere> matieres=serviceMatiere.display();
		view.addObject("ListeNotes",notes);
		view.addObject("ListeEtuds",etudiants);
		view.addObject("ListeMats",matieres);
		return view;
		
	}
	
	
	@RequestMapping("/user/editEtud")
	public ModelAndView modifier(@RequestParam int id) {
		ModelAndView view=new ModelAndView("GestionNote");
		Etudiant e=serviceEtudiant.GetById(id);
		List <Noter> notes=serviceNoter.display();
		view.addObject("etudiant",e);
	    view.addObject("ListeNotes",notes);
		return view;
		
	}
	

	@RequestMapping("/redirectColl")
	public ModelAndView infosCollege() {
		
		return new ModelAndView("SuiviCollege");
		
	}
	@RequestMapping("/redirectEtud")
	public ModelAndView infosEtudiant() {
		
		return new ModelAndView("SuivitEtud"); 
	}	
}