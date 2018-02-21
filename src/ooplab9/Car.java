package ooplab9;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Car {

    private String brang;
    private String color;
    private String model;
    private Engine engine;

    public Car(String brang, String color, String model, Engine engine) {
        this.brang = brang;
        this.color = color;
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brang='" + brang + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

    public String getBrang() {
        return brang;
    }

    public void setBrang(String brang) {
        this.brang = brang;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}