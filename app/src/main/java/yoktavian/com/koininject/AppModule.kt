package yoktavian.com.koininject

import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext
import org.koin.dsl.module.module

object AppModule {

    fun getModule() : Module = module {
        single { DataStore(get()) }
    }

}