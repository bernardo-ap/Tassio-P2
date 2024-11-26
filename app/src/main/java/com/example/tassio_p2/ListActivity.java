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
        productList.add(new Product("Alexa multi mídia", "R$299,99", "Uma alexa que pode ser usada da forma que quiser!", R.drawable.alexa, 5));
        productList.add(new Product("Playstation 5", "R$3500,00", "Um videogame para se divertir como nunca antes visto!", R.drawable.ps5, 5));
        productList.add(new Product("Apple Iphone 14Plus", "R$4350,00", "Celular mais seguro e rápido que pode ser oferecido!", R.drawable.iphone, 5));
        productList.add(new Product("AirFryer", "R$470,99", "Economize seu tempo em casa com essa AirFryer", R.drawable.airfryer, 5));
        productList.add(new Product("WAP aspirador de pó", "R$1169,99", "Descomplique seus dias de folga e finais de semana com esse robô aspirador!", R.drawable.roboaspirador, 5));


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
