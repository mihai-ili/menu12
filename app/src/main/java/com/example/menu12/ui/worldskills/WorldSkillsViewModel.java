package com.example.menu12.ui.worldskills;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WorldSkillsViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public WorldSkillsViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}