package com.example.tassio_p2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductsAdapter extends ArrayAdapter<Product> {
    public ProductsAdapter(Context context, List<Product> newsList) {
        super(context, 0, newsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Product product = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_content, parent, false);
        }

        TextView titleTextView = convertView.findViewById(R.id.productTitle);
        TextView descriptionTextView = convertView.findViewById(R.id.productDescription);
        ImageView imageView = convertView.findViewById(R.id.productImage);
        TextView priceTextView = convertView.findViewById(R.id.productPrice);

        if (product != null) {
            titleTextView.setText(product.getName());
            descriptionTextView.setText(product.getDescription());
            imageView.setImageResource(product.getImageResId());
            priceTextView.setText(product.getPrice());

            convertView.setOnClickListener(v -> {
                Intent intent = new Intent(getContext(), ProductsDetailActivity.class);
                intent.putExtra("product_title", product.getName());
                intent.putExtra("product_description", product.getDescription());
                intent.putExtra("product_image", product.getImageResId());
                intent.putExtra("product_price", product.getPrice());
                getContext().startActivity(intent);
            });
        }

        return convertView;
    }
}
