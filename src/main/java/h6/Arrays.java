package h6;

import java.util.Arrays;

class ArraysOp {
    public static void main(String[] args) {
        long[] row = new long[4]; //[0, 0, 0, 0] je maakt een array van 4 lang. Het begint van 0 tot en met 3.
        row[2] = 3; //[0, 0, 3, 0] je geeft de 3e vak in de array de waarde 3.
        long[] copy = row; //[0, 0, 3, 0] je maakt een nieuwe array genaamd copy en geeft het de reference naar row.
        copy[2]++; //[0, 0, 4, 0] je verhoogd de 3e vak van de array met 1.

            System.out.println(row[2]);

        long[] array = new long[] {1, 2, 3, 4};
            System.out.println(array.length);

        long[] newArray = Arrays.copyOf(array, array.length*2);
            System.out.println(newArray.length);

            System.out.println(Arrays.toString(newArray));

        long[] multiplierArray = new long[]{1, 2, 3, 4};
        multiplier(multiplierArray, 2);
            System.out.println(Arrays.toString(multiplierArray));

    }
    public static void multiplier(long[] multiplyArray, int multiplier){
        for (int i = 0; i < multiplyArray.length; i++) {
            multiplyArray[i] =  multiplyArray[i] * multiplier;
        }
    }
}
