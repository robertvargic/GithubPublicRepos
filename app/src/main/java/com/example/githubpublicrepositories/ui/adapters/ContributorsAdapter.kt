package com.example.githubpublicrepositories.ui.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.githubpublicrepositories.data.response.Contributor
import com.example.githubpublicrepositories.data.response.Repository

class ContributorsAdapter(private val contributors: List<Contributor>, private val context: Context?) :
    RecyclerView.Adapter<ContributorsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindData(contributor: Contributor) {
//            itemView.repositoryName.text = repository.name
        }
    }
}