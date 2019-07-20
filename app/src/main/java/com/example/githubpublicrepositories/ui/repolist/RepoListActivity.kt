package com.example.githubpublicrepositories.ui.repolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.githubpublicrepositories.R
import com.example.githubpublicrepositories.data.response.Repository
import com.robertvargic.githubusersearch.ui.base.BaseActivity

class RepoListActivity : BaseActivity(), RepoListContract.View {

    private lateinit var repoListPresenter: RepoListContract.Presenter

    override fun initRepoList(repoList: MutableList<Repository>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setPresenter(presenter: RepoListContract.Presenter) {
        repoListPresenter = presenter
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repolist)
        setPresenter(RepoListPresenter(this))
    }
}
