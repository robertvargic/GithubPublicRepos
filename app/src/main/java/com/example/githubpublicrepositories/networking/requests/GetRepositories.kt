package com.example.githubpublicrepositories.networking.requests

import com.example.githubpublicrepositories.data.response.Repository
import com.robertvargic.cryptochecker.networking.base.BaseTask
import com.robertvargic.cryptochecker.networking.base.ServerTask
import com.robertvargic.cryptochecker.networking.base.TaskListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class GetRepositories(retrofit: Retrofit, val page: Int, val perPage: Int) : BaseTask(retrofit),
    ServerTask<MutableList<Repository>> {
    override fun execute(listener: TaskListener<MutableList<Repository>>) {
        listener.onPreExecute()
        val call = mService.getRepositories(page, perPage)

        call.enqueue(object : Callback<MutableList<Repository>> {
            override fun onFailure(call: Call<MutableList<Repository>>, t: Throwable) {

            }

            override fun onResponse(call: Call<MutableList<Repository>>, response: Response<MutableList<Repository>>) {

            }

        })
    }
}