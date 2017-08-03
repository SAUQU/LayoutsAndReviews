package com.example.segundoauqui.layoutsandreviews;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "Second";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        
        switch (intent.getAction()){
            case "sendingValue":
                Log.d(TAG, "onCreate: " + intent.getStringExtra(getString(R.string.KEY_VALUE)));
                break;
            case "sendingPerson":
                Person person = (Person) intent.getSerializableExtra("person");
                Log.d(TAG, "onCreate: ");
    }
    
   
}
