package springwork.kmpspetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springwork.kmpspetclinic.model.Owner;
import springwork.kmpspetclinic.model.Vet;
import springwork.kmpspetclinic.services.OwnerService;
import springwork.kmpspetclinic.services.VetService;

/*** Created by karan patoliya
 on Jan 2020    ***/

@Component
public class DataLoader implements CommandLineRunner {

    public final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Hiren");
        owner1.setLastName("Paglia");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jean");
        owner2.setLastName("Aesto");

        ownerService.save(owner2);

        System.out.println("Owners Loaded....");

        Vet vet1 =  new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Haldu");

        vetService.save(vet1);

        Vet vet2 =  new Vet();
        vet2.setFirstName("Tom");
        vet2.setLastName("Brady");

        vetService.save(vet2);

        System.out.println("Vets Loaded....");
    }
}
