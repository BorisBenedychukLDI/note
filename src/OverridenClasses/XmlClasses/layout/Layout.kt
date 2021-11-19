package OverridenClasses.XmlClasses.layout

import OverridenClasses.projectName
import java.io.File

fun createActivity () = File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\res\\layout\\activity_main_56huk.xml").apply {
    delete()
    writeText("""
    <?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity56huk">

        <androidx.fragment.app.FragmentContainerView
            android:id="@+id/nav_host_fragment_56huk"
            android:name="androidx.navigation.fragment.NavHostFragment"
            android:layout_width="0dp"
            android:layout_height="0dp"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintBottom_toBottomOf="parent"

            app:defaultNavHost="true"
            app:navGraph="@navigation/nav_56huk" />

    </androidx.constraintlayout.widget.ConstraintLayout>
""".trimIndent())
}
fun createFirstFr () = File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\res\\layout\\first_fr_56huk.xml").writeText("""
    <?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.motion.widget.MotionLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/theme_2_56huk"
        app:layoutDescription="@xml/first_fr_56huk_scene">

        <Button
            android:id="@+id/b_start_56huk"
            android:layout_width="157dp"
            android:layout_height="48dp"
            android:background="@drawable/custom_b_56huk"
            android:fontFamily="@font/fred_56huk"
            android:text="@string/start_56huk"
            android:textColor="@color/theme_3_56huk"
            android:textSize="20sp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.5"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="@+id/gl_1_56huk" />

        <TextView
            android:id="@+id/tv_56huk_logo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:fontFamily="@font/fred_56huk"
            android:text="@string/logo_56huk"
            android:textColor="@color/theme_3_56huk"
            android:textSize="60sp"
            app:layout_constraintBottom_toTopOf="@+id/gl_1_56huk"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.5"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <androidx.constraintlayout.widget.Guideline
            android:id="@+id/gl_1_56huk"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            app:layout_constraintGuide_percent="0.55540353" />

        <com.airbnb.lottie.LottieAnimationView
            android:id="@+id/l_loading_56huk"
            android:layout_width="150dp"
            android:layout_height="150dp"
            android:alpha="0"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.5"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:lottie_autoPlay="true"
            app:lottie_loop="true"
            app:lottie_rawRes="@raw/loading_56huk" />
    </androidx.constraintlayout.motion.widget.MotionLayout>
""".trimIndent())
fun createSecondFr () = File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\res\\layout\\second_fr_56huk.xml").writeText("""
    <?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.motion.widget.MotionLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/theme_1_56huk"
        app:layoutDescription="@xml/second_fr_56huk_scene">

        <TextView
            android:id="@+id/tv_56huk_connection"
            android:layout_width="300dp"
            android:layout_height="wrap_content"
            android:fontFamily="@font/fred_56huk"
            android:gravity="center"
            android:text="@string/connection_56huk"
            android:textColor="@color/theme_3_56huk"
            android:textSize="34sp"
            app:layout_constraintBottom_toTopOf="@+id/gl_2_56huk"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.5"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <androidx.constraintlayout.widget.Guideline
            android:id="@+id/gl_2_56huk"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            app:layout_constraintGuide_percent="0.5" />

        <com.airbnb.lottie.LottieAnimationView
            android:id="@+id/l_connection_56huk"
            android:layout_width="150dp"
            android:layout_height="150dp"
            app:layout_constraintBottom_toBottomOf="parent"

            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.5"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="@+id/gl_2_56huk"
            app:lottie_autoPlay="true"
            app:lottie_loop="true"
            app:lottie_rawRes="@raw/loading_56huk" />

        <androidx.swiperefreshlayout.widget.SwipeRefreshLayout
            android:id="@+id/srl_56huk"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.5"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent">

            <com.olo.nanie.pocasa.com.KoinPack56huk.WebView56huk
                android:id="@+id/wv_56huk"
                android:layout_width="match_parent"
                android:layout_height="match_parent" />
        </androidx.swiperefreshlayout.widget.SwipeRefreshLayout>

    </androidx.constraintlayout.motion.widget.MotionLayout>
""".trimIndent())