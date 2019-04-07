package com.allen.testmvvm

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.BindingAdapter
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

/**
 * Created by allen on 19/4/5.
 */
class User(
    private var name: String = "",
    private var passwd: String = "",
    private var photo: String = ""
) : BaseObservable() {


    @Bindable
    fun getPhoto(): String {
        return photo
    }

    fun setPhoto(url: String) {
        this.photo = url
        notifyPropertyChanged(BR.photo)
    }

    @Bindable
    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
        notifyPropertyChanged(BR.name)
    }

    @Bindable
    fun getPasswd(): String? {
        return passwd
    }

    fun setPasswd(passwd: String) {
        this.passwd = passwd
        notifyPropertyChanged(BR.passwd)
    }

    companion object {
        @BindingAdapter("photo")
        @JvmStatic
        fun loadImg(iv: ImageView, url: String) {
            Picasso.get().load(url).into(iv)
        }
    }

    fun click(view: View) {

        Toast.makeText(view.context, getName(), Toast.LENGTH_SHORT).show()
    }
}