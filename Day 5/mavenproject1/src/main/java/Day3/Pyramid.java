package Day3;

public class Pyramid {

    private String modern_name, pharaoh, site;
    private double height;

    public Pyramid(String modern_name, String pharaoh, String site, double height) {
        this.modern_name = modern_name;
        this.pharaoh = pharaoh;
        this.site = site;
        this.height = height;
    }

    public String getModern_name() {
        return modern_name;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public String getPharaoh() {
        return pharaoh;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Pyramid{"
                + "modern_name='" + modern_name + '\''
                + ", pharaoh='" + pharaoh + '\''
                + ", site='" + site + '\''
                + ", height=" + height
                + '}';
    }
}


