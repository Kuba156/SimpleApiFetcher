package com.example.simpleapifetcher.presentation.rv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.simpleapifetcher.R
import com.example.simpleapifetcher.domain.models.UserRepository

class RepoListAdapter(private val listOfData: Array<UserRepository>) : RecyclerView.Adapter<RepoListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tv_repoName: TextView = view.findViewById(R.id.tv_repoName)
        val tv_userName: TextView = view.findViewById(R.id.tv_repoName)
        val iv_avatar: ImageView = view.findViewById(R.id.iv_avatar)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_element, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tv_repoName.text = listOfData[position].repositoryName
        holder.tv_userName.text = listOfData[position].repositoryName
        // todo: img
    }

    override fun getItemCount(): Int = listOfData.count()
}