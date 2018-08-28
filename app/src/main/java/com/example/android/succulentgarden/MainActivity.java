package com.example.android.succulentgarden;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button generalCare = (Button) findViewById(R.id.generalcare);
        generalCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genCareIntent = new Intent(MainActivity.this, generalCareGuide.class);
                startActivity(genCareIntent);
            }
        });

        Button catalog = (Button) findViewById(R.id.catalog);
        catalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent catalogIntent = new Intent(MainActivity.this, catalogActivity.class);
                startActivity(catalogIntent);
            }
        });
    }
}
