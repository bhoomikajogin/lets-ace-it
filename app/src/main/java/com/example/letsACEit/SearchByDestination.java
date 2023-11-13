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

public class SearchByDestination extends AppCompatActivity {
    Spinner from,to;
    Toolbar tDest;
    Button Search;
    ArrayList<String> arrNames = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_destination);

        tDest = findViewById(R.id.tDest);
        setSupportActionBar(tDest);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Search By Destination");
        tDest.setSubtitle("Lets ACE it");

        from = findViewById(R.id.from);
        to = findViewById(R.id.to);



        arrNames.add("Options");
        arrNames.add("KR market");
        arrNames.add("kumarswamy layout");
        arrNames.add("Dayanand sagar college");
        arrNames.add("Basavangudi");
        arrNames.add("Banshankri");
        arrNames.add("Mejestic");
        arrNames.add("Monotype");
        arrNames.add("kadrenahalli cross");
        arrNames.add("Makkala koota");
        arrNames.add("National college");

        ArrayAdapter<String> fromAdapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, arrNames);
        from.setAdapter(fromAdapter);

        ArrayAdapter<String> toAdapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, arrNames);
        to.setAdapter(toAdapter);


        Search = findViewById(R.id.dSearch);
        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SearchByDestination.this, "Bus Not Available", Toast.LENGTH_SHORT).show();
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