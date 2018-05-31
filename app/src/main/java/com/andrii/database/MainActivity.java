package com.andrii.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHandler db = new DBHandler(this);

        Log.d("Insert", "Inserting...");

        db.addShop(new Shop("Dockers", "banana street"));
        db.addShop(new Shop("Dunlin donuts", "palm street"));
        db.addShop(new Shop("Pizza portal", "portal street"));
        db.addShop(new Shop("town bakers", "baker street"));

        Log.d("Reading", "Reading all shops");
        List<Shop> shops = db.getAllShops();

        for (Shop shop : shops){
            String log = "Id " + shop.getId() + "name " + shop.getName() + " address " + shop.getAddress();
            Log.d("Shop::", log);
        }
    }
}
