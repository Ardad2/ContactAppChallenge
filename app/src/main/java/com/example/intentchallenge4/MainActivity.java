package com.example.intentchallenge4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvDisplay ;
    ImageView iv_call,iv_web,iv_location,iv_emoji;
    Button btn_create;
    int emoji,phoneNumber;
    Boolean visibleCall,visibleCalender,visibleLocation;
    String webAddress,physicalAddress,phoneString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.tvDisplay);
        iv_call = findViewById(R.id.iv_call);
        iv_web = findViewById(R.id.iv_web);
        iv_location = findViewById(R.id.iv_location);
        iv_emoji = findViewById(R.id.iv_emoji);
        btn_create = findViewById(R.id.btn_create);

        iv_call.setVisibility(View.GONE);
        iv_web.setVisibility(View.GONE);
        iv_location.setVisibility(View.GONE);

        phoneNumber=14;
        webAddress="wwww.google.com";
        physicalAddress="Applegate";

        emoji=0;
        visibleCall=visibleCalender=visibleLocation=true;

        if (visibleCall == true)
        {
             iv_call.setVisibility(View.VISIBLE);
        }
        if (visibleCalender == true)
        {
            iv_web.setVisibility(View.VISIBLE);
        }
        if (visibleLocation == true)
        {
            iv_location.setVisibility(View.VISIBLE);
        }




        if (emoji==0)
        {
            iv_emoji.setVisibility(View.GONE);
        }
        else if (emoji==1)
        {
            iv_emoji.setVisibility(View.VISIBLE);
            iv_emoji.setImageResource(R.drawable.smile1);
        }
        else if (emoji==2)
        {
            iv_emoji.setVisibility(View.VISIBLE);
            iv_emoji.setImageResource(R.drawable.smile2);
        }
        else if (emoji==3)
        {
            iv_emoji.setVisibility(View.VISIBLE);
            iv_emoji.setImageResource(R.drawable.smile3);
        }


        btn_create.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view)
            {
                Intent intent = new Intent(MainActivity.this, com.example.intentchallenge4.create_contact.class);
                startActivity(intent);
            }
        });


        iv_call.setOnClickListener(new View.OnClickListener()
        {
           @Override
           public void onClick (View view)
           {
               phoneString="tel:" + Integer.toString(phoneNumber);
             Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(phoneString));
             startActivity(intent);
           }
        });

        iv_web.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webAddress));
                startActivity(intent);
            }
        });

        iv_location.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view)
            {
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0, 0 ?q=37.423156,-122.084917 (" + physicalAddress + ")"));
                startActivity(intent);
            }
        });




    }
}