import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListFunction {

    public static void main(String args[]) {

        System.out.println("my project");

        Movie m1 = new Movie();
        Movie m2 = new Movie();
        Movie m3 = new Movie();
        Movie m4 = new Movie();
        Movie m5 = new Movie();

        m1.setId("1");
        m1.setName("one");
        m1.setStatus("active");

        m2.setId("2");
        m2.setName("two");
        m2.setStatus("created");

        m3.setId("3");
        m3.setName("three");
        m3.setStatus("active");

        m4.setId("4");
        m4.setName("two");
        m4.setStatus("active");

        m5.setId("5");
        m5.setName("five");
        m5.setStatus("active");

        List<Movie> movieList = new ArrayList();
        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);
        movieList.add(m4);
        movieList.add(m5);
        List<Movie> active = new ArrayList<Movie>();
        List<Movie> created = new ArrayList<Movie>();
        List<Movie> finalList = new ArrayList<Movie>();


        for (Movie priceUploadCsvVO : movieList) {
            if ("active".equalsIgnoreCase(priceUploadCsvVO.getStatus())) {
                active.add(priceUploadCsvVO);
            } else if ("created".equalsIgnoreCase(priceUploadCsvVO.getStatus()) ||
                    "Pending".equalsIgnoreCase(priceUploadCsvVO.getStatus())) {
                created.add(priceUploadCsvVO);
            }
        }
        /*for (Movie last1 : active) {
            System.out.println("berore   "+last1.getId() +"   " + last1.getName());
        }*/
    //    Collections.sort(active, nameComparator);

        active.sort((Movie s1, Movie s2)->s1.getName().compareTo(s2.getName()));

       /*   for (Movie last2 : active) {
            System.out.println("after   "+last2.getId() +"   " + last2.getName());
        }*/
        for (Movie activeDataItem : active) {
            boolean matchFound = false;
            Movie matchedObject = null;
            for (Movie createdDataItem : created) {
                if (activeDataItem.getName().equals(createdDataItem.getName())) {
                    matchFound = true;
                    matchedObject = createdDataItem;
                    break;
                }
            }
            //matched or not
            if (matchFound) {
                finalList.add(matchedObject);
            } else {
                finalList.add(activeDataItem);
            }
        }
        for (Movie last : finalList) {
            System.out.println(last.getId() +"   " + last.getName());
        }
    }

   /* public static Comparator<Movie> nameComparator = new Comparator<Movie>() {

        public int compare(Movie s1, Movie s2) {
            String key1 = s1.getName().toUpperCase();
            String key2 = s2.getName().toUpperCase();

            //ascending order
            return key1.compareTo(key2);

            //descending order
            //return StudentName2.compareTo(StudentName1);
        }};*/
}
 /* Collections.sort(active , (d1,d2) ->{
            return d1.getName() - d2.getName();
        });*/

  /* List<Movie> sortedList = active.stream()
	.sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
	.collect(Collectors.toList());*/

       /* List<Movie> sortedList = active.stream()
                .sorted(Comparator.comparing(Movie::getName))
                .collect(Collectors.toList());*/

//  sortedList.forEach(System.out::println);