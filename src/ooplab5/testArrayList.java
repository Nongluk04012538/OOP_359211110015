package ooplab5;

import java.util.ArrayList;

public class testArrayList {
    public static void main (String[] args) {
//Arraylist
        ArrayList list =new ArrayList();
        list.add("SAM");
        list.add("BOY");
        list.add("GIRL");
        System.out.println(list);
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list);
        list.add(1,"joy");
        System.out.println(list);


        //print with for loop
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }//for



    }//main
}
//class