package springcourse;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "guest")
public class Guest extends Person{

    private Date VISIT_DATE;
    private  Integer EMP_ID;

    Guest(Byte card, String type) {
        super(card, type);
    }

    public Date getVISIT_DATE() {
        return VISIT_DATE;
    }

    public void setVISIT_DATE(Date VISIT_DATE) {
        this.VISIT_DATE = VISIT_DATE;
    }
    
    public Integer getEMP_ID() {
        return EMP_ID;
    }

    public void setEMP_ID(Integer EMP_ID) {
        this.EMP_ID = EMP_ID;
    }
}
