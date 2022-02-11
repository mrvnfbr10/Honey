package com.example.honey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.button)
        button.setOnClickListener{
            val msg1 = AlertDialog.Builder(this)
            msg1.setTitle("Annyeong!")
            msg1.setMessage("Do you agree to be honest when using this app?")
            msg1.setPositiveButton(android.R.string.yes) { dialog, which ->
                val msg2 = AlertDialog.Builder(this)
                msg2.setTitle("Shaira Mae R. Mangas")
                msg2.setMessage("You're the one that I want")
                msg2.setPositiveButton(android.R.string.yes){ dialog, which ->
                    val msg3 = AlertDialog.Builder(this)
                    msg3.setTitle("Shaira Mae R. Mangas")
                    msg3.setMessage("In my feels so deep like I'm in a dream")
                    msg3.setPositiveButton(android.R.string.yes){dialog, which ->
                        val msg4 = AlertDialog.Builder(this)
                        msg4.setTitle("Shaira Mae R. Mangas")
                        msg4.setMessage("And I don't want to wake up")
                        msg4.setPositiveButton(android.R.string.yes){dialog, which ->
                            val msg5 = AlertDialog.Builder(this)
                            msg5.setTitle("Shaira Mae R. Mangas")
                            msg5.setMessage("And it's all because of you, I'm sprung")
                            msg5.setPositiveButton(android.R.string.yes){dialog, which ->
                                val msg6 = AlertDialog.Builder(this)
                                msg6.setTitle("Shaira Mae R. Mangas")
                                msg6.setMessage("All I think about is you and us")
                                msg6.setPositiveButton(android.R.string.yes){dialog, which ->
                                    val msg7 = AlertDialog.Builder(this)
                                    msg7.setTitle("Shaira Mae R. Mangas")
                                    msg7.setMessage("You're all I want tonight")
                                    msg7.setPositiveButton(android.R.string.yes){dialog, which ->
                                        val msg8 = AlertDialog.Builder(this)
                                        msg8.setTitle("Shaira Mae R. Mangas")
                                        msg8.setMessage("Will you be Marvin Louie Fabre's valentine?")
                                        msg8.setPositiveButton(android.R.string.yes){dialog, which ->
                                            val msg9 = AlertDialog.Builder(this)
                                            msg9.setTitle("Happy Valentine's Day")
                                            msg9.setMessage("I love you so much Shaira! :* ")
                                            msg9.show()
                                        }
                                        msg8.show()
                                    }
                                    msg7.show()
                                }
                                msg6.show()
                            }
                            msg5.show()
                        }
                        msg4.show()
                    }
                    msg3.show()
                }
                msg2.show()
            }
            msg1.show()
        }
    }
}