package com.example.inf04_2023_zima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public List<String> onClickDodajZadanie(View view) {
        List<String> listaZadan = new ArrayList<>();
        listaZadan.add("kurczak, przecier, porcja rosołowa, makaron");
        listaZadan.add("Ugotować zupę pomidorową");
        listaZadan.add("Wyjazd w góry");
        EditText editTextNoweZadanie = (EditText) findViewById(R.id.editTextNoweZadanie);
        String strEditTextNoweZadanie = String.valueOf(editTextNoweZadanie.getText());
        Button buttonDodaj = (Button) findViewById(R.id.btnDodaj);
        TextView textViewLista = (TextView) findViewById(R.id.textViewLista);
//        List<String> listaZadan = lista.getListaZadan(strEditTextNoweZadanie);
        editTextNoweZadanie.setText((CharSequence) listaZadan);
        return null;
    }
}