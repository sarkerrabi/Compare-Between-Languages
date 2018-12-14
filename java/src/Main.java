import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String filepath = "NCHS_-_Leading_Causes_of_Death__United_States.csv";

        String inpurText = "";
        Scanner scanner = new Scanner(System.in);

        inpurText = scanner.nextLine();


        Reader inputFile  = new FileReader(filepath);
        try {
            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(inputFile);
            for (CSVRecord record :
                    records) {
//                String year = record.get(0);
//                System.out.println(year);

                if (record.get(0).toLowerCase().trim().equals(inpurText.toLowerCase().trim())
                        ||record.get(1).toLowerCase().trim().equals(inpurText.toLowerCase().trim())
                        ||record.get(2).toLowerCase().trim().equals(inpurText.toLowerCase().trim())
                        ||record.get(3).toLowerCase().trim().equals(inpurText.toLowerCase().trim())
                        ||record.get(4).toLowerCase().trim().equals(inpurText.toLowerCase().trim())
                        ||record.get(5).toLowerCase().trim().equals(inpurText.toLowerCase().trim()))
                {
                    System.out.println(record.get(0)+" "+record.get(1)+" "+record.get(2)
                            +" "+record.get(3)+" "+record.get(4)+" "+record.get(5));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
