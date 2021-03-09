package ru.lenkoa.android1.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        button_theme_first.setOnClickListener(v -> {
            Intent runSettings = new Intent(SettingsActivity.this,
                    MainActivity.class);
            startActivity(runSettings);
            //TODO добавить таки изменение темы MainActivity
        });

        Button button_theme_second = findViewById(R.id.button_theme_second);
        button_theme_second.setOnClickListener(v -> {
            Intent runSettings = new Intent(SettingsActivity.this,
                    MainActivity.class);
            startActivity(runSettings);
            //TODO добавить таки изменение темы MainActivity
        });

        Button button_back = findViewById(R.id.button_back);
        button_back.setOnClickListener(v -> {
            this.finish();
        });
    }
}