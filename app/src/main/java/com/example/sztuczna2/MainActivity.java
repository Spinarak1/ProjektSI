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
                    for(int i = 0; i<result.size(); i++){
                        //przykladowe frazy
                        if(result.get(i).equals("pustak")){
                            if(i+ 1<result.size()){
                                i++;
                            }
                            if(result.get(i).equals("na")) {
                                if(i+ 1<result.size()){
                                    i++;
                                }
                                //pozycja do ustawienia
                                    if (result.get(i).equals("zero")) {
                                        if(i+ 1<result.size()){
                                            i++;
                                        }
                                        if (result.get(i).equals("zero")) {
                                            //argument w load() to String z adresem URL obrazka
                                            //argument into() obrazek z layoutu zadeklarowany wyzej zalezny od x y
                                            Picasso.get().load("https://obrazek.pl").into(x_0_y_0);
                                        }
                                        if (result.get(i).equals("jeden")) {
                                            Picasso.get().load("https://obrazek.pl").into(x_0_y_1);
                                        }
                                        if (result.get(i).equals("dwa")) {
                                            Picasso.get().load("https://obrazek.pl").into(x_0_y_2);
                                        }
                                        if (result.get(i).equals("trzy")) {
                                            Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                if (result.get(i).equals("jeden")) {
                                    if(i+ 1<result.size()){
                                        i++;
                                    }
                                    if (result.get(i).equals("zero")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_1_y_0);
                                    }
                                    if (result.get(i).equals("jeden")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_1_y_1);
                                    }
                                    if (result.get(i).equals("dwa")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_1_y_2);
                                    }
                                    if (result.get(i).equals("trzy")) {
                                        Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                    }
                                }
                                if (result.get(i).equals("dwa")) {
                                    if(i+ 1<result.size()){
                                        i++;
                                    }
                                    if (result.get(i).equals("zero")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_2_y_0);
                                    }
                                    if (result.get(i).equals("jeden")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_2_y_1);
                                    }
                                    if (result.get(i).equals("dwa")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_2_y_2);
                                    }
                                    if (result.get(i).equals("trzy")) {
                                        Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                    }
                                }
                                if (result.get(i).equals("trzy")) {
                                    if(i+ 1<result.size()){
                                        i++;
                                    }
                                    if (result.get(i).equals("zero")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_3_y_0);
                                    }
                                    if (result.get(i).equals("jeden")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_3_y_1);
                                    }
                                    if (result.get(i).equals("dwa")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_3_y_2);
                                    }
                                    if (result.get(i).equals("trzy")) {
                                        Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                    }
                                }
                                if (result.get(i).equals("cztery")) {
                                    if(i+ 1<result.size()){
                                        i++;
                                    }
                                    if (result.get(i).equals("zero")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_4_y_0);
                                    }
                                    if (result.get(i).equals("jeden")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_4_y_1);
                                    }
                                    if (result.get(i).equals("dwa")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_4_y_2);
                                    }
                                    if (result.get(i).equals("trzy")) {
                                        Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                    }
                                }
                                if (result.get(i).equals("pięć")) {
                                    if(i+ 1<result.size()){
                                        i++;
                                    }
                                    if (result.get(i).equals("zero")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_5_y_0);
                                    }
                                    if (result.get(i).equals("jeden")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_5_y_1);
                                    }
                                    if (result.get(i).equals("dwa")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_5_y_2);
                                    }
                                    if (result.get(i).equals("trzy")) {
                                        Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                    }
                                }
                                if (result.get(i).equals("sześć")) {
                                    if(i+ 1<result.size()){
                                        i++;
                                    }
                                    if (result.get(i).equals("zero")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_6_y_0);
                                    }
                                    if (result.get(i).equals("jeden")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_6_y_1);
                                    }
                                    if (result.get(i).equals("dwa")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_6_y_2);
                                    }
                                    if (result.get(i).equals("trzy")) {
                                        Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                    }
                                }
                                if (result.get(i).equals("siedem")) {
                                    if(i+ 1<result.size()){
                                        i++;
                                    }
                                    if (result.get(i).equals("zero")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_7_y_0);
                                    }
                                    if (result.get(i).equals("jeden")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_7_y_1);
                                    }
                                    if (result.get(i).equals("dwa")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_7_y_2);
                                    }
                                    if (result.get(i).equals("trzy")) {
                                        Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                    }
                                }
                                if (result.get(i).equals("osiem")) {
                                    if(i+ 1<result.size()){
                                        i++;
                                    }
                                    if (result.get(i).equals("zero")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_8_y_0);
                                    }
                                    if (result.get(i).equals("jeden")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_8_y_1);
                                    }
                                    if (result.get(i).equals("dwa")) {
                                        Picasso.get().load("https://obrazek.pl").into(x_8_y_2);
                                    }
                                    if (result.get(i).equals("trzy")) {
                                        Toast.makeText(this, "Nie możesz postawić tego elementu", Toast.LENGTH_SHORT).show();
                                    }
                                }
                                    //...
                                    //...
                            }
                        }
                        if(result.get(i).equals("dach")){
                            if(i+1<result.size()){
                                i++;
                            }
                            if(result.get(i).equals("na")){
                                if(i+1<result.size()){
                                    i++;
                                }
                                if(result.get(i).equals("zero")){
                                    if(i+1<result.size()){
                                        i++;
                                    }
                                    if(result.get(i).equals("trzy")){
                                        Picasso.get().load("https://obrazek.pl").into(x_0_y_3);
                                    }else{
                                        Toast.makeText(this, "Nie możesz postawić tego elementu w tej lokacji", Toast.LENGTH_SHORT).show();
                                    }
                                }else{
                                    Toast.makeText(this, "Nie możesz postawić tego elementu w tej lokacji", Toast.LENGTH_SHORT).show();
                                }
                            }
                        }
                        if(result.get(i).equals("okno")){

                        }
                        if(result.get(i).equals("drzwi")){

                        }
                    }
                }
                break;
            }
        }
    }
}
