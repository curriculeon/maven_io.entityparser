package com.github.curriculeon;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by leon on 1/8/2020.
 */
public class PetParser implements Parser<Pet> {
    Long id;
    String name;
    Date birthDate;
    @Override
    public Pet parseString(String data) {
        String [] temp = data.split("\n");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        this.id= Long.parseLong(temp[0]);
        this.name = String.valueOf(temp[1]);
        try {
            this.birthDate = formatter.parse(temp[2]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Pet pet= new Pet(this.id, this.name, this.birthDate);
        return pet;
    }

    @Override
    public Pet[] parseStrings(String[] data) {
        Pet[] pets = new Pet[data.length];
        int j=0;
        for(String i: data){
            pets[j] = parseString(i);
            j++;
        }
        return pets;
    }

    @Override
    public Pet[] parseFile(File data) {
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
        Pet[] pets = parseStrings(selectedLines);
        return pets;
    }
}
