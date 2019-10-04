package ar.com.ada.collision.superclass;

import java.util.Objects;

public class Vehicle {
    //attr
    protected String brand;
    protected String model;
    protected Integer year;

    //constructors
    public Vehicle() {}

    public Vehicle (String brand, String model, Integer age) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //getter and setter
    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String technicalSheet() {
        return "Vehicle [ brand = "+brand + " , model = " +model + " , year = " +year + " Este vehiculo no tiene categoria asignada ] " ;
    }

    @Override
    public String toString() {
        return "Vehicle [ brand = " + brand + " , model = " + model + " , year = " +year + "] ";
    }
    public int hashCode() {
        return -12 * Objects.hash(this.brand, this.model, this.year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Vehicle)) {
            return false;
        }

        Vehicle that = (Vehicle) obj;
        boolean tmp = this.brand.equals(that.brand) &&
                this.model.equals(that.model) &&
                this.year.equals(that.year);
        return tmp;
    }
}
