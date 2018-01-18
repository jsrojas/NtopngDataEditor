/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSVCreator;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author juan
 */
public class CSVCreator {

    public void csvCreator(String[][] labeledDataset) {
        String csvPath = "/home/juan/ntop/CSVOutput/26-04/26-04-4_12pm-JavaLabeled.csv";

        try {
            CSVWriter writer = new CSVWriter(new FileWriter(csvPath));
            List<String[]> csvData = Arrays.asList(labeledDataset);

            writer.writeAll(csvData);
            writer.close();
            System.out.println("CSV file created succesfully.");

            //csvData.addAll(list);
        } catch (Exception e) {
            System.out.println("exception :" + e.getMessage());
        }
    }

}
