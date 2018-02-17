package com.luminary.setyo.simplemvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {


    //deklarasi presenter

    lateinit var presenter : MainPresenter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initView()
    }

    private fun initView() {
       iniButton.setOnClickListener {

           presenter.logicView(iniInput.text.toString())

       }
    }


    override fun Success() {
        Toast.makeText(this,"success",Toast.LENGTH_LONG).show()
    }

    override fun Salah() {
       Toast.makeText(this,"input kosong",Toast.LENGTH_LONG).show()
    }



    private fun initPresenter() {
        presenter = MainPresenter(this)
    }
}
