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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextTv = findViewById(R.id.textTV);
        mVoiceBtn = findViewById(R.id.voiceBtn);
        //zapamietanie id obrazkow
        x_0_y_0 = findViewById(R.id.x_0_y_0);
        x_1_y_0 = findViewById(R.id.x_1_y_0);
        //...

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
                    for(String i: result){
                        //przykladowe frazy
                        if(i.equals("pustak")){
                            //pozycja do ustawienia
                            if(i.equals("x")){
                                if(i.equals("jeden")){
                                    x = 1;
                                }
                                //...
                            }
                            if(i.equals("y")){
                                if(i.equals("jeden")){
                                    y = 1;
                                }
                                //...
                            }
                            //argument w load() to String z adresem URL obrazka
                            //argument into() obrazek z layoutu zadeklarowany wyzej zalezny od x y
                            Picasso.get().load("https://obrazek.pl").into(x_0_y_0);
                        }
                        if(i.equals("dach")){

                        }
                        if(i.equals("okno")){

                        }
                        if(i.equals("drzwi")){

                        }
                    }
                }
                break;
            }
        }
    }
}
