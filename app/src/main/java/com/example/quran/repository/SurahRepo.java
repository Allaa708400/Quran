package com.example.quran.repository;

import androidx.lifecycle.MutableLiveData;



import com.example.quran.network.Api;
import com.example.quran.network.JsonPlaceHolderApi;
import com.example.quran.response.SurahResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class SurahRepo {

    private final JsonPlaceHolderApi jsonPlaceHolderApi;


    public SurahRepo() {

        jsonPlaceHolderApi = Api.getRetrofit().create(JsonPlaceHolderApi.class);
    }

    public MutableLiveData<SurahResponse> getSurah() {

        MutableLiveData<SurahResponse> data = new MutableLiveData<>();



        jsonPlaceHolderApi.getSurah().enqueue(new Callback<SurahResponse>() {
            @Override
            public void onResponse(Call<SurahResponse> call, Response<SurahResponse> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<SurahResponse> call, Throwable t) {

                data.setValue(null);
            }
        });


        return data;
    }
}




