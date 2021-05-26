package com.example.tekbasinaingilizce;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static androidx.recyclerview.widget.RecyclerView.*;

public class RecAdapChat extends RecyclerView.Adapter<RecAdapChat.MyViewHolder> {

    public List<String> chatmesajlari;


    public class MyViewHolder extends ViewHolder{

        public TextView chatmesaj;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


                    chatmesaj = itemView.findViewById(R.id.rec_text);




        }
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



                View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message_send,parent,false);
                return new MyViewHolder(itemView);




    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


            String chatmesaj = chatmesajlari.get(position);
            holder.chatmesaj.setText(chatmesaj);

    }

    @Override
    public int getItemCount() {

        return chatmesajlari.size();

    }

    public RecAdapChat(List<String> chatmesajlari) {

        this.chatmesajlari = chatmesajlari;
    }


}
