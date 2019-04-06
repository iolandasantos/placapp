package br.com.iolandasantos.placapp.extensions

import android.widget.EditText

fun EditText.value() = this.text.toString()