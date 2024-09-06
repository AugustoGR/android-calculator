package com.br.calculadora

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calc = findViewById<TextView>(R.id.calc)

        findViewById<AppCompatButton>(R.id.clean).setOnClickListener {
            calc.text = ""
        }
        findViewById<AppCompatButton>(R.id.open_paren).setOnClickListener {
            calc.text = "${calc.text}("
        }
        findViewById<AppCompatButton>(R.id.close_paren).setOnClickListener {
            calc.text = "${calc.text})"
        }
        findViewById<AppCompatButton>(R.id.div).setOnClickListener {
            calc.text = "${calc.text}/"
        }
        findViewById<AppCompatButton>(R.id.num7).setOnClickListener {
            calc.text = "${calc.text}7"
        }
        findViewById<AppCompatButton>(R.id.num8).setOnClickListener {
            calc.text = "${calc.text}8"
        }
        findViewById<AppCompatButton>(R.id.num9).setOnClickListener {
            calc.text = "${calc.text}9"
        }
        findViewById<AppCompatButton>(R.id.mult).setOnClickListener {
            calc.text = "${calc.text}*"
        }
        findViewById<AppCompatButton>(R.id.num4).setOnClickListener {
            calc.text = "${calc.text}4"
        }
        findViewById<AppCompatButton>(R.id.num5).setOnClickListener {
            calc.text = "${calc.text}5"
        }
        findViewById<AppCompatButton>(R.id.num6).setOnClickListener {
            calc.text = "${calc.text}6"
        }
        findViewById<AppCompatButton>(R.id.sub).setOnClickListener {
            calc.text = "${calc.text}-"
        }
        findViewById<AppCompatButton>(R.id.num1).setOnClickListener {
            calc.text = "${calc.text}1"
        }
        findViewById<AppCompatButton>(R.id.num2).setOnClickListener {
            calc.text = "${calc.text}2"
        }
        findViewById<AppCompatButton>(R.id.num3).setOnClickListener {
            calc.text = "${calc.text}3"
        }
        findViewById<AppCompatButton>(R.id.sum).setOnClickListener {
            calc.text = "${calc.text}+"
        }
        findViewById<AppCompatButton>(R.id.dot).setOnClickListener {
            calc.text = "${calc.text}."
        }
        findViewById<AppCompatButton>(R.id.num0).setOnClickListener {
            calc.text = "${calc.text}0"
        }
        findViewById<AppCompatButton>(R.id.cleanNum).setOnClickListener {
            calc.text = "${calc.text.substring(0, calc.length() - 1)}"
        }
        findViewById<AppCompatButton>(R.id.equal).setOnClickListener {
            try {
                val expr = ExpressionBuilder(calc.text.toString()).build()
                val result = expr.evaluate()
                if (result % 1 == 0.0) {
                    calc.text = "${result.toInt()}"
                } else {
                    calc.text = "${result}"
                }

            } catch (e: Exception) {
                calc.text = "Erro"
            }
        }

    }
}