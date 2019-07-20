package com.example.githubpublicrepositories.networking.requests

import com.example.githubpublicrepositories.data.response.Repository
import com.robertvargic.cryptochecker.networking.base.BaseTask
import com.robertvargic.cryptochecker.networking.base.ServerTask
import com.robertvargic.cryptochecker.networking.base.TaskListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class GetRepository(retrofit: Retrofit, val owner: String, val repo: String) : BaseTask(retrofit),
    ServerTask<Repository> {
    override fun execute(listener: TaskListener<Repository>) {
        listener.onPreExecute()
        val call = mService.getRepository(owner, repo)

        call.enqueue(object : Callback<Repository> {
            override fun onFailure(call: Call<Repository>, t: Throwable) {
            }

            override fun onResponse(call: Call<Repository>, response: Response<Repository>) {
            }
        })
    }
}