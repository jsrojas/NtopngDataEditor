/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSVReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author juan
 */
public class CSVReader {

    public List<List<String>> CSVLabelsLoader(String fileName) {

        File file = new File(fileName);

        // this gives you a 2-dimensional array of strings
        List<List<String>> ntopngSet = new ArrayList<>();
        Scanner inputStream;

        try {
            inputStream = new Scanner(file);

            while (inputStream.hasNext()) {
                String line = inputStream.next();
                String[] values = line.split(",");
                // this adds the currently parsed line to the 2-dimensional string array
                ntopngSet.add(Arrays.asList(values));
            }

            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return ntopngSet;
    }

    public List<List<String>> CSVUnlabeledLoader(String fileName) {

        File file = new File(fileName);

        // this gives you a 2-dimensional array of strings
        List<List<String>> unlabeledSet = new ArrayList<>();
        Scanner inputStream;

        try {
            inputStream = new Scanner(file);

            while (inputStream.hasNext()) {
                String line = inputStream.next();
                String[] values = line.split(",");
                // this adds the currently parsed line to the 2-dimensional string array
                unlabeledSet.add(Arrays.asList(values));
            }

            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return unlabeledSet;

    }
    
        public List<List<String>> CSVProtocolsLoader(String fileName) {

        File file = new File(fileName);

        // this gives you a 2-dimensional array of strings
        List<List<String>> protocolsSet = new ArrayList<>();
        Scanner inputStream;

        try {
            inputStream = new Scanner(file);

            while (inputStream.hasNext()) {
                String line = inputStream.next();
                String[] values = line.split(",");
                // this adds the currently parsed line to the 2-dimensional string array
                protocolsSet.add(Arrays.asList(values));
            }

            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return protocolsSet;
    }

}
