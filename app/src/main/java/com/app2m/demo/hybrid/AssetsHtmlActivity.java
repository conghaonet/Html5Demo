package com.app2m.demo.hybrid;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.app2m.demo.hybrid.network.RetrofitWrapper;
import com.app2m.demo.hybrid.network.slp.SlpService;
import com.app2m.demo.hybrid.network.slp.SlpTemplateBean;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AssetsHtmlActivity extends AppCompatActivity {
    private static final String TAG = AssetsHtmlActivity.class.getName();
    private WebView mWebView;
    private EditText mEditText;
    private ProgressBar mProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assets_html);

        mEditText = (EditText) findViewById(R.id.url_text);
        mWebView = (WebView) findViewById(R.id.my_webview);
        mProgressBar = (ProgressBar) findViewById(R.id.myProgressBar);
        //设置支持JavaScript
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setAllowFileAccess(false);
        mWebView.getSettings().setDatabaseEnabled(true);
        mWebView.getSettings().setDomStorageEnabled(true);
        mWebView.getSettings().setUseWideViewPort(true);
        mWebView.getSettings().setLoadWithOverviewMode(true);
        mWebView.getSettings().setBuiltInZoomControls(true);
        mWebView.getSettings().setSupportZoom(true);
        mWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);//不加上，会显示白边
        mWebView.setWebViewClient(new MyWebViewClient());
        mWebView.setWebChromeClient(new MyWebChromeClient());
        mWebView.loadUrl("file:///android_asset/zishiying.html");
        //设置本地调用对象及其接口
        mWebView.addJavascriptInterface(new JavaScriptObject(this), "myObj");
    }
    public void onClickJS(View view) {
//        mWebView.loadUrl("javascript:show_alert('          Native传递的参数             ')");
//        mWebView.loadUrl("javascript:setTableData()");
        executeSlp();
    }
    @Override
    public void onBackPressed() {
        if (mWebView.canGoBack()) {
            mWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    private void executeSlp() {
        SlpService slpService = RetrofitWrapper.getInstance().create(SlpService.class);
        Call<List<SlpTemplateBean>> call = slpService.getTemplate();
        call.enqueue(new Callback<List<SlpTemplateBean>>() {
            @Override
            public void onResponse(Call<List<SlpTemplateBean>> call, Response<List<SlpTemplateBean>> response) {
                if(response.code() == 200) {
                    List<SlpTemplateBean> list = response.body();
                    SlpTemplateBean bean = list.get(0);
                    mWebView.loadUrl("javascript:setTableData()");
                    Toast.makeText(AssetsHtmlActivity.this, bean.getId(), Toast.LENGTH_SHORT).show();
                } else {

                }
            }

            @Override
            public void onFailure(Call<List<SlpTemplateBean>> call, Throwable t) {
                Toast.makeText(AssetsHtmlActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            mWebView.loadUrl(url);
            return true;
        }
        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            // 接受所有网站的证书
            handler.proceed();
        }
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
        }
        @Override
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            Toast.makeText(AssetsHtmlActivity.this, description, Toast.LENGTH_LONG).show();
        }
        //在加载页面资源时会调用，每一个资源（比如图片）的加载都会调用一次。
        @Override
        public void onLoadResource(WebView view, String url) {
            Log.d(TAG, " onLoadResource " + url);
            super.onLoadResource(view, url);
        }
    }

    class MyWebChromeClient extends WebChromeClient {
        @Override
        public boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
            return true;
        }
        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            if (newProgress == 100) {
                mProgressBar.setVisibility(View.INVISIBLE);
            } else {
                if (View.INVISIBLE == mProgressBar.getVisibility()) {
                    mProgressBar.setVisibility(View.VISIBLE);
                }
                mProgressBar.setProgress(newProgress);
            }
            super.onProgressChanged(view, newProgress);
        }
    }
}
