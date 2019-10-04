package ar.com.ada.collision.subclass;

import ar.com.ada.collision.superclass.Vehicle;

import java.util.Objects;

public class Truck extends Vehicle {
    //attr
    private Integer maxLoad;

    //constructors
    public Truck() {}

    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck(String brand, String model, Integer year, Integer maxLoad) {
        super(brand, model, year);
        this.maxLoad = maxLoad;
    }

    //getter and setter
    public Integer getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    //methods
    @Override
    public String technicalSheet() {
        if (maxLoad <= 100) {
            return "Vehiculo camión: Ficha técnica: " + this.toString() + " [Para iniciar un negocio de flete, está muy bien este auto] ";
        } else {
            return "Vehiculo camión: Ficha técnica: " + this.toString() + " [Tienes que usar este auto en el campo, es una máquina de trabajo] ";
        }
    }

    @Override
    public String toString() {
        return "marca: " + this.brand + "modelo: " + this.model + "Año: " + this.year;
    }

    @Override
    public int hashCode() {
        return -25 * Objects.hash(this.maxLoad);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Truck that = (Truck) obj;
        return this.maxLoad.equals(that.maxLoad) &&
                super.equals(that);
    }
}