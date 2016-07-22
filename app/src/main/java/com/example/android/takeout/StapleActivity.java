package com.example.android.takeout;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class StapleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staplefood);
    }

    public void submitOrder(View view) {
        CheckBox congee = (CheckBox) findViewById(R.id.rice_Congee_checkbox);
        CheckBox noodles = (CheckBox) findViewById(R.id.beef_Noodle_checkbox);
        CheckBox tofu = (CheckBox) findViewById(R.id.tofu_rice_checkbox);

        // Calculate the price of the order
        if (congee.isChecked()) {
            FoodInfo.PRICE += 8;
            FoodInfo.foodList.add("Rice Congee");
        }
        if (noodles.isChecked()) {
            FoodInfo.PRICE += 15;
            FoodInfo.foodList.add("Beef Noodle");
        }
        if (tofu.isChecked()) {
            FoodInfo.PRICE += 12;
            FoodInfo.foodList.add("Tofu Rice");
        }

        //summary the order
        String message = "selected food\n";
        for (int i = 0; i < FoodInfo.foodList.size(); i++) {
            message += (FoodInfo.foodList.get(i) + '\n');
        }

        //Show the summary of the order
        message += ("total price : $" + FoodInfo.PRICE + '\n');
        Toast.makeText(StapleActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
