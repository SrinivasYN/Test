package java8Practice;

public class TestStatic {



    public static String age;

    public void setAge(String age) {
        this.age = age;
    }

    public  String name = "Srinivas";

    TestStatic(){}

    public  static String getAge() {
        return age;
    }

    public  String getName() {
        return name;
    }


    public static void main(String args[]){

        TestStatic ts  = new TestStatic();

        System.out.println(ts.getAge());

        System.out.println(ts.getName());

    }
}
