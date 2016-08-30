package org.bthnapaydin.learning.field;

/**
 * Created by bapaydin on 30.08.2016.
 */
public class TestClass {
    private String firstName;
    private String lastName;


    public TestClass(){

    }

    public TestClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void printFullName(){
        String fullName = firstName +" " + lastName;
        System.out.println("Full name : " + fullName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
