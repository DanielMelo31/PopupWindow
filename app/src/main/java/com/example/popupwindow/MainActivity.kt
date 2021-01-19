package com.example.popupwindow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupWindow
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val mButton: Button = findViewById(R.id.btnPopup1);
        val mContext = applicationContext

        // Set a click listener for the text view
        mButton.setOnClickListener {

            val inflater = LayoutInflater.from(mContext).inflate(R.layout.custom_layout, null)

            val mPopupWindow = PopupWindow(
                inflater,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )

            // Get a reference for the custom view close button
            val closeButton: ImageButton = inflater.findViewById(R.id.ib_close);

            // Set a click listener for the popup window close button
            closeButton.setOnClickListener {
                mPopupWindow.dismiss();
            }
            mPopupWindow.showAtLocation(it, Gravity.CENTER, 500, -500)
        }
    }
}


