package lat.pam.restoranpizza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TampilaKe4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampila_ke4)

        val button_order: Button = findViewById(R.id.button_order)

        button_order.setOnClickListener {
            val receivedData = intent.getStringExtra("data_key")
            val intent = Intent(this, TampilanKe5::class.java)
            intent.putExtra("data_key", receivedData)
            startActivity(intent)
        }

        val button_back: Button = findViewById(R.id.button_back)
        button_back.setOnClickListener {
            onBackPressed()
        }
    }
}