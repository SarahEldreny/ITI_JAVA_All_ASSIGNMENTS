package Day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.ReadPyramidsFormCSV("src\\main\\java\\ExtraSources\\pyramids.csv");

        int i = 0;
        Object pyramid;
        for (Pyramid p : pyramids) {
           System.out.println("#" + (i++) + "" + p);
        }
        List<Double> Height = pyramids.stream().filter(p -> p.getHeight() > 0).
                map(Pyramid::getHeight).sorted().collect(Collectors.toList());
        System.out.println(Height);
        System.out.println(Height.size());
        
        //The lower quartile 
        System.out.println(Height.get(Height.size() / 4));
        
        //The median 
        System.out.println(Height.get(Height.size() / 2));
        
        //The Upper quartile 
        Collections.reverse(Height);
        System.out.println(Height.get(Height.size() / 4));
        
        //The Avarage   
        double avarage = Height.stream().mapToDouble(Double::doubleValue).sum() / Height.size();
        //double avarage = Height.stream().mapToDouble(h->h.doubleValue()).sum()/Height.size();
        System.out.println(avarage);
    }
}
