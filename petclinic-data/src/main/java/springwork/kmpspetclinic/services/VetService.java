package springwork.kmpspetclinic.services;

import springwork.kmpspetclinic.model.Vet;

import java.util.Set;

/*** Created by karan patoliya
 on Jan 2020    ***/
public interface VetService {

    Vet findById(Long id);

    Vet save (Vet vet);

    Set<Vet> findAll();

}
