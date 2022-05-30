package com.sysafarila.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView skorA, skorB;
    Button btnSkorA, btnSkorB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skorA = findViewById(R.id.tvSkorA);
        skorB = findViewById(R.id.tvSkorB);
        btnSkorA = findViewById(R.id.btnSkorA);
        btnSkorB = findViewById(R.id.btnSkorB);

        skorA.setText(""+Skor.skorA);
        skorB.setText(""+Skor.skorB);

        btnSkorA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Skor.skorA++;
                skorA.setText(""+Skor.skorA);
            }
        });

        btnSkorB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Skor.skorB++;
                skorB.setText(""+Skor.skorB);
            }
        });
    }
}