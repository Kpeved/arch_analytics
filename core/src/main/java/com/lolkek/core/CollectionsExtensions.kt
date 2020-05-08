package com.lolkek.core

import android.os.Bundle
import org.json.JSONObject

fun Map<String, Any?>.toBundle(): Bundle {
    val bundle = Bundle()
    filter { (_, value) -> value != null }
        .forEach { (key, value) -> bundle.putString(key, value.toString()) }
    return bundle
}

fun Map<String, Any?>.toJson(): JSONObject {
    val jsonObject = JSONObject()
    filter { (_, value) -> value != null }
        .forEach { (key, value) -> jsonObject.put(key, value) }
    return jsonObject
}