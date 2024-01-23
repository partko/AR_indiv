package com.raywenderlich.android.targetpractice.common

import android.util.Log
import kotlin.math.absoluteValue

class Ball {
//    fun isAllowPlusXMove(): Boolean {
//        val x: Int = sPos.first + (xPoint / .05f).toInt()
//        val z: Int = sPos.third + (zPoint / .05f).toInt()
//        val xPrev: Float = ((xPoint.absoluteValue - 0.025f) % .05f *2)
//        val xNext: Float = ((xPoint.absoluteValue + 0.025f) % .05f *2)
//        //Log.d("cord", "x = $x, z = $z")
//        Log.d("cord", "xPoint = $xPoint")
//        Log.d("cord", "x = $x, z = $z, xPrev = $xPrev, xNext = $xNext")
//        return maze.mazeData[x+1][z] != 1
//    }
//    fun isAllowMinusXMove(): Boolean {
//        val x: Int = sPos.first + (xPoint / .05f).toInt()
//        val z: Int = sPos.third + (zPoint / .05f).toInt()
//        //val xPrev: Float = (sPos.first + (xPoint / .05f - 0.025f) % .05f)
//        //val xNext: Float = (sPos.first + (xPoint / .05f + 0.025f) % .05f)
//        //Log.d("cord", "x = $x, z = $z")
//        //Log.d("cord", "x = $x, z = $z, xPrev = $xPrev, xNext = $xNext")
//        return maze.mazeData[x-1][z] != 1
//    }
//    fun isAllowPlusZMove(): Boolean {
//        val x: Int = sPos.first + (xPoint / .05f + 0.025f).toInt()
//        val z: Int = sPos.third + (zPoint / .05f + 0.025f).toInt()
//        Log.d("cord", "x = $x, z = $z")
//        return maze.mazeData[x][z+1] != 1
//    }
//    fun isAllowMinusZMove(): Boolean {
//        val x: Int = sPos.first + (xPoint / .05f + 0.025f).toInt()
//        val z: Int = sPos.third + (zPoint / .05f + 0.025f).toInt()
//        Log.d("cord", "x = $x, z = $z")
//        return maze.mazeData[x][z-1] != 1
//    }
}