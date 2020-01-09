package springwork.kmpspetclinic.services;

import springwork.kmpspetclinic.model.Owner;

import java.util.Set;

/*** Created by karan patoliya
 on Jan 2020    ***/
public interface OwnerService {

    Owner findByLastName (String lastName);

    Owner findById(Long id);

    Owner save (Owner owner);

    Set<Owner> findAll();
}
