package com.jolielaide.Bun;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;

/**
 * Created by risadale on 7/17/13.
 *
 */
public class GestureListener extends  SimpleOnGestureListener {

   static String currentGestureDetected;

    // Overrides all the callback methods for SimpleOnGesture Listener

    @Override

    public boolean onSingleTapUp(MotionEvent ev) {
    currentGestureDetected =ev.toString();
    return true;

    }


    @Override
    public void onShowPress(MotionEvent ev){
        currentGestureDetected =ev.toString();


    }

    @Override
    public void onLongPress(MotionEvent ev){
        currentGestureDetected =ev.toString();


    }

    @Override

    public boolean onScroll(MotionEvent e1,MotionEvent e2,float distanceX,float distanceY){

        currentGestureDetected=e1.toString() + "" +e2.toString();

        return true;


    }

    @Override

    public boolean onFling(MotionEvent e1,MotionEvent e2,float velocityX,float velocityY){

        currentGestureDetected=e1.toString() + "" +e2.toString();

        return true;


    }






}









