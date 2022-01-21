package java8Practice;

import java.util.function.*;

public class NegateEx {


    public static void main (String[]args)
    {

        int[] x = { 0, 5, 10, 15, 20, 25, 30, 35, 40, 45 };
        //Predicate<String> p1 = i->i.length()%2==0;

        System.out.println ("Hello World");
        //      System.out.println(p1.test("srinivas"));
        //      System.out.println(p1.test("divya"));

        Predicate < Integer > p1 = i->i % 2 == 0;
        Predicate < Integer > p2 = i->i > 10;

        for (int i1:x)
        {

            if (p1.negate ().or (p2).test (i1))
            {

                System.out.println (i1);
            }
        }

    }
}
