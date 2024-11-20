package dev.tomco.a25a_10357_l02_03

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.annotation.IntegerRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {

    val SCORE_DEFAULT: Int = 10
    
    private lateinit var main_IMG_flag: AppCompatImageView
    
    private lateinit var main_LBL_countryName: MaterialTextView
    
    private lateinit var main_BTN_yes: MaterialButton
    
    private lateinit var main_BTN_no: MaterialButton
    
    private lateinit var main_LBL_score: MaterialTextView
    
    private lateinit var main_IMG_hearts: Array<AppCompatImageView>
    
    private var score: Int = 0
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViews()
        initViews()
    }

    private fun findViews() {
        main_IMG_flag = findViewById(R.id.main_IMG_flag)
        main_LBL_countryName = findViewById(R.id.main_LBL_countryName)
        main_BTN_yes = findViewById(R.id.main_BTN_yes)
        main_BTN_no = findViewById(R.id.main_BTN_no)
        main_LBL_score = findViewById(R.id.main_LBL_score)
        main_IMG_hearts = arrayOf(
            findViewById(R.id.main_IMG_heart1),
            findViewById(R.id.main_IMG_heart2),
            findViewById(R.id.main_IMG_heart3)
        )
    }

    private fun initViews() {
        refreshUI()
        main_BTN_yes.setOnClickListener { view:View -> increaseScore() }
        main_BTN_no.setOnClickListener { view: View -> decreaseScore() }
    }

    private fun decreaseScore() {
        score -= SCORE_DEFAULT
        refreshUI()
    }

    private fun increaseScore() {
        score += SCORE_DEFAULT
        refreshUI()
    }

    private fun refreshUI() {
        main_LBL_score.text = "$score"
    }
}