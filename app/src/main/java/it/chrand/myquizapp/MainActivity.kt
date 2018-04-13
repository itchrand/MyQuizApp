package it.chrand.myquizapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * This method is called when the submit button is clicked.
     */
    fun submitAnswers(view: View) {
        var countRightAnswers: Int = 0
        var answer: String
        var questionsToLookAt: String = ""
        var editText: EditText
        var radioButton: RadioButton
        var checkBox1: CheckBox
        var checkBox2: CheckBox
        var checkBox3: CheckBox
        var checkBox4: CheckBox
        var checkBox5: CheckBox

        // question 1.)
        editText = findViewById<EditText>(R.id.answer01) as EditText
        answer = editText.text.toString()
        if (answer == getString(R.string.answer01))
            countRightAnswers++
        else
            questionsToLookAt += "1.)"

        // question 2.)
        radioButton = findViewById<RadioButton>(R.id.answer02_5) as RadioButton
        if (radioButton.isChecked)
            countRightAnswers++
        else
            questionsToLookAt += (if (questionsToLookAt == "") "" else ", ") + "2.)"

        // question 3.)
        editText = findViewById<EditText>(R.id.answer03) as EditText
        answer = editText.text.toString()
        if (answer == getString(R.string.answer03))
            countRightAnswers++
        else
            questionsToLookAt += (if (questionsToLookAt == "") "" else ", ") + "3.)"

        // question 4.)
        radioButton = findViewById<RadioButton>(R.id.answer04_3) as RadioButton
        if (radioButton.isChecked)
            countRightAnswers++
        else
            questionsToLookAt += (if (questionsToLookAt == "") "" else ", ") + "4.)"

        // question 5.)
        radioButton = findViewById<RadioButton>(R.id.answer05_2) as RadioButton
        if (radioButton.isChecked)
            countRightAnswers++
        else
            questionsToLookAt += (if (questionsToLookAt == "") "" else ", ") + "5.)"

        // question 6.)
        editText = findViewById<EditText>(R.id.answer06) as EditText
        answer = editText.text.toString()
        if (answer == getString(R.string.answer06))
            countRightAnswers++
        else
            questionsToLookAt += (if (questionsToLookAt == "") "" else ", ") + "6.)"

        // question 7.)
        radioButton = findViewById<RadioButton>(R.id.answer07_1) as RadioButton
        if (radioButton.isChecked)
            countRightAnswers++
        else
            questionsToLookAt += (if (questionsToLookAt == "") "" else ", ") + "7.)"

        // question 8.)
        checkBox1 = findViewById<RadioButton>(R.id.answer08_1) as CheckBox
        checkBox2 = findViewById<RadioButton>(R.id.answer08_2) as CheckBox
        checkBox3 = findViewById<RadioButton>(R.id.answer08_3) as CheckBox
        checkBox4 = findViewById<RadioButton>(R.id.answer08_4) as CheckBox
        checkBox5 = findViewById<RadioButton>(R.id.answer08_5) as CheckBox
        if (!checkBox1.isChecked && !checkBox2.isChecked && checkBox3.isChecked && !checkBox4.isChecked && checkBox5.isChecked)
            countRightAnswers++
        else
            questionsToLookAt += (if (questionsToLookAt == "") "" else ", ") + "8.)"

        // question 9.)
        editText = findViewById<EditText>(R.id.answer09) as EditText
        answer = editText.text.toString()
        if (answer == getString(R.string.answer09))
            countRightAnswers++
        else
            questionsToLookAt += (if (questionsToLookAt == "") "" else ", ") + "9.)"

        // question 10.)
        checkBox1 = findViewById<RadioButton>(R.id.answer10_1) as CheckBox
        checkBox2 = findViewById<RadioButton>(R.id.answer10_2) as CheckBox
        checkBox3 = findViewById<RadioButton>(R.id.answer10_3) as CheckBox
        checkBox4 = findViewById<RadioButton>(R.id.answer10_4) as CheckBox
        checkBox5 = findViewById<RadioButton>(R.id.answer10_5) as CheckBox
        if (!checkBox1.isChecked && checkBox2.isChecked && !checkBox3.isChecked && checkBox4.isChecked && !checkBox5.isChecked)
            countRightAnswers++
        else
            questionsToLookAt += (if (questionsToLookAt == "") "" else ", ") + "10.)"

        // give feedback
        if (countRightAnswers == 10)
            giveAToast(getString(R.string.well_done))
        else
            giveAToast(getString(R.string.not_well_done) + questionsToLookAt)
    }

    /**
     * This method gives a toast message.
     */
    private fun giveAToast(message: String) {
        val context = applicationContext
        val duration = Toast.LENGTH_LONG

        val toast = Toast.makeText(context, message, duration)
        toast.show()
    }
}
