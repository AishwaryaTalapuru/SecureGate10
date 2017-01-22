package com.appstone.www.securegate;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.*;
public class Login extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void sendMessage(View view){

        Intent startNewActivity = new Intent(this, DisplayMessageActivity.class);
        startActivity(startNewActivity);
    }
}
