//package productcrudapp.controller;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.view.RedirectView;
//
//import productcrudapp.dao.ProductDao;
//import productcrudapp.model.Product;
//
//@Controller
//public class MainController {
//	
//	@Autowired
//	private ProductDao productDao;
//	
//	
//	@RequestMapping("/")
//	public String home() {
//		return "index";
//	}
//	
//	@GetMapping("/hello")
//	public String getHello() {
//		return "hello";
//	}
//	 
//	//show add the product form
//	
//	@RequestMapping("/add-product")
//	public String addProduct(Model m) {
//		m.addAttribute("title","Add Product");
//		
//		return "add_product_form";
		
//	}
//	
//	//handle add product form
//	
//	@RequestMapping(value="/handle-product",method = RequestMethod.POST )
//	public RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest request) {
//		System.out.println(product);
//		
//		productDao.createProduct(product);
//		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl(request.getContextPath()+"/");
//		return redirectView;
//	} 
	
//	// delete handler 2
//	@RequestMapping("/delete/{pid}")
//	public RedirectView deleteProduct(@PathVariable int pid , HttpServletRequest request)
//	{
//		this.productDao.deleteProduct(pid);
//		RedirectView  redirectView = new RedirectView();
//		redirectView.setUrl(request.getContextPath());
//		return redirectView ;
//	}
//
//	//update
//	@RequestMapping("/update/{pid}")
//	public String updateForm(@PathVariable int pid , Model model) {
//		Product product =this.productDao.getProduct(pid);
//		model.addAttribute("product",product);   
//		return "update_form";
//	}
//

//}
