
package Business;


import Data.VehicleData;
import Domain.Customer;
import Domain.Vehicle;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedList;


public class VehicleBusiness {
    
    VehicleData vehicleData;

    public VehicleBusiness() {
        vehicleData = new VehicleData();
    }
    
    public void insertVehicle(Vehicle vehicle) throws IOException, org.json.simple.parser.ParseException, ParseException {
        //regla de negocio de no permitir datos en blanco. Todos son requeridos.
        if (!vehicle.getPlate().equals("") &&!vehicle.getBrand().equals("") && !vehicle.getCustomer().equals("")
                && !vehicle.getVehicleType().equals("")) {
            vehicleData.insertVehicles(vehicle);
        }
    }
    
    public LinkedList<Vehicle> getAllVehicles() throws ParseException, org.json.simple.parser.ParseException {
        return vehicleData.getAllVehicles();
    }

    public Vehicle getVehicleByCustomer(Customer customer) throws ParseException, org.json.simple.parser.ParseException {
        Vehicle vehicle = new Vehicle();
        //regla de negocio de no permitir datos en blanco. Todos son requeridos.
        if (!customer.equals("")) {
            vehicle = vehicleData.getVehicleByCustomer(customer);
        }
        return vehicle;
    }
    
    public void modifyVehicle(String plate, Vehicle vehicle) throws IOException, ParseException, org.json.simple.parser.ParseException {

        vehicleData.modifyVehicle(plate, vehicle);

    }

    public void deleteVehicle(String plate) throws IOException, ParseException, org.json.simple.parser.ParseException {

        vehicleData.deleteVehicle(plate);

    }
    
    public Vehicle getVehicleByPlate(String plate) throws ParseException, org.json.simple.parser.ParseException{
    Vehicle vehicle = new Vehicle();
        //regla de negocio de no permitir datos en blanco. Todos son requeridos.
        if (!plate.equals("")) {
            vehicle = vehicleData.getVehicleByPlate(plate);
        }
        return vehicle;
    
    }
}
