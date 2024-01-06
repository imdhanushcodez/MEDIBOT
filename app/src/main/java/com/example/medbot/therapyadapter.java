package com.example.medbot;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class therapyadapter extends RecyclerView.Adapter<therapyadapter.viewholderclass> {
    Context context;
    ArrayList<therapydata> list;

    public therapyadapter(Context context, ArrayList<therapydata> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewholderclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.recycleitem1,parent,false);
        return new therapyadapter.viewholderclass(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholderclass holder, int position) {
        therapydata data = list.get(position);
        holder.name.setText(data.getName());
        holder.add.setText(data.getAddress());
        holder.imageView.setImageResource(data.getImg());
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+"8148303499"));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewholderclass extends RecyclerView.ViewHolder{
        TextView name,add;
        ImageView imageView;
        AppCompatButton btn;

        public viewholderclass(@NonNull View itemView) {
            super(itemView);
            btn = itemView.findViewById(R.id.recyclebtn);
            name = itemView.findViewById(R.id.therapyname);
            add = itemView.findViewById(R.id.therapyaddress);
            imageView = itemView.findViewById(R.id.imgs);
        }
    }

}
