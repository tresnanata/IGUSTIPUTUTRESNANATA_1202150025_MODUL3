package com.example.tresnanata.igustipututresnanata_1202150025_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMenuActivity extends AppCompatActivity {
    private Button buttonAdd, buttonMin;
    private ImageView progress, labelImg;
    private TextView textMerk, textDesc, textStatus;
    private int level =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        buttonAdd = findViewById(R.id.buttonTambah);
        buttonMin = findViewById(R.id.buttonKurang);
        progress = findViewById(R.id.imageIsi);

        textMerk = findViewById(R.id.textMerk);
        textDesc = findViewById(R.id.textDeskripsi);
        labelImg = findViewById(R.id.labelImage);
        textStatus = findViewById(R.id.textStatus);

        Intent in = getIntent();
        String title=in.getStringExtra("etitle");
        String description=in.getStringExtra("edesc");
        if(description.length()<1){description="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin ut tincidunt dui. Etiam et tincidunt dolor. Phasellus eu rhoncus sem. Suspendisse laoreet dolor eu nisi dictum congue id ut ipsum. Etiam sagittis sodales urna. Sed condimentum arcu at pretium laoreet. Nam venenatis leo sit amet sodales malesuada. Morbi quis convallis lorem, quis malesuada elit. Integer suscipit mauris et ex finibus, id aliquam nisi maximus. Quisque lacinia suscipit ipsum, in posuere elit eleifend vel. Vestibulum vehicula, est ac interdum tristique, elit odio volutpat ex, eu eleifend erat dolor a mauris.\nInterdum et malesuada fames ac ante ipsum primis in faucibus. Nunc sagittis sagittis orci, a mollis justo ultrices id. Vestibulum a neque eget magna ultricies posuere eget ut sem. Nunc egestas vestibulum metus. Praesent et mi quis dolor pellentesque mattis quis eu turpis. Nunc convallis quis elit vitae ornare. Sed venenatis sed lorem eget posuere. Nam lobortis diam dui, et sollicitudin velit faucibus quis. Donec sit amet neque non diam aliquam imperdiet.\n";}
        int imgRes = in.getIntExtra("eimg",0);

        setTitle(title);
        textMerk.setText(title);
        textDesc.setText(description);
        labelImg.setImageResource(imgRes);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambahIsi();
            }
        });

        buttonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kurangIsi();
            }
        });
    }


    public void tambahIsi(){
        status();
        if(level==6){
            Toast.makeText(this,"Air Penuh",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(++level);
    }

    public void kurangIsi(){
        status();
        if(level==0){Toast.makeText(this,"Air Sedikit",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(--level);
    }

    public void status(){
        textStatus.setText(""+level+"L");
    }
}
