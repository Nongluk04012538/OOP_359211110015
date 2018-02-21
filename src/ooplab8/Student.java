package ooplab8;

import java.util.Date;


public class Student extends Person {
    private  String id;
    private  String program;

    public Student(String name, String gender, String dateofBirth, int agel, String id, String program) {
        super(name, gender, dateofBirth, agel);
        this.id = id;
        this.program = program;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", program='" + program + '\'' +
                "} " + super.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}