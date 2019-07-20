package com.example.githubpublicrepositories.ui.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.githubpublicrepositories.data.response.Repository

class RepoListAdapter(private val contributors: List<Repository>, private val context: Context?) :
    RecyclerView.Adapter<RepoListAdapter.ViewHolder>() {

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
        fun bindData(repository: Repository) {
//            itemView.repositoryName.text = repository.name
        }
    }
}