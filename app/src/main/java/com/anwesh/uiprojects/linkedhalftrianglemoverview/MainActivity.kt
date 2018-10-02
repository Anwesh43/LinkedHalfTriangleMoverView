package com.anwesh.uiprojects.linkedhalftrianglemoverview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.halftrianglemoverview.HalfTriangleMoverView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        HalfTriangleMoverView.create(this)
    }
}
