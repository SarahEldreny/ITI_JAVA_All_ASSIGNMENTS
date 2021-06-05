package Day3;

import java.util.*;

public class Main_1 {

    private static Comparator<? super Worldcities> population;

    public static void main(String[] args) {
        // write your code here
        String Path = "src\\main\\java\\ExtraSources\\worldcities.csv";
        worldcitiesCSVDAO citiesDAO = new worldcitiesCSVDAO();
        List<Worldcities> worldCities;
        worldCities = citiesDAO.readWorldcitiesfromCSV(Path);
        int i = 0;
        for (Worldcities worldcities : worldCities) {
            System.out.println("#" + (i++) + " " + worldCities);
        }
        worldcountiesCSVDAO countriesDAO = new worldcountiesCSVDAO();
        List<Worldcountries> worldcountries = countriesDAO.readWorldcountiesfromCSV("src\\main\\java\\ExtraSources\\worldcountries.csv");
        int j = 0;
        for (Worldcountries worldCountries : worldcountries) {
            System.out.println("#" + (j++) + " " + worldCountries);
        }
        Map<Integer, List<Worldcities>> cityCountry = new HashMap<>();
        for (Worldcities c : worldCities) {
            if (!cityCountry.containsKey(c.getCode())) {
                List<Worldcities> worldcities = new ArrayList<>();
                worldcities.add(c);
                cityCountry.put((int) c.getCode(), worldCities);
            } else {
                cityCountry.get(c.getCode()).add(c);
            }
            Collections.sort(worldCities, population);
            System.out.println(worldCities);
            List<Worldcities> city = new ArrayList<>();
          /*  worldcountries.stream().map(x -> worldCities.stream()
                    .filter(city -> x.getName().equals(city.getCountry())
                    .mapToDouble(Worldcities::getPopulation).max().getAsDouble())
                    .forEachOrdered((maxCity) -> { worldCities.stream().filter(x -> x.getPopulation() == maxCity)
                    .forEach(x -> city.add(x)); });*/

            StringUtils stringUtils = new StringUtils();
            System.out.println(StringUtils.betterString("Country", "City", (string1, string2) -> string1.length() > string2.length()));

            checkerString checkerString = new checkerString();
            boolean b = checkerString.checkString("java", (string) -> {
                for (int a = 0; a < string.length(); a++) {
                    if (Character.isLetter(string.charAt(a))) {
                        return true;
                    }
                }
                return false;
            });
            System.out.println(b);
        }
    }
}
