package zzkshare.top.studyassistant

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_wake_alarm.*
import kotlinx.android.synthetic.main.content_main.*
import java.util.*

class WakeAlarm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wake_alarm)

        setupWakeStyle()
        alarm_btn_done.setOnClickListener{
            val rIntent = Intent()
            rIntent.putExtra("time", select_time_btn.text)
            setResult(1, rIntent)
            finish()
        }
        setupTimeBtn()
    }

    fun setupTimeBtn(){
        select_time_btn.setOnClickListener{
            val c = Calendar.getInstance();

            val sel = TimePickerDialog(this,
                    TimePickerDialog.OnTimeSetListener{view, hour, min ->
                        select_time_btn.text = hour.toString()+":"+min.toString()
                    }, c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE),true).show()
        }
    }

    fun setupWakeStyle(){
        wake_style_select.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
             }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                val styles = resources.getStringArray(R.array.wake_styles)
            }
        }

    }
}
