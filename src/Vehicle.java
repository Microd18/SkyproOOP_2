public abstract class Vehicle {

    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        setModelName(modelName);
        setWheelsCount(wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
