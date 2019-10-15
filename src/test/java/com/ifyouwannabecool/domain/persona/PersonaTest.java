package com.ifyouwannabecool.domain.persona;

import org.junit.Test;

import javax.validation.constraints.NotNull;

import static org.junit.Assert.*;

public class PersonaTest {

    @Test
    public void verifySimpleName() {


        assertEquals("NotNull", NotNull.class.getSimpleName());
    }

    @Test
    public void verifyFQN() {


        assertEquals("javax.validation.constraints.NotNull", NotNull.class.getCanonicalName());
    }
}