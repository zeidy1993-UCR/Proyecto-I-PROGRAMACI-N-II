
package Domain;

/**
 *
 * @author Esteban
 */
public class Vehicle {

    private String plate;
    private String brand;
    private Customer [] customer;
    private VehicleType vehicleType;
    private String idVehicleType;
    private String nameCustomer, usernameCustomer;

    public Vehicle() {
    }

    public Vehicle(String plate,String brand,Customer[] customer, VehicleType vehicleType) {
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public Customer[] getCustomer() {
        return customer;
    }

    public void setCustomer(Customer[] customer) {
        this.customer = customer;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getIdVehicleType() {
        return idVehicleType;
    }

    public void setIdVehicleType(String idVehicleType) {
        this.idVehicleType = idVehicleType;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getUsernameCustomer() {
        return usernameCustomer;
    }

    public void setUsernameCustomer(String usernameCustomer) {
        this.usernameCustomer = usernameCustomer;
    }
    

    

}
