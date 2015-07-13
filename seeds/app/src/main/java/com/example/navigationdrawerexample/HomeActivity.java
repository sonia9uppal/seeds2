package com.example.navigationdrawerexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class HomeActivity extends Activity {

    public static String MESSAGE = "connect";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        if(MainActivity.MESSAGE.equals("play")){setContentView(R.layout.activity_play);}
        else if(MainActivity.MESSAGE.equals("learn")){setContentView(R.layout.activity_learn);}
        else if(MainActivity.MESSAGE.equals("connect")){setContentView(R.layout.activity_connect);}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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

    public void pressConnectButton(View view) {
        Intent other = new Intent(this, ConnectActivity.class);
        switch (view.getId()) {
            case R.id.location:
                MESSAGE = "location";
                break;
            case R.id.mentoring:
                MESSAGE = "mentoring";
                break;
            case R.id.calendar:
                MESSAGE = "calendar";
                break;
        }

    }

}
