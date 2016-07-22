package com.example.android.takeout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


public class SnackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);
    }

    public void submitOrder(View view) {
        CheckBox springRow = (CheckBox) findViewById(R.id.spring_roll_checkbox);
        CheckBox dumpling = (CheckBox) findViewById(R.id.dumpling_checkbox);
        CheckBox streamed = (CheckBox) findViewById(R.id.steamed_stuffed_bun_checkbox);

        // Calculate the price of the order
        if (springRow.isChecked()) {
            FoodInfo.PRICE += 8;
            FoodInfo.foodList.add("Spring Roll");
        }
        if (dumpling.isChecked()) {
            FoodInfo.PRICE += 9;
            FoodInfo.foodList.add("dumpling");
        }
        if(streamed.isChecked()){
            FoodInfo.PRICE += 15;
            FoodInfo.foodList.add("Steamed Stuffed Bun");
        }

        //summary the order
        String message = "selected food\n";
        for (int i = 0; i < FoodInfo.foodList.size(); i++) {
            message += (FoodInfo.foodList.get(i) + '\n');
        }

        //Show the summary of the order
        message += ("total price : $" + FoodInfo.PRICE + '\n');
        Toast.makeText(SnackActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
