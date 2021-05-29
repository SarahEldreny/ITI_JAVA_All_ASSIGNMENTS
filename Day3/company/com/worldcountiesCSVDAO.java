package company.com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class worldcountiesCSVDAO {
    List<Worldcountries> worldCounties;
    public List<Worldcountries> readWorldcountiesfromCSV (String filename){
        this.worldCounties= new ArrayList<Worldcountries>();
        List<String> lines = new ArrayList<String>();
        File worldcountiesfile = new File(filename);
        try {
            lines = Files.readAllLines(worldcountiesfile.toPath());
        } catch (IOException e) {
            System.out.println("An issue happened while reading worldCounties file: " + e);
        }
        for (int lineIdx=1; lineIdx < lines.size(); lineIdx++) {
            String line = lines.get(lineIdx);
            String [] fields = line.split(",");
            for (int fieldIndex=0; fieldIndex < fields.length; fieldIndex++) {
                fields[fieldIndex]= fields[fieldIndex].trim();
                Worldcountries worldCountiesObj = createWorldcountries(fields);
                worldCounties.add(worldCountiesObj);
            }
        }

        return worldCounties;
    }
    public Worldcountries createWorldcountries (String[] metadata) {
        Worldcountries worldCountriesObj = new Worldcountries (metadata[0],metadata[1],Double.parseDouble(metadata[2]),Double.parseDouble(metadata[3]),Double.parseDouble(metadata[5]));
        return worldCountriesObj;
    }

}
