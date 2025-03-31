package SchoolManagement;

import java.util.List;

public class School {
    private List<Teacher> teacher;
    private List<Student> student;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    public School(List<Teacher> teacher, List<Student> student) {
        this.teacher = teacher;
        this.student = student;
        totalMoneySpent = 0;
        totalMoneyEarned = 0;
    }

    public List<Teacher> getTeachers() {
        return teacher;
    }

    public void addTeacher(Teacher teacher) {
        this.teacher.add(teacher);
    }

    public List<Student> getStudents() {
        return student;
    }

    public void addStudent(Student student) {
        this.student.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
        totalMoneyEarned -= moneySpent; // Deduct spent money from earnings
    }
}
