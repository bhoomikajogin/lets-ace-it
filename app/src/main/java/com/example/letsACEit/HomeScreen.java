package com.example.letsACEit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.letsACEit.R;

public class HomeScreen extends AppCompatActivity {
    Toolbar tHome;
    Intent iNext;
    Button dest, seri, vehi, help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        tHome = findViewById(R.id.tHome);
        setSupportActionBar(tHome);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Homescreen");
        tHome.setSubtitle("Lets ACE it");

        dest = findViewById(R.id.dest);
        seri = findViewById(R.id.seri);
        vehi = findViewById(R.id.vehi);
        help = findViewById(R.id.help);

        dest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iDest;
                iDest = new Intent(HomeScreen.this, SearchByDestination.class);
                startActivity(iDest);
            }
        });

        seri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iSeri;
                iSeri = new Intent(HomeScreen.this, SearchByNumberSeries.class);
                startActivity(iSeri);

            }
        });

        vehi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iVehi;
                iVehi = new Intent(HomeScreen.this, SearchByVehicleNumber.class);
                startActivity(iVehi);
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ihelp;
                ihelp = new Intent(HomeScreen.this, HelpLine.class);
                startActivity(ihelp);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if(itemId==android.R.id.home){
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}