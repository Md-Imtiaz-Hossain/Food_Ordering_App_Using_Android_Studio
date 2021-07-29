package com.example.project.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.project.R;

public class ItemCategoryFragmentWork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_category_fragment_work);
    }

    public void clickToPizza(View view) {

        Pizza pizza = new Pizza();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frag,pizza);
        fragmentTransaction.commit();

    }

    public void clickToDrink(View view) {


        Drinks drinks = new Drinks();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frag,drinks);
        fragmentTransaction.commit();
    }

    public void clickToBurger(View view) {


        Burger burger = new Burger();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frag,burger);
        fragmentTransaction.commit();
    }
}