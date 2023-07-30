package web.controller;

public class Car {
    private String carModel;
    private int carNumber;
    private String carSries;

    public Car(String carModel, int carNumber, String carSries) {
        this.carModel = carModel;
        this.carNumber = carNumber;
        this.carSries = carSries;
    }

    @Override
    public String toString() {
        return carModel +
                ", " + carNumber +
                ", " + carSries;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}
