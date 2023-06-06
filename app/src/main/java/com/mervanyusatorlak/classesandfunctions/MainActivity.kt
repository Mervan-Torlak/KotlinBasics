package com.mervanyusatorlak.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var myTextView: TextView
    private lateinit var myButton: Button
    private lateinit var nameText:TextView
    private lateinit var jobText:TextView
    private lateinit var ageText:TextView
    private lateinit var weightText:TextView
    var name=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView=findViewById(R.id.textView)
        nameText=findViewById(R.id.nameText)
        jobText=findViewById(R.id.jobText)
        ageText=findViewById(R.id.ageText)
        weightText=findViewById(R.id.weightText)
        myButton=findViewById(R.id.button)
        /*
        myButton.setOnClickListener {
            myTextView.text="Button Clicked 2"
        }*/

        test()
        mySum(10,15)
        val sumResult=mySum(40,35)
        val result=myMultiply(10,20)

        println(sumResult)
        println(result)

        //Class

        val homer=Simpson("Homer",50,"Nuclear",500)
        homer.name="Homer Simpson"
        println(homer.name)
        homer.setHegiht(190)



    }
    fun test(){
        println("Naber")
    }
    fun mySum(a:Int,b:Int){

    }
    fun myMultiply(x:Int,y:Int):Int{
        val result=x*y
        myTextView.text="Result: ${result}"
        return x*y
    }

    fun buttonClicked(view: View){
        name=nameText.text.toString()
        val job=jobText.text.toString()
        val weight=weightText.text.toString().toIntOrNull()
        val age=ageText.text.toString().toIntOrNull()
        if(age!=null && weight!=null){
            val simpson=Simpson(name,age,job,weight)
            myTextView.text="Name: ${simpson.name}  Age:${simpson.age}  Job:${simpson.job}  Weight:${simpson.weight}"
        }
        else if(age == null && weight == null){
            myTextView.text="Enter your age and weight"
        }
        else if(age == null){
            myTextView.text="Enter your age"
        }
        else{
            myTextView.text="Enter your weight"
        }


    }
}