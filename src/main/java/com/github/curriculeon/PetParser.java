package com.github.curriculeon;


import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by leon on 1/8/2020.
 */
public class PetParser implements Parser<Pet> {
    @Override
    public Pet parseString(String data) {
        String[] pet=data.split("\n");

        return new Pet(Long.parseLong(pet[0]),pet[1], parseDate(pet[2]));
    }

    @Override
    public Pet[] parseStrings(String[] data) {
        Pet[] pets=new Pet[data.length];
        int index=0;
        for (String strPet: data
        ) {
            pets[index]=parseString(strPet);
            index++;
        }
        return pets;
    }

    @Override
    public Pet[] parseFile(File data)
    {
        String text=new FileReader(data.getPath()).toString();
        String [] arrValues=text.split("\n");
        Pet [] pets=new Pet[arrValues.length/3];
        int petIndex=0;
        for (int index = 0;index<arrValues.length;) {
            pets[petIndex]=new Pet (Long.parseLong(arrValues[index]),arrValues[index+1],
                    parseDate(arrValues[index + 2]));
            petIndex++;
            index+=3;
        }
        return pets;
    }
    public static Date parseDate(String sDate1) {
        try {
            return new SimpleDateFormat("MM-dd-yyyy").parse(sDate1);
        } catch (ParseException e) {
            throw new Error(e);
        }
    }
}
