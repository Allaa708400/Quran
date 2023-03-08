package com.example.quran.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.quran.repository.SurahRepo;
import com.example.quran.response.SurahResponse;

public class SurahViewModel extends ViewModel {

    private SurahRepo surahRepo;

    public SurahViewModel() {

        surahRepo = new SurahRepo();
    }
    public MutableLiveData<SurahResponse> getSurah(){

        return surahRepo.getSurah();
    }
}
