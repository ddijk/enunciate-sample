package com.ifyouwannabecool.domain.persona;

import com.ifyouwannabecool.beanval.SimulationAPI;

import javax.validation.constraints.NotNull;

abstract public class Foetus {

    String wweight;

    @NotNull(groups = SimulationAPI.class)
    public String getWweight() {
        return wweight;
    }
}
