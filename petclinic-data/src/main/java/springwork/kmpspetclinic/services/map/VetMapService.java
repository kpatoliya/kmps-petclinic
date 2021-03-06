package springwork.kmpspetclinic.services.map;

import org.springframework.stereotype.Service;
import springwork.kmpspetclinic.model.Vet;
import springwork.kmpspetclinic.services.VetService;

import java.util.Set;

/*** Created by karan patoliya
 on Jan 2020    ***/

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
