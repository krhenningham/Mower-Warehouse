public class GasPoweredMower {
    private Engine engine;
    private boolean selfPropelled;

    public GasPoweredMower(){
        this.engine = new Engine();
        this.selfPropelled = false;
    }

    public Engine getEngine() {
        return engine;
    }

    public boolean isSelfPropelled() {
        return selfPropelled;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setSelfPropelled(boolean selfPropelled) {
        this.selfPropelled = selfPropelled;
    }
}
