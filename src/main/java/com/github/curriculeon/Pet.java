package com.github.curriculeon;

import java.util.Date;

/**
 * Created by leon on 1/8/2020.
 */
public class Pet {
    Long id;
    String name;
    Date birthDate;
    public Pet(Long id, String name, Date birthDate) {
        this.id=id;
        this.birthDate=birthDate;
        this.name=name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date type) {
        this.birthDate=birthDate;
    }
    @Override
    public String toString() {
        return "Pet{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", Date='" + birthDate + '\'' +
               '}';
    }
    @Override
    public boolean equals(Object objectToCompareAgainst) {
        Pet petToCompareAgainst = (Pet)objectToCompareAgainst;
        String petCurrentState = petToCompareAgainst.toString();
        String thisPetCurrentState = this.toString();
        return petCurrentState.equals(thisPetCurrentState);
    }
}
