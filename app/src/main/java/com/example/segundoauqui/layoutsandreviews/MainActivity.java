package com.example.segundoauqui.layoutsandreviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";



    EditText etName;
    EditText zxName;
    Button btnName;
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.etName);
        etName.setText("Hello World");

        zxName = (EditText) findViewById(R.id.zxName);

        btnName = (Button) findViewById(R.id.btnDoMagic);
        tvName = (TextView) findViewById(R.id.tvName);


        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String etValue = etName.getText().toString();
                String zxValue = zxName.getText().toString();
                Log.d(TAG, "onClick: " + etValue);

                int et = Integer.parseInt(etValue);
                int at = Integer.parseInt(zxValue);

                tvName.setText(String.valueOf(et+at));
            }
        });

        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d(TAG, "onPause: ");;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
 public void goToSecond(View view){


     String value = etName.getText().toString();

     Intent intent = new Intent(this , SecondActivity.class);
     intent.putExtra(getString(R.string.KEY_VALUE), value);

     startActivity(intent);
 }


 public void passPersonToSecond(View view){

     String personName = second.getText().toString();
     String personGender = personName.getText().toString();

 }

}

