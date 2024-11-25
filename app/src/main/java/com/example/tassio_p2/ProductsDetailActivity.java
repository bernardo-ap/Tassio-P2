package com.example.tassio_p2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductsDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_detail);

        String title = getIntent().getStringExtra("product_title");
        String description = getIntent().getStringExtra("product_description");
        String price = getIntent().getStringExtra("product_price");
        int imageResId = getIntent().getIntExtra("product_image", 0);

        TextView titleTextView = findViewById(R.id.detailTitle);
        TextView descriptionTextView = findViewById(R.id.detailDescription);
        ImageView imageView = findViewById(R.id.detailImage);
        ImageView logoImageView = findViewById(R.id.logoImageView);
        TextView priceTextView = findViewById(R.id.detailPrice);

        titleTextView.setText(title);
        descriptionTextView.setText(description);
        imageView.setImageResource(imageResId);
        priceTextView.setText(price);

        logoImageView.setOnClickListener(v -> {

            Intent intent = new Intent(ProductsDetailActivity.this, ListActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }
}
