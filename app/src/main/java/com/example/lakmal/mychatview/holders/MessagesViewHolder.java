package com.example.lakmal.mychatview.holders;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.lakmal.mychatview.R;
import com.example.lakmal.mychatview.models.Message;

/**
 * Created by Lakmal on 7/1/16.
 */
public class MessagesViewHolder extends RecyclerView.ViewHolder{

    private LinearLayout messageContainer;
    private TextView _message;
    private TextView _sender;

    public MessagesViewHolder(View itemView) {
        super(itemView);

        this.messageContainer = (LinearLayout) itemView.findViewById(R.id.message_container);
        this._message = (TextView) itemView.findViewById(R.id.message);
        this._sender = (TextView) itemView.findViewById(R.id.sender);

    }

    public void updateUI(Message message){

        String bgImage = message.getBackgroundImage();
        int resource = messageContainer.getResources().getIdentifier(bgImage, null, messageContainer.getContext().getPackageName());
        Drawable image = messageContainer.getResources().getDrawable(resource);
        messageContainer.setBackground(image);

        _message.setText(message.getText());
        _sender.setText(message.getSender());

        RelativeLayout.LayoutParams params =
                (RelativeLayout.LayoutParams)messageContainer.getLayoutParams();
        if(message.getAlignLeft() == true) {
            params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, 1);
            params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 0);
        }else if(message.getAligRight() == true) {
            params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 1);
            params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, 0);
        }
        messageContainer.setLayoutParams(params);



    }
}
