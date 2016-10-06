package com.example.hedgehog.coordinationlayout;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FloatingActionButton fab;
    com.getbase.floatingactionbutton.FloatingActionButton fab1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab1 = (com.getbase.floatingactionbutton.FloatingActionButton) findViewById(R.id.fab2);
        fab.setOnClickListener(this);
        fab1.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fab:
                Snackbar.make(v, "Hello Snackbar", Snackbar.LENGTH_LONG).show();
                break;
            case R.id.fab2:
                Snackbar.make(v, "Snackbar 2", Snackbar.LENGTH_LONG).show();
                break;
        }

    }
}
