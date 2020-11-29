package com.moringaschool.myrestaurants;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyRestaurantsArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mRestaurant;
    private String[] mCuisine;

    public MyRestaurantsArrayAdapter(Context mContext, int resource,String[] mRestaurant,
                                     String[] mCuisine){
        super(mContext, resource);
        this.mContext=mContext;
        this.mRestaurant=mRestaurant;
    }
}
