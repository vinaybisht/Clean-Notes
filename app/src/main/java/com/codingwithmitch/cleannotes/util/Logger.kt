package com.codingwithmitch.cleannotes.util

import android.util.Log
import com.codingwithmitch.cleannotes.util.Constants.DEBUG
import com.codingwithmitch.cleannotes.util.Constants.TAG
import com.crashlytics.android.Crashlytics

fun printLogD(className: String?, message: String ) {
    if (DEBUG) {
        Log.d(TAG, "$className: $message")
    }
}

/*
    Priorities: Log.DEBUG, Log. etc....
 */
fun cLog(priority: Int, tag: String, msg: String?)
        = Crashlytics.log(Log.DEBUG, tag, msg)
