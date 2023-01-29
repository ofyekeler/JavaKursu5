package Mentoring.mentoring_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Java2DArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(13);
        list1.add(23);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(33);
        list2.add(123);

        ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();
        list3.add(list1);
        list3.add(list2);

        System.out.println("list3: " + list3);
        System.out.println(list3.size());  // 2

        ArrayList<String> strList1 = new ArrayList<>(Arrays.asList("ece", "cem", "efe", "ali"));
        ArrayList<String> strList2 = new ArrayList<>(Arrays.asList("benay", "benan"));

        ArrayList<ArrayList<String>> strList3 = new ArrayList<>();
        strList3.add(strList1);
        strList3.add(strList2);
        System.out.println("strList3 = " + strList3);

    }
}
