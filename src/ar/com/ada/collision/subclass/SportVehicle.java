package ar.com.ada.collision.subclass;

import ar.com.ada.collision.superclass.Vehicle;

import java.util.Objects;

public class SportVehicle extends Vehicle {

    private Integer rpm;

    public SportVehicle() {
    }

    public SportVehicle(Integer rpm) {
        this.rpm = rpm;
    }

    public SportVehicle(String brand, String model, Integer year, Integer rpm) {
        //atributos de la clase padre
        super(brand, model, year);
        this.rpm = rpm;
    }

    public void setRpm(Integer potency) {
        this.rpm = rpm;
    }

    public Integer getRpm() {
        return this.rpm;
    }

    public String technicalSheet() {
        if (rpm < 50) {
            return "Vehiculo deportivo: Ficha técnica: " + this.toString() + " [El auto es muy bonito, pero solo sirve para ir a pasear] ";
        } else if (rpm >= 51 && rpm <= 300) {
            return "Vehiculo deportivo: Ficha técnica: " + this.toString() + " [Con este auto puedes desafiar a cualquiera en la pista] ";
        } else if (rpm >= 301 && rpm <= 600) {
            return "Vehiculo deportivo: Ficha técnica: " + this.toString() + " [Si tienes este auto, debe considerar participar en NASCAR] ";
        } else {
            return "Vehiculo deportivo: Ficha técnica: " + this.toString() + " [ Eres parte del elenco de rápidos y furiosos ] ";
        }
    }

    @Override
    public String toString() {
        return "marca: " + this.brand + "modelo: " + this.model + "Año: " + this.year;
    }

    @Override
    public int hashCode() {
        return -25 * Objects.hash(this.rpm);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        SportVehicle that = (SportVehicle) obj;
        return this.rpm.equals(that.rpm) &&
                super.equals(that);
    }

}
