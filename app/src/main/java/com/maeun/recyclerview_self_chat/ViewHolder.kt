package com.maeun.recyclerview_self_chat

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ViewHolder(itemView : View?) : RecyclerView.ViewHolder(itemView) {
    var chat : TextView = itemView!!.findViewById(R.id.chat) as TextView
}