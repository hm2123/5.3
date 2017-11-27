/**
 * Creator: Hamid Majeed
 */
public class Car {
    String color;
    int horsepower;
    String make;
    double engineSize;

    public Car() {
        this.make = "McLaren";
        this.color = "purple";
        this.horsepower =710;
        this.engineSize = 4.0; }

    public Car(String color, String make, int horsepower, double engineSize) {
        this.color = color;
        this.make = make;
        this.horsepower = horsepower;
        this.engineSize = engineSize; }

    public String getMake() { return make; }

    public void setMake(String newMake) {
        this.make = newMake; }

    public String getColor() { return color; }

    public void setColor(String newColor) {
        this.color = newColor; }

    public int getHorsepower() { return horsepower; }

    public void setHorsepower(int newHorsepower) {
        this.horsepower = newHorsepower; }

    public double getEngineSize() { return engineSize; }

    public void setEngineSize(double newEngineSize) {
        this.engineSize = newEngineSize; }

        public String toString() {
        String output = (this.color + " " + this.make + ", " + this.horsepower + ", " + this.engineSize);
        return output; }


}
