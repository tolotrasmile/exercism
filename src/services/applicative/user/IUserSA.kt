package services.applicative.user

import data.UserDto

interface IUserSA {
    fun getUsers(before: (() -> Unit)?, success: (List<UserDto>) -> Unit, failure: () -> Unit, done: (() -> Unit)?)
}