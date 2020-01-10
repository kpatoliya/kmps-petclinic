package springwork.kmpspetclinic.model;

import java.io.Serializable;

/*** Created by karan patoliya
 on Jan 2020    ***/
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
