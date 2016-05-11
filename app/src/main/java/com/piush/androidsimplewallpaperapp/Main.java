package com.piush.androidsimplewallpaperapp;

        import java.io.IOException;
        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.Toast;
        import android.app.Activity;
        import android.app.WallpaperManager;
        import android.content.Intent;

@SuppressWarnings("ALL")
public class Main extends Activity {

    ImageView iv;
    int t=0,n;
    Button butn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        iv=(ImageView)findViewById(R.id.imageView);
        butn=(Button)findViewById(R.id.button1);

//Intent to receive the data send in first activity.
        Intent i=getIntent() ;
        Bundle b=i.getExtras();

        if(b!=null){
//getting the value send with the key "val"
            n=b.getInt("val");
//here switch is used to set the image in first activity in fullscreen
            switch(n){
                case 1:
                    iv.setImageResource(R.drawable.one);
                    t=1;
                    break;
                case 2:
                    iv.setImageResource(R.drawable.two);
                    t=2;
                    break;
                case 3:
                    iv.setImageResource(R.drawable.three);
                    t=3;
                    break;
                case 4:
                    iv.setImageResource(R.drawable.four);
                    t=4;
                    break;
                case 5:
                    iv.setImageResource(R.drawable.five);
                    t=5;
                    break;
                case 6:
                    iv.setImageResource(R.drawable.six);
                    t=6;
                    break;
                case 7:
                    iv.setImageResource(R.drawable.seven);
                    t=7;
                    break;
                case 8:
                    iv.setImageResource(R.drawable.eight);
                    t=8;
                    break;
                case 9:
                    iv.setImageResource(R.drawable.nine);
                    t=9;
                    break;
                case 10:
                    iv.setImageResource(R.drawable.ten);
                    t=10;
                    break;
                default:
                    t=0;
                    iv.setImageResource(R.drawable.ic_launcher);
                    break;

            }
        }
        else{

            Toast.makeText(getApplicationContext(), "some error occur", Toast.LENGTH_LONG).show();
        }


//On clicking the button wallpaper will be set.
        butn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

//creating wallamanager class object to set the image as wallpaper.
                WallpaperManager wm= WallpaperManager.getInstance(getApplicationContext());
                switch(n){
                    case 1:
                        try {
//setting the wallpaper
                            wm.setResource(R.drawable.one);
                            Toast.makeText(getApplicationContext(), "Wallpaper Set", Toast.LENGTH_LONG).show();
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        try {
                            wm.setResource(R.drawable.two);
                            Toast.makeText(getApplicationContext(), "Wallpaper Set", Toast.LENGTH_LONG).show();
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        break;
                    case 3:
                        try {
                            wm.setResource(R.drawable.three);
                            Toast.makeText(getApplicationContext(), "Wallpaper Set", Toast.LENGTH_LONG).show();

                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        break;
                    case 4:
                        try {
                            wm.setResource(R.drawable.four);
                            Toast.makeText(getApplicationContext(), "Wallpaper Set", Toast.LENGTH_LONG).show();

                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        break;
                    case 5:
                        try {
                            wm.setResource(R.drawable.five);
                            Toast.makeText(getApplicationContext(), "Wallpaper Set", Toast.LENGTH_LONG).show();

                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        break;
                    case 6:
                        try {
                            wm.setResource(R.drawable.six);
                            Toast.makeText(getApplicationContext(), "Wallpaper Set", Toast.LENGTH_LONG).show();

                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        break;
                    case 7:
                        try {
                            wm.setResource(R.drawable.seven);
                            Toast.makeText(getApplicationContext(), "Wallpaper Set", Toast.LENGTH_LONG).show();

                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        break;
                    case 8:
                        try {
                            wm.setResource(R.drawable.eight);
                            Toast.makeText(getApplicationContext(), "Wallpaper Set", Toast.LENGTH_LONG).show();

                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        break;
                    case 9:
                        try {
                            wm.setResource(R.drawable.nine);
                            Toast.makeText(getApplicationContext(), "Wallpaper Set", Toast.LENGTH_LONG).show();

                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        break;
                    case 10:
                        try {
                            wm.setResource(R.drawable.ten);
                            Toast.makeText(getApplicationContext(), "Wallpaper Set", Toast.LENGTH_LONG).show();

                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        break;
                    default:
                        try {
                            wm.setResource(R.drawable.ic_launcher);
                            Toast.makeText(getApplicationContext(), "Wallpaper Set", Toast.LENGTH_LONG).show();

                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        break;
                }
            }
        });
    }
}
