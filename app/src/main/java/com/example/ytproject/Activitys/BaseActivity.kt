package com.example.ytproject.Activitys

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.ytproject.R

open class BaseActivity : AppCompatActivity(){

    lateinit var dialog: Dialog
    @SuppressLint("ResourceAsColor")
    fun createDialog() {
        dialog = Dialog(this)
        dialog.window?.setBackgroundDrawable(ColorDrawable(android.R.color.transparent))
        dialog.setContentView(R.layout.loading_dialog)
    }

    fun showDialog() {
        dialog.show()
    }

    fun closeDialog() {
        dialog.dismiss()
    }

}