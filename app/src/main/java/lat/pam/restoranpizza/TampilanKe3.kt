package lat.pam.restoranpizza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TampilanKe3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan_ke3)

        val addButton = findViewById<FloatingActionButton>(R.id.fab)
        val extraName = intent.getStringExtra("EXTRA_NAME")
        val extraDistrict = intent.getStringExtra("EXRA_DISTRICT")
        addButton.setOnClickListener {
            Intent(this, TampilaKe4::class.java).also {
                it.putExtra("EXTRA_NAME", extraName)
                it.putExtra("EXTRA_DISTRICT", extraDistrict)
                startActivity(it)
            }
        }
    }
}