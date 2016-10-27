package com.example.ade.uts;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ade.uts.adapter.Product;
import com.example.ade.uts.adapter.ProductListAdapter;
import com.example.ade.uts.utils.SharedPreference;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ade on 23/10/16.
 */
public class ListMenu extends AppCompatActivity{

    public static final String ARG_ITEM_ID = "product_list";

    ListView productListView;
    List<Product> products, favorite;
    ProductListAdapter productListAdapter;

    SharedPreference sharedPreference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_produk);

        setProducts();
        sharedPreference = new SharedPreference();
        productListAdapter = new ProductListAdapter(getApplicationContext(), products);

        productListView = (ListView) findViewById(R.id.list_product);
        productListView.setAdapter(productListAdapter);

    }

    private void setProducts() {

        Product product1 = new Product(1, "Nasi Timbel", "Nasi timbel murah meriah", 40000);
        Product product2 = new Product(2, "Nasi Liwet", "Nasi liwet enak pisan asli", 50000);
        Product product3 = new Product(3, "Karedok",
                "Karedok mantaaappp", 15000);
        Product product4 = new Product(4, "Cah Kangkung",
                "Cah kangkung terenaaakk", 10000);
        Product product5 = new Product(5, "Semur Jengkol",
                "Semur Jengkol mandeeeppp", 30000);
        Product product6 = new Product(6, "Sayur asem", "Sayur asemnya endoolll",
                20000);
        Product product7 = new Product(7, "Sop Buntut",
                "Sop Buntut nya enaakk coy", 50000);
        Product product8 = new Product(8, "Sop Kaki Sapi",
                "Sop kaki sapi termantaap", 75000);
        Product product9 = new Product(9, "Lotek",
                "Loteknya meleleehh di mulut", 15000);
        Product product10 = new Product(10, "Sop Iga Bakar",
                "Sop iga Bakar lezaaaattt", 75000);

        products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);
    }
}
