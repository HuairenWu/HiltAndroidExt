package com.github.huairenwu.di

import android.accounts.AccountManager
import android.app.ActivityManager
import android.app.AlarmManager
import android.app.AppOpsManager
import android.app.DownloadManager
import android.app.KeyguardManager
import android.app.NotificationManager
import android.app.SearchManager
import android.app.UiModeManager
import android.app.WallpaperManager
import android.app.admin.DevicePolicyManager
import android.app.job.JobScheduler
import android.app.usage.NetworkStatsManager
import android.app.usage.UsageStatsManager
import android.appwidget.AppWidgetManager
import android.bluetooth.BluetoothManager
import android.content.ClipboardManager
import android.content.Context
import android.content.RestrictionsManager
import android.content.pm.LauncherApps
import android.hardware.ConsumerIrManager
import android.hardware.SensorManager
import android.hardware.camera2.CameraManager
import android.hardware.display.DisplayManager
import android.hardware.input.InputManager
import android.hardware.usb.UsbManager
import android.location.LocationManager
import android.media.AudioManager
import android.media.MediaRouter
import android.media.projection.MediaProjectionManager
import android.media.session.MediaSessionManager
import android.media.tv.TvInputManager
import android.net.ConnectivityManager
import android.net.nsd.NsdManager
import android.net.wifi.WifiManager
import android.net.wifi.p2p.WifiP2pManager
import android.nfc.NfcManager
import android.os.BatteryManager
import android.os.Build
import android.os.DropBoxManager
import android.os.PowerManager
import android.os.UserManager
import android.os.Vibrator
import android.os.storage.StorageManager
import android.print.PrintManager
import android.telecom.TelecomManager
import android.telephony.SubscriptionManager
import android.telephony.TelephonyManager
import android.view.WindowManager
import android.view.accessibility.AccessibilityManager
import android.view.accessibility.CaptioningManager
import android.view.inputmethod.InputMethodManager
import android.view.textservice.TextServicesManager
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object SystemServiceModule {
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideContext(@ApplicationContext context: Context) = context

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideAccessibilityManager(context: Context) = ContextCompat.getSystemService(context, AccessibilityManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideAccountManager(context: Context) = ContextCompat.getSystemService(context, AccountManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideActivityManager(context: Context) = ContextCompat.getSystemService(context, ActivityManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideAlarmManager(context: Context) = ContextCompat.getSystemService(context, AlarmManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideAudioManager(context: Context) = ContextCompat.getSystemService(context, AudioManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideClipboardManager(context: Context) = ContextCompat.getSystemService(context, ClipboardManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideConnectivityManager(context: Context) = ContextCompat.getSystemService(context, ConnectivityManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideDevicePolicyManager(context: Context) = ContextCompat.getSystemService(context, DevicePolicyManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideDownloadManager(context: Context) = ContextCompat.getSystemService(context, DownloadManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideDropBoxManager(context: Context) = ContextCompat.getSystemService(context, DropBoxManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideInputMethodManager(context: Context) = ContextCompat.getSystemService(context, InputMethodManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideKeyguardManager(context: Context) = ContextCompat.getSystemService(context, KeyguardManager::class.java) ?: throw NullPointerException()

//    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
//    @Provides
//    fun provideLayoutInflater(context: Context) = ContextCompat.getSystemService(context, LayoutInflater::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideLocationManager(context: Context) = ContextCompat.getSystemService(context, LocationManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideNfcManager(context: Context) = ContextCompat.getSystemService(context, NfcManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideNotificationManager(context: Context) = ContextCompat.getSystemService(context, NotificationManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun providePowerManager(context: Context) = ContextCompat.getSystemService(context, PowerManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideSearchManager(context: Context) = ContextCompat.getSystemService(context, SearchManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideSensorManager(context: Context) = ContextCompat.getSystemService(context, SensorManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideStorageManager(context: Context) = ContextCompat.getSystemService(context, StorageManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideTelephonyManager(context: Context) = ContextCompat.getSystemService(context, TelephonyManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideTextServicesManager(context: Context) = ContextCompat.getSystemService(context, TextServicesManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideUiModeManager(context: Context) = ContextCompat.getSystemService(context, UiModeManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideUsbManager(context: Context) = ContextCompat.getSystemService(context, UsbManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideVibrator(context: Context) = ContextCompat.getSystemService(context, Vibrator::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideWallpaperManager(context: Context) = ContextCompat.getSystemService(context, WallpaperManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideWifiP2pManager(context: Context) = ContextCompat.getSystemService(context, WifiP2pManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideWifiManager(context: Context) = ContextCompat.getSystemService(context, WifiManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideWindowManager(context: Context) = ContextCompat.getSystemService(context, WindowManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideInputManager(context: Context) = ContextCompat.getSystemService(context, InputManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideMediaRouter(context: Context) = ContextCompat.getSystemService(context, MediaRouter::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideNsdManager(context: Context) = ContextCompat.getSystemService(context, NsdManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Provides
    fun provideDisplayManager(context: Context) = ContextCompat.getSystemService(context, DisplayManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Provides
    fun provideUserManager(context: Context) = ContextCompat.getSystemService(context, UserManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Provides
    fun provideBluetoothManager(context: Context) = ContextCompat.getSystemService(context, BluetoothManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    @Provides
    fun provideAppOpsManager(context: Context) = ContextCompat.getSystemService(context, AppOpsManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    @Provides
    fun provideCaptioningManager(context: Context) = ContextCompat.getSystemService(context, CaptioningManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    @Provides
    fun provideConsumerIrManager(context: Context) = ContextCompat.getSystemService(context, ConsumerIrManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    @Provides
    fun providePrintManager(context: Context) = ContextCompat.getSystemService(context, PrintManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideAppWidgetManager(context: Context) = ContextCompat.getSystemService(context, AppWidgetManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @Provides
    fun provideBatteryManager(context: Context) = ContextCompat.getSystemService(context, BatteryManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @Provides
    fun provideCameraManager(context: Context) = ContextCompat.getSystemService(context, CameraManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @Provides
    fun provideJobScheduler(context: Context) = ContextCompat.getSystemService(context, JobScheduler::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @Provides
    fun provideLauncherApps(context: Context) = ContextCompat.getSystemService(context, LauncherApps::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @Provides
    fun provideMediaProjectionManager(context: Context) = ContextCompat.getSystemService(context, MediaProjectionManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @Provides
    fun provideMediaSessionManager(context: Context) = ContextCompat.getSystemService(context, MediaSessionManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @Provides
    fun provideRestrictionsManager(context: Context) = ContextCompat.getSystemService(context, RestrictionsManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @Provides
    fun provideTelecomManager(context: Context) = ContextCompat.getSystemService(context, TelecomManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @Provides
    fun provideTvInputManager(context: Context) = ContextCompat.getSystemService(context, TvInputManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @Provides
    fun provideUsageStatsManager(context: Context) = ContextCompat.getSystemService(context, UsageStatsManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP_MR1)
    @Provides
    fun provideSubscriptionManager(context: Context): SubscriptionManager = ContextCompat.getSystemService(context, SubscriptionManager::class.java) ?: throw NullPointerException()

    @RequiresApi(Build.VERSION_CODES.M)
    @Provides
    fun provideNetworkStatsManager(context: Context): NetworkStatsManager = ContextCompat.getSystemService(context, NetworkStatsManager::class.java) ?: throw NullPointerException()
}
