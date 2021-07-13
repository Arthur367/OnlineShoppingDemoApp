package com.arthur.onlineshoppingapp.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.arthur.onlineshoppingapp.Interface.ItemClickListener;
import com.arthur.onlineshoppingapp.R;


public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        public TextView txtProductName, txtProductDescription, txtProductPrice, txtProductState;
        public ImageView imageView;
        public ItemClickListener listener;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.product_seller_image);
            txtProductName = (TextView) itemView.findViewById(R.id.product_seller_name);
            txtProductDescription = (TextView) itemView.findViewById(R.id.product_seller_description);
            txtProductPrice = (TextView) itemView.findViewById(R.id.product_seller_price);
            txtProductState =(TextView) itemView.findViewById(R.id.product_state);
        }

        public void setItemClickListener(ItemClickListener listener){
            this.listener = listener;
        }

        @Override
        public void onClick(View view) {

            listener.onClick(view, getAdapterPosition(), false);
        }
    }

