package com.example.fragement;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
Button AB,BB;
FrameLayout linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AB=findViewById(R.id.button);
        BB=findViewById(R.id.button2);
        linear=findViewById(R.id.linear);
        AB.setOnClickListener(v -> {
            A a=new A();
            FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.linear,a);
            ft.commit();
        });
        BB.setOnClickListener(v -> {
            B b=new B();
            FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.linear,b);
            ft.commit();
        });
    }
}