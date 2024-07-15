package com.example.tictactoe

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.NonNull
import com.example.tictactoe.databinding.ActivityResultDialogBinding

class ResultDialog(@NonNull context: Context, private val message: String, private val mainActivity: MainActivity) :
    Dialog(context) {
    private lateinit var binding: ActivityResultDialogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityResultDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.messageText.text = message

        binding.startAgainButton.setOnClickListener {
            mainActivity.restartMatch()
            dismiss()
        }
    }
}
