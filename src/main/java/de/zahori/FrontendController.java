package de.zahori;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontendController {

    
    @RequestMapping("/")
    public String index(@RequestParam(value="title", required=false, defaultValue="Grayscale") String title, Model model) {
    	model.addAttribute("title", title);
        return "index";
    }
	
}
