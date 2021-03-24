import h5.Overloading;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        long[] row = new long[4]; //[0, 0, 0, 0] je maakt een array van 4 lang. Het begint van 0 tot en met 3.
        row[2] = 3; //[0, 0, 3, 0] je geeft de 3e vak in de array de waarde 3.
        long[] copy = row; //[0, 0, 3, 0] je maakt een nieuwe array genaamd copy en geeft het de zelfde waarde als row.
        copy[2]++; //[0, 0, 4, 0] je verhoogd de 3e vak van de array met 1.

        System.out.println(row[2]);

    }

}
