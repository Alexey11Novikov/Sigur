package springcourse;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="employee")
public class Employee extends Person{

    private Date HIRE_TIME;

    private Date FIRED_TIME;

    private Integer DEPARTMENT_ID;


}
