package com.github.curriculeon;

import java.util.Date;

/**
 * Created by leon on 1/8/2020.
 */
public class Pet {
    private Long id;
    private String name;
    private Date birthDate;
    public Pet(Long id, String name, Date birthDate) {
        setId(id);
        setName(name);
        setBirthDate(birthDate);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date type) {
        this.birthDate = birthDate;
    }
    @Override
    public String toString() {
        return "Pet{" +
                "id=" + this.id +
                ", Name='" + this.name + '\'' +
                ", BirthDate='" + this.birthDate + '\'' +
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
