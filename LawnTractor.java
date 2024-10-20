public class LawnTractor {
    private Engine engine;
    private String model;
    private double deckWidth;

    public LawnTractor(){
        this.engine = new Engine();
        this.model = "";
        this.deckWidth = 0.0;
    }

    public double getDeckWdith() {
        return deckWidth;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public void setDeckWdith(double deckWidth) {
        this.deckWidth = deckWidth;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
