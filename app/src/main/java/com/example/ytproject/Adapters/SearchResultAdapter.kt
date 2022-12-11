package com.example.ytproject.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.ytproject.Model.SearchModel.Content
import com.example.ytproject.R

class SearchResultAdapter(data: List<Content>?) :
    RecyclerView.Adapter<SearchResultAdapter.SearchResultHolder>() {

    var data = data
    lateinit var context: Context
    var oldpos = 0

    class SearchResultHolder(itemView: View) : ViewHolder(itemView) {
        var imgThumbnail = itemView.findViewById<ImageView>(R.id.imgThumbnail)
        var txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchResultHolder {
        context = parent.context
        return SearchResultHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.search_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SearchResultHolder, position: Int) {

        var video = data?.get(position)?.video

        Glide.with(context).load(video?.thumbnails?.get(video.thumbnails!!.size - 1)?.url)
            .into(holder.imgThumbnail)
        holder.txtTitle.text = video?.title
        holder.imgThumbnail.setOnTouchListener(object : OnTouchListener {
            override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
                Glide.with(context)
                    .load(video?.movingThumbnails?.get(video.movingThumbnails!!.size - 1)?.url)
                    .into(holder.imgThumbnail)
                return false
            }

        })
    }

    override fun getItemCount(): Int {
        return data?.size!!
    }

}