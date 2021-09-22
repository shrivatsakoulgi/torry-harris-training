package com.torryharris.driver;

import com.torryharris.model.HatchBack;
import com.torryharris.model.MusicSystem;
import com.torryharris.model.SUV;
import com.torryharris.model.Tyre;

public class CarTypesDemo {
    public static void main(String[] args) {
        Tyre mrf = new Tyre("MRF",17);
        MusicSystem harman = new MusicSystem("Harman",4,true);

        HatchBack swift = new HatchBack("Swift","Petrol",1200,
                88.7f,5,mrf,harman,"Power");

       // swift.displayHatchBackFeatures();

        SUV nexon = new SUV("Nexon","Diesel",1500,115.6f,
                    6,mrf,harman,"Sports",true);

        nexon.accelerate();     // Method overriding
        nexon.setDriveMode("Eco");
        nexon.accelerate();
        swift.accelerate();


    }
}
