package com.example.menusapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.inputmethod.InputBinding
import android.widget.Toast
import com.example.menusapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.actionBar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_bar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.actionBarOpt1 -> {
                Toast
                    .makeText(
                        this,
                        "Compartir",
                        Toast.LENGTH_SHORT
                    )
                    .show()
                true
            }
            R.id.actionBarOpt2 -> {
                Toast
                    .makeText(
                        this,
                        "Generar PDF",
                        Toast.LENGTH_SHORT
                    )
                    .show()
                true
            }
            R.id.actionBarOpt3 -> {
                Toast
                    .makeText(
                        this,
                        "Imprimir",
                        Toast.LENGTH_SHORT
                    )
                    .show()
                true
            }
            R.id.actionBarOpt4 -> {
                Toast
                    .makeText(
                        this,
                        "Enviar",
                        Toast.LENGTH_SHORT
                    )
                    .show()
                true
            }
            R.id.actionBarOpt5 -> {
                Toast
                    .makeText(
                        this,
                        "Marcar como pagada",
                        Toast.LENGTH_SHORT
                    )
                    .show()
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }

    }
}