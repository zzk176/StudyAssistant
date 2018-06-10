package zzkshare.top.studyassistant

import android.app.DatePickerDialog
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.DatePicker
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*
import java.awt.font.TextAttribute

import java.lang.reflect.Array
import java.util.Calendar

class Main2Activity : AppCompatActivity() {

    val myDataList = ArrayList<String>()
    var textCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        add_btn.setOnClickListener{
            setTime()
        }
    }

    fun setTime(){
//        <TextView
//        android:id="@+id/textView"
//        android:layout_width="match_parent"
//        android:layout_height="match_parent"
//        android:padding="12dp"
//        android:text="10:00 ------- 12:00"
//        android:textAlignment="center"
//        android:textColor="@color/colorWhite"
//        android:background="@drawable/plan_btn"
//        android:textSize="29dp"/>

        val tv = TextView(this)
        val text = (6+3*textCount).toString() + ":00" + "-------" + (9+3*textCount).toString() + ":00"
        tv.setText(text)
        tv.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        val lp = LinearLayout.LayoutParams(tv.layoutParams)
        lp.setMargins(12,24,24,12)
        tv.layoutParams = lp
        tv.setPadding(12,12,12,12)
        tv.gravity = Gravity.CENTER
        tv.setTextColor(resources.getColor(R.color.colorWhite, theme))
        tv.setBackgroundResource(R.drawable.plan_btn)

        tv.textSize = 29.0f
        time_text.addView(tv)
        if (textCount++ >= 4){
            add_btn.visibility = View.INVISIBLE
        }
    }
}
