package com.example.android.sippklingg

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_test.*
import org.jetbrains.anko.intentFor

class Test : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        btnHome.setOnClickListener { startActivity(intentFor<Home>()) }
        btnProfile.setOnClickListener { startActivity(intentFor<Profile>()) }
        btnKategori.setOnClickListener { startActivity(intentFor<KategoriPendataan>()) }
        btnDetail.setOnClickListener { startActivity(intentFor<InfoDetail>()) }
        btnReward.setOnClickListener { startActivity(intentFor<CardReward>()) }
        btnPesan.setOnClickListener { startActivity(intentFor<pesan_card>()) }
        btnRewardKader.setOnClickListener { startActivity(intentFor<RewardKader>()) }
    }



}
