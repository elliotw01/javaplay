package wood.elliot.school;

import java.time.LocalDate;

public class SchoolStarter {

    public static void main( String [] args ) {
        SchoolStarter ss = new SchoolStarter();
        ss.createSchool();
    }

    private void createSchool() {
        System.out.println( "Creating school" );
        Student elliot = new Student();
        elliot.setName( "ELLIOT" );
        elliot.setDob( LocalDate.of(2005,1,30) );
        System.out.println( elliot.toString() );

        Student owen = new Student();
        owen.setName( "owen" );
        owen.setDob( LocalDate.of(2001,12,14) );
        System.out.println(owen.toString());

        Parent mike = new Parent();
        mike.setName( "Mike" );
        mike.setDob( LocalDate.of(1975,4,10) );
        mike.addChild(elliot);
        mike.addChild(owen);
        System.out.println(mike.toString());
    }
}
