package org.example;

import ListaEncadeada.LinkedList;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;



public class CsvHandle {
    public static void readDataLineByLine(String file, LinkedList listaEncadeada)
    {

        try {

            // Create an object of filereader
            // class with CSV file as a parameter.
            FileReader filereader = new FileReader(file);

            // create csvReader object passing
            // file reader as a parameter
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            // we are going to read data line by line
            while ((nextRecord = csvReader.readNext()) != null) {

                //corrigir de acordo com entrada dos dados
                listaEncadeada.add();

                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

