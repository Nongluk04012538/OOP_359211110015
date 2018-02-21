package ooplab8;

public class Employee extends Person {

    private String position;
    private  String salary;


    public Employee(String name, String gender, String dateofBirth, int agel, String position, String salary)  {
        super(name, gender, dateofBirth, agel);

        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                "} " + super.toString();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}