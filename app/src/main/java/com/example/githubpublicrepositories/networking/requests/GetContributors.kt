package com.example.githubpublicrepositories.networking.requests

import com.example.githubpublicrepositories.data.response.Contributor
import com.example.githubpublicrepositories.data.response.Repository
import com.robertvargic.cryptochecker.networking.base.BaseTask
import com.robertvargic.cryptochecker.networking.base.ServerTask
import com.robertvargic.cryptochecker.networking.base.TaskListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class GetContributors(retrofit: Retrofit, val owner: String, val repo: String) : BaseTask(retrofit),
    ServerTask<MutableList<Contributor>> {
    override fun execute(listener: TaskListener<MutableList<Contributor>>) {
        listener.onPreExecute()
        val call = mService.getRepositoryContributors(owner, repo)

        call.enqueue(object : Callback<MutableList<Contributor>> {
            override fun onFailure(call: Call<MutableList<Contributor>>, t: Throwable) {
            }

            override fun onResponse(
                call: Call<MutableList<Contributor>>,
                response: Response<MutableList<Contributor>>
            ) {
            }

        })
    }
}