
package Domain;

/**
 *
 * @author Esteban
 */
public class VehicleType {
    
    private String id;
    private String description;
    private byte numberOfTires; //# de llantas
    private float fee; //precio asignado

    public VehicleType(String id, String description,float fee) {
        this.id = id;
        this.description = description;
        this.fee = fee;
    }

    public VehicleType() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
