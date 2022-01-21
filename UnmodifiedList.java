package java8Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UnmodifiedList {

    public static void main(String args[]) {
        List<String> al = new ArrayList<String>();
        al.add("hai");
        al.add("hello");

        System.out.println(al);
        List<String> al1  =   Collections.unmodifiableList(al);

        al1= new LinkedList<String>();

        al1.add("chennai");
        al1.add("hyd");
        System.out.println(al1);
    }
}
