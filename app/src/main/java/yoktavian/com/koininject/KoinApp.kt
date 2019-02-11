package yoktavian.com.koininject

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import org.koin.android.ext.android.startKoin

@SuppressLint("Registered")
class KoinApp : Application() {

    var context: Context? = null

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(AppModule.getModule()))
        context = this
    }
}