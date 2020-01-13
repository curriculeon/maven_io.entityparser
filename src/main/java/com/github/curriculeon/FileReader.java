package com.github.curriculeon;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/**
 * Created by leon on 1/8/2020.
 */
public class FileReader {
    private final String filename;
    private File file;
    Scanner scanner;

    public FileReader(String filename){
        this.filename = "src/main/resources" + filename;
        this.file = new File(this.filename);
    }

    @Override
    public String toString(){
        String contents = new String();
        try {
            scanner = new Scanner(this.file);
            while (scanner.hasNextLine()) {
                contents += scanner.nextLine();
                if(scanner.hasNextLine()) contents+='\n';
            }
        }catch (IOException e){
            throw new Error(e);
        }
        return contents;
    }

}
