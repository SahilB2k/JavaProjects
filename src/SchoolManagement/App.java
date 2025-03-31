package SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Creating teachers
        Teacher Irin = new Teacher(1, "Irin", 50000);
        Teacher Preeti = new Teacher(2, "Preeti", 70000);
        Teacher Anil = new Teacher(3, "Anil", 55000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Irin);
        teacherList.add(Preeti);
        teacherList.add(Anil);

        // Creating students
        Student Sahil = new Student(1, "Sahil", 12);
        Student Anuj = new Student(2, "Anuj", 10);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Sahil);
        studentList.add(Anuj);

        // Creating the school object
        School APS = new School(teacherList, studentList);

        // Students paying fees
        Sahil.payFees(50000, APS);  // Sahil pays 50,000
        Anuj.payFees(50000, APS);   // Anuj pays 50,000

// Now, total collected fees = 100,000

        Irin.receiveSalary(APS);  // Now this check will work properly
        Preeti.receiveSalary(APS);
        Anil.receiveSalary(APS);

        System.out.println("APS has earned: " + APS.getTotalMoneyEarned());
        System.out.println("APS has spent on salaries: " + APS.getTotalMoneySpent());

        // Anuj pays 20,000

// Paying teacher salaries
        Irin.receiveSalary(APS);
        Preeti.receiveSalary(APS);
        Anil.receiveSalary(APS);

        System.out.println("APS has earned: " + APS.getTotalMoneyEarned());
        System.out.println("APS has spent on salaries: " + APS.getTotalMoneySpent());
        // Anuj pays 20,000

        // Displaying total money earned
        System.out.println("APS has earned: " + APS.getTotalMoneyEarned());
    }
}
