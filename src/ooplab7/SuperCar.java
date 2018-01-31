package ooplab7;
public class SuperCar {
    //properties of SuperCar
    private String carBrand;
    private String carColor;
    private String carEngineSize;
    private String maxSpeed;
    private String countryOfOrigin;

    //Constructor
    //Default Constructor
    public SuperCar() {
    }

    //Constructor by own
    public SuperCar(String b, String c, String s, String m, String o) {
        //assign data to properties
        this.carBrand = b;
        this.carColor = c;
        this.carEngineSize = s;
        this.maxSpeed = m;
        this.countryOfOrigin = o;
    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "carBrand='" + carBrand + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carEngineSize='" + carEngineSize + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarEngineSize() {
        return carEngineSize;
    }

    public void setCarEngineSize(String carEngineSize) {
        this.carEngineSize = carEngineSize;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}//class
