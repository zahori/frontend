package de.zahori;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontendController {

    
    @RequestMapping("/")
    public String index() {
        return "index";
    }
	
}
