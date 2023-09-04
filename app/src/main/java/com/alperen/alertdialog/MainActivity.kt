package com.alperen.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this@MainActivity,"welcome",Toast.LENGTH_SHORT).show()
    }
    fun save(view: View){
        val alert= AlertDialog.Builder(this@MainActivity)
        alert.setTitle("save")
        alert.setMessage("sure?")
        alert.setPositiveButton("yes", object:DialogInterface.OnClickListener {
            override fun onClick(p0: DialogInterface?, p1: Int) {
                Toast.makeText(this@MainActivity,"saved!",Toast.LENGTH_LONG).show()
            }

        })
        alert.setNegativeButton("no"){p0, p1 ->
            Toast.makeText(this@MainActivity,"not saved!",Toast.LENGTH_LONG).show()
        }
        alert.show()
    }
}