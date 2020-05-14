package sg.edu.rpc346.id19016011.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp= findViewById(R.id.datePicker);
        tp= findViewById(R.id.timePicker);
        btnDisplayDate= findViewById(R.id.buttonDate);
        btnDisplayTime= findViewById(R.id.buttonTime);
        tvDisplay= findViewById(R.id.textViewDisplay);
        btnReset= findViewById(R.id.buttonReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvDisplay.setText("Time is " + tp.getCurrentHour().toString() +":"+tp.getCurrentMinute().toString());
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText("Date is "+ dp.getDayOfMonth()+"/"+ (dp.getMonth()+1)+"/"+dp.getYear());
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dp.updateDate(2020, 0,1);
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
            }
        });
    }
}
