package sample.data.rest.service;

import org.springframework.util.Assert;

import java.io.Serializable;

public class CitySearchCriteria implements Serializable {

    private static final long serialVersionUID = -5499825739868007302L;

    private String name;

    public CitySearchCriteria() {
    }

    public CitySearchCriteria(String name) {
        Assert.notNull(name,"name must not be null");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
