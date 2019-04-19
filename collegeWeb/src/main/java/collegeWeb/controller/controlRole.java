//package collegeWeb.controller;
//
//import java.util.List;
//
//import org.collegeServeur.entities.Role;
//import org.collegeServeur.entities.User;
//import org.collegeServeur.service.IServiceAdmin;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class controlRole {
//
//	@Autowired
//	private IServiceAdmin serviceAdmin;
//	
//	@RequestMapping(value = "/admin/home", method = RequestMethod.GET)
//	public String homeAdmin( ) {
//		return "hello";
//	}
//	
//	
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String AdminLogin() {
//		return "authentif";
//	}
//	
//	@RequestMapping("/adminForm")
//	public ModelAndView formulaire() {
//		
//		return new ModelAndView("addUser","admin",new User());
//		
//	}
//	
//	@RequestMapping("/addAdmin")
//	public ModelAndView ajout(@ModelAttribute("admin")User admin) {
//		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);
//		System.out.println(admin.getPassword());
//		admin.setPassword(encoder.encode(admin.getPassword()));
//		
//		serviceAdmin.add(admin);;
//		return new ModelAndView("addUser");
//		
//	}
//	
//	@RequestMapping("/roleForm")
//	public ModelAndView role() {
//		ModelAndView view=new ModelAndView("addRole","role",new Role());
//		List<User> users=serviceAdmin.show();
//		view.addObject("users",users);
//		return view;
//		
//	}
//	
//	@RequestMapping("/addRole")
//	public ModelAndView ajout(@ModelAttribute("role")Role role) {
//		
//		
//		serviceAdmin.addR(role);;
//		return new ModelAndView("addRole");
//		
//	}
//
//
//}
