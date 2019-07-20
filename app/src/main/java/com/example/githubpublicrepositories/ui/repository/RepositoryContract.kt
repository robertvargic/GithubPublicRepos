package com.example.githubpublicrepositories.ui.repository

import com.example.githubpublicrepositories.data.response.Contributor
import com.example.githubpublicrepositories.data.response.Repository
import com.robertvargic.githubusersearch.ui.base.BasePresenter
import com.robertvargic.githubusersearch.ui.base.BaseView

interface RepositoryContract {
    interface View : BaseView<Presenter> {
        fun initRepository(repository: Repository)
        fun initContributors(contributors: List<Contributor>)
    }

    interface Presenter : BasePresenter {
        fun getRepository(user: String, repo: String)
        fun getContributors(user: String, repo: String)
    }
}