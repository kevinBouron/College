package collegeWeb.controller;

import java.util.List;

import org.collegeServeur.entities.Etudiant;
import org.collegeServeur.entities.Noter;
import org.collegeServeur.service.ServiceEtudiant;
import org.collegeServeur.service.ServiceNoter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class ControlUser {

	@Autowired
	ServiceNoter serviceNoter;
	@Autowired
	ServiceEtudiant serviceEtudiant;
	
	@RequestMapping("/noteForm")
	public ModelAndView note() {
		ModelAndView view=new ModelAndView("GestionNote","note",new Noter());
		List<Noter> notes=serviceNoter.display();
		view.addObject("ListeNotes",notes);
		return view;
}

	@RequestMapping("/addNote")
	public ModelAndView ajout(@ModelAttribute("note")Noter noter) {
		
		
		serviceNoter.create(noter);
		return new ModelAndView("noteForm");
		
	}
	
	
	@RequestMapping("/editEtud")
	public ModelAndView modifier(@RequestParam int id) {
		ModelAndView view=new ModelAndView("GestionNote");
		Etudiant e=serviceEtudiant.GetById(id);
		List <Noter> notes=serviceNoter.display();
		
		
		view.addObject("etudiant",e);
	    view.addObject("ListeNotes",notes);
		return view;
		
	}
	
//	------------------------------WIP--------------------------------------------- //
	
	@RequestMapping("/detailsE")
	public ModelAndView detailsEtud(@ModelAttribute("note")Noter noter) {
		
		
		serviceNoter.create(noter);
		return new ModelAndView("noteForm");
		
	}
	@RequestMapping("/detailsC")
	public ModelAndView detailsColl(@ModelAttribute("note")Noter noter) {
		
		
		serviceNoter.create(noter);
		return new ModelAndView("noteForm");
		
	}
	
}