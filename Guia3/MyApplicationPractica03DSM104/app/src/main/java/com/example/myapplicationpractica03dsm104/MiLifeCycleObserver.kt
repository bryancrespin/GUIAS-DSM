package com.example.myapplicationpractica03dsm104


import android.os.Bundle
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner


class MiLifeCycleObserver: DefaultLifecycleObserver {
    override fun onCreate(lifecycler:LifecycleOwner) {
        super.onCreate(lifecycler)
        Log.d("MiLifeCycleObsever", "onCreate")
}


    override fun onStart(lifecycler:LifecycleOwner) {
        super.onCreate(lifecycler)
        Log.d("MiLifeCycleObsever", "onStart")
    }



    override fun onPause(lifecycler:LifecycleOwner) {
        super.onCreate(lifecycler)
        Log.d("MiLifeCycleObsever", "onPause")
    }



    override fun onResume(lifecycler:LifecycleOwner) {
        super.onCreate(lifecycler)
        Log.d("MiLifeCycleObsever", "onResume")
    }




    override fun onStop(lifecycler:LifecycleOwner) {
        super.onCreate(lifecycler)
        Log.d("MiLifeCycleObsever", "onStop")
    }




    override fun onDestroy(lifecycler:LifecycleOwner) {
        super.onCreate(lifecycler)
        Log.d("MiLifeCycleObsever", "onDestroy")
    }

}