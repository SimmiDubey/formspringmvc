package productcrudapp.controller;


import java.util.List;


import javax.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.dao.FormDao;
import productcrudapp.model.Form;

@Controller
public class HomeController {
	
	@Autowired
	private FormDao formDao;
	
	     
	
	@RequestMapping("/form")
	public String display(Model m) {
		m.addAttribute("title","Form");
		
		return "form";
	}
	
	
	@PostMapping("/handle-form")
    public String handleForm(
            @ModelAttribute Form form, Model model){

      	System.out.println("this is controller");

        // Save form data to the database
        formDao.createForm(form);

        // Retrieve all forms for display
        List<Form> forms = formDao.findAll();
        model.addAttribute("forms", forms);

        return "viewForms";
    }
	
//	@GetMapping("/viewForm")
//    public String viewForm(Model model) {
//        List<Form> forms = formDao.findAll();
//        model.addAttribute("forms", forms);
//        return "viewForms";
//	}
//	
	

    }
