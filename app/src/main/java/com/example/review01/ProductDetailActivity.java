package com.example.review01;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProductDetailActivity extends AppCompatActivity {
    private EditText edt_product_name, edt_product_code, edt_product_price, edt_product_quantity;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Add Product");
        
        initializeViews();
        setupSaveButton();
    }

    public boolean onCreate(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu_product, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    private void setupSaveButton() {

    }

    private void initializeViews() {
        edt_product_name = findViewById(R.id.edt_product_name);
        edt_product_code = findViewById(R.id.edt_product_code);
        edt_product_price = findViewById(R.id.edt_product_price);
        edt_product_quantity = findViewById(R.id.edt_product_quantity);
        btnSave = findViewById(R.id.btnSave);


    }
    private boolean validateInput() {
        if (edt_product_name.getText().toString().isEmpty()) {
            edt_product_name.setError("Please enter product name");
            return false;
        }
        if (edt_product_code.getText().toString().isEmpty()) {
            edt_product_code.setError("Please enter product code");
            return false;
        }
        if (edt_product_price.getText().toString().isEmpty()) {
            edt_product_price.setError("Please enter product price");
            return false;
        }
        if (edt_product_quantity.getText().toString().isEmpty()) {
            edt_product_quantity.setError("Please enter product quantity");
            return false;
        }
        return true;
    }
}