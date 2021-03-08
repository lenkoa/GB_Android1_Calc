package ru.lenkoa.android1.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        initView();
    }

    private void initView() {
        Button button_theme_first = findViewById(R.id.button_theme_first);
        button_theme_first.setOnClickListener(); //TODO set theme
        Button button_theme_second = findViewById(R.id.button_theme_second);
        button_theme_second.setOnClickListener(); //TODO set theme
        Button button_back = findViewById(R.id.button_back);
        button_back.setOnClickListener(); //TODO set theme
    }
}