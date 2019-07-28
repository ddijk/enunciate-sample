package com.ifyouwannabecool.api;


import com.webcohesion.enunciate.metadata.rs.TypeHint;

import java.util.List;

public class ErrorResponse {

    String name;

    List<double[]> messages;

    //    @DocumentationExample(type = @TypeHint(double[][].class))
    @TypeHint(double[][].class)
    public List<double[]> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }
}
