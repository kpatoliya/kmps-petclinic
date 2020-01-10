package springwork.kmpspetclinic.services;

import java.util.Set;

/*** Created by karan patoliya
 on Jan 2020    ***/
public interface CrudService<T, ID> {

    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);

}
