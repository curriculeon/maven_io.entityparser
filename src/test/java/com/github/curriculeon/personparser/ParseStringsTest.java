package com.github.curriculeon.personparser;

import com.github.curriculeon.Person;
import com.github.curriculeon.PersonParser;
import org.junit.Assert;
import org.junit.Test;

import java.util.StringJoiner;

/**
 * Created by leon on 1/8/2020.
 */
public class ParseStringsTest {
    // given
    private void test(String[] dataArray, Person[] expectedPersons) {
        PersonParser parser = new PersonParser();

        // when
        Person[] actualPerson = parser.parseStrings(dataArray);

        // then
        Assert.assertArrayEquals(expectedPersons, actualPerson);
    }

    @Test
    public void test0() {
        Long id0 = 99L;
        String firstName0 = "Leon";
        String lastName0 = "Hunter";
        String personData0 = new StringJoiner("\n")
                .add(id0.toString())
                .add(firstName0)
                .add(lastName0)
                .toString();

        String[] personData = {personData0};

        Person person0 = new Person(id0, firstName0, lastName0);
        Person[] expectedPersons = {person0};

        test(personData, expectedPersons);
    }

    @Test
    public void test1() {
        Long id1 = 1L;
        String firstName1 = "Leon";
        String lastName1 = "Hunter";
        String personData1 = new StringJoiner("\n")
                .add(id1.toString())
                .add(firstName1)
                .add(lastName1)
                .toString();

        Long id2 = 2L;
        String firstName2 = "Ali";
        String lastName2 = "Hyman";
        String personData2 = new StringJoiner("\n")
                .add(id2.toString()) //corrected for sending id1
                .add(firstName2) //corrected for sending firstname1
                .add(lastName2) //corrected for sending lastname1
                .toString();

        String[] personData = {personData1, personData2};

        Person person1 = new Person(id1, firstName1, lastName1);
        Person person2 = new Person(id2, firstName2, lastName2);
        Person[] expectedPersons = {person1, person2};

        test(personData, expectedPersons);
    }



    @Test
    public void test2() {
        Long id0 = 99L;
        String firstName0 = "Leon";
        String lastName0 = "Hunter";
        String personData0 = new StringJoiner("\n")
                .add(id0.toString())
                .add(firstName0)
                .add(lastName0)
                .toString();

        Long id1 = 5L;
        String firstName1 = "Noel";
        String lastName1 = "Retnuh";
        String personData1 = new StringJoiner("\n")
                .add(id1.toString())
                .add(firstName1)
                .add(lastName1)
                .toString();

        Long id2 = 3L;
        String firstName2 = "Bezawit";
        String lastName2 = "Maine";
        String personData2 = new StringJoiner("\n")
                .add(id2.toString()) //corrected for sending id1
                .add(firstName2) //corrected for sending firstname1
                .add(lastName2) //corrected for sending lastname1
                .toString();

        String[] personData = {personData0, personData1, personData2};

        Person person0 = new Person(id0, firstName0, lastName0);
        Person person1 = new Person(id1, firstName1, lastName1);
        Person person2 = new Person(id2, firstName2, lastName2);
        Person[] expectedPersons = {person0, person1, person2};

        test(personData, expectedPersons);
    }

}