package Project2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Artem");
        list.add("Adrian");
        list.add("Kate");
        list.add("Karim");
        list.add("Eva");
        list.add("Dmitry");
        list.add("Artem");
        list.add("Eva");

        ArrayList<String> removeList = removeDuplicates(list);

        System.out.println("Original List: " + list);
        System.out.println("List without Duplicates: " + removeList);
    }

    public static <A> ArrayList<A> removeDuplicates(ArrayList<A> list) {
        HashSet<A> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}


