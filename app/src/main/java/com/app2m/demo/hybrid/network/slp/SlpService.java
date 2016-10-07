package com.app2m.demo.hybrid.network.slp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ch on 2016/10/5.
 */

public interface SlpService {

    @GET("templates?category=AFT_APPDOWNLOAD")
    Call<List<SlpTemplateBean>> getTemplate();
}
