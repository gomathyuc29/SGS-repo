package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

	
	@Autowired
	private ProductService pservice;
	
	/*
	 * @GetMapping public String showAllProducts(Model model) {
	 * model.addAttribute("products", pservice.findAllProducts()); return
	 * "ViewProducts"; }
	 */
	
	
	 @GetMapping("/new-product")
	 public String showOroductForm(Model model) {
	        model.addAttribute("product", new Product());
	        return "new-product-form";
	 }
	 
	 @GetMapping("/show-view-by-id")
	 public String showSearch() {
	        return "search-by-id-form";
	 }
	 
	 @RequestMapping("/")
	 public String showfetchIndex() {
	        return "index";
	 }
	 
	 @RequestMapping(value="/addProduct/{id}",method=RequestMethod.POST)
	 public String addProduct(@ModelAttribute("product") ProductDTO pto,@PathVariable("id") int id) {
		 pservice.addProduct(pto);
	     return "redirect:/list/"+id; 
	 }
	 
	 @RequestMapping(value="/list/{id}",method=RequestMethod.GET)
	    public String listOfProducts(@PathVariable("id") int id,Model model) {
	          List<ProductDTO> plist = pservice.getAllProducts();
	          model.addAttribute("prodList", plist);
	          switch(id)
	          {
	          case 1:model.addAttribute("message", "Product added successfully");
	        	  break;
	          case 2:model.addAttribute("message", "Product updated successfully");
	        	  break;
	          case 3:model.addAttribute("message", "Product deleted successfully");
	        	  break;
	        	  default:break;
	          }
	          
	          if(plist==null || plist.size()==0)
	          {
	        	  return "NoDataFound";
	          }
	          return "view-all-products";
	    }
	 
	 @RequestMapping(value="/perform",method=RequestMethod.GET)
	    public String perform(@RequestParam("pid") String id,@RequestParam("action") String action,
	    		@ModelAttribute("product") ProductDTO pto,Model model) {
		 if(action!=null && action.equals("UPDATE"))
		 {
			 ProductDTO x = pservice.fetchProduct(id);
		     model.addAttribute("product", x);
			 return "update-form";
		 }
		 else if(action!=null && action.equals("DELETE"))
		 {
			 pservice.deleteProduct(id);
		 }
		 return "redirect:/list/3";  
	    }

	 @GetMapping("/search")
	    public String showProductById(@RequestParam("pid") String id, Model model) {
	        ProductDTO product = pservice.fetchProduct(id);
	        model.addAttribute("product", product);
	        if(product==null)
	          {
	        	  return "NoDataFound";
	          }
	        return "view-product";
	    }
	
}
