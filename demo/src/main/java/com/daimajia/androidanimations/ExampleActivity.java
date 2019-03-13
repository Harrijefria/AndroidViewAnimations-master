package com.daimajia.androidanimations;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class ExampleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example);


        final TextView t2 = (TextView) findViewById(R.id.notice2);
        t2.setText("Silakan masukkan Email dan Kata Sandi Anda");
        findViewById(R.id.submit2).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Shake).playOn(findViewById(R.id.edit_area2));
                t2.setText("Kata sandi salah");
            }

        });


        final TextView t = (TextView) findViewById(R.id.notice);
        t.setText("Silakan masukkan Email dan Kata Sandi Anda");
        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada).duration(700).playOn(findViewById(R.id.edit_area));
                t.setText("Kata sandi salah!");
            }

        });


    }
}
