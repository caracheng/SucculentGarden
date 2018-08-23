package com.example.android.succulentgarden;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class generalCareGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_care_guide);

        Button indoorCare = (Button) findViewById(R.id.indoorcare);
        indoorCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent indoorCareIntent = new Intent(generalCareGuide.this,indoorCare.class);
                startActivity(indoorCareIntent);
            }
        });

        Button outdoorCare = (Button) findViewById(R.id.outdoorcare);
        outdoorCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent outdoorCareIntent = new Intent(generalCareGuide.this,outdoorCare.class);
                startActivity(outdoorCareIntent);
            }
        });

        Button warningSigns = (Button) findViewById(R.id.warningsigns);
        warningSigns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent warningSignsIntent = new Intent(generalCareGuide.this,warningSigns.class);
                startActivity(warningSignsIntent);
            }
        });
    }
}
