import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest {


    public static void main(String args[]){




        List<String> listObj = new ArrayList();
        listObj.add("one");
        listObj.add("two");
        listObj.add("three");
        listObj.add("four");
        listObj.add("eleven");



        listObj.stream().filter(p->p.length()<4).limit(2).forEach(
            System.out.println(p)
        );

        listObj.stream().sorted(Comparator.comparing(listObj.get().length()))


           listen
           silenta



                   String s1 = new String("listen");

        String s2 = new String("silenta");


        if(s1.length()== s2.length()){

         char ch1[]   = s1.toCharArray();

         if(int i=0;i<=ch1.length;i++){


                s2.contains( ch1[i]));
            }
        }

    }
}
