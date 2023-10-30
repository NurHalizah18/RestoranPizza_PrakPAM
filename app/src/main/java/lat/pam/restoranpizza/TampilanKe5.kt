package lat.pam.restoranpizza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class TampilanKe5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan_ke5)

        val popup = findViewById<LinearLayout>(R.id.popup)
        val button_akhir = findViewById<Button>(R.id.button_akhir)

        button_akhir.setOnClickListener {
            popup.visibility = View.VISIBLE
        }
    }
}