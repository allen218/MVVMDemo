package com.allen.testmvvm

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    val handler: Handler = Handler()
    val list: MutableList<User> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val dataBinding: ActivityMainBinding =
//            DataBindingUtil.setContentView(this, R.layout.activity_main)
        val user1 = User(
            "1",
            "1",
            "http://b.hiphotos.baidu.com/image/h%3D300/sign=10da86d6df43ad4bb92e40c0b2035a89/03087bf40ad162d93b3a196f1fdfa9ec8b13cde9.jpg"
        )
        val user2 = User(
            "2",
            "2",
            "http://b.hiphotos.baidu.com/image/h%3D300/sign=10da86d6df43ad4bb92e40c0b2035a89/03087bf40ad162d93b3a196f1fdfa9ec8b13cde9.jpg"
        )
        val user3 = User(
            "3",
            "3",
            "http://b.hiphotos.baidu.com/image/h%3D300/sign=10da86d6df43ad4bb92e40c0b2035a89/03087bf40ad162d93b3a196f1fdfa9ec8b13cde9.jpg"
        )
        val user4 = User(
            "4",
            "4",
            "http://b.hiphotos.baidu.com/image/h%3D300/sign=10da86d6df43ad4bb92e40c0b2035a89/03087bf40ad162d93b3a196f1fdfa9ec8b13cde9.jpg"
        )
        val user5 = User(
            "5",
            "5",
            "http://b.hiphotos.baidu.com/image/h%3D300/sign=10da86d6df43ad4bb92e40c0b2035a89/03087bf40ad162d93b3a196f1fdfa9ec8b13cde9.jpg"
        )

        list.add(user1)
        list.add(user2)
        list.add(user3)
        list.add(user4)
        list.add(user5)

        val listView: ListView = findViewById(R.id.list)
        listView.adapter = ItemAdapter(layoutInflater, list, this, R.layout.item, BR.user)

    }
}
