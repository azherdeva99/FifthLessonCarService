package com.msaggik.fifthlessoncarservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.msaggik.fifthlessoncarservice.entity.IncomeRentPort;
import com.msaggik.fifthlessoncarservice.entity.ShipsServiceIncome;

public class MainActivity extends AppCompatActivity {

    // поля
    private TextView output; // поле вывода информации на экран смартфона

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка поля к разметке
        output = findViewById(R.id.output);

        // создание объектов
        ShipsServiceIncome shipsServiceIncome = new ShipsServiceIncome( "Обслуживание морских судов",125, 3500);
        IncomeRentPort incomeRentPort = new IncomeRentPort("Аренда площадей порта", 170_000);

       output.setText("Выручка морского порта за месяц "
               + (incomeRentPort.monthlyIncome()
               + shipsServiceIncome.monthlyIncome()));
    }

}