package Project2;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Artem");
        list.add("Adrian");
        list.add("Kate");
        list.add("Karim");
        list.add("Lee");
        list.add("Dmitry");
        list.add("Anton");
        list.add("Eva");

        List<String>findNemes=findName(list);
        System.out.println("Filtered strings "+findNemes);
    }


    public static List<String> findName(List<String> strings){
        List<String> findNemes=new ArrayList<>();
        for (String str:strings){
            if (str.toLowerCase().startsWith("a")){
                findNemes.add(str.toLowerCase());


            }
        }
        return findNemes;
    }
}
