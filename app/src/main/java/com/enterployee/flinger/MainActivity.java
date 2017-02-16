package com.enterployee.flinger;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {

    private TextView msg;
    private GestureDetectorCompat gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg = (TextView)findViewById(R.id.gesture1);
        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public View findViewById(int id) {
        return super.findViewById(id);
    }

    ///////  Gestures  /////
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        msg.setText("SingleTap");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        msg.setText("DoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        msg.setText("DoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        msg.setText("OnDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        msg.setText("onShowPress");
    }


    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        msg.setText("onSingleTapup");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        msg.setText("OnScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        msg.setText("OnLongPress");
    }


    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        msg.setText("OnFling");
        return true;
    }
            ////End Gesture////


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
