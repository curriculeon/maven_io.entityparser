package com.github.curriculeon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 * Created by leon on 1/8/2020.
 */
public class FileReader {
    private final String filename;

    public FileReader(String filename)
    {
        this.filename = "src/main/resources"+filename;
    }

    @Override
    public String toString(){
        Scanner scanner= null;
        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder text=new StringBuilder();
        int count=0;
        while ( scanner.hasNextLine() ){
            if(count!=0)
                text.append("\n");
            text.append(scanner.nextLine());
            count++;

        }
        return text.toString();
    }

}
