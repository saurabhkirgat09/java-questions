import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableExample {

    public static void main(String[] args) {
        Student student = new Student(19, "Saurabh", "pwd");

        try(FileOutputStream fileOutputStream = new FileOutputStream("student.ser"); //opening a file to write byte array data
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) { // wrap it up in output stream, its a java serializer which converts it into byte stream

            objectOutputStream.writeObject(student); //serialize the object
            System.out.println("Object is serialized to student.ser");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
