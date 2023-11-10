package work02;
import work01.Utilitor;
import work01.Utilitor.*;

import java.util.Objects;
import java.util.StringJoiner;

public class Person {
    private static int nextId = 1;
    private final int id;
    private String firstName;
    private String lastName;

    public Person(String firstName , String lastName){
        this.firstName = Utilitor.testString(firstName);
        this.lastName = Utilitor.testString(lastName);
        this.id = nextId;
        nextId += 1;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person(")";
        sb.append("id=")
        sb.append(id);
        sb.append(", firstName='");
        sb.append(firstName);
        sb.append(", lastName='");
        sb.append(lastName);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    @Override
    public boolean equals (Objects obj){
        if (this == obj) {
            return true;
        } else return false;
    }
}
