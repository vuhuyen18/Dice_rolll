package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

 lateinit  var diceImage: ImageView  // sử dụng lateinit để trích biến chế độ xem hình ảnh

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Xúc xắc"
        rollButton.setOnClickListener{
            //Toast.makeText(this,"button clicked", Toast.LENGTH_SHORT).show()  //đây là thông báo toast
            //Hiển thị chữ sau khi bấm nút với this: cho đối tượng này ,vb là button clicked
            // thời lượng sd cú pháp : Toast.LENGTH_SHORT - thời gian ngắn

            rollDice()
        }
        diceImage = findViewById(R.id.dice_image)  //Khởi tạo biến view hình ảnh
    }

    private fun rollDice() {
     // val resultText: TextView = findViewById(R.id.result_text)  // tham chiếu textview bằng findViewById
        val randomInt = Random.nextInt(6)+1  // tạo hàm random từ 1 tới 6
      //  resultText.text = randomInt.toString()  //hiển thị text bằng cách gọi biến randomInt
        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2->  R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else ->R.drawable.dice_6
        }
     //   val diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)
    }
}