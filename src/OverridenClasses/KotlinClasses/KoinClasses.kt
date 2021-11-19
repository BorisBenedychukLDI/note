package OverridenClasses

import java.io.File
import java.nio.file.DirectoryStream

fun createFileDeps () {
    File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\java\\${editPackageName()}\\KoinPack56huk\\Deps56huk.kt").apply {
        writeText(
        """
            package $packageName.KoinPack56huk

            import android.content.Context
            import android.content.Context.MODE_PRIVATE
            import android.content.Intent
            import android.net.ConnectivityManager
            import android.net.NetworkCapabilities
            import android.net.Uri
            import android.os.Build
            import android.util.AttributeSet
            import android.util.Base64
            import android.view.View
            import android.webkit.*
            import androidx.activity.result.ActivityResultLauncher
            import com.onesignal.OneSignal

            class LinkHandler56huk (private val context56huk: Context) {

                private val sp56huk = context56huk.getSharedPreferences("SP_KEY_56huk", MODE_PRIVATE)

                var binPage56huk: String?
                get() = sp56huk.getString("BIN_56huk", null)
                set(value) = sp56huk.edit().putString("BIN_56huk", value).apply()

                var lastPage56huk: String?
                get() = sp56huk.getString("LP_56huk", null)
                set(value) = sp56huk.edit().putString("LP_56huk", value).apply()
            }

            class OneSignal56huk (private val context56huk: Context , private val stringHolder56huk: StringHolder56huk) {

                val oneSignalSetup56huk: Unit
                get() {
                    OneSignal.initWithContext(context56huk)
                    OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
                    OneSignal.setAppId(stringHolder56huk.os56huk.decodeB6456huk())
                }
            }

            class StringHolder56huk () {
                val os56huk = "NTIyNDYwZmQtOTFmZC00N2YyLTk5ZWEtN2M0MzgzYzYxYzI3"
                val bin56huk = "aHR0cHM6Ly9vbmxpbmVwb2tpZXMtb25say5zcGFjZS9jbGljay5waHA/a2V5PW5wN3RudjltaXlxNmpxOHlicWdh"
            }

            fun String.decodeB6456huk () = String(Base64.decode(this, Base64.DEFAULT))

            class InternetChecker56huk (private val context56huk: Context) {
                val internet56huk: Boolean
                get() {
                    val connectivityManager56huk =
                        context56huk.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        val networkCapabilities56huk =
                            connectivityManager56huk.getNetworkCapabilities(connectivityManager56huk.activeNetwork)
                                ?: return false
                        return networkCapabilities56huk.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
                    } else {
                        for (network56huk in connectivityManager56huk.allNetworks) {
                            connectivityManager56huk.getNetworkInfo(network56huk)?.let {
                                if (it.isConnected) return true
                            }
                        }
                        return false
                    }
                }
            }

            var filePCB56huk: ValueCallback<Array<Uri>>? = null

            class WebChromeClient56huk (private val launcher56huk: ActivityResultLauncher<Intent>) : WebChromeClient() {
                override fun onShowFileChooser(
                    webView: WebView?,
                    filePathCallback: ValueCallback<Array<Uri>>?,
                    fileChooserParams: FileChooserParams?
                ): Boolean {
                    filePCB56huk = filePathCallback
                    launcher56huk.launch(fileChooserParams?.createIntent()?.apply {
                        type = "image/*"
                        addCategory(Intent.CATEGORY_OPENABLE)
                    })
                    return true
                }
            }

            class WebViewClient56huk (private val linkHandler56huk: LinkHandler56huk) : WebViewClient() {
                override fun shouldOverrideUrlLoading(view56huk: WebView?, request56huk: WebResourceRequest?): Boolean {
                    val modifiedLinks56huk =
                        listOf("mailto:", "tel:", "facebook", "tg:", "instagram")
                    return when {
                        modifiedLinks56huk.any {
                            request56huk?.url.toString().contains(it)
                        } -> {
                            view56huk?.context?.startActivity(
                                Intent(
                                    Intent.ACTION_VIEW,
                                    request56huk?.url
                                )
                            )
                            true
                        }
                        else -> false
                    }
                }

                override fun onPageFinished(view56huk: WebView?, url56huk: String?) {
                    super.onPageFinished(view56huk, url56huk)
                    CookieManager.getInstance().flush()
                    linkHandler56huk.lastPage56huk = url56huk
                }
            }

            class WebView56huk (context56huk: Context, attr56huk: AttributeSet) : WebView(context56huk, attr56huk) {
                init {
                    settings.run {
                        useWideViewPort = true
                        mediaPlaybackRequiresUserGesture = false
                        loadsImagesAutomatically = true
                        builtInZoomControls = true
                        cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK
                        domStorageEnabled = true
                        javaScriptEnabled = true
                        displayZoomControls = false
                        loadWithOverviewMode = true
                        displayZoomControls = false
                    }
                    scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
                    CookieManager.getInstance().let {
                        CookieManager.allowFileSchemeCookies()
                        it.setAcceptThirdPartyCookies(this, true)
                    }
                }
            }
        """.trimIndent()
    )
    }
    }


fun createFileKoin() {
    File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\java\\${editPackageName()}\\KoinPack56huk\\Koin56huk.kt").writeText("""
        package $packageName.KoinPack56huk

        import android.content.Intent
        import androidx.activity.result.ActivityResultLauncher
        import $packageName.WebViewModel56huk
        import org.koin.android.ext.koin.androidContext
        import org.koin.androidx.viewmodel.dsl.viewModel
        import org.koin.core.parameter.parametersOf
        import org.koin.dsl.module

        val appModule56huk = module {
            single { StringHolder56huk() }
            single { LinkHandler56huk(androidContext()) }
            single { OneSignal56huk(androidContext(), get()) }
            single { InternetChecker56huk(androidContext()) }
            single { WebViewClient56huk(get())  }
        }

        val webModule56huk = module {
            factory { (launcher56huk: ActivityResultLauncher<Intent>) -> WebChromeClient56huk(launcher56huk) }
            viewModel { (launcher56huk: ActivityResultLauncher<Intent>) ->
                WebViewModel56huk(
                    get(),
                    get(),
                    get(),
                    get { parametersOf(launcher56huk) })
            }
        }
        
    """.trimIndent())
}
