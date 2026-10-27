
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declarăm butonul și componenta care conține textul
    private Button butonAfisare;
    private TextView textAfisat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Încărcăm interfața grafică a aplicației
        setContentView(R.layout.activity_main);

        // Identificăm componentele din fișierul XML
        butonAfisare = findViewById(R.id.butonAfisare);
        textAfisat = findViewById(R.id.textAfisat);

        // Definim acțiunea executată la apăsarea butonului
        butonAfisare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Verificăm dacă textul este vizibil
                if (textAfisat.getVisibility() == View.VISIBLE) {

                    // Dacă este vizibil, îl ascundem
                    textAfisat.setVisibility(View.INVISIBLE);

                } else {

                    // Dacă este ascuns, îl afișăm din nou
                    textAfisat.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
