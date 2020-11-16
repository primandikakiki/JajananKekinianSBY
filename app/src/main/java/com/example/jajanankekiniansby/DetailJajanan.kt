package com.example.jajanankekiniansby

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_jajanan.*

class DetailJajanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_jajanan)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {

            var imgJ = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var nameJ = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskJ = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)

            image_detail.setImageResource(imgJ)
            tv_name_detail.text = nameJ
            tv_desc_detail.text = deskJ
        }
    }
}