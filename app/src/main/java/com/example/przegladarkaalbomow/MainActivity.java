package com.example.przegladarkaalbomow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Album> albumy = new ArrayList<>();
    ImageButton buttonDalej;
    ImageButton buttonWstecz;
    Button buttonPobierz;
    TextView textViewZespol;
    TextView textViewNazwaPiosenki;
    TextView textViewRok;
    TextView textViewPobrania;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        albumy.add(new Album("Gorillaz","The Now Now",2018,11,11000102));
        albumy.add(new Album("My Chemical Romance","The Black Parade",2006,14,304666444));
        albumy.add(new Album("Wilki","wilki",1992,16,4000230));

        buttonDalej = findViewById(R.id.imageButtonPrawo);
        buttonDalej.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        buttonWstecz = findViewById(R.id.imageButtonLewo);
        buttonWstecz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        buttonPobierz = findViewById(R.id.button3);
        buttonPobierz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        textViewNazwaPiosenki = findViewById(R.id.textViewNazwa);
        textViewPobrania = findViewById(R.id.textViewDoPobrania);
        textViewRok = findViewById(R.id.textViewLiczbaRokPiosenkek);
        textViewZespol = findViewById(R.id.textViewZespol);
    }
}