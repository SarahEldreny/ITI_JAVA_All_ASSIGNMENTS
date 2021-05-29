package company.com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class worldcitiesCSVDAO {
    List<Worldcities> worldCities;

    public List<Worldcities> readWorldcitiesfromCSV (String filename){
        this.worldCities= new ArrayList<Worldcities>();
        List<String> lines = new ArrayList<String>();
        File worldcitiesfile = new File(filename);
        try {
            lines = Files.readAllLines(worldcitiesfile.toPath());
        } catch (IOException e) {
            System.out.println("An issue happened while reading worldCities file: " + e);
        }
        for (int lineIdx=1; lineIdx < lines.size(); lineIdx++) {
            String line = lines.get(lineIdx);
            String [] fields = line.split(",");
            for (int fieldIndex=0; fieldIndex < fields.length; fieldIndex++) {
                fields[fieldIndex]= fields[fieldIndex].trim();
                Worldcities worldcitiesObj = createWorldcities (fields);
                worldCities.add(worldcitiesObj);
                return worldCities;
            }
        }

        return worldCities;
    }
    public Worldcities createWorldcities(String[] metadata) {
        Worldcities worldcitiesObj = new Worldcities(metadata[0],metadata[1],Double.parseDouble(metadata[2]),Double.parseDouble(metadata[3]),Double.parseDouble(metadata[5]));
        return worldcitiesObj;
    }

}
