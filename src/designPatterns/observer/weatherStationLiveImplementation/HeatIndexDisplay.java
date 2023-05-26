package designPatterns.observer.weatherStationLiveImplementation;

public class HeatIndexDisplay implements Observer{
private float tempFeelC;
public double tempFeel(double t, double rh) {
    double c1, c2, c3, c4, c5, c6, c7, c8, c9, index;
    c1 = -8.784695;
    c2 = 1.61139411;
    c3 = 2.338549;
    c4 = -0.14611605;
    c5 = -0.012308094;
    c6 = -0.016425828;
    c7 = 0.002211732;
    c8 = 0.00072546;
    c9 = -0.000003582;

    index = c1 + c2 * t + c3 * rh + c4 * t * rh + c5 * t * t + c6 * rh * rh + c7 * t * t * rh + c8 * t * rh * rh + c9 * t * t * rh * rh;
    return index;
}
    @Override
    public void update(float temp, float humidity, float pressure) {
        tempFeelC = (float) tempFeel(temp, humidity);
        display();
    }
    public void display(){
        System.out.printf("Gefühlte Temperatur beträgt: %.2f \n" , tempFeelC);
    }
}
