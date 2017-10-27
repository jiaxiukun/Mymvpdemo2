package baway.com.mymvpdemo.home.modle;

import baway.com.mymvpdemo.core.net.CallbackListener;
import baway.com.mymvpdemo.home.modle.beans.ConfigResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by 贾秀坤 on 2017/7/6.
 */

public class HomeService {

    private static volatile HomeService instance;

    private HomeService() {
    }

    public static HomeService getInstance() {

        if (instance == null) {
            synchronized (HomeService.class) {
                if (instance == null) {
                    instance = new HomeService();
                }
            }
        }
        return instance;
    }

    //获取配置数据
    public void getConfig(String sid, final CallbackListener callbackListener) {
        callbackListener.onNetStart();
        Call<String> call = ApiHome.getInstance().getConfigFromServer(sid);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                //System.out.println("A");
                if (response != null && response.isSuccessful() && response.body() != null && response.body().length() > 0) {

                    callbackListener.onNetSuccess(ConfigResponse.objectFromData(response.body().toString()));

                } else {
                    callbackListener.onNetFail("");
                }

            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                callbackListener.onNetFail("");
            }
        });

    }


}
