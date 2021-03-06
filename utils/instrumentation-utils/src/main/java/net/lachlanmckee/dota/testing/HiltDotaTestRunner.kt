package net.lachlanmckee.dota.testing

import android.app.Application
import android.content.Context
import dagger.hilt.android.testing.HiltTestApplication
import timber.log.Timber

class HiltDotaTestRunner : DotaTestRunner() {
  override fun newApplication(cl: ClassLoader?, name: String?, context: Context?): Application {
    Timber.plant(Timber.DebugTree())
    return super.newApplication(cl, HiltTestApplication::class.java.name, context)
  }
}
