package com.app2m.demo.hybrid.network;

import com.app2m.demo.hybrid.Constant;
import com.app2m.lib.network.HttpHelper;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ch on 2016/10/4.
 *
 */

public class RetrofitWrapper {
    private volatile static RetrofitWrapper mInstance;
    private Retrofit retrofit;

    private RetrofitWrapper() {
        //1.创建Retrofit对象
        retrofit = new Retrofit.Builder().baseUrl(Constant.BASE_URL) // 定义访问的主机地址
                .addConverterFactory(GsonConverterFactory.create())  //解析方法
//                .addConverterFactory(MyGsonConverterFactory.create())
                .client(HttpHelper.getInstance().getHttpClient())
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }
    /**
     * 单例模式
     *
     * @return
     */
    public static RetrofitWrapper getInstance () {
        if(mInstance == null) {
            synchronized (RetrofitWrapper.class) {
                if(mInstance == null) {
                    mInstance = new RetrofitWrapper();
                }
            }
        }
        return mInstance;
    }


    public <T> T create(final Class<T> service) {
        if(!service.isInterface()) {
            throw new IllegalArgumentException("需要传入Interface");
        }
        return retrofit.create(service);
    }

}



