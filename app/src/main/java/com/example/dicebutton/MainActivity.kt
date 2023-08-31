package com.example.dicebutton
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener {

            val imageView: ImageView = findViewById(R.id.imageView)
            val imageView2: ImageView = findViewById(R.id.imageView2)

            val dice : Dice = Dice(6)

            getDiceView(dice, imageView)
            getDiceView(dice, imageView2)

            val toast: Toast = Toast.makeText(this, "Dice Rolled",Toast.LENGTH_SHORT)
            toast.show()
        }

    }

    private fun getDiceView(dice: Dice, imageView: ImageView) {
        when (dice.rollDice()) {
            1 -> imageView.setImageResource(R.drawable.dice_1)
            2 -> imageView.setImageResource(R.drawable.dice_2)
            3 -> imageView.setImageResource(R.drawable.dice_3)
            4 -> imageView.setImageResource(R.drawable.dice_4)
            5 -> imageView.setImageResource(R.drawable.dice_5)
            6 -> imageView.setImageResource(R.drawable.dice_6)
        }
    }
}
