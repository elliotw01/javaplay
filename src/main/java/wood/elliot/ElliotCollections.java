package wood.elliot;

import java.util.*;

public class ElliotCollections {

    public static void main(String[] args) {
        new ElliotCollections().run();
    }

    public void run() {
        listTest();
        /*setTest();
        mapTest();
        arrayTest();*/
    }

    public void arrayTest() {
        String[] stringArray = new String[] {
          "car", "boat", "plane", "helicopter", "train"
        };

        for( String st : stringArray ) {
            System.out.println( st );
        }
    }

    public void mapTest() {
        Map<Integer, String> myMap = new HashMap<>();
        System.out.println( "myMap size is " + myMap.size() );
        myMap.put( 1, "Elliot" );
        myMap.put( 2, "Mike" );
        System.out.println( "myMap size is " + myMap.size() );
        myMap.remove( 1 );
        System.out.println( "myMap size is " + myMap.size() );

        for( String v : myMap.values() ) {
            System.out.println( v );
        }
    }

    public void setTest(){
        Set<Integer> integerSet = new HashSet<>();
        System.out.println( "Size of integerSet is: " + integerSet.size() );
        integerSet.add( 42 );
        integerSet.add( 42123123 );
        System.out.println( "Size of integerSet is: " + integerSet.size() );
        integerSet.remove( 42 );
        System.out.println( "Size of integerSet is: " + integerSet.size() );

        for( Integer i : integerSet ){
            System.out.println( i );
        }
    }

    public void listTest() {
        List<String> stringList = new ArrayList<>();
        System.out.println( "Size of stringList is: " + stringList.size() );
        stringList.add( "lkajdfklajdf" );
        stringList.add( "ua9839843423klrw" );
        System.out.println( "Size of stringList is: " + stringList.size() );
        stringList.remove( 0 );
        System.out.println( "Size of stringList is: " + stringList.size() );

        for( String s : stringList ) {
            System.out.println( s );
        }
    }
}
