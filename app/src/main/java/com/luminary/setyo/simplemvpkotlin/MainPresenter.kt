package com.luminary.setyo.simplemvpkotlin

/**
 * Created by root on 17/02/18.
 */
class MainPresenter {

    var mainView :MainView? = null

    constructor(mainView: MainView?) {
        this.mainView = mainView
    }

    fun logicView(input : String){
        // kondisional check dia kosong apa enggak

        if(input.isEmpty()){
            mainView?.Salah()
        }else{
            mainView?.Success()
        }

    }



}