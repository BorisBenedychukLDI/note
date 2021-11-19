package OverridenClasses.XmlClasses.xml

import OverridenClasses.projectName
import java.io.File

fun createXmlScene1 () = File ("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\res\\xml\\first_fr_56huk_scene.xml").writeText("""
    <?xml version="1.0" encoding="utf-8"?>
    <MotionScene 
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:motion="http://schemas.android.com/apk/res-auto">

        <Transition
            motion:constraintSetEnd="@+id/end"
            motion:constraintSetStart="@id/start"
            motion:duration="1000">
           <KeyFrameSet>
               <KeyAttribute
                   motion:motionTarget="@+id/tv_56huk_logo"
                   motion:framePosition="100"
                   android:alpha="0" />
               <KeyAttribute
                   motion:motionTarget="@+id/b_start_56huk"
                   motion:framePosition="100"
                   android:alpha="0" />
               <KeyAttribute
                   motion:motionTarget="@+id/b_start_56huk"
                   motion:framePosition="50"
                   android:alpha="0" />
               <KeyAttribute
                   motion:motionTarget="@+id/tv_56huk_logo"
                   motion:framePosition="50"
                   android:alpha="0" />
               <KeyAttribute
                   motion:motionTarget="@+id/l_loading_56huk"
                   motion:framePosition="50"
                   android:alpha="0" />
               <KeyAttribute
                   motion:motionTarget="@+id/l_loading_56huk"
                   motion:framePosition="100"
                   android:alpha="1" />
           </KeyFrameSet>
        </Transition>

        <ConstraintSet android:id="@+id/start">
        </ConstraintSet>

        <ConstraintSet android:id="@+id/end">
        </ConstraintSet>
    </MotionScene>
""".trimIndent())


fun createXmlScene2 () = File("C:\\Users\\User\\AndroidStudioProjects\\$projectName\\app\\src\\main\\res\\xml\\second_fr_56huk_scene.xml").writeText("""
    <?xml version="1.0" encoding="utf-8"?>
    <MotionScene 
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:motion="http://schemas.android.com/apk/res-auto">

        <Transition
            motion:constraintSetEnd="@+id/end"
            motion:constraintSetStart="@id/start"
            motion:duration="500">
           <KeyFrameSet>
               <KeyAttribute
                   motion:motionTarget="@+id/srl_56huk"
                   motion:framePosition="100"
                   android:alpha="0" />
           </KeyFrameSet>
        </Transition>

        <ConstraintSet android:id="@+id/start">
        </ConstraintSet>

        <ConstraintSet android:id="@+id/end">
        </ConstraintSet>
    </MotionScene>
""".trimIndent())
