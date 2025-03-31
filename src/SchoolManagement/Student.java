package SchoolManagement;

/** This class is responsible for student records */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /** Constructor: To create a new student and initialize values */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000; // Assuming fixed fees for all students
    }

    /** Updates the grade of the student */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /** Student pays fees, updates school earnings */
    public void payFees(int fees, School school) {
        feesPaid += fees;
        school.updateTotalMoneyEarned(fees); // Updates school earnings
    }

    /** Getters */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
}
