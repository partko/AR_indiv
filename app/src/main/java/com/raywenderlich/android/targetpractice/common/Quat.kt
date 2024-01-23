package com.raywenderlich.android.targetpractice.common

import kotlin.math.cos
import kotlin.math.sin

data class Quaternion(var x: Float, var y: Float, var z: Float, var w: Float)
data class Vect(var x: Float, var y: Float, var z: Float)

class Quat {
    var quat = Quaternion(0f, 0f, 0f, 0f)
    var vector = Vect(0f, 0f, 0f)
    var tempVect = Vect(0f, 0f, 0f)

    var keyVector = Vect(0f, 0f, 0f)
    var exitVector = Vect(0f, 0f, 0f)

    fun quatInvert(q: Quaternion): Quaternion {
        val length = (1.0f / ((q.x * q.x) + (q.y * q.y) + (q.z * q.z) + (q.w * q.w)))
        val invQuat = Quaternion(q.x * -length, q.y * -length, q.z * -length, q.w * length)
        return invQuat
    }

    fun quatMult(q1: Quaternion, q2: Quaternion): Quaternion {
        val v1 = Vect(q1.x, q1.y, q1.z)
        val v2 = Vect(q2.x, q2.y, q2.z)
        val angle: Float = ((q1.w * q2.w) - vDot(v1, v2))
        val vCross: Vect = cross(v1, v2)
        val qRes = Quaternion(0f, 0f, 0f, 0f)

        v1.x *= q2.w
        v1.y *= q2.w
        v1.z *= q2.w

        v2.x *= q1.w
        v2.y *= q1.w
        v2.z *= q1.w

        qRes.x = v1.x + v2.x + vCross.x
        qRes.y = v1.y + v2.y + vCross.y
        qRes.z = v1.z + v2.z + vCross.z
        qRes.w = angle
        return qRes
    }

    fun vDot(v1: Vect, v2: Vect): Float {
        return (v1.x * v2.x) + (v1.y * v2.y) + (v1.z * v2.z)
    }

    fun vSum(v1: Vect, v2: Vect): Vect {
        return Vect(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z)
    }

    fun cross(v1: Vect, v2: Vect): Vect {
        return Vect((v1.y * v2.z) - (v1.z * v2.y),
            (v1.z * v2.x) - (v1.x * v2.z),
            (v1.x * v2.y) - (v1.y * v2.x))
    }

    fun quatMultVect(q: Quaternion, v: Vect): Vect {
        val vQuat = Quaternion(0f, 0f, 0f, 0f)

        vQuat.x = v.x
        vQuat.y = v.y
        vQuat.z = v.z
        vQuat.w = 0f

        val invQuat = quatInvert(q)
        var resQuat = quatMult(vQuat, invQuat)
        resQuat = quatMult(q, resQuat)
        val resVect = Vect(resQuat.x, resQuat.y, resQuat.z)

        return resVect
    }

    fun createQuat(rotateVector: Vect, rotateAngle: Float, quaternion: Quaternion = Quaternion(0f, 0f, 0f, 0f)): Quaternion {
        //rotate_vector = normal(rotate_vector)
        //val quat = Quaternion(0f, 0f, 0f, 0f)
        val quat = quaternion
        quat.w = cos(rotateAngle / 2)
        quat.x = rotateVector.x * sin(rotateAngle / 2)
        quat.y = rotateVector.y * sin(rotateAngle / 2)
        quat.z = rotateVector.z * sin(rotateAngle / 2)
        return quat
    }




}