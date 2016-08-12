package com.example.girlswhocode.pawpals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class HumanProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_profile2);

        Spinner dropHGender = (Spinner) findViewById(R.id.spinHGender);
        ArrayAdapter<CharSequence> adapterHGender = ArrayAdapter.createFromResource(this, R.array.human_gender, android.R.layout.simple_spinner_item);
        adapterHGender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropHGender.setAdapter(adapterHGender);

        Spinner dropMonth = (Spinner) findViewById(R.id.spinHBMonth);
        ArrayAdapter<CharSequence> adapterMonth = ArrayAdapter.createFromResource(this, R.array.month, android.R.layout.simple_spinner_item);
        adapterMonth.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropMonth.setAdapter(adapterMonth);

        Spinner dropDays = (Spinner) findViewById(R.id.spinHBDay);
        ArrayAdapter<CharSequence> adapterDay = ArrayAdapter.createFromResource(this, R.array.month_days, android.R.layout.simple_spinner_item);
        adapterDay.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropDays.setAdapter(adapterDay);

        Spinner dropYears = (Spinner) findViewById(R.id.spinHBYear);
        ArrayAdapter<CharSequence> adapterYear = ArrayAdapter.createFromResource(this, R.array.years, android.R.layout.simple_spinner_item);
        adapterYear.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropYears.setAdapter(adapterYear);
    }
}
