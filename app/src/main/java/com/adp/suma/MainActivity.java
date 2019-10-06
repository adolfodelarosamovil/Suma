package com.adp.suma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private EditText edNumero1;
    private EditText edNumero2;
    private TextView txtResultado;
    private Button btnSumar, btnSalir;
    private Button awesomeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MIAPP", "Entra al OnCreate");

        edNumero1 = (EditText) findViewById(R.id.edNumero1);
        edNumero2 = (EditText) findViewById(R.id.edNumero2);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnSalir = (Button) findViewById(R.id.btnSalir);

        awesomeButton = new Button(this);
        awesomeButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Log.d("MIAPP", "Entra al OnClick");
        switch (v.getId()){
            case R.id.btnSumar:
                int numero1 = Integer.parseInt(edNumero1.getText().toString());
                int numero2 = Integer.parseInt(edNumero2.getText().toString());
                int suma = numero1 + numero2;
                txtResultado.setText(String.valueOf(suma));
                break;
            case R.id.btnSalir:
                finish();
                break;
        }
    }
}
