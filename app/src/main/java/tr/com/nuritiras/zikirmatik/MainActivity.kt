package tr.com.nuritiras.zikirmatik

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var count = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    fun onClickReset(view: View) {
        count = 0
        val textViewSonuc = findViewById<TextView>(R.id.textViewSonuc)
        textViewSonuc.setText(count.toString())
    }
    fun onClickCount(view: View) {
        count++
        val textViewSonuc = findViewById<TextView>(R.id.textViewSonuc)
        textViewSonuc.setText(count.toString())
    }
}