import data.UserDto
import services.applicative.user.UserSA

fun main(args: Array<String>) {
    //val items = arrayListOf(1, 2, 3, 4, 5, 6, 7)
    //println(items.map { x -> x * 2 })

    val service = UserSA()
    service.getUsers(
        before = {
            run {
                println("BEFORE...")
            }
        },
        success = { list: List<UserDto> ->
            run {
                println(list)
            }
        },
        failure = {
            println("FAILURE")
        },
        done = {
            run {
                println("DONE")
            }
        }
    )

}