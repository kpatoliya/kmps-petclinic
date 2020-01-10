package springwork.kmpspetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*** Created by karan patoliya
 on Jan 2020    ***/

@RequestMapping("/pets")
@Controller
public class PetController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String listPets(){
        return "pets/index";
    }
}
