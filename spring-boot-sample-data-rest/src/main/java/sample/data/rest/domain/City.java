package sample.data.rest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class City implements Serializable{

    private static final long serialVersionUID = 4475421814613801058L;

    public City() {
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String map;

    public City(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getMap() {
        return map;
    }

    @Override
    public String toString() {
        return getName()+", " + getState() + "," + getCountry();
    }
}
