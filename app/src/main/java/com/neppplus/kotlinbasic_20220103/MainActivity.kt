package com.neppplus.kotlinbasic_20220103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        로그찍기 버튼 눌리면 할 일 셋팅
        btnLog.setOnClickListener {

//            버튼이 눌리면 할 일
            Log.d("메인화면", "로그 찍기 버튼이 눌렸지롱")
            Log.e("메인화면2", "로그찍기2")

        }

//        토스트 띄우기 버튼 눌리면 할 일 셋팅
        btnToast.setOnClickListener {

//            토스트로 "안녕하세요" 문장 띄우기
            Toast.makeText(this, "코틀린은 참 신기하군", Toast.LENGTH_SHORT).show()


        }
    }
}