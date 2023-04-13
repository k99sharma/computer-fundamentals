package Abstraction;

abstract class AbstractCar {
    private int plateNumber;
    private String model;
    private String engineType;

    public abstract int getPlateNumber();

    public abstract void setPlateNumber(int plateNumber);

    public abstract String getModel();

    public abstract void setModel(String model);

    public abstract String getEngineType();
    public abstract void setEngineType(String engineType);
}
