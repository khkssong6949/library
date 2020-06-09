package kr.co.hgney.library

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        profileImg.setOnClickListener {
            val myIntent = Intent(mContext, LargePhotoActivity::class.java)
            startActivity(myIntent)
        }

    }

    override fun setValues() {
        Glide.with(mContext).load("http://s.marketwatch.com/public/resources/images/MW-HT282_dollar_ZG_20191014195738.jpg").into(profileImg)
    }

}