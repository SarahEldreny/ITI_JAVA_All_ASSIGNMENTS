package Day3;

public class Worldcountries {
    private String name, continent;
    private double code, surfaceArea, population;

    public Worldcountries(String name, String continent, double code, double surfaceArea, double population) {
        this.name = name;
        this.continent = continent;
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
        return "Worldcountries{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", code=" + code +
                ", surfaceArea=" + surfaceArea +
                ", population=" + population +
                '}';
    }
}

