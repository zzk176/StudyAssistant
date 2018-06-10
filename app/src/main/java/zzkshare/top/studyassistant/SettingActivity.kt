package zzkshare.top.studyassistant

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_setting.*

class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        button2.setOnClickListener{
            startActivity(Intent(this, ClockSetting::class.java))
        }
        button3.setOnClickListener{
            startActivity(Intent(this, learning_record::class.java))
        }
    }
}
