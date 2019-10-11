package com.ifyouwannabecool.domain.persona;

import com.ifyouwannabecool.beanval.DataAPI;
import com.webcohesion.enunciate.metadata.rs.TypeHint;

import javax.validation.constraints.*;
import java.util.Date;

public class Bike {

    String make;

    Double price;

    Date productionDate;

    Date recycleDate;

    @NotNull(groups = DataAPI.class)
    @Size(min = 3, max = 5)
    public String getMake() {
        return make;
    }

    @NotNull
    @Digits(integer = 3, fraction = 2)
    public Double getPrice() {
        return price;
    }

    @Past
    @TypeHint(Date.class)
    public Date getProductionDate() {
        return productionDate;
    }

    @Future
    public Date getRecycleDate() {
        return recycleDate;
    }
}
