package com.jolielaide.Bun;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * Created by risadale on 7/21/13.
 */
class MainActivity extends Activity  {

    public boolean onTouchEvent(MotionEvent event){
       final Button button = new Button(R.id.mapButton);
        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {

                setContentView(R.layout.mapview);

                return true;
            }
        });


    }


}

