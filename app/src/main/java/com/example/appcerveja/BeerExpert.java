package com.example.appcerveja;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert extends Activity {
    List<String> getBrands (String color){
        List<String> brands = new ArrayList<>();
        if (color.equals("Pilsen")){
            brands.add("Skol");
            brands.add("Boehmia");
        } else if (color.equals("Stout")){
            brands.add("Guinness");
        } else if( color.equals("Puro Malte")){
            brands.add("Stella");
            brands.add("Heineken");
        } else {
            brands.add("Colorado");
            brands.add("Baden Baden");
        }
        return  brands;
    };
}
