package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myapplication.R
import com.example.myapplication.model.Response

class CustomAdapter(private val context: Context, private val it: List<Response>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
return it.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewHolder: MyViewHolder = holder as MyViewHolder
        viewHolder.tvValue?.text = it[position].name

        viewHolder.image?.let { it1 ->
            Glide.with(context).load(it[position].links?.patch?.small).apply(
                RequestOptions().placeholder(R.drawable.anim_progress).error(R.mipmap.ic_launcher).centerCrop().fitCenter()
            ).into(it1)
        }

        val sdf = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm")
        val date = java.util.Date((it[position].date_unix) * 1000)
        val sd:String = sdf.format(date)
        viewHolder.tvDate?.text = sd

    }

    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        var tvValue: TextView? = null
        var image: ImageView? = null
        var tvDate: TextView? = null

        init {
            tvValue = itemView!!.findViewById(R.id.tv_name)
            tvDate = itemView!!.findViewById(R.id.tv_date)
            image = itemView.findViewById(R.id.image)
        }
    }

}