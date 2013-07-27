package com.jolielaide.Bun;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by risadale on 7/26/13.
 */
public class TouchAndZoom extends Activity implements View.OnClickListener {


    TextView scaleGesture;
    ImageView imageView;
    float curScale = 1f;
    Bitmap bitmap;
    int bmpWidth,bmpHeight;
    ScaleGestureDetector scaleGestureDetector;



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image);

        imageView= (ImageView)findViewById(R.id.wholeimage);


        bitmap = BitmapFactory.decodeResource(getResources(),R.id.wholeimage);

        bmpWidth =bitmap.getWidth();
        bmpHeight= bitmap.getHeight();
        drawMatrix ();

        scaleGestureDetector = new ScaleGestureDetector(this,new ScaleGestureDetector.SimpleOnScaleGestureListener());



    }


        public void drawMatrix() {

         curScale = ((curScale -1) * 10)+1;
         if (curScale < 0.1 ){

             curScale = 0.1f;

         }

         Bitmap resizedBitMap;
         int newHeight = (int)(bmpHeight * curScale );
         int newWidth  = (int) (bmpWidth * curScale);
         resizedBitMap = Bitmap.createScaledBitmap(bitmap,newWidth,newHeight,false);
         imageView.setImageBitmap(resizedBitMap);


    }


        @Override
    public boolean onTouchEvent(MotionEvent event){

            scaleGestureDetector.onTouchEvent(event);
            return true;
        }


    public class simpleOnScaleGesturelistener extends GestureDetector.SimpleOnGestureListener{

            {
           curScale = detector.getScaleFactor();
           scaleGesture.setText(String.valueOf(curScale));
           drawMatrix();
           return true;


        }

            @Override
            public boolean onScaleBegin(ScaleGestureDetector detector) {
                // TODO Auto-generated method stub
                return true;
            }


            public void onScaleEnd(ScaleGestureDetector detector) {
                // TODO Auto-generated method stub
                super.onDown(onTouchEvent(event));
            }


        }

}