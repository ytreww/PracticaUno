package com.example.soportecea.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class actividadDos extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Actividad 2","Se ejecutó: On Create");
        setContentView(R.layout.activity_actividad_dos);
    }

    public void click(View view){
        startActivity(new Intent(this,MainActivity.class));
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Actividad 2","Se ejecutó: On Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Actividad 2","Se ejecutó: On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Actividad 2","Se ejecutó: On Destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Actividad 2","Se ejecutó: On Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Actividad 2","Se ejecutó: On Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Actividad 2","Se ejecutó: On Restart");
    }
}
