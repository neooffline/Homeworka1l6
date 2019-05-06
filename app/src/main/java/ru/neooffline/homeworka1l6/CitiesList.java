package ru.neooffline.homeworka1l6;

import android.content.Context;
import java.util.List;

public class CitiesList {
    private List<String[]> cities;
    private static final int NUMBER = 4;
    public CitiesList(Context context){
        for (int i = 0; i < context.getResources().getStringArray(R.array.cities).length; i++) {
            cities.add(i,context.getResources().getStringArray(R.array.cities));
        }
    }

    public List<String[]> getCities() {
        return cities;
    }
}
