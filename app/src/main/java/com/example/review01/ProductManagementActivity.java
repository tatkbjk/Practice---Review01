package com.example.review01;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.adapters.ProductAdapter;
import com.thaianhthu.models.models.ListProduct;
import com.thaianhthu.models.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManagementActivity extends AppCompatActivity {
    private ListView productListView;
    private ProductAdapter productAdapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_management);
        // Thiết lập Toolbar làm ActionBar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        initializeViews();
        setupAdapter();

    }

    private void initializeViews() {
        productListView = findViewById(R.id.productListView);
        productList = new ArrayList<Product>();
    }

    private void setupAdapter() {

        // Create listProducts instance and generate sample data
        ListProduct productData = new ListProduct();
        productData.generate_sample_dataset();

        // Get the products and set them to productList
        productList.addAll(productData.getProducts());

        // Initialize adapter with populated list
        productAdapter = new ProductAdapter(this, productList);
        productListView.setAdapter(productAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu_product, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.menuAddProduct) {
            Intent intent = new Intent(this, ProductDetailActivity.class);
            startActivityForResult(intent, 1);
            return true;
        }
        else if (itemId == R.id.menuAbout) {
            // Show about dialog
            showAboutDialog();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK && data != null) {
            String name = data.getStringExtra("productName");
            String code = data.getStringExtra("productCode");
            double price = data.getDoubleExtra("price", 0.0);

            // Create new product with all required parameters
            // Using productList.size() + 1 as a simple way to generate new IDs
            Product newProduct = new Product(
                    productList.size() + 1,  // ID
                    code,                    // ProductCode
                    name,                    // ProductName
                    price,                   // UnitPrice
                    ""                       // ImageLink (empty for now)
            );
            productList.add(newProduct);
            productAdapter.notifyDataSetChanged();
        }
    }

    private void showAboutDialog() {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }


}