package com.example.githubpublicrepositories.ui.repository

import android.os.Bundle
import com.example.githubpublicrepositories.R
import com.example.githubpublicrepositories.data.response.Contributor
import com.example.githubpublicrepositories.data.response.Repository
import com.example.githubpublicrepositories.ui.repolist.RepoListContract
import com.robertvargic.githubusersearch.ui.base.BaseActivity

class RepositoryActivity : BaseActivity(), RepositoryContract.View {
    private lateinit var repositoryPresenter: RepositoryContract.Presenter

    override fun initRepository(repository: Repository) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initContributors(contributors: List<Contributor>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun setPresenter(presenter: RepositoryContract.Presenter) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repository)
        setPresenter(RepositoryPresenter(this))
    }
}