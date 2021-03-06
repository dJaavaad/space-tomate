package com.example.superjeuenfait;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TomatoActivity extends AppCompatActivity {

    private ImageButton imageButtonArrowLeft;
    private ImageButton imageButtonArrowRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomato);
        imageButtonArrowLeft = findViewById(R.id.imageButtonArrowLeft);
        imageButtonArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity(BroccoliActivity.class);
            }
        });

        imageButtonArrowRight = findViewById(R.id.imageButtonArrowRight);
        imageButtonArrowRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity(EggplantActivity.class);
            }
        });

    }

    @Override
    public void onBackPressed(){
        changeActivity(SpaceshipViewActivity.class);
    }

    public void changeActivity(Class newActivity){
        Intent intent = new Intent(this, newActivity);
        startActivity(intent);
        finish();
    }
}
