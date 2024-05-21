package com.daniela.moviesselector;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalculadoraProductos extends AppCompatActivity {

    RadioButton rbTv, rbPc, rbLav;
    RadioGroup rgList;
    CheckBox chDescuento;
    Button calcularBtn;
    TextView resultFinal, resultDesc;


    double precioProducto = 0.0;

    private static final int PRECIO_TV = 1550000;
    private static final int PRECIO_PC = 3000000;
    private static final int PRECIO_LAV = 2700890;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_productos);

        referencia();

        rgList.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbTv) {
                    precioProducto = PRECIO_TV;

                } else if (checkedId == R.id.rbPc) {
                    precioProducto = PRECIO_PC;

                } else if (checkedId == R.id.rbLav) {
                    precioProducto = PRECIO_LAV;

                }
                resultDesc.setText(String.format("%.2f", precioProducto));
            }

        });

        calcularBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double precioFinal = precioProducto;

                if (chDescuento.isChecked()) {
                    precioFinal *= 0.9;
                }
                resultFinal.setText(String.format("%.2f", precioFinal));
            }
        });


    }

    private void referencia() {
        calcularBtn = findViewById(R.id.calcularBtn);
        resultFinal = findViewById(R.id.resultFinal);
        resultDesc = findViewById(R.id.resultDesc);
        rbTv = findViewById(R.id.rbTv);
        rbPc = findViewById(R.id.rbPc);
        rbLav = findViewById(R.id.rbLav);
        rgList = findViewById(R.id.rgList);
        chDescuento = findViewById(R.id.chDescuento);
    }
}