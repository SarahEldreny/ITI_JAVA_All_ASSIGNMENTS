package Day3;

public class Worldcities {

    private String name, continent, country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    private double code, surfaceArea, population;

    public Worldcities(String name, String continent, String country, double code, double surfaceArea, double population) {
        this.name = name;
        this.continent = continent;
        this.country = country;
        this.code = code;
        this.surfaceArea = surfaceArea;
        this.population = population;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Worldcities{" + "name=" + name + ", continent=" + continent + ", country=" + country + ", code=" + code + ", surfaceArea=" + surfaceArea + ", population=" + population + '}';
    }

}
