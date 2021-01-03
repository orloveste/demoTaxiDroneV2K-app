package demoTaxiDroneV2K.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import java.util.Date;

@Entity
public class TaxiDrone {
    @javax.persistence.Id
    @JoinColumn
    private Integer Id;
    @JoinColumn
    private String name;
    private String model;
    private String updateBy;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateOn;

    public TaxiDrone(Integer id, String name, String model, String updateBy, Date updateOn) {
        Id = id;
        this.name = name;
        this.model = model;
        this.updateBy = updateBy;
        this.updateOn = updateOn;
    }

    public TaxiDrone() {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(Date updateOn) {
        this.updateOn = updateOn;
    }

    @Override
    public String toString() {
        return "TaxiDrone{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", updateOn=" + updateOn +
                '}';
    }
}
