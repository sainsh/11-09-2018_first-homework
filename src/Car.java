import java.awt.*;

public class Car {

    double averageMilePerGalon;
    String licencePlate;
    Color paintColor;
    boolean areTaillightsWorking;

    public Car(double aVG, String plate, Color color, boolean aTW){

        this.averageMilePerGalon=aVG;
        this.licencePlate=plate;
        this.paintColor=color;
        this.areTaillightsWorking = aTW;


    }

    public void changePaintColor(Color newPaintColor){
        this.paintColor = newPaintColor;
    }

    public double speedingUp(double currentSpeed){
        currentSpeed +=100;
        return currentSpeed;
    }

}
