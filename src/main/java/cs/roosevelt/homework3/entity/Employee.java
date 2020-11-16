package cs.roosevelt.homework3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {

    @Id
    @Min(value = 10000, message = "eid: must be a 5 digit number")
    @Max(value = 99999, message = "eid: must be a 5 digit number")
    private int eid;

    @NotBlank(message = "name: must not be blank")
    @Size(max = 30, message = "name: must be less than {max} characters")
    private String name;

    @NotBlank(message = "position: must not be blank")
    @Size(max = 30, message = "position: must be less than {max} characters")
    private String position;

    @Positive(message = "yos: must be greater than or equal to 0")
    private int yos;

    @Positive(message = "salary: must be greater than or equal to 0")
    private double salary;

    @Min(value = 10000, message = "sid: must be a 5 digit number")
    @Max(value = 99999, message = "sid: must be a 5 digit number")
    private int sid;

    public Employee() {
    }

    public Employee(@Min(value = 10000, message = "eid: must be a 5 digit number") @Max(value = 99999, message = "eid: must be a 5 digit number") int eid,
                    @NotBlank(message = "name: must not be blank") @Size(max = 30, message = "name: must be less than {max} characters") String name,
                    @NotBlank(message = "position: must not be blank") @Size(max = 30, message = "position: must be less than {max} characters") String position,
                    @Positive(message = "yos: must be greater than or equal to 0") int yos,
                    @Positive(message = "salary: must be greater than or equal to 0") double salary,
                    @Min(value = 10000, message = "sid: must be a 5 digit number") @Max(value = 99999, message = "sid: must be a 5 digit number") int sid) {
        this.eid = eid;
        this.name = name;
        this.position = position;
        this.yos = yos;
        this.salary = salary;
        this.sid = sid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYos() {
        return yos;
    }

    public void setYos(int yos) {
        this.yos = yos;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
