package com.example.shiz.mvpproject.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.shiz.mvpproject.R;
import com.example.shiz.mvpproject.model.Content;
import com.example.shiz.mvpproject.ui.MainActivity;
import com.example.shiz.mvpproject.ui.ReadMoreActivity;

import java.util.ArrayList;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleHolder> {

    Context context;
    ArrayList<Content> content;

    public ArticleAdapter(ArrayList<Content> content, MainActivity mainActivity) {
        this.context = mainActivity;
        this.content = content;

    }

    @NonNull
    @Override
    public ArticleHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(context).inflate(R.layout.rv_article,viewGroup,false);
        ArticleHolder viewholder = new ArticleHolder(v);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleHolder articleHolder, final int i) {

        articleHolder.tvTitle.setText(content.get(i).getArticle().getTitle());
        articleHolder.tvText.setText(Html.fromHtml(content.get(i).getArticle().getText()));
        Glide.with(context).load(content.get(i).getArticle().getImage_url())
                .into(articleHolder.ivImage);

        articleHolder.readMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ReadMoreActivity.class);
                intent.putExtra("text", content.get(i).getArticle().getText());
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return content.size();
    }

    public class ArticleHolder extends RecyclerView.ViewHolder {

        TextView tvTitle, tvText, readMore;
        ImageView ivImage;

        public ArticleHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvText = itemView.findViewById(R.id.tvText);
            readMore = itemView.findViewById(R.id.readMore);
            ivImage = itemView.findViewById(R.id.ivImage);
        }
    }
}
