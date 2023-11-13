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

import com.example.letsACEit.R;

import java.util.ArrayList;

public class SearchByNumberSeries extends AppCompatActivity {
    Spinner number;
    Toolbar tSeri;
    Button Search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_number_series);

        tSeri = findViewById(R.id.tSeri);
        setSupportActionBar(tSeri);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Search By Number Series");
        tSeri.setSubtitle("Lets ACE it");



        ArrayList<String> numSeries = new ArrayList<>();
        number = findViewById(R.id.number);

        numSeries.add("Options");
        numSeries.add("15E");

        ArrayAdapter<String> numAdapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, numSeries);
        number.setAdapter(numAdapter);


        Search = findViewById(R.id.Search);
        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iSearch;
                iSearch = new Intent(SearchByNumberSeries.this, GMaps.class);
                startActivity(iSearch);
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