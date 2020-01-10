package springwork.kmpspetclinic.services.map;

import springwork.kmpspetclinic.model.Pet;
import springwork.kmpspetclinic.services.CrudService;

import java.util.Set;

/*** Created by karan patoliya
 on Jan 2020    ***/
public class PetMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
