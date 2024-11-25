package com.example.tassio_p2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        ListView productsListView = findViewById(R.id.productsListView);
        ImageView logoImageView = findViewById(R.id.logoImageView);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Alexa mt braba", 299.0f, "ela é mt braba", R.drawable.alexa, 5));
        productList.add(new Product("Alexa mt braba2", 299.0f, "ela é mt braba", R.drawable.alexa, 5));
        productList.add(new Product("Alexa mt braba3", 299.0f, "ela é mt braba", R.drawable.alexa, 5));
        productList.add(new Product("Alexa mt braba4", 299.1f, "ela é mt braba", R.drawable.alexa, 5));
        productList.add(new Product("Alexa mt braba5", 299.99f, "ela é mt braba", R.drawable.alexa, 5));


        ProductsAdapter adapter = new ProductsAdapter(this, productList);
        productsListView.setAdapter(adapter);

        logoImageView.setOnClickListener(v -> {
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
