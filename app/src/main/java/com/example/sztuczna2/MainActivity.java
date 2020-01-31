package com.example.sztuczna2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_SPEECH_INPUT = 1000;
    //views from activity
    TextView mTextTv;
    ImageButton mVoiceBtn;
    String bricks = "https://www.bimobject.com/en/content/showproductimage/4a544d86-39af-420a-915f-3cc4e7b5a8f4/145561/default?ver=20180510102031";
    String window = "https://previews.123rf.com/images/dsmsoft/dsmsoft1206/dsmsoft120600011/14173355-small-window-with-lattice-in-a-the-red-brick-prison-wall.jpg";
    String roof = "https://imgur.com/kYwMXZC";
    String doors = "https://previews.123rf.com/images/kaowenhua/kaowenhua1604/kaowenhua160401242/54485209-old-bricks-door.jpg";
    ImageView x_0_y_0;
    ImageView x_1_y_0;
    ImageView x_2_y_0;
    ImageView x_3_y_0;
    ImageView x_4_y_0;
    ImageView x_5_y_0;
    ImageView x_6_y_0;
    ImageView x_7_y_0;
    ImageView x_8_y_0;
    ImageView x_0_y_1;
    ImageView x_1_y_1;
    ImageView x_2_y_1;
    ImageView x_3_y_1;
    ImageView x_4_y_1;
    ImageView x_5_y_1;
    ImageView x_6_y_1;
    ImageView x_7_y_1;
    ImageView x_8_y_1;
    ImageView x_0_y_2;
    ImageView x_1_y_2;
    ImageView x_2_y_2;
    ImageView x_3_y_2;
    ImageView x_4_y_2;
    ImageView x_5_y_2;
    ImageView x_6_y_2;
    ImageView x_7_y_2;
    ImageView x_8_y_2;
    ImageView x_0_y_3;

    //----------------------------------------------

    ImageView magazine_bricks_1;
    ImageView magazine_bricks_2;
    ImageView magazine_bricks_3;
    ImageView magazine_bricks_4;
    ImageView magazine_bricks_5;
    ImageView magazine_bricks_6;
    ImageView magazine_bricks_7;
    ImageView magazine_bricks_8;
    ImageView magazine_bricks_9;
    ImageView magazine_bricks_10;
    ImageView magazine_bricks_11;
    ImageView magazine_bricks_12;
    ImageView magazine_bricks_13;
    ImageView magazine_bricks_14;
    ImageView magazine_bricks_15;
    ImageView magazine_bricks_16;
    ImageView magazine_bricks_17;
    ImageView magazine_bricks_18;
    ImageView magazine_bricks_19;
    ImageView magazine_bricks_20;
    ImageView magazine_bricks_21;
    ImageView magazine_bricks_22;
    ImageView magazine_windows_1;
    ImageView magazine_windows_2;
    ImageView magazine_windows_3;
    ImageView magazine_windows_4;
    ImageView magazine_doors_1;
    ImageView magazine_roof_1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextTv = findViewById(R.id.textTV);
        mVoiceBtn = findViewById(R.id.voiceBtn);
        //zapamietanie id obrazkow
        x_0_y_0 = findViewById(R.id.x_0_y_0);
        x_1_y_0 = findViewById(R.id.x_1_y_0);
        x_2_y_0 = findViewById(R.id.x_2_y_0);
        x_3_y_0 = findViewById(R.id.x_3_y_0);
        x_4_y_0 = findViewById(R.id.x_4_y_0);
        x_5_y_0 = findViewById(R.id.x_5_y_0);
        x_6_y_0 = findViewById(R.id.x_6_y_0);
        x_7_y_0 = findViewById(R.id.x_7_y_0);
        x_8_y_0 = findViewById(R.id.x_8_y_0);
        //...
        x_0_y_1 = findViewById(R.id.x_0_y_1);
        x_1_y_1 = findViewById(R.id.x_1_y_1);
        x_2_y_1 = findViewById(R.id.x_2_y_1);
        x_3_y_1 = findViewById(R.id.x_3_y_1);
        x_4_y_1 = findViewById(R.id.x_4_y_1);
        x_5_y_1 = findViewById(R.id.x_5_y_1);
        x_6_y_1 = findViewById(R.id.x_6_y_1);
        x_7_y_1 = findViewById(R.id.x_7_y_1);
        x_8_y_1 = findViewById(R.id.x_8_y_1);
        //...
        x_0_y_2 = findViewById(R.id.x_0_y_2);
        x_1_y_2 = findViewById(R.id.x_1_y_2);
        x_2_y_2 = findViewById(R.id.x_2_y_2);
        x_3_y_2 = findViewById(R.id.x_3_y_2);
        x_4_y_2 = findViewById(R.id.x_4_y_2);
        x_5_y_2 = findViewById(R.id.x_5_y_2);
        x_6_y_2 = findViewById(R.id.x_6_y_2);
        x_7_y_2 = findViewById(R.id.x_7_y_2);
        x_8_y_2 = findViewById(R.id.x_8_y_2);
        //...
        x_0_y_3 = findViewById(R.id._x_0_y_3);

        //--------------------------------------------------------

        magazine_bricks_1 = findViewById(R.id.magazine_bricks_1);
        magazine_bricks_2 = findViewById(R.id.magazine_bricks_2);
        magazine_bricks_3 = findViewById(R.id.magazine_bricks_3);
        magazine_bricks_4 = findViewById(R.id.magazine_bricks_4);
        magazine_bricks_5 = findViewById(R.id.magazine_bricks_5);
        magazine_bricks_6 = findViewById(R.id.magazine_bricks_6);
        magazine_bricks_7 = findViewById(R.id.magazine_bricks_7);
        magazine_bricks_8 = findViewById(R.id.magazine_bricks_8);
        magazine_bricks_9 = findViewById(R.id.magazine_bricks_9);
        magazine_bricks_10 = findViewById(R.id.magazine_bricks_10);
        magazine_bricks_11 = findViewById(R.id.magazine_bricks_11);
        magazine_bricks_12 = findViewById(R.id.magazine_bricks_12);
        magazine_bricks_13 = findViewById(R.id.magazine_bricks_13);
        magazine_bricks_14 = findViewById(R.id.magazine_bricks_14);
        magazine_bricks_15 = findViewById(R.id.magazine_bricks_15);
        magazine_bricks_16 = findViewById(R.id.magazine_bricks_16);
        magazine_bricks_17 = findViewById(R.id.magazine_bricks_17);
        magazine_bricks_18 = findViewById(R.id.magazine_bricks_18);
        magazine_bricks_19 = findViewById(R.id.magazine_bricks_19);
        magazine_bricks_20 = findViewById(R.id.magazine_bricks_20);
        magazine_bricks_21 = findViewById(R.id.magazine_bricks_21);
        magazine_bricks_22 = findViewById(R.id.magazine_bricks_22);

        magazine_windows_1 = findViewById(R.id.magazine_windows_1);
        magazine_windows_2 = findViewById(R.id.magazine_windows_2);
        magazine_windows_3 = findViewById(R.id.magazine_windows_3);
        magazine_windows_4 = findViewById(R.id.magazine_windows_4);

        magazine_doors_1 = findViewById(R.id.magazine_doors_1);

        magazine_roof_1 = findViewById(R.id.magazine_roof_1);

        //-------------------------------------------------
        Picasso.get().load(bricks).into(magazine_bricks_1);
        Picasso.get().load(bricks).into(magazine_bricks_2);
        Picasso.get().load(bricks).into(magazine_bricks_3);
        Picasso.get().load(bricks).into(magazine_bricks_4);
        Picasso.get().load(bricks).into(magazine_bricks_5);
        Picasso.get().load(bricks).into(magazine_bricks_6);
        Picasso.get().load(bricks).into(magazine_bricks_7);
        Picasso.get().load(bricks).into(magazine_bricks_8);
        Picasso.get().load(bricks).into(magazine_bricks_9);
        Picasso.get().load(bricks).into(magazine_bricks_10);
        Picasso.get().load(bricks).into(magazine_bricks_11);
        Picasso.get().load(bricks).into(magazine_bricks_12);
        Picasso.get().load(bricks).into(magazine_bricks_13);
        Picasso.get().load(bricks).into(magazine_bricks_14);
        Picasso.get().load(bricks).into(magazine_bricks_15);
        Picasso.get().load(bricks).into(magazine_bricks_16);
        Picasso.get().load(bricks).into(magazine_bricks_17);
        Picasso.get().load(bricks).into(magazine_bricks_18);
        Picasso.get().load(bricks).into(magazine_bricks_19);
        Picasso.get().load(bricks).into(magazine_bricks_20);
        Picasso.get().load(bricks).into(magazine_bricks_21);
        Picasso.get().load(bricks).into(magazine_bricks_22);

        Picasso.get().load(window).into(magazine_windows_1);
        Picasso.get().load(window).into(magazine_windows_2);
        Picasso.get().load(window).into(magazine_windows_3);
        Picasso.get().load(window).into(magazine_windows_4);

        Picasso.get().load(doors).into(magazine_doors_1);

        Picasso.get().load(roof).into(magazine_roof_1);


        //button click listener
        mVoiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }
        });
    }

    private void speak() {
        //intent to show speach to text dialog
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Hej, powiedz coś");
        //start intent
        try{
            //no error
            //start dialog
            startActivityForResult(intent,REQUEST_CODE_SPEECH_INPUT);


        }
        catch(Exception e) {
            Intent your_browser_intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://market.android.com/details?id=APP_PACKAGE_NAME"));
            startActivity(your_browser_intent);
            Toast.makeText(this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }
    //Receive message and handle it

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        int x = 0, y = 0;
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode){
            case REQUEST_CODE_SPEECH_INPUT:{
                if (resultCode==RESULT_OK && data!=null) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    mTextTv.setText(result.get(0));
                    for(int i = 0; i<result.size(); i++) {
                        //przykladowe frazy
                        if(result.get(i).equals("pobierz")){
                            if (i + 1 < result.size()) {
                                i++;
                            }
                            if(result.get(i).equals("z")){
                                if (i + 1 < result.size()) {
                                    i++;
                                }
                                if(result.get(i).equals("magazynu")){
                                    if (i + 1 < result.size()) {
                                        i++;
                                    }

                                }
                            }
                        }
                        if (result.get(i).equals("wstaw")) {
                            if (i + 1 < result.size()) {
                                i++;
                            }
                            if (result.get(i).equals("pustak")) {
                                if (i + 1 < result.size()) {
                                    i++;
                                }
                                if (result.get(i).equals("na")) {
                                    if (i + 1 < result.size()) {
                                        i++;
                                    }
                                    //pozycja do ustawienia
                                    if (result.get(i).equals("zero")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            //argument w load() to String z adresem URL obrazka
                                            //argument into() obrazek z layoutu zadeklarowany wyzej zalezny od x y
                                            Picasso.get().load(bricks).into(x_0_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(bricks).into(x_0_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(bricks).into(x_0_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("jeden")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(bricks).into(x_1_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(bricks).into(x_1_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(bricks).into(x_1_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("dwa")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(bricks).into(x_2_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(bricks).into(x_2_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(bricks).into(x_2_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("trzy")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(bricks).into(x_3_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(bricks).into(x_3_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(bricks).into(x_3_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("cztery")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(bricks).into(x_4_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(bricks).into(x_4_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(bricks).into(x_4_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("pięć")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(bricks).into(x_5_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(bricks).into(x_5_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(bricks).into(x_5_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("sześć")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(bricks).into(x_6_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(bricks).into(x_6_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(bricks).into(x_6_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("siedem")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(bricks).into(x_7_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(bricks).into(x_7_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(bricks).into(x_7_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("osiem")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(bricks).into(x_8_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(bricks).into(x_8_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(bricks).into(x_8_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    //...
                                    //...
                                }
                            }
                            if (result.get(i).equals("dach")) {
                                if (i + 1 < result.size()) {
                                    i++;
                                }
                                if (result.get(i).equals("na")) {
                                    if (i + 1 < result.size()) {
                                        i++;
                                    }
                                    if (result.get(i).equals("zero")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Picasso.get().load(roof).into(x_0_y_3);
                                        } else {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu w tej lokacji", Toast.LENGTH_SHORT).show();
                                        }
                                    } else {
                                        Toast.makeText(this, "Nie możesz postawić tego elementu w tej lokacji", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            }
                            if (result.get(i).equals("okno")) {
                                if (i + 1 < result.size()) {
                                    i++;
                                }
                                if (result.get(i).equals("na")) {
                                    if (i + 1 < result.size()) {
                                        i++;
                                    }
                                    if (result.get(i).equals("zero")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(window).into(x_0_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(window).into(x_0_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(window).into(x_0_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("jeden")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(window).into(x_1_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(window).into(x_1_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(window).into(x_1_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("dwa")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(window).into(x_2_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(window).into(x_2_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(window).into(x_2_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("trzy")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(window).into(x_3_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(window).into(x_3_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(window).into(x_3_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("cztery")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(window).into(x_4_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(window).into(x_4_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(window).into(x_4_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("pięć")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(window).into(x_5_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(window).into(x_5_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(window).into(x_5_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("sześć")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(window).into(x_6_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(window).into(x_6_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(window).into(x_6_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("siedem")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(window).into(x_7_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(window).into(x_7_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(window).into(x_7_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("osiem")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(window).into(x_8_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load(window).into(x_8_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load(window).into(x_8_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    //...
                                    //...
                                }
                            }
                            if (result.get(i).equals("drzwi")) {
                                if (i + 1 < result.size()) {
                                    i++;
                                }
                                if (result.get(i).equals("na")) {
                                    if (i + 1 < result.size()) {
                                        i++;
                                    }
                                    //pozycja do ustawienia
                                    if (result.get(i).equals("zero")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(doors).into(x_0_y_0);
                                        } else {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("jeden")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(doors).into(x_1_y_0);
                                        } else {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("dwa")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(doors).into(x_2_y_0);
                                        } else {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("trzy")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(doors).into(x_3_y_0);
                                        } else {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("cztery")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(doors).into(x_4_y_0);
                                        } else {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("pięć")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(doors).into(x_5_y_0);
                                        } else {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("sześć")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(doors).into(x_6_y_0);
                                        } else {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("siedem")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(doors).into(x_7_y_0);
                                        } else {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (result.get(i).equals("osiem")) {
                                        if (i + 1 < result.size()) {
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            Picasso.get().load(doors).into(x_8_y_0);
                                        } else {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            }
        }
    }
}
