package com.ifyouwannabecool.domain.persona;


import javax.validation.constraints.NotNull;

public class Renner extends Persona {

    /**
     * My doc 1
     */
    String team;

    @NotNull
    Bike bike;

    /**
     * The Team blah...
     *
     * @return The ids of the members in the social group.
     */
    @NotNull
    public String getTeam() {
        return team;
    }

    /**
     * The Bike blah...
     *
     * @return The ids of the members in the social group.
     */
    public Bike getBike() {
        return bike;
    }
}
