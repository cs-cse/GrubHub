package com.example.project.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.example.project.R;

public class final_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
    }
    public void onBackPressed(){

        AlertDialog.Builder buildera=new AlertDialog.Builder(this);
        buildera.setMessage("Make Payment").setCancelable(false).
                setPositiveButton("Confirm ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                      final_activity.super.onBackPressed();
                    }
                })

                .setNegativeButton("Not yet ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent a= new Intent(final_activity.this,IntroActivity.class);
                        startActivity(a);
                    }
                });

        AlertDialog alertDialoga=buildera.create();
        alertDialoga.show();

    }
}