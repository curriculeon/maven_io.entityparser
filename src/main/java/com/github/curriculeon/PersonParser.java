package com.github.curriculeon;

import java.io.File;

/**
 * Created by leon on 1/8/2020.
 */
public class PersonParser implements Parser<Person> {
    @Override
    public Person parseString(String data) {
        String[] person=data.split("\n");
        return new Person(Long.parseLong(person[0]), person[1], person[2]);
    }

    @Override
    public Person[] parseStrings(String[] data)
    {
        Person[] persons=new Person[data.length];
        int index=0;
        for (String strPerson: data
             ) {
            persons[index]=parseString(strPerson);
            index++;
        }
        return persons;
    }

    @Override
    public Person[] parseFile(File data) {
        String text=new FileReader(data.getPath()).toString();
        String [] arrValues=text.split("\n");
        Person [] persons=new Person[arrValues.length/3];
        int personIndex=0;
        for (int index = 0;index<arrValues.length;) {
            persons[personIndex]=new Person (Long.parseLong(arrValues[index]),arrValues[index+1], arrValues[index+2]);
            personIndex++;
            index+=3;
        }
        return persons;
    }
}
