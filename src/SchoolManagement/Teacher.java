package SchoolManagement;

public class Teacher {
    private int id;
    private int salary;
    private String name;
    private int salaryEarned;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0; // Initially, no salary paid
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /** Pays the teacher and updates the school's money spent */
    public void receiveSalary(School school) {
        if (school.getTotalMoneyEarned() >= salary) {
            school.updateTotalMoneySpent(salary);
            salaryEarned += salary;
            System.out.println(name + " has received salary of " + salary);
        } else {
            System.out.println("Not enough funds to pay " + name + "'s salary.");
        }
    }

}
