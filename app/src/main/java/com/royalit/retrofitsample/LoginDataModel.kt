package com.royalit.retrofitsample

import com.google.gson.annotations.SerializedName

data class LoginDataModel(@SerializedName("status") var status: String? = null,) {
}