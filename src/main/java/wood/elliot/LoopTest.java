package wood.elliot;

import java.util.Arrays;

public class LoopTest {

    public static void main(String[] args) {
        new LoopTest().loop();
    }

    public void loop() {
        System.out.println("For test");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Number is: " + i);
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        // write a for loop that counts from 20 to 1
        // but only prints out the variable z if it is even
        // see web page for help with how to check if number is even

        for( int z = 20; z > 0; z-- ) {
            if( z % 2 == 0 ) {
                System.out.println("The value of z is: " + z);
            }
        }

        System.out.println( "++++++++++++++++++++++++++++++++++++++++++" );

        int i = 1;
        while( i <= 10 ) {
            System.out.println( "Number is " + i );
            i = i + 1;
        }

        System.out.println( "++++++++++++++++++++++++++++++++++++++++++" );

        int x = 10;
        while( x <= 20 ) {

            if(x >= 15)
                System.out.println( "Number is " + x );

            x = x + 1;
        }

        String songTitle = "sweet child o mine";
        String[] splitSongTitle = songTitle.split(" ");
        System.out.println(Arrays.toString(splitSongTitle));

    }
}
