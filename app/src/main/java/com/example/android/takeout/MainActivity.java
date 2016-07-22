package com.example.android.takeout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the stapleFood button is clicked.
     */
    public void stapleFood(View view) {
        Intent intent = new Intent(MainActivity.this, StapleActivity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the dishes button is clicked.
     */

    public void dishes(View view) {
        Intent intent = new Intent(MainActivity.this, DishesActivity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the snack button is clicked.
     */

    public void snack(View view) {
        Intent intent = new Intent(MainActivity.this, SnackActivity.class);
        startActivity(intent);
    }

    /**
     * This method is called when the drink button is clicked.
     */

    public void drink(View view) {
        Intent intent = new Intent(MainActivity.this, DrinkActivity.class);
        startActivity(intent);
    }


    /*
    This method is called when the clear botton is clicked
    * */

    public void clearOrder(View view){
        FoodInfo.PRICE=0;
        FoodInfo.foodList.clear();
        Toast.makeText(this, "You have removed all food", Toast.LENGTH_SHORT).show();
    }
}
