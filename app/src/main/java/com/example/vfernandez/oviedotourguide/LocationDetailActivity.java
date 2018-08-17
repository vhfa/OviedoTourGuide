package com.example.vfernandez.oviedotourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LocationDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.location_detail);

        Intent intent = getIntent();

        //Loads all the location details
        ImageView fullImgImageView = (ImageView) findViewById(R.id.full_image);
        fullImgImageView.setImageResource(intent.getIntExtra("image",-1));

        TextView titleTextView = (TextView) findViewById(R.id.location_detail_title);
        titleTextView.setText(intent.getStringExtra("title"));

        TextView infoTextView = (TextView) findViewById(R.id.location_detail_text);
        infoTextView.setText(intent.getStringExtra("info"));

        TextView timetableTextView = (TextView) findViewById(R.id.location_detail_timetable);
        timetableTextView.setText(intent.getStringExtra("timetable"));
    }
}
