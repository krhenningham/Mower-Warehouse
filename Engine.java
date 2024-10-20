public class Engine {
    private String manufacturer;
    private double horsePower;
    private int cylinders;

    public Engine(){
        this.manufacturer = "";
        this.horsePower = 0.0;
        this.cylinders = 0;
    }

    public Engine(String manufacturer, double horsePower, int cylinders){
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
        this.cylinders = cylinders;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
