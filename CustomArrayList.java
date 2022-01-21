package java8Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomArrayList extends ArrayList {

String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomArrayList)) return false;
        if (!super.equals(o)) return false;
        CustomArrayList that = (CustomArrayList) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public boolean add(Object o){
        if(this.contains(o))
            return true;
        else
            return super.add(o);

    }

    public static void main(String args[]){

        CustomArrayList cl  = new CustomArrayList();
        cl.add(1);
        cl.add(1);
        cl.add(1);
        cl.add(12);
        System.out.println(cl);
        System.out.println(cl.hashCode());

        Object ca =  cl.clone();

        System.out.println(ca.hashCode());





    }
}
