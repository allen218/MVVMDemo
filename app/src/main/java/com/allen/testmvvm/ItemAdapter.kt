package com.allen.testmvvm

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

/**
 * Created by allen on 19/4/7.
 */
class ItemAdapter<T>(
    private var inflater: LayoutInflater,
    private var list: List<T>,
    private var context: Context,
    private var layoutId: Int,
    private var variableId: Int
) : BaseAdapter() {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var dataBindingUtil: ViewDataBinding
        if (null == convertView) {
            dataBindingUtil = DataBindingUtil.inflate(inflater, layoutId, parent, false)
        } else {
            dataBindingUtil = DataBindingUtil.getBinding(convertView)!!
        }
        dataBindingUtil.setVariable(variableId, list[position])

        return dataBindingUtil.root.rootView
    }

    override fun getItem(position: Int): T {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return -1
    }

    override fun getCount(): Int {
        return list.size
    }
}