package com.example.letsACEit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.letsACEit.R;

public class HelpLine extends AppCompatActivity {

    Button btnCall, btnMsg, btnEmail, btnShare;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_line);

        toolbar = findViewById(R.id.Toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("HelpLine");
        toolbar.setSubtitle("Lets BMTC");


        btnCall = findViewById(R.id.btnCall);
        btnMsg = findViewById(R.id.btnMsg);
        btnEmail = findViewById(R.id.btnEmail);
        btnShare = findViewById(R.id.btnShare);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iCall = new Intent();
                iCall.setAction(Intent.ACTION_DIAL);
                iCall.setData(Uri.parse("tel: +917760991399"));
                startActivity(iCall);
            }
        });

        btnMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iMsg = new Intent();
                iMsg.setAction(Intent.ACTION_SENDTO);
                iMsg.setData(Uri.parse("smsto:"+Uri.encode("+917760991399")));
                startActivity(iMsg);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iEmail = new Intent();
                iEmail.setAction(Intent.ACTION_SEND);
                iEmail.setType("message/rfc822");
                iEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{"complaints@mybmtc.com"});
                iEmail.putExtra(Intent.EXTRA_SUBJECT, "Queries");
                startActivity(Intent.createChooser(iEmail, "Email via"));
            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iShare = new Intent();
                iShare.setAction(Intent.ACTION_SEND);
                iShare.setType("text/plain");
                iShare.putExtra(Intent.EXTRA_TEXT, "Dayananda Sagar College of Engineering\n" +
                        "080 4216 1750\n" +
                        "https://maps.app.goo.gl/qfnaKrv9W7ViquUU6 ");
                startActivity(Intent.createChooser(iShare, "Share via"));
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