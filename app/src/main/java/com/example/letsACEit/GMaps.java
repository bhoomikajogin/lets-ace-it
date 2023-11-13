package com.example.letsACEit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.letsACEit.R;

public class GMaps extends AppCompatActivity {

    Button locat,route;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmaps);

        locat = findViewById(R.id.locat);
        locat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("google.streetview:cbll=12.9643,77.5781"));
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:q=12.9643,77.5781"));
                intent.setPackage("com.google.android.apps.maps");
                if(intent.resolveActivity(getPackageManager())!= null){
                    startActivity(intent);
                }
            }
        });
        route = findViewById(R.id.route);
        route.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent navi = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=12.9656, 77.5770"));
                navi.setPackage("com.google.android.apps.maps");
                if(navi.resolveActivity(getPackageManager())!= null){
                    startActivity(navi);
                }
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