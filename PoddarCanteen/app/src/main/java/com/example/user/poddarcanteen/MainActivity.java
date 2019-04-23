package com.example.user.poddarcanteen;

import android.content.Intent;
import android.Manifest;
import android.os.Bundle;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import agency.tango.materialintroscreen.MessageButtonBehaviour;
import agency.tango.materialintroscreen.SlideFragmentBuilder;
import agency.tango.materialintroscreen.animations.IViewTranslation;



public class MainActivity extends MaterialIntroActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.first_slide_background)
                        .buttonsColor(R.color.first_slide_buttons)
                        .image(R.drawable.burger)
                        .title("Organize your time with us")
                        .description("Would you try?")
                        .build(),
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showMessage("We provide solutions to make you love your work");
                    }
                }, "Work with love"));

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.second_slide_background)
                .buttonsColor(R.color.second_slide_buttons)
                .title("Want more?")
                .description("Go on")
                .build());


        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.third_slide_background)
                        .buttonsColor(R.color.third_slide_buttons)
                        .image(R.drawable.burger)
                        .title("We provide best tools")
                        .description("ever")
                        .build(),
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showMessage("Try us!");
                    }
                }, "Tools"));

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.fourth_slide_background)
                .buttonsColor(R.color.fourth_slide_buttons)
                .title("That's it")
                .description("Would you join us?")
                .build());
    }

    @Override
    public void onFinish() {
        super.onFinish();
        Intent i=new Intent(MainActivity.this,LogIn.class);
        startActivity(i);
        Toast.makeText(this, "Try this library in your project! :)", Toast.LENGTH_SHORT).show();
    }
}
        /*

    Button btn,btn1;
        AppCompatActivity {
                ImageView img;
    int[] imageId={R.drawable.c,R.drawable.f,R.drawable.p,R.drawable.r,R.drawable.v,R.drawable.a};

    int currentIndex=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        btn=findViewById(R.id.click_me);
//        img=findViewById(R.id.imageView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(imageId[currentIndex]);
                currentIndex++;
                currentIndex=currentIndex%imageId.length;
            }
        });
        btn1=findViewById(R.id.next);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,LogIn.class);
                startActivity(i);
                finish();
            }
        });
    }
}

*/
