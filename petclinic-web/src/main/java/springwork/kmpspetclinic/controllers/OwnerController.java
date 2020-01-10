package springwork.kmpspetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*** Created by karan patoliya
 on Jan 2020    ***/

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
