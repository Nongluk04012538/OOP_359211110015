package ooplab8;

public class Person {
    private String name;
    private String gander;
    private String dateOfBirth;
    private String age;
    //constructor


    public Person(String name, String gander, String dateOfBirth, String age) {
        this.name = name;
        this.gander = gander;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }
    //toString()


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gander='" + gander + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", age='" + age + '\'' +
                '}';


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}//class

