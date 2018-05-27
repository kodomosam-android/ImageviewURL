package com.gerimp.imageviewurl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = (ImageView) findViewById(R.id.imageview1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageview2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageview3);

        String url1 = "http://sua URL";
        String url2 = "http://sua URL";
        String url3 = "http://sua URL";

        Picasso.with(this).load(url1).into(imageView1);
        Picasso.with(this).load(url2).into(imageView2);
        Picasso.with(this).load(url3).into(imageView3);

    }

//    private void loadImageFromUrl(String url) {
//
//        Picasso.with(this).load(url).placeholder(R.mipmap.ic_launcher)
//                .error(R.mipmap.ic_launcher)
//                .into(imageView, new com.squareup.picasso.Callback() {
//
//                    @Override
//                    public void onSuccess() {
//
//                    }
//
//                    @Override
//                    public void onError() {
//
//                    }
//                });
//    }
}


