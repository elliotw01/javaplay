package wood.elliot.school;

import java.util.ArrayList;
import java.util.Collection;

public class Parent extends Person {

    Collection <Student> children = new ArrayList<>();

    public void addChild( Student student ) {
        children.add(student);
    }

    @Override
    public String toString() {
        return "Parent{" +
                "children=" + children +
                ", dob=" + getDob() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
