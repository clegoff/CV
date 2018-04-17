package com.example.clego.cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonCompetences = (Button) findViewById(R.id.buttonC);
        Button buttonExperiences = (Button) findViewById(R.id.buttonE);
        Button buttonFormations = (Button) findViewById(R.id.buttonF);

        buttonCompetences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), CompetencesActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
        buttonExperiences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), ExperienceActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
        buttonFormations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), FormationActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }
}
