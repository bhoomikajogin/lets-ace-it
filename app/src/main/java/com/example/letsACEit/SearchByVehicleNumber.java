package com.example.letsACEit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.letsACEit.R;

import java.util.ArrayList;

public class SearchByVehicleNumber extends AppCompatActivity {
    Spinner Vnumber;
    Toolbar tVehi;
    Button Search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_vehicle_number);
        Vnumber= findViewById(R.id.Vnumber);

        tVehi = findViewById(R.id.tVehi);
        setSupportActionBar(tVehi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Search By Vehicle Number");
        tVehi.setSubtitle("Lets ACE it");




        ArrayList<String> vehNum = new ArrayList<>();

        vehNum.add("Options");
        vehNum.add("KA01F2492");
        vehNum.add("KA01F4253");
        vehNum.add("KA01F2378");
        vehNum.add("KA01F1311");
        vehNum.add("KA01F1234");
        vehNum.add("KA01F2311");
        vehNum.add("KA01F4222");
        vehNum.add("KA01F2423");
        vehNum.add("KA01F7644");
        vehNum.add("KA01F3634");
        vehNum.add("KA01F1242");
        vehNum.add("KA01F7321");

        ArrayAdapter<String> vehAdapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, vehNum);
        Vnumber.setAdapter(vehAdapter);


        Search = findViewById(R.id.vSearch);
        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SearchByVehicleNumber.this, "Bus Not Available", Toast.LENGTH_SHORT).show();
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