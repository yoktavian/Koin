package yoktavian.com.koininject

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import org.koin.android.ext.android.inject

open class BaseActivity : AppCompatActivity() {

//    val dataStore: DataStore by inject()
    val dataStore: DataStore by lazy { DataStore(getApp) }

    override fun onCreate(savedInstanceState: Bundle?,
                          persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }
}