package com.app2m.lib.network.retrofit2;

/**
 * Created by CongHao on 2016/6/17.
 */

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Converter;

final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final Gson gson;
    private final TypeAdapter<T> adapter;

    GsonResponseBodyConverter(Gson gson, TypeAdapter<T> adapter) {
        this.gson = gson;
        this.adapter = adapter;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        try {
/*
            JsonReader jsonReader = gson.newJsonReader(value.charStream());
            return adapter.read(jsonReader);
*/
            String strBody = value.string();
            if (TextUtils.isEmpty(strBody))
                return null;
            else
                return adapter.fromJson(strBody);
        } finally {
            value.close();
        }
    }
}