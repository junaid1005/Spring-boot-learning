package com.practice.cake.Cake;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "app.syrup",havingValue = "strawberry")
public class StrawberrySyrup implements Syrup{
    @Override
    public String getSyrupType(){
        return "Strawberry Syrup";
    }
}
