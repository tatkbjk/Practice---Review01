package com.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.example.review01.R;
import com.thaianhthu.models.models.Product;

import java.util.List;

public class ProductAdapter extends ArrayAdapter<Product> {
   private Context context;
   private List<Product> productList;

   public ProductAdapter(Context context, List<Product> productList) {
       super(context, 0,productList);
       this.context = context;
       this.productList = productList;
   }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Product product = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.product_list, parent, false);
    }
        ImageView image = convertView.findViewById(R.id.imgProduct);
        TextView name = convertView.findViewById(R.id.txtProductName);
        TextView code = convertView.findViewById(R.id.txtProductCode);
        TextView price = convertView.findViewById(R.id.txtProductPrice);

        name.setText(product.getProduct_name());
        code.setText("Code: " + product.getProduct_code());
        price.setText(String.format("Price: %.0f đ", product.getUnit_price()));

//        Glide.with(context)
//                .load(product.getImage_link())
//                .placeholder(R.drawable.placeholder)
//                .error(R.drawable.placeholder)
//                .centerCrop()
//                .override(100, 100)
//                .into(image);

        return convertView;
    }
}
