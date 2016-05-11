package com.piush.androidsimplewallpaperapp;

        import android.os.Bundle;
        import android.app.Activity;
        import android.content.Intent;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.ImageView;

public class MainActivity extends Activity {

    //Initializing image views
    ImageView on, tw, th, fo, fi, si, se, ei, ni,te;
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        on = (ImageView) findViewById(R.id.imageView1);
        tw = (ImageView) findViewById(R.id.imageView2);
        th = (ImageView) findViewById(R.id.imageView3);
        fo = (ImageView) findViewById(R.id.imageView4);
        fi = (ImageView) findViewById(R.id.imageView5);
        si = (ImageView) findViewById(R.id.imageView6);
        se = (ImageView) findViewById(R.id.imageView7);
        ei = (ImageView) findViewById(R.id.imageView8);
        ni = (ImageView) findViewById(R.id.imageView9);
        te = (ImageView) findViewById(R.id.imageView10);


        //on clicking images another main.java activity will be called.

        on.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
//defining an intent to start another activity and sending a number to main.java class
// so that we could know that which image was clicked.
                Intent i = new Intent(getApplicationContext(), Main.class);
                n = 1;
                //putextra sends data to another activity here "val" key is used which will help to get data.
                i.putExtra("val", n);
                startActivity(i);
            }
        });

        tw.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), Main.class);
                n = 2;
                i.putExtra("val", n);
                startActivity(i);
            }
        });

        th.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), Main.class);
                n = 3;
                i.putExtra("val", n);
                startActivity(i);
            }
        });

        fo.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), Main.class);
                n = 4;
                i.putExtra("val", n);
                startActivity(i);
            }
        });

        fi.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), Main.class);
                n = 5;
                i.putExtra("val", n);
                startActivity(i);
            }
        });
        si.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), Main.class);
                n = 6;
                i.putExtra("val", n);
                startActivity(i);
            }
        });

        se.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), Main.class);
                n = 7;
                i.putExtra("val", n);
                startActivity(i);
            }
        });

        ei.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), Main.class);
                n = 8;
                i.putExtra("val", n);
                startActivity(i);
            }
        });

        ni.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), Main.class);
                n = 9;
                i.putExtra("val", n);
                startActivity(i);
            }
        });

        te.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), Main.class);
                n = 10;
                i.putExtra("val", n);
                startActivity(i);
            }
        });
    }

}
