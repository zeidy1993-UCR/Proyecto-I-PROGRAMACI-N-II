
package Domain;

/**
 *
 * @author Esteban
 */
public class Vehicle {

    private String plate;
    private String color;
    private String brand;
    private String model;
    private Customer customer;
    private VehicleType vehicleType;

    public Vehicle() {
    }

    public Vehicle(String plate,String brand,Customer customer, VehicleType vehicleType) {
        this.plate = plate;
        this.brand = brand;
        this.customer = customer;
        this.vehicleType = vehicleType;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    

}
