package yoktavian.com.koininject

import android.content.Context

val Context.getApp: KoinApp get() = applicationContext as KoinApp