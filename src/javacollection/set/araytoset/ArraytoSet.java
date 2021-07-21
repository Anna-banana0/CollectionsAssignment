package javacollection.set.araytoset;


import java.util.*;

public class ArraytoSet {
    public void removeDuplicates(){
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(89);
        list.add(22);
        list.add(89);
        list.add(11);
        list.add(44);
        list.add(61);
        list.add(16);
        Set<Integer> Hset = new HashSet<>(list);
        System.out.println("using HashSet");
        System.out.println(Hset); // unique without order of insertion

        Set<Integer> Tset = new TreeSet<>(list); // unique with sorted set
        System.out.println("using TreeSet");
        System.out.println(Tset);

        Set<Integer> LHset = new LinkedHashSet<>(list); // unique with order of insertion
        System.out.println("using LinkedHashSet");
        System.out.println(LHset);

    }
}





