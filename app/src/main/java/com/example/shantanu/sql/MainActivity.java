package com.example.shantanu.sql;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buy,sell;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buy = (Button) findViewById(R.id.buy);
        sell = (Button) findViewById(R.id.sell);
    }


        public void sell(View view)
    {
        Intent i= new Intent(MainActivity.this,sell.class);
        startActivity(i);
    }
    public void Show(View view)
    {

        Intent i= new Intent(MainActivity.this,Display_product.class);
        startActivity(i);
    }

}
