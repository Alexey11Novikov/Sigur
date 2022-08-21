package springcourse;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
    private Integer id;

    private Byte Card;
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    Person(){}
    Person (Byte card, String type) {
        this.Card=card;
        this.type =type;
    }
}
