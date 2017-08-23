package services.applicative.user

import data.UserDto
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import services.businessdelegate.user.UserBDL
import javax.inject.Singleton

@Singleton
class UserSA : IUserSA {

    constructor() {
        print("Construct")
    }

    override fun getUsers(before: (() -> Unit)?, success: (List<UserDto>) -> Unit, failure: () -> Unit, done: (() -> Unit)?) {

        before?.let { before() }

        val service = UserBDL()

        service.getUsers(object : Callback<List<UserDto>> {

            override fun onResponse(call: Call<List<UserDto>>?, response: Response<List<UserDto>>?) {

                if (response?.body() != null) {
                    val users = response.body() as List<UserDto>
                    success(users)
                } else {
                    failure()
                }

                done?.let { done() }
            }

            override fun onFailure(call: Call<List<UserDto>>?, t: Throwable?) {
                failure()
                done?.let { done() }
            }
        })
    }
}