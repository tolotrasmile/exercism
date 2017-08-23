package services

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitBuilderFactory private constructor() {

    fun getRetrofit(): Retrofit.Builder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))

    companion object {
        val instance: RetrofitBuilderFactory by lazy { Holder.INSTANCE }
    }

    private object Holder {
        val INSTANCE = RetrofitBuilderFactory()
    }

}