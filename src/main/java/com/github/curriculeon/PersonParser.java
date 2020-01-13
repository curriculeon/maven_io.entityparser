package com.github.curriculeon;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by leon on 1/8/2020.
 */
public class PersonParser implements Parser<Person> {
    long id;
    String first, last;
    @Override
    public Person parseString(String data) {
        String [] temp = data.split("\n");
        this.id= Long.parseLong(temp[0]);
        this.first = String.valueOf(temp[1]);
        this.last = String.valueOf(temp[2]);
        Person person= new Person(this.id, this.first, this.last);
        return person;
    }

    @Override
    public Person[] parseStrings(String[] data) {
        Person[] persons = new Person[data.length];
        for(int i=0; i< data.length; i++){
            String [] temp = data[i].split("\n");
            this.id= Long.parseLong(temp[0]);
            this.first = String.valueOf(temp[1]);
            this.last = String.valueOf(temp[2]);
            persons[i] = new Person(id, first, last);
        }
        return persons;
    }

    @Override
    public Person[] parseFile(File data) {
        FileReader file = new FileReader(data.getName());
        String fileContents = file.toString();
        String[] fileStrings = fileContents.split("\n");
        for(int i=0; i<fileStrings.length; i++) {

            }
        Person[] persons= parseStrings(fileContents);
        return persons;
    }
}
