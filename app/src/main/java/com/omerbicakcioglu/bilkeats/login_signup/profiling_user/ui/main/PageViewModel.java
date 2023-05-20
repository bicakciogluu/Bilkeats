package com.omerbicakcioglu.bilkeats.login_signup.profiling_user.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();


    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    // These Changes does not work

   // public LiveData<String> getText() {
        //return mText;
    }
