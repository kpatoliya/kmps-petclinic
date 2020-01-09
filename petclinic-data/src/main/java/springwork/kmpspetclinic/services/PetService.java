package springwork.kmpspetclinic.services;

import springwork.kmpspetclinic.model.Pet;

import java.util.Set;

/*** Created by karan patoliya
 on Jan 2020    ***/
public interface PetService {
    Pet findById(Long id);

    Pet save (Pet pet);

    Set<Pet> findAll();
}
