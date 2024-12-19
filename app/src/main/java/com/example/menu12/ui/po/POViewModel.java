package com.example.menu12.ui.po;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class POViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public POViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}