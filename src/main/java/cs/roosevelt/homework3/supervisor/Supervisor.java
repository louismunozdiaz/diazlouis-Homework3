package cs.roosevelt.homework3.supervisor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "SUPERVISORS")
public class Supervisor {
    @Id
    int sid;

    @NotBlank
    String name;

    @NotBlank
    String department;

    public Supervisor() {
    }

    public Supervisor(int sid, String name, String department) {
        this.sid = sid;
        this.name = name;
        this.department = department;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
