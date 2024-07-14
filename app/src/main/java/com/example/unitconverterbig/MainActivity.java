package com.example.unitconverterbig;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements CategoryAdapter.OnCategoryClickListener {

    private RecyclerView recyclerView;

    @Override
    public void onCategoryClick(Category category) {
        // Handle click on a category item
        Intent intent = new Intent(MainActivity.this, ConversionActivity.class);
        intent.putExtra("categoryName", category.getCategoryName());
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Unit Converter");

        recyclerView = findViewById(R.id.recyclerView);

        List<Category> categories = Arrays.asList(
                new Category("Length", R.drawable.ic_length),
                new Category("Weight", R.drawable.ic_weight),
                new Category("Temperature", R.drawable.ic_temp),
                new Category("Volume", R.drawable.ic_volume),
                new Category("Area", R.drawable.ic_area),
                new Category("Speed", R.drawable.ic_speed),
                new Category("Time", R.drawable.ic_time),
                new Category("Number", R.drawable.ic_number),
                new Category("Currency", R.drawable.ic_currency)
        );

        CategoryAdapter adapter = new CategoryAdapter(this, categories);
        adapter.setOnCategoryClickListener(this); // Set the click listener

        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(adapter);
    }

}
