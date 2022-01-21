package java8Practice;

import java.util.*;

public class Employee {


    int id;
    String name;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String args[]){

        Employee e= new Employee();
        e.setId(101);
        e.setName("srinivas");
        Employee e1= new Employee();
        e1.setId(101);
        e1.setName("srinivas");
        Set<Employee> es= new HashSet<Employee>();
        List<Employee> el= new ArrayList<Employee>();
 es.add(e);
 es.add(e1);
 System.out.println(es);

        el.add(e);
        el.add(e1);
        System.out.println(el);

    }

}



