package com.jolielaide.Bun;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

/**
 * Created by risadale on 7/21/13.
 */
class MainActivity extends Activity  {

    private GestureDetector mGestureDetector;



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image);


        //bind The Gesture Detector to Gesture Listener

        mGestureDetector = new GestureDetector(this,new SimpleOnGestureListener());

    }
           @Override

            public boolean onTouchEvent(MotionEvent event){

           //method onTouchEvent of GestureDetector Class analyzes the given motion event
           //if applicable triggers are supplied the callback methods
           //returns true if the GestureDetetctor consumed the event

               boolean eventConsumed = mGestureDetector.onTouchEvent(event);

               if (eventConsumed){

                System.out.toString();
                return true;

               }
                else
                   return false;

}

}


