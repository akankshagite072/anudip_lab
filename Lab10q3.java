
//3.  Create a arraylist of students name and remove name of students who start with ‘S’ using lambda expression.
import java.util.ArrayList;
import java.util.List;

public class Lab10q3 {
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Akanksha");
        studentNames.add("Sai");
        studentNames.add("Harshal");
        studentNames.add("Samarth");
        studentNames.add("Soham");
        studentNames.add("Palak");
        studentNames.add("Shyam");
        studentNames.add("Akki");

        studentNames.removeIf(name -> name.startsWith("S"));

        System.out.println("Student names after removing names starting with 'S':");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}