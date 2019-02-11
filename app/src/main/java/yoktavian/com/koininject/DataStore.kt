package yoktavian.com.koininject

import android.content.Context
import android.widget.Toast

class DataStore constructor(val context: Context) {

    fun showToast() {
        Toast.makeText(context, "Injected broh", Toast.LENGTH_SHORT).show()
    }

}