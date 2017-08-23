package services.businessdelegate.user

import data.UserDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface IUserBDL {

    @GET("users")
    fun getUsers(): Call<List<UserDto>>

    @GET("users/{username}")
    fun getUserByName(@Query("username") username: String): Call<UserDto>

}