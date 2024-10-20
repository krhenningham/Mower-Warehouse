abstract public class Mower {
    private String manufacturer;
    private int year;
    private String serialNumber;

    public Mower(){
        this.manufacturer = "";
        this.year = 0;
        this.serialNumber = "";
    }

    public Mower(String manufacturer, int year, String serialNumber){
        this.manufacturer = manufacturer;
        this.year = year;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
