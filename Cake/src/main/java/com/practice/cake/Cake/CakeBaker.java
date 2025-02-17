package com.practice.cake.Cake;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
        private final Frosting frosting;
        private final Syrup syrup;
        public CakeBaker(Frosting frosting,
                         Syrup syrup){
                this.frosting=frosting;
                this.syrup=syrup;

        }
        void bakeCake(){
                System.out.println("Baking cake with- "+frosting.getFrostingType()+" "+syrup.getSyrupType());
        }

}
