package com.example.android.takeout;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


public class DrinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.antivity_drink);
    }

    public void submitOrder(View view) {
       CheckBox wangzi_milk = (CheckBox) findViewById(R.id.wangzi_milk_checkbox);
       CheckBox mineral_water = (CheckBox) findViewById(R.id.mineral_water_checkbox);
       CheckBox soup = (CheckBox) findViewById(R.id.soup_checkbox);

        // Calculate the price of the order

        if (wangzi_milk.isChecked()) {
            FoodInfo.PRICE += 5;
            FoodInfo.foodList.add("Wangzai Milk");
        }
        if (mineral_water.isChecked()) {
            FoodInfo.PRICE += 3;
            FoodInfo.foodList.add("Mineral Water");
        }
        if (soup.isChecked()) {
            FoodInfo.PRICE += 6;
            FoodInfo.foodList.add("Soup");
        }

        //summary the order
        String message = "selected food\n";
        for (int i = 0; i < FoodInfo.foodList.size(); i++) {
            message += (FoodInfo.foodList.get(i) + '\n');
        }

        //Show the summary of the order
        message += ("total price : $" + FoodInfo.PRICE + '\n');
        Toast.makeText(DrinkActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
