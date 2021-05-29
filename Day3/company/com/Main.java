package company.com;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main<string, b> {

    private static Comparator<? super Worldcities> population;

    public static void main(String[] args) {
	// write your code here
        String Path = "worldcities.csv";
        worldcitiesCSVDAO citiesDAO = new worldcitiesCSVDAO();
        List<Worldcities> worldCities;
        worldCities = citiesDAO.readWorldcitiesfromCSV(Path);
        int i = 0;
        for (Worldcities worldcities : worldCities) {
            System.out.println("#" + (i++) + " " + worldcities);
        }
        worldcountiesCSVDAO countriesDAO = new worldcountiesCSVDAO();
        List<Worldcountries> worldcountries = countriesDAO.readWorldcountiesfromCSV("worldcountries.csv");
        int j=0;
        for (Worldcountries worldCountries: worldcountries){
            System.out.println("#" + (j++) + " " + worldCountries);
        }
        Map<Integer, List<Worldcities> > cityCountry = new HashMap<>();
        for (Worldcities c : worldCities){
            if (!cityCountry.containsKey(c.getCode())){
                List<Worldcities> worldcities = new ArrayList<>();
                worldcities.add(c);
                cityCountry.put((int) c.getCode(), worldCities);
            } else {
                cityCountry.get(c.getCode()).add(c);
            }
            Collections.sort(worldCities, population);
            System.out.println(worldCities);

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
}}}
