package com.example.joel.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   Button bt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(myIntent);
            }


            });


}



}
