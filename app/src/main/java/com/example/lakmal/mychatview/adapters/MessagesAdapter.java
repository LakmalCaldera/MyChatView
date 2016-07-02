package com.example.lakmal.mychatview.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lakmal.mychatview.R;
import com.example.lakmal.mychatview.holders.MessagesViewHolder;
import com.example.lakmal.mychatview.models.Message;

import java.util.ArrayList;

/**
 * Created by Lakmal on 7/1/16.
 */
public class MessagesAdapter extends RecyclerView.Adapter<MessagesViewHolder> {

    private ArrayList<Message> messages;

    public MessagesAdapter(ArrayList<Message> messages) {
        this.messages = messages;
    }

    @Override
    public void onBindViewHolder(MessagesViewHolder holder, int position) {
        Message message = messages.get(position);
        holder.updateUI(message);
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }


    @Override
    public MessagesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View message = LayoutInflater.from(parent.getContext()).inflate(R.layout.message, parent, false);
        return new MessagesViewHolder(message);
    }




}
