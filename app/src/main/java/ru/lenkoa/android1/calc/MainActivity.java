package ru.lenkoa.android1.calc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Calculations calc;
    private final String CALC = "calc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle instanceState) {
        instanceState.putString(CALC, calc.toString());
        super.onSaveInstanceState(instanceState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        calc.restoreCalc(savedInstanceState.getString(CALC));
    }

    private void initView() {
        // Получить окно с текстом по идентификатору
        calc = new Calculations(findViewById(R.id.textArea));

        // Получить кнопки
        initButtonsView();
    }

    private void initButtonsView() {
        Button button_1 = findViewById(R.id.button_1);
        button_1.setOnClickListener(calc.button_1Click());
        Button button_2 = findViewById(R.id.button_2);
        button_2.setOnClickListener(calc.button_2Click());
        Button button_3 = findViewById(R.id.button_3);
        button_3.setOnClickListener(calc.button_3Click());
        Button button_4 = findViewById(R.id.button_4);
        button_4.setOnClickListener(calc.button_4Click());
        Button button_5 = findViewById(R.id.button_5);
        button_5.setOnClickListener(calc.button_5Click());
        Button button_6 = findViewById(R.id.button_6);
        button_6.setOnClickListener(calc.button_6Click());
        Button button_7 = findViewById(R.id.button_7);
        button_7.setOnClickListener(calc.button_7Click());
        Button button_8 = findViewById(R.id.button_8);
        button_8.setOnClickListener(calc.button_8Click());
        Button button_9 = findViewById(R.id.button_9);
        button_9.setOnClickListener(calc.button_9Click());
        Button button_0 = findViewById(R.id.button_0);
        button_0.setOnClickListener(calc.button_0Click());
        Button button_comma = findViewById(R.id.button_comma);
        button_comma.setOnClickListener(calc.button_commaClick());
        Button button_equal = findViewById(R.id.button_equal);
        button_equal.setOnClickListener(calc.button_equalClick());
        Button button_divide = findViewById(R.id.button_divide);
        button_divide.setOnClickListener(calc.button_divideClick());
        Button button_multiply = findViewById(R.id.button_multiply);
        button_multiply.setOnClickListener(calc.button_multiplyClick());
        Button button_minus = findViewById(R.id.button_minus);
        button_minus.setOnClickListener(calc.button_minusClick());
        Button button_plus = findViewById(R.id.button_plus);
        button_plus.setOnClickListener(calc.button_plusClick());
        Button button_backspace = findViewById(R.id.button_backspace);
        button_backspace.setOnClickListener(calc.button_backspaceClick());
    }

}