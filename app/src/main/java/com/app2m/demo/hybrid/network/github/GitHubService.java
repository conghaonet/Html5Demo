package com.app2m.demo.hybrid.network.github;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by ch on 2016/10/4.
 */

public interface GitHubService {

    @GET
    Call<GitHubBean> getGitHub(@Url String aaa);

    @GET("events")
    Call<List<GitHubEventBean>> getEvents();

}
