package pawelpolski;

import java.io.Serializable;

/**
 * Created by PawelPolski on 01.05.2017.
 * Equipments class
 */
public class Equipment implements Serializable {

    private int id;
    private String serialNumber;
    private String type;
    private String status;

    public Equipment(int id, String serialNumber, String type, String status) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.type = type;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
