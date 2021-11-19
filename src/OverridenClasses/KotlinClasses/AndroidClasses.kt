package OverridenClasses

import java.io.File

fun createApplication () {
    File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\java\\${editPackageName()}\\Application56huk.kt").writeText("""
        package $packageName

        import android.app.Application
        import $packageName.KoinPack56huk.OneSignal
        import $packageName.KoinPack.appModule
        import $packageName.KoinPack.webModule
        import org.koin.android.ext.android.get
        import org.koin.android.ext.koin.androidContext
        import org.koin.core.context.startKoin

        class Application56huk :  Application() {
            override fun onCreate() {
                super.onCreate()
                startKoin {
                    modules(appModule56huk, webModule56huk)
                    androidContext(this@Application56huk)
                }
                get<OneSignal56huk>().oneSignalSetup56huk
            }
        }
      
    """.trimIndent())
}


fun createFirstFragmentClass () = File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\java\\${editPackageName()}\\FirstFragment56huk.kt").writeText("""
    package $packageName

    import android.os.Bundle
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import androidx.fragment.app.Fragment
    import androidx.lifecycle.lifecycleScope
    import androidx.navigation.fragment.findNavController
    import $packageName.KoinPack56huk.LinkHandler56huk
    import $packageName.KoinPack56huk.StringHolder56huk
    import $packageName.KoinPack56huk.decodeB6456huk
    import $packageName.databinding.FirstFr56hukBinding
    import kotlinx.coroutines.delay
    import kotlinx.coroutines.launch
    import org.koin.android.ext.android.get

    class FirstFragment56huk : Fragment() {
        override fun onCreateView(
            inflater56huk: LayoutInflater,
            container56huk: ViewGroup?,
            savedInstanceState56huk: Bundle?
        ): View? {
            FirstFr56hukBinding.inflate(inflater56huk, container56huk, false).run {
                get<LinkHandler56huk>().lastPage56huk?.let {
                    findNavController().navigate(R.id.action_firstFragment56huk_to_secondFragment56huk)
                }
                bStart56huk.setOnClickListener {
                    bStart56huk.isClickable = false
                    root.transitionToEnd()
                    lifecycleScope.launch {
                        delay(5000)
                        get<LinkHandler56huk>().binPage56huk = get<StringHolder56huk>().bin56huk.decodeB6456huk()
                        findNavController().navigate(R.id.action_firstFragment56huk_to_secondFragment56huk)
                    }

                }


                return root
            }
        }
    }
""".trimIndent())


fun createMainActivityClass () {

    File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\java\\${editPackageName()}\\MainActivity56huk.kt").delete()
    File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\java\\${editPackageName()}\\MainActivity56huk.kt").writeText(
        """
    
   package $packageName

   import androidx.appcompat.app.AppCompatActivity
   import android.os.Bundle

   class MainActivity56huk : AppCompatActivity() {
       override fun onCreate(savedInstanceState: Bundle?) {
           super.onCreate(savedInstanceState)
           setContentView(R.layout.activity_main_56huk)
       }
   }
""".trimIndent()
    )
}

fun createSecondFragment () = File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\java\\${editPackageName()}\\SecondFragment56huk.kt").writeText("""
    package $packageName

    import android.os.Bundle
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import androidx.activity.OnBackPressedCallback
    import androidx.fragment.app.Fragment
    import $packageName.databinding.SecondFr56hukBinding
    import org.koin.android.ext.android.get
    import org.koin.core.parameter.parametersOf

    class SecondFragment56huk : Fragment() {

        private lateinit var binding56huk: SecondFr56hukBinding
        private lateinit var viewModel56huk: WebViewModel56huk

        override fun onCreateView(
            inflater56huk: LayoutInflater,
            container56huk: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding56huk = SecondFr56hukBinding.inflate(inflater56huk, container56huk, false).apply {
                viewModel56huk = get { parametersOf(
                    )}
                wv56huk.run {
                    srl56huk.run {
                        setOnRefreshListener {
                            loadUrl( url ?: return@setOnRefreshListener)
                            isRefreshing = false
                        }
                        object : OnBackPressedCallback (true) {
                            override fun handleOnBackPressed() = if (canGoBack()) goBack() else requireActivity().finish()
                        }.let { requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, it) }
                        viewModel56huk.wvcLD56huk.observe(viewLifecycleOwner) {
                            webViewClient = it
                        }
                        viewModel56huk.wccLD56huk.observe(viewLifecycleOwner) {
                            webChromeClient = it
                        }
                        viewModel56huk.urlLD56huk.observe(viewLifecycleOwner) {
                            loadUrl(it)
                        }
                    }
                }
            }
            return binding56huk.root
        }

        override fun onResume() {
            super.onResume()
            viewModel56huk.internetLD56huk.observe(viewLifecycleOwner) {
                if (!it) {
                    binding56huk.root.transitionToEnd()
                } else {
                    binding56huk.root.transitionToStart()
                }
            }
        }
    }
""".trimIndent())


fun createViewModelClass () = File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\java\\${editPackageName()}\\WebViewModel56huk.kt").writeText(
    """
        package $packageName

        import androidx.lifecycle.LiveData
        import androidx.lifecycle.MutableLiveData
        import androidx.lifecycle.ViewModel
        import androidx.lifecycle.viewModelScope
        import $packageName.KoinPack56huk.InternetChecker56huk
        import $packageName.KoinPack56huk.LinkHandler56huk
        import $packageName.KoinPack56huk.WebChromeClient56huk
        import $packageName.KoinPack56huk.WebViewClient56huk
        import kotlinx.coroutines.delay
        import kotlinx.coroutines.isActive
        import kotlinx.coroutines.launch

        class WebViewModel56huk(
            private val linkHandler56huk: LinkHandler56huk,
            private val internetChecker56huk: InternetChecker56huk,
            private val webViewClient56huk: WebViewClient56huk,
            private val webChromeClient56huk: WebChromeClient56huk,
        ) : ViewModel() {

            private var url56huk = MutableLiveData<String> ()
            private var internet56huk = MutableLiveData<Boolean>()
            private var webViewClient56hukMLD = MutableLiveData<WebViewClient56huk>()
            private var webChromeClient56hukMLD = MutableLiveData<WebChromeClient56huk>()

            val urlLD56huk: LiveData<String> = url56huk
            val internetLD56huk: LiveData<Boolean> = internet56huk
            val wvcLD56huk: LiveData<WebViewClient56huk> = webViewClient56hukMLD
            val wccLD56huk: LiveData<WebChromeClient56huk> = webChromeClient56hukMLD

            private var isShown56huk = false

            init {
                url56huk.value = linkHandler56huk.run { lastPage56huk ?:  binPage56huk }
                webViewClient56hukMLD.value = webViewClient56huk
                webChromeClient56hukMLD.value = webChromeClient56huk
                viewModelScope.launch {
                    while (isActive) {
                        if (!isShown56huk && !internetChecker56huk.internet56huk) {
                            internet56huk.value = internetChecker56huk.internet56huk
                            isShown56huk = true
                        } else if (isShown56huk && internetChecker56huk.internet56huk) {
                            internet56huk.value = internetChecker56huk.internet56huk
                            isShown56huk = false
                        }
                        delay(500)
                    }
                }
            }
        }
    """.trimIndent()
)