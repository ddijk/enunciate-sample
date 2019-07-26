package com.ifyouwannabecool;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ifyouwannabecool.domain.persona.Name;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws IOException {


        Name name = new Name();

        List<String[]> of = new ArrayList();
        of.add( new String[]{"aap", "aap2"});
        of.add( new String[]{"noot", "noot2"});
        of.add( new String[]{"mies", "mies2"});
        name.setScores(of);

        double[] meting = new double[] { 4d, 5d, 6d};
        double[] meting2 = new double[] { 40d, 50d, 60d};

        List<double[]> metingen  = new ArrayList<double[]>();
        metingen.add(meting);
        metingen.add(meting2);
        name.setMeasurements(metingen);


        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.writerWithDefaultPrettyPrinter().writeValue(System.out, name);
    }
}
