package com.github.curriculeon;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        int j=0;
        for(String i: data){
            persons[j] = parseString(i);
            j++;
        }
        return persons;
    }

    @Override
    public Person[] parseFile(File data) {
        String fileName = String.valueOf(data);
        FileReader file = new FileReader(fileName);
        String[] fileStrings = file.toString().split("\n");
        String[] selectedLines = new String[fileStrings.length/3];
        int j=0;
        for(int i=0; i<fileStrings.length; i++) {
            selectedLines[j] = fileStrings[i] + "\n" + fileStrings[i+1] + "\n" + fileStrings[i+2];
            i+=2;
            j++;
        }
        Person[] persons = parseStrings(selectedLines);
        return persons;
    }
}
