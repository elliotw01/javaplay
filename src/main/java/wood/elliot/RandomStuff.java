package wood.elliot;

import java.util.Random;

public class RandomStuff {

    final int THIS_CANNOT_BE_CHANGED = 32323;

    int int1 = 999999999;
    long long1 = 999999999999999999L;
    String st1 = "f;ioSD;FLASJDAUEOF89IO3ro89qwfhaspd-eilfhsi";
    String st2 = "291829182198291";

    public void setVariables() {
        printVariables();
        int1 = 38282938;
        long1 = 239382;
        st1 = "I love Elliot";
        st2 = "Elliot hates me";
        printVariables();
        int ran = new Random().nextInt(100);

        System.out.println("ran is " + ran);
    }

    public void printVariables() {
        System.out.println( "int1 is " + int1 );
        System.out.println( "long1 is " + long1 );
        System.out.println( "st1 is " + st1 );
        System.out.println( "st2 is " + st2 );
    }
}
