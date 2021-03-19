package examplepackageinterface.entity;

public class Admin {


    private String name;
    private Integer age;
    private String address;
    private String gender;
    private Integer contactNumber;



    public Admin() {

    }

    public Admin(String name, Integer age, String address, String gender, Integer contactNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }







    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }


}