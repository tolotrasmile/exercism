package services.businessdelegate.user

import data.UserDto
import retrofit2.Callback
import services.businessdelegate.AbstractCommonBDL

class UserBDL : AbstractCommonBDL<IUserBDL>() {

    fun getUsers(callback: Callback<List<UserDto>>) {
        getHttpFactory<IUserBDL>().getUsers().enqueue(callback)
    }

    fun getUserByName(username: String, callback: Callback<UserDto>) {
        getHttpFactory<IUserBDL>().getUserByName(username).enqueue(callback)
    }
}