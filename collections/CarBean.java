package collections;

import java.io.Serializable;

/**
 * Created by matiasmikkola on 1/19/16.
 */
public class CarBean implements Serializable {

    String make;
    int year;
    String model;
    String color;
    String body;

    public CarBean(String make, int year, String model, String color, String body) {
        this.make = make;
        this.year = year;
        this.model = model;
        this.color = color;
        this.body = body;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "collections.CarBean{" +
                "make='" + make + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
