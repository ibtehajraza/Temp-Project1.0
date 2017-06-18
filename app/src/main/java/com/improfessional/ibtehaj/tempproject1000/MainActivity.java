package com.improfessional.ibtehaj.tempproject1000;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List<Employ> employList;
    private RecyclerView recyclerView;
    private EmployAdapter eAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        employList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        eAdapter = new EmployAdapter(employList);
        RecyclerView.LayoutManager eLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(eLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(eAdapter);

        ItemClickSupport.addTo(recyclerView)
                .setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
                    @Override
                    public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                        Toast.makeText(getApplicationContext(),"Clicked: "+position ,Toast.LENGTH_SHORT ).show();
                    }
                });

        tempData();

    }

    private void tempData(){
        Employ employ = new Employ("Javad", "Registered Architect");
        employList.add(employ);

        employ = new Employ("Aamir", "Professional Landscape Architect");
        employList.add(employ);

        employ = new Employ("Ali", "Association of Architects Member");
        employList.add(employ);

        employ = new Employ("Basit", "Engineer Intern");
        employList.add(employ);

        employ = new Employ("Zohaib", "C.E.O");
        employList.add(employ);

        employ = new Employ("Zuhayr", "Scraper");
        employList.add(employ);

        employ = new Employ("Zohair", "MVP");
        employList.add(employ);

        employ = new Employ("Ziyad", "Senior Manager");
        employList.add(employ);

        employ = new Employ("Sohni", "Asst. GM");
        employList.add(employ);

        employ = new Employ("Saim", "General Manager");
        employList.add(employ);

        employ = new Employ("Danish", "Managing Director");
        employList.add(employ);

        employ = new Employ("Nida", "P.M");
        employList.add(employ);

        employ = new Employ("Yasir", "Writer");
        employList.add(employ);

        employ = new Employ("Daniyal", "Content Creater");
        employList.add(employ);

        employ = new Employ("Zeeshan", "Sasuke");
        employList.add(employ);

        eAdapter.notifyDataSetChanged();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Snackbar.make(findViewById(R.id.relative1), "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            return true;
        }
        if (id == R.id.tempBtn) {
            Snackbar.make(findViewById(R.id.relative1), "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
