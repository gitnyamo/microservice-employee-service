package fun.services.asap.employee.response;

//Note: make sure you remove all the column or any database mapping from the variables of this response class. Mapping should strictly stay within the entity class and not the response for security.
public class EmployeeResponse {

    //use the EmployeeResponse object for return in the EmployeeController instead of return your Employee object directly to the controller... again it is for security reasons.... bare minimum...
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
