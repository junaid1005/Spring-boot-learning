package com.practice.cake.Cake;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "app.frosting",havingValue = "strawberry")
public class StrawberryFrosting implements Frosting{
    @Override
    public String getFrostingType(){
        return "Strawberry Frosting";
    }
}
