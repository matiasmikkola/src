package JSON;

import java.io.Serializable;

/**
 * Created by matiasmikkola on 1/28/16.
 */
public class MatiasObjectTest implements Serializable {

    private String Make;
    private String Model;
    private int Year;
    private String Color;

    public MatiasObjectTest(String make, String model, int year, String color) {
        Make = make;
        Model = model;
        Year = year;
        Color = color;
    }
}
