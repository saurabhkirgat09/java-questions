import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializableExample {

    public static void main(String[] args) {


        try(FileInputStream fileInputStream = new FileInputStream("student.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            Student student = (Student)objectInputStream.readObject();
            System.out.println("Deserialized Student: ");
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Password: " + student.getPassword());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
