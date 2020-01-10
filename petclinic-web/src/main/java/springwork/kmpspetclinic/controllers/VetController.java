package springwork.kmpspetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*** Created by karan patoliya
 on Jan 2020    ***/

@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String listVets(){
        return "vets/index";
    }
}