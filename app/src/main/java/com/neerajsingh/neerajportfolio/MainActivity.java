package com.neerajsingh.neerajportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonClick(View view){
        Toast.makeText(MainActivity.this,((Button)view).getText().toString(),Toast.LENGTH_LONG).show();
    }
}
