package lat.pam.restoranpizza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TampilanKe2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan_ke2)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            val receiverData = intent.getStringExtra("data_key")
            val intent = Intent(this, TampilanKe3::class.java)
            intent.putExtra("data_key", receiverData)
            startActivity(intent)
        }

    }
}