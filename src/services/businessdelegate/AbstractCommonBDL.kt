package services.businessdelegate

import services.RetrofitBuilderFactory

abstract class AbstractCommonBDL<T> {

    protected val BASE_URL = "https://api.github.com/"

    protected var service: T? = null

    protected inline fun <reified R : T> getHttpFactory(): T {

        if (service == null) {

            service = RetrofitBuilderFactory.instance.getRetrofit()
                    .baseUrl(BASE_URL)
                    .build()
                    .create(R::class.java)
        }

        return service!!
    }
}