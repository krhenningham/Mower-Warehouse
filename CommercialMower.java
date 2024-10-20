public class CommercialMower {
    private double operatingHours;
    private boolean zeroTurnRadius;

    public CommercialMower(){
        this.operatingHours = 0.0;
        this.zeroTurnRadius = false;
    }

    public double getOperatingHours() {
        return operatingHours;
    }

    public boolean isZeroTurnRadius() {
        return zeroTurnRadius;
    }

    public void setOperatingHours(double operatingHours) {
        this.operatingHours = operatingHours;
    }

    public void setZeroTurnRadius(boolean zeroTurnRadius) {
        this.zeroTurnRadius = zeroTurnRadius;
    }
}
