package com.example.githubpublicrepositories.ui.repolist

import com.example.githubpublicrepositories.data.response.Repository
import com.robertvargic.githubusersearch.ui.base.BasePresenter
import com.robertvargic.githubusersearch.ui.base.BaseView

interface RepoListContract {
    interface View : BaseView<Presenter> {
        fun initRepoList(repoList: MutableList<Repository>)
    }

    interface Presenter : BasePresenter {
        fun getRepoList(page: Int, perPage: Int)
    }
}