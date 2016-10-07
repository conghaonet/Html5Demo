package com.app2m.demo.hybrid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.app2m.demo.hybrid.network.RetrofitWrapper;
import com.app2m.demo.hybrid.network.github.GitHubBean;
import com.app2m.demo.hybrid.network.github.GitHubService;
import com.app2m.demo.hybrid.network.slp.SlpService;
import com.app2m.demo.hybrid.network.slp.SlpTemplateBean;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        executeSlp();
//        executeGitHub();
    }
    public void onClickOpenOnlineUrl(View view) {
        startActivity(new Intent(this, WebViewActivity.class));
    }

    public void onClickOpenAssetsHtml(View view) {
        startActivity(new Intent(this, AssetsHtmlActivity.class));
    }

/*
    private void executeGitHub() {
        GitHubService gitHubService = RetrofitWrapper.getInstance().create(GitHubService.class);
        Call<GitHubBean> call = gitHubService.getGitHub("https://api.github.com/events");
        call.enqueue(new Callback<GitHubBean>() {
            @Override
            public void onResponse(Call<GitHubBean> call, Response<GitHubBean> response) {
                if(response.code() == 200) {
                    GitHubBean gitHubBean = response.body();
                    Toast.makeText(MainActivity.this, gitHubBean.getEvents_url(), Toast.LENGTH_SHORT).show();
                } else {

                }
            }

            @Override
            public void onFailure(Call<GitHubBean> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
*/
    private void executeSlp() {
        SlpService slpService = RetrofitWrapper.getInstance().create(SlpService.class);
        Call<List<SlpTemplateBean>> call = slpService.getTemplate();
        call.enqueue(new Callback<List<SlpTemplateBean>>() {
            @Override
            public void onResponse(Call<List<SlpTemplateBean>> call, Response<List<SlpTemplateBean>> response) {
                if(response.code() == 200) {
                    List<SlpTemplateBean> list = response.body();
                    SlpTemplateBean bean = list.get(0);
                    Toast.makeText(MainActivity.this, bean.getId(), Toast.LENGTH_SHORT).show();
                } else {

                }
            }

            @Override
            public void onFailure(Call<List<SlpTemplateBean>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
