package h3;

public class h3 {
    public static void main(String[] args) {
        //Hoofdstuk 3

        int age = 18;
        age = age + 1;
        age += 1;
        age++;
        ++age;

        // dit is voorbeeld van ++i
        int incrementedAge = ++age;
        System.out.println(incrementedAge);

        // dit is voorbeeld van i++
        int incrementedAge2 = age++;
        System.out.println(incrementedAge2);

        //3.2


        //int 0000 0000 0000 0000 0000 0000 0000 0000
        int i = 6;
        int j = i < 3 ? i++ + ++i : ++i >>> 1;
        System.out.println(j);

    }
}
