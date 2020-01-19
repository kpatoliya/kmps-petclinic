package springwork.kmpspetclinic.services.map;

import org.springframework.stereotype.Service;
import springwork.kmpspetclinic.model.Owner;
import springwork.kmpspetclinic.services.OwnerService;

import java.util.Set;

/*** Created by karan patoliya
 on Jan 2020    ***/

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
