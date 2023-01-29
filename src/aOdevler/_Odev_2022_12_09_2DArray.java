package aOdevler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _Odev_2022_12_09_2DArray {
    public static void main(String[] args) {

        //1- Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
            //Bütün 2'leri 6'yla değiştirin.
            //Array'i yazdırınız.

        int[][] arr1={{2,3,2},{4,1,5},{7,2,5}};
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr1[i].length; j++)
            {
                if (arr1[i][j]==2)
                    arr1[i][j]=6;
            }
        }
        System.out.println(Arrays.deepToString(arr1));

        //2- Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
            //2D array'de olan elemanları toplayınız.
            //toplamı yazdırınız.
            //Sonuç 32 olmalıdır.

        int[][] arr2={{5,2,1},{10,2,3,6},{1,2}};
        int toplam2=0;

        for (int i2 = 0; i2 < arr2.length; i2++)
        {
            for (int j2 = 0; j2 < arr2[i2].length; j2++)
            {
                toplam2+=arr2[i2][j2];
            }
        }
        System.out.println(toplam2);

        //3- Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
            //[{"new jersey","atlanta","ohio"} ,
            //{"Pittsburgh" ,"ohio","new york","ohio"} ,
            //{"ohio","new york"}]
            //Bütün ohio'ları Florida'yla değiştiriniz.
            //Array'i yazdırınız.

        String[][]arr3={
                {"new jersey","atlanta","ohio"},
                {"Pittsburgh" ,"ohio","new york","ohio"},
                {"ohio","new york"}};
        for (int i3 = 0; i3 < arr3.length; i3++)
        {
            for (int j3 = 0; j3 < arr3[i3].length; j3++)
            {
                if(arr3[i3][j3].equals("ohio"))
                    arr3[i3][j3]="florida";
            }
        }
        System.out.println(Arrays.deepToString(arr3));


        //4- Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
            //Store all the elements in one arraylist and print the arraylist
            //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
            //**Örnek:**
            //```
            //**Girdi:**
            //[
            // [ 1, 2, 3 ],
            // [ 4, 5, 6 ],
            // [ 7, 8, 9 ]
            //]
            //**Çıktı:** [1,2,3,4,5,6,7,8,9]
            //```

        int[][] arr4={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> list4=new ArrayList<>();
        for (int i4 = 0; i4 < arr4.length; i4++)
        {
            for (int j4 = 0; j4 < arr4[i4].length; j4++)
            {
                list4.add(arr4[i4][j4]);
            }
        }
        System.out.println(list4);

        //5- ismi getCount() olan bir method oluşturun.
            //Parametre olarak bir String ArayList  ve  bir tane String
            //Return tipi int olmalı.
            //ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
            //Örneğin;
            //ArrayList = Orange , Kiwi , Peach , Banana , Orange
            //String Orange:
            //Count = 2 olmalı. (Orange 2 kez yazılmış)

        String[] arr5={"Orange","Kiwi","Peach","Banana","Orange"};
        System.out.println(getCount(arr5));

        //6- getSum() isminde bir method oluşturun.
            //Parametresi ArrayList olmalı
            //Return tipi int olmalı.
            //ArrayList teki tüm sayıları birbiri ile toplayın.
            //return olarak toplam sonucu döndürün.
            //Örneğin;
            //Arraylist = 1,2,3,4,5
            //return 15 olmalı

        ArrayList<Integer> list6=new ArrayList<>();
        Collections.addAll(list6,1,2,3,4,5);
        System.out.println(getSum(list6));

        //7- getLength() isminde bir method oluşturun.
            //Parametre olarak String ArrayList
            //Return tipi Integer ArrayList
            //ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
            //Tüm elementlerin uzunluğunu döndürün
            //Örneğin;
            //ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
            //Tüm Stringlerin uzunluklarını yazdırın;
            //cevap: 10 ,  8 , 4 , 7 , 6 olmalı

        ArrayList<String> list7 = new ArrayList<>();
        Collections.addAll(list7, "New Jersey", "New york", "Ohio", "Florida", "Boston");
        for (Integer i7 : getLength(list7))
        {
            System.out.print(i7+" ");
        }

        //8- İsmi changelnArraylist() olan bir method oluşturun.
            //Parametre olarak String ArrayList, String s1, String s2
            //   Arraylist'te s1'i s2 olarak değiştirin
            //Return String arrayList
            //Örneğin;
            //Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
            //s1 = blue
            //s2 = yellow
            //Tüm blue 'ları yellow'a dönüştürün.
            //cevap: "yellow" , "red" , "yellow" , "red" , "yellow"

        ArrayList<String> list8=new ArrayList<>();
        Collections.addAll(list8,"yellow","red","blue","red","blue");
        for (String s8 : changeArrayList(list8))
        {
            System.out.print(s8+" ");
        }

        /*-------------------------------*/

    }
/*5*/public static String getCount(String[] arr5){
        int count5=1;
        String tekrar5="";
        Arrays.sort(arr5);
        for (int i5 = 1; i5 < arr5.length; i5++)
        {
            if (arr5[i5-1].equals(arr5[i5]))
            {
                count5++;
                tekrar5=arr5[i5];
            }
        }
        return tekrar5+" "+count5+" kez yazılmış";
    }
/*6*/public static int getSum(ArrayList<Integer> list6)
    {
        int toplam6=0;
        for (Integer sayı6 : list6)
        {
            toplam6 += sayı6;
        }
        return toplam6;
    }
/*7*/public static ArrayList<Integer> getLength(ArrayList<String> list7) {
        ArrayList<Integer> listInt7 = new ArrayList<>();
        for (String str7 : list7)
        {
            listInt7.add(str7.length());
        }
        return listInt7;
    }
/*8*/public static ArrayList<String> changeArrayList(ArrayList<String> list8)
    {
        ArrayList<String> changedList=new ArrayList<>();
        for (String s8 : list8)
        {
            if (s8.equals("blue"))
                s8="yellow";
            changedList.add(s8);
        }
        return changedList;
    }
}
