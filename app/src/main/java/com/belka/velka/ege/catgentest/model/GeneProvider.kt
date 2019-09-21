package com.belka.velka.ege.catgentest.model

import com.belka.velka.ege.catgentest.R

class GeneProvider{
    companion object {
        fun getBody(id: Int): Int {
            return when (id) {
                101 -> R.drawable.body_gray
                102 -> R.drawable.body_brown
                103 -> R.drawable.body_white
                1 -> R.drawable.body_pink
                else -> android.R.drawable.alert_dark_frame
            }
        }

        fun getTail(id: Int): Int {
            return when (id) {
                111 -> R.drawable.tail_gray
                112 -> R.drawable.tail_brown
                113 -> R.drawable.tail_white
                11 -> R.drawable.tail_pink
                else -> android.R.drawable.alert_dark_frame
            }
        }

        fun getDetail(id: Int): Int{
            return when(id){
                121 -> R.drawable.detail_spot_eye
                122 -> R.drawable.detail_spot_tail
                21 -> R.drawable.detail_tiger
                else -> android.R.drawable.alert_dark_frame
            }
        }


        fun getEar(id: Int): Int{
            return when(id){
                131 -> R.drawable.ear_gray
                132 -> R.drawable.ear_brown
                133 -> R.drawable.ear_white
                31 -> R.drawable.ear_pink
                else -> android.R.drawable.alert_dark_frame
            }
        }

        fun getEye(id: Int): Int{
            return when(id){
                141 -> R.drawable.eye_blue
                142 -> R.drawable.eye_yellow
                41 -> R.drawable.eye_red
                else -> android.R.drawable.alert_dark_frame
            }
        }

        fun getFur(id: Int): Int{
            return when(id){
                151 -> R.drawable.fur_big
                152 -> R.drawable.fur_none
                else -> android.R.drawable.alert_dark_frame
            }
        }
    }
}