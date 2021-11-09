package kr.co.prnd.slider.sample

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kr.co.prnd.slider.FlexibleStepRangeSlider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val slider1 = findViewById<FlexibleStepRangeSlider>(R.id.slider_1)
        val slider2 = findViewById<FlexibleStepRangeSlider>(R.id.slider_2)
        val textView1 = findViewById<TextView>(R.id.text_view_1)
        val textView2 = findViewById<TextView>(R.id.text_view_2)

        slider1.addOnValueChangeListener { from, to, state ->
            val text = "[${from.toInt()} ~ ${to.toInt()}]"
            textView1.text = text
        }

        slider2.addOnValueChangeListener { from, to, state ->
            fun setText(from: Float, to: Float) {
                val text = "[${from.toInt()} ~ ${to.toInt()}]"
                textView2.text = text
            }

            when (state) {
                FlexibleStepRangeSlider.ValueChangeState.Dragging -> setText(from, to)
                FlexibleStepRangeSlider.ValueChangeState.Idle -> Log.w(
                    MainActivity::class.java.simpleName,
                    "from: $from to: $to"
                )
            }

        }
    }
}
