import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String filepath = "NCHS_-_Leading_Causes_of_Death__United_States.csv";

        String inpurText = "55.50";

        Reader inputFile  = new FileReader(filepath);
        try {
            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(inputFile);
            for (CSVRecord record :
                    records) {
//                String year = record.get(0);
//                System.out.println(year);

                if (record.get(0).equals(inpurText)
                        ||record.get(1).equals(inpurText)
                        ||record.get(2).equals(inpurText)
                        ||record.get(3).equals(inpurText)
                        ||record.get(4).equals(inpurText)
                        ||record.get(5).equals(inpurText))
                {
                    System.out.println(record.get(0)+" "+record.get(1)+" "+record.get(2)+" "+record.get(3)+" "+record.get(4)+" "+record.get(5));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
