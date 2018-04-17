package com.example.clego.cv;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import java.util.ArrayList;

public class FormationActivity extends Activity {

    ArrayList<Formation> formations = new ArrayList<Formation>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formation);

        formations.add(new Formation("BAC S option ISN", "2013-2015", "Lycee René Cassin, ARPAJON"));
        formations.add(new Formation("BTS SIO option SLAM", "2015-2017", "Lycee Geoffroy St-Hilaire, ETAMPES"));

        ListView listViewFormations = (ListView) findViewById(R.id.ListViewFormation);

        FormationAdapter formationsAdapter = new FormationAdapter(this, formations);

        listViewFormations.setAdapter(formationsAdapter);
    }

}
