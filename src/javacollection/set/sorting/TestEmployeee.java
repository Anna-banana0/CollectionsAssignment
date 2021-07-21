package javacollection.set.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmployeee {
    public static void main(String[] args) {

        List<Employeee> list = new ArrayList<>();
        list.add(new Employeee("Ani Singh",341,"Java Team"));
        list.add(new Employeee("Doloris",500,"HR"));
        list.add(new Employeee("Shin Chan",1,"HR"));
        list.add(new Employeee("Dumbledore",121,"Legal"));

        System.out.println("Before sorting: ");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Sorted by name");
        System.out.println(list);

        Comparator<Employeee> com = new Comparator<Employeee>() {
            @Override
            public int compare(Employeee e1, Employeee e2) {

                if(e1.getEmpno() > e2.getEmpno())
                    return 1;
                else if(e1.getEmpno() < e2.getEmpno())
                    return -1;
                return 0;
            }
        };
        System.out.println("Sorted with empno");
        Collections.sort(list,com);
        System.out.println(list);
    }
}
