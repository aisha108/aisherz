package com.example.girlswhocode.pawpals;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.view.View;

public class ProfileCreatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_creator);

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

        Spinner dropSpNeut = (Spinner) findViewById(R.id.spinSpNeut);
        ArrayAdapter<CharSequence> adapterSpNeut = ArrayAdapter.createFromResource(this, R.array.YN, android.R.layout.simple_spinner_item);
        adapterSpNeut.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropSpNeut.setAdapter(adapterSpNeut);

        final Button bNext = (Button) findViewById(R.id.bProfileNext);
        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntentTwo = new Intent(ProfileCreatorActivity.this, HumanProfileActivity.class);
                ProfileCreatorActivity.this.startActivity(registerIntentTwo);
            } });
    }

     public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {
            public void onItemSelected (AdapterView<?> parent, View v, int pos, long id)

            {
                //An item was selected. You can retrieve the selected item using
                parent.getItemAtPosition(pos);
            }

            public void onNothingSelected(AdapterView<?> parent) {
                //Another interface callback
            }
        }




}