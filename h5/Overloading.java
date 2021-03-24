package h5;

import java.util.ArrayList;
import java.util.Collections;

public class Overloading {

    public int greatest(int a, int b){
        return Math.max(a, b);
    }

    public String greatest(String a, String b){

        String temp = " ";

        if(a.length() < b.length()){

            temp = b;

        }else {

            temp = a;
        }

        return temp;
    }

    public int greatest(ArrayList<Integer> list) {

        int biggestNumber = Collections.max(list);

        return biggestNumber;
    }

    public int factorial(int n){
         //5! = 5 * (4 * 3 * 2 * 1);
        if(n==1){
        return 1;
    } else{
        return (n * factorial(n -1));
        }
    }
//    Main uitvoering
//
//    Overloading overloading = new Overloading();
//    int greatestNumber = overloading.greatest(10, 60);
//        System.out.println("Het grootste getal is: " + greatestNumber);
//
//    String greatestValue = overloading.greatest("324324", "r32eewrewfew");
//        System.out.println(greatestValue);
//
//    ArrayList<Integer> list = new ArrayList<>();
//        list.add(55);
//        list.add(9);
//        list.add(145);
//    int greatestValue1 = overloading.greatest(list);
//        System.out.println("Het grootste getal is: " + greatestValue1);
//
//    int factorial = overloading.factorial(10);
//        System.out.println(factorial);

}
