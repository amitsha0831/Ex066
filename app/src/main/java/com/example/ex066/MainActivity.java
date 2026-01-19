package com.example.ex066;

import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView picture;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void clicked(View view) {
        btn = findViewById(R.id.btn);
        picture = findViewById(R.id.picture);

        int min = 1;
        int max = 3;
        Random r = new Random();
        int num = r.nextInt(max - min + 1) + min;

        if (num == 1) {
            btn.setText("1");
            picture.setImageResource(R.drawable.img);}
        else if (num == 2) {
            btn.setText("2");
            picture.setImageResource(R.drawable.img_1);}
        else {
            btn.setText("3");
            picture.setImageResource(R.drawable.img_2);}



        }

    }
