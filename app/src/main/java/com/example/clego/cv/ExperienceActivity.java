package com.example.clego.cv;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import java.util.ArrayList;

public class ExperienceActivity extends Activity {

    ArrayList<Experience> experiences = new ArrayList<Experience>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.experience);

        experiences.add(new Experience("STAGE DE 5 SEMAINES","ATEMPO, LES ULIS","Développeur WEB"));
        experiences.add(new Experience("STAGE DE 7 SEMAINES","ATEMPO, LES ULIS","Administrateur BDD"));

        ListView listViewExperiences = (ListView) findViewById(R.id.ListViewExperience);

        ExperienceAdapter experiencesAdapter = new ExperienceAdapter(this, experiences);

        listViewExperiences.setAdapter(experiencesAdapter);
    }
}
