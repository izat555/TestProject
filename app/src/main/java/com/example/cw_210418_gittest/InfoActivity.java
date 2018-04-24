package com.example.cw_210418_gittest;

import android.content.DialogInterface;
import android.icu.text.IDNA;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        findViewById(R.id.btnAlertDialogShow).setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            AlertDialog alertDialog = new AlertDialog.Builder(InfoActivity.this)
                    .setMessage("Clicked")
                    .setCancelable(true)
                    .setPositiveButton("Click me", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .create();

            alertDialog.show();
        }
    };
}
