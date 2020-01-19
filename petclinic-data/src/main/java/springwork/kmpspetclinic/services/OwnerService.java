package springwork.kmpspetclinic.services;

import springwork.kmpspetclinic.model.Owner;

/*** Created by karan patoliya
 on Jan 2020    ***/
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
