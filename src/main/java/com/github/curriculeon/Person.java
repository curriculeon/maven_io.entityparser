package com.github.curriculeon;

/**
 * Created by leon on 1/8/2020.
 */
public class Person {
    private Long id;
    private String firstName;
    private String lastName;

    public Person(Long id, String firstName, String lastName) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + this.id +
                ", firstName='" + this.firstName + '\'' +
                ", lastName='" + this.lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object objectToCompareAgainst) {
        Person personToCompareAgainst = (Person)objectToCompareAgainst;
        String personCurrentState = personToCompareAgainst.toString();
        String thisPersonCurrentState = this.toString();
        return personCurrentState.equals(thisPersonCurrentState);
    }
}
