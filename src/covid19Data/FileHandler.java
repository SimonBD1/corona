package covid19Data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileHandler {

    public void loadData() throws IOException {
        Scanner reader = new Scanner(new File("data/11_noegletal_pr_region_pr_aldersgruppe.csv"), StandardCharsets.ISO_8859_1);
        System.out.println("udskriver hele filen");

        reader.nextLine();

        while (reader.hasNextLine()) {
            String line = reader.nextLine();

            Covid19Data dataobjekt = csvLine(line);

            System.out.println(line);
        }
        System.out.println("Færdig med at udskrive");
    }

    private Covid19Data csvLine(String line) {
        String[] parts = line.split(";");

        Covid19Data dataObjekt = new Covid19Data();

        dataObjekt.setRegion(parts[0]);
        dataObjekt.setAldersgruppe(parts[1]);
        int tilfælde = Integer.parseInt(parts[2]);
        dataObjekt.setBekræftedeIAlt(tilfælde);
        dataObjekt.setDøde(Integer.parseInt(parts[3]));
        dataObjekt.setIndlagtPåIntensiv(Integer.parseInt(parts[4]));
        dataObjekt.setIndlagte(Integer.parseInt(parts[5]));
        dataObjekt.setDato(parts[6]);

        return dataObjekt;
    }

    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler();
        fileHandler.loadData();
    }
}
