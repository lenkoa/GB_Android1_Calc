package ru.lenkoa.android1.calc;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class Calculations {

    private String input = null;
    private final TextView textArea;
    private Double firstNumber = null;
    private Double secondNumber = null;
    private Double result = null;
    private String action;

    public Calculations(TextView viewById) {
        textArea = viewById;
    }

    @NonNull
    @Override
    public String toString() {
        return textArea.getText().toString();
    }

    public View.OnClickListener button_1Click() {
        return v -> {
            textArea.append("1");
            input += "1"; // после преобразуем из этой строки в double при нажатии на кнопки действий
        };
    }

    public View.OnClickListener button_2Click() {
        return v -> {
            textArea.append("2");
            input += "2";
        };
    }

    public View.OnClickListener button_3Click() {
        return v -> {
            textArea.append("3");
            input += "3";
        };
    }

    public View.OnClickListener button_4Click() {
        return v -> {
            textArea.append("4");
            input += "4";
        };
    }

    public View.OnClickListener button_5Click() {
        return v -> {
            textArea.append("5");
            input += "5";
        };
    }

    public View.OnClickListener button_6Click() {
        return v -> {
            textArea.append("6");
            input += "6";
        };
    }

    public View.OnClickListener button_7Click() {
        return v -> {
            textArea.append("7");
            input += "7";
        };
    }

    public View.OnClickListener button_8Click() {
        return v -> {
            textArea.append("8");
            input += "8";
        };
    }

    public View.OnClickListener button_9Click() {
        return v -> {
            textArea.append("9");
            input += "9";
        };
    }

    public View.OnClickListener button_0Click() {
        return v -> {
            textArea.append("0");
            input += "0";
        };
    }

    public View.OnClickListener button_commaClick() {
        return v -> {
            textArea.append(",");
            input += ".";
        };
    }

    public View.OnClickListener button_equalClick() {
        return v -> {
        };
        //TODO
        //производим расчеты
    }

    public View.OnClickListener button_divideClick() {
        return v -> {
            if (input == null && firstNumber == null) { // если цифр не нажимали, на нажатие действий не реагируем
            } else if (firstNumber != null && input == null) {// если последним задано действие, заменяем действие
                action = "divide"; //TODO
            } else if (firstNumber != null && input != null) { // если действие нажато после заполнения строки для второго числа - выполняем промежуточные расчеты
                button_equalClick();
                textArea.setText(String.valueOf(result));
                textArea.append("/");
                firstNumber = result;
                secondNumber = null;
                result = null;
                //action = "divide";
            } else { // если действие нажато после заполнения строки для первого числа
                textArea.append("/");
                // firstNumber = Double.parseDouble(input);
                input = null;
                //action = "divide";
            } //TODO
        };
    }

    public View.OnClickListener button_multiplyClick() {
        return v -> {
        };
        //TODO
    }

    public View.OnClickListener button_minusClick() {
        return v -> {
        };
        //TODO
    }

    public View.OnClickListener button_plusClick() {
        return v -> {
        };
        //TODO
    }

    public View.OnClickListener button_backspaceClick() {
        return v -> {
        };
        //TODO
    }

    public void restoreCalc(String string) {
        textArea.setText(string);
    }
}
