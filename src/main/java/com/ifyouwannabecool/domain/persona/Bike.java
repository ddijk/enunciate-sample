package com.ifyouwannabecool.domain.persona;

import com.ifyouwannabecool.beanval.DataAPI;
import com.ifyouwannabecool.constraints.NotEmptyFields;
import com.webcohesion.enunciate.metadata.rs.TypeHint;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

public class Bike {

    String make;

    Double price;

    Date productionDate;

    Date recycleDate;

    @NotEmptyFields(groups = DataAPI.class)
    List<Wheel> wheels;

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

    @Past(groups = DataAPI.class)
    @TypeHint(Date.class)
    @NotNull(message = "{aap}")
    public Date getProductionDate() {
        return productionDate;
    }

    @Future(groups = DataAPI.class)
    public Date getRecycleDate() {
        return recycleDate;
    }
}
