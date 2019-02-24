package com.example.shiz.mvpproject.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

import com.example.shiz.mvpproject.R;

public class ReadMoreActivity extends AppCompatActivity {


    TextView tvReadMore;
    String articleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readmore);

        tvReadMore = findViewById(R.id.tvReadMore);
        articleText = getIntent().getStringExtra("text");
        tvReadMore.setText(Html.fromHtml(articleText));
    }

}
