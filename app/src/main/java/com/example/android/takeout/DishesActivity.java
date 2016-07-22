package com.example.android.takeout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


public class DishesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dishes);
    }

    public void submitOrder(View view){
        CheckBox boiled_fish = (CheckBox) findViewById(R.id.boiled_fish_checkbox);
        CheckBox dumpling = (CheckBox) findViewById(R.id.dumpling_checkbox);

        // Calculate the price of the order
        if (boiled_fish.isChecked()) {
            FoodInfo.PRICE += 13;
            FoodInfo.foodList.add("Boiled Fish In Chili Oid");
        }
        if (dumpling.isChecked()) {
            FoodInfo.PRICE += 14;
            FoodInfo.foodList.add("Sweet And Sour Spare Ribs");
        }

        //summary the order
        String message = "selected food\n";
        for (int i = 0; i < FoodInfo.foodList.size(); i++) {
            message += (FoodInfo.foodList.get(i) + '\n');
        }

        //Show the summary of the order
        message += ("total price : $" + FoodInfo.PRICE + '\n');
        Toast.makeText(DishesActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
