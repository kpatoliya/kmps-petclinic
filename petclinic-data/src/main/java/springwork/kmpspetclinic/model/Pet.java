package springwork.kmpspetclinic.model;
/*** Created by karan patoliya
 on Jan 2020    ***/

import java.time.LocalDate;

public class Pet extends BaseEntity {

    private PetType petTyoe;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetTyoe() {
        return petTyoe;
    }

    public void setPetTyoe(PetType petTyoe) {
        this.petTyoe = petTyoe;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
