package com.careerdevs;
// Define a public class so code can be accessed throughout the program.
public class Car {
    // Make private so the is not visible outside of the method.
    private String carMake;
    private String carModel;
    private int carYear;  // Used carYear vs year as year is a reserved word.

    public Car(String carMake, String carModel, int carYear) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carYear = carYear;

    }
//  Getters and Setters to access the private properties of the Car class.
    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }
}
//use ctrl + insert to generate getters & setters.