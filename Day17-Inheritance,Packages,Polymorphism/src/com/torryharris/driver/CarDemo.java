package com.torryharris.driver;
import com.torryharris.model.Car;
import com.torryharris.model.MusicSystem;
import com.torryharris.model.Tyre;

public class CarDemo {


    public static void main(String[] args) {
        Tyre mrf = new Tyre("MRF",16);
        MusicSystem harman = new MusicSystem("Harman",4,true);
        Car nexon = new Car("Nexon","Petrol",1500,
                93.4f,6,mrf,harman);
        nexon.setTyre(mrf);
        nexon.displayFeatures();
        nexon.accelerate();
        nexon.changeGear(2);
        nexon.changeGear(3);

        nexon.steer();
        nexon.applyBrake();

        Tyre appollo = new Tyre("Appollo",17);
        nexon.setTyre(appollo);
        nexon.displayFeatures();
        nexon.displayFeatures("tyre");
        nexon.displayFeatures("music");

    }
}
