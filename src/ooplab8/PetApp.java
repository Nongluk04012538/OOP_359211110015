package ooplab8;

import ooplab9.Cow;

public class PetApp {

    public static void main(String[] args) {
        Dog dog = new Dog("Chayen",2,"Bangkeaw");
        System.out.println(dog.toString());
        dog.makeNoise();

        Cat cat = new Cat("Male",2,"persian");
        System.out.println(cat.toString());
        cat.makeNoise();

        System.out.println(dog.msg);


        Cow cow = new Cow("Namjai",5);
        System.out.println(cow.toString());
        cow.makeNoise();

        // System.out.println(cow.msg);



    }//main
}//class
///