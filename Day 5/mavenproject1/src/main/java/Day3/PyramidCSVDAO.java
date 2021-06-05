package Day3;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PyramidCSVDAO {
     List<Pyramid> pyramid;
     File pyramidsFile;


     public PyramidCSVDAO() {
          this.pyramid = new ArrayList<Pyramid>();
     }

     public List<Pyramid> ReadPyramidsFormCSV(String fileName) {
          pyramidsFile = new File(fileName);
          List<String> lines = new ArrayList<String>();
          try {
               lines = Files.readAllLines(pyramidsFile.toPath());
          } catch (Exception e) {
               System.out.println("An issue happened while reading pyramids file: " + e);
          }
          for (int lineIdx = 1; lineIdx < lines.size(); lineIdx++) {
               String line = lines.get(lineIdx);
               String[] data = line.split(",");
               pyramid.add(createPyramid(data));
          }
          return pyramid;
     }
          public Pyramid createPyramid(String[] metadata) {
               Pyramid pyramid = new Pyramid(metadata[0], metadata[2], metadata[4],
                       metadata[7].equals("") ? 0 : Double.parseDouble(metadata[7]));
               return pyramid;
          }
     }


