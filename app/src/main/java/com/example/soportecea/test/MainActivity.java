package com.example.soportecea.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Actividad 1","Se ejecutó: On Create");
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        startActivity(new Intent(this,actividadDos.class));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Actividad 1","Se ejecutó: On Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Actividad 1","Se ejecutó: On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Actividad 1","Se ejecutó: On Destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Actividad 1","Se ejecutó: On Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Actividad 1","Se ejecutó: On Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Actividad 1","Se ejecutó: On Restart");
    }
}
