package queryexample;
// Generated 16/02/2017 05:07:47 PM by Hibernate Tools 4.3.1



/**
 * Phone generated by hbm2java
 */
public class Phone  implements java.io.Serializable {


     private Integer id;
     private Employee employee;
     private String phoneNumber;

    public Phone() {
    }

    public Phone(Employee employee, String phoneNumber) {
       this.employee = employee;
       this.phoneNumber = phoneNumber;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




}


