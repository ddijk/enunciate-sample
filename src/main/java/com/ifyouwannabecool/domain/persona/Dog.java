package com.ifyouwannabecool.domain.persona;

public class Dog implements Pet {

    private boolean aggressive;

    public boolean isAggressive() {
        return aggressive;
    }

    @Override
    public String getName() {
        return null;
    }
}
