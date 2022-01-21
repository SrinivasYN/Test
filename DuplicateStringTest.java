import java.util.Arrays;
import java.util.List;

public class DuplicateStringTest {



    public static void main (String args[]) {
        List<String> test1 = Arrays.asList("tomato", "vegitables", "carrot", "tomato");

        for (int i = 0; i <= test1.size(); i++) {
            int count=0;
            if(test1.contains(i)){
                count++;
            }
if (count>=1){
    System.out.println(test1.get(i));
}

        }

    }

}
