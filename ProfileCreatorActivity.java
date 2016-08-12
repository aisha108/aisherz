package com.example.girlswhocode.pawpals;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class ProfileCreatorActivity extends AppCompatActivity {
//    Spinner spinner;
//    ArrayAdapter<CharSequence> adapter;
    private SeekBar seekBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_creator);
//        initializeVariables();

        Spinner dropbreed = (Spinner) findViewById(R.id.spinBreed);
        ArrayAdapter<CharSequence> adapterBreed = ArrayAdapter.createFromResource(this, R.array.breed_names, android.R.layout.simple_spinner_item);
        adapterBreed.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropbreed.setAdapter(adapterBreed);

        Spinner dropgender = (Spinner) findViewById(R.id.spinGender);
        ArrayAdapter<CharSequence> adapterGender = ArrayAdapter.createFromResource(this, R.array.dog_gender, android.R.layout.simple_spinner_item);
        adapterGender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropgender.setAdapter(adapterGender);

        Spinner dropSize = (Spinner) findViewById(R.id.spinSize);
        ArrayAdapter<CharSequence> adapterSize = ArrayAdapter.createFromResource(this, R.array.size_list, android.R.layout.simple_spinner_item);
        adapterSize.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropSize.setAdapter(adapterSize);

        Spinner dropAge = (Spinner) findViewById(R.id.spinAge);
        ArrayAdapter<CharSequence> adapterAge = ArrayAdapter.createFromResource(this, R.array.dog_age, android.R.layout.simple_spinner_item);
        adapterAge.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropAge.setAdapter(adapterAge);
//
    }
//
     public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {
            public void onItemSelected (AdapterView<?> parent, View view, int pos, long id)

            {
                //An item was selected. You can retrieve the selected item using
                parent.getItemAtPosition(pos);
            }

            public void onNothingSelected(AdapterView<?> parent) {
                //Another interface callback
            }

        }

//    private SeekBar.OnSeekBarChangeListener customSeekBarListener =
//            new SeekBar.OnSeekBarChangeListener() {
//                @Override
//                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                    updateTextSize(int );
//                }
//            }
//    private void updateTextSize(int sizeIncrease) {
//        float newTextSize = sizeIncrease / 2;
//        if (newTextSize > 10 && newTextSize <50) {
//            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, newTextSize);
//        }
//    }
//    private void initializeVariables() {
//        seekBar = (SeekBar) findViewById(R.id.seekSize);
//        textView = (TextView) findViewById(R.id.tvDogSize);
//    }

    }