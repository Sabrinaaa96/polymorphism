package ar.com.ada.collision.subclass;

import ar.com.ada.collision.superclass.Vehicle;

import java.util.Objects;

public class ElectricaVehicle extends Vehicle {

    //attr
    private Integer potency;

    //constructors
    public ElectricaVehicle() {}

    public ElectricaVehicle(Integer potency) {
        this.potency = potency;
    }

    public ElectricaVehicle(String brand, String model, Integer year, Integer potency) {
        //atributos de la clase padre
        super(brand, model, year);
        this.potency = potency;
    }
    //getter and setter
    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    public Integer getPotency() {
        return this.potency;
    }

    //methods
    @Override
    public String technicalSheet() {
        if (year < 2007) {
            return "Vehiculo electrico: " + " [No existe modelo para este año] ";
        } else {
            return "Vehiculo electrico: Ficha técnica: " + this.toString() + " [Es un auto de última tecnología!]";
        }
    }

    @Override
    public String toString() {
        return " ElectricaVehicle [ Marca: = " + this.brand
                + "modelo: " + this.model +
                "Año: " + this.year +
                " Potencia:  " + this.potency + "] ";
    }

    @Override
    public int hashCode() {
        return -25 * Objects.hash(this.potency);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        ElectricaVehicle that = (ElectricaVehicle) obj;
        return this.potency.equals(that.potency) &&
                super.equals(that);
    }
}
