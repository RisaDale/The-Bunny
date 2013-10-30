package com.jolielaide.Bun;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FullImageActivity extends Activity  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image);

        // get intent data
        Intent i = getIntent();

        // Selected image id
        int position;
        //noinspection ConstantConditions
        position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.wholeimageview);
        imageView.setImageResource(imageAdapter.images[position]);
        final Resources imageViewResources = imageView.getResources();


        Button button =(Button)findViewById(R.id.mapbutton);
        button.setOnTouchListener((View.OnTouchListener) this);




            // Intent c = (new Intent(getApplicationContext(),SoundActivity.class));

            // startActivity(c);



    }



    @Override
    public void onClick(View view) {
     Intent d = (new Intent(getApplicationContext(),MapActivity.class));
     startActivity(d);



    }
}