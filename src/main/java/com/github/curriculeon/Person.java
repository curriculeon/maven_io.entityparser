package com.github.curriculeon;

/**
 * Created by leon on 1/8/2020.
 */
public class Person {
    private Long id;
    private String firstName;
    private String lastName;

    public Person(Long id, String firstName, String lastName) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
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
