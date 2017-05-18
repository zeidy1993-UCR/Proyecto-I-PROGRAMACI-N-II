
package Domain;

/**
 *
 * @author Esteban
 */
public class VehicleType {
    
    private int id;
    private String description;
    private byte numberOfTires; //# de llantas
    private float fee; //precio asignado

    public VehicleType(int id, String description,float fee) {
        this.id = id;
        this.description = description;
        this.fee = fee;
    }

    public VehicleType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }
    
    
}
