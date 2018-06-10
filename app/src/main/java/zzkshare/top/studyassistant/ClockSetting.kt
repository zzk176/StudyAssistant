package zzkshare.top.studyassistant

import android.app.Dialog
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.Menu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_clock_setting.*

class ClockSetting : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clock_setting)

        hard.setOnClickListener{
            val alertBuilder = AlertDialog.Builder(this)
            val item = arrayOf("非常简单(1+1)","简单","中等","提神醒脑")
            alertBuilder.setTitle("当前难度")
            alertBuilder.setItems(item, DialogInterface.OnClickListener{
                arg0, index->
                hard.text = item[index]
//                Toast.makeText(this, item[index],Toast.LENGTH_SHORT).show()
            })
            alertBuilder.create().show()
        }
        number.setOnClickListener{
            val alertBuilder = AlertDialog.Builder(this)
            val item = arrayOf("学渣(3道题)","学霸(5道题)","学神(10道题)","提神醒脑")
            alertBuilder.setTitle("当前难度")
            alertBuilder.setItems(item, DialogInterface.OnClickListener{
                arg0, index->
                number.text = item[index]
//                Toast.makeText(this, item[index],Toast.LENGTH_SHORT).show()
            })
            alertBuilder.create().show()
        }
        jingdu.setOnClickListener{
            val alertBuilder = AlertDialog.Builder(this)
            val item = arrayOf("低","中","高","提神醒脑")
            alertBuilder.setTitle("当前难度")
            alertBuilder.setItems(item, DialogInterface.OnClickListener{
                arg0, index->
                jingdu.text = item[index]
//                Toast.makeText(this, item[index],Toast.LENGTH_SHORT).show()
            })
            alertBuilder.create().show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

}
