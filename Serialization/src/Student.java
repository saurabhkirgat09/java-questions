import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L; // version control


    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String name;
    private transient String password; // This field won't be saved

    public Student(int age, String name, String password) {
        this.age = age;
        this.name = name;
        this.password = password;
    }
}
