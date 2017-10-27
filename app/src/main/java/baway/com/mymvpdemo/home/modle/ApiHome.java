package baway.com.mymvpdemo.home.modle;

import baway.com.mymvpdemo.core.net.ApiGenerator;
import baway.com.mymvpdemo.core.net.BaseService;
import retrofit2.Call;

/**
 * Created by 贾秀坤 on 2017/7/6.
 */

public class ApiHome {
    private static volatile ApiHome instance;
    private BaseService baseService;

    private ApiHome() {
        baseService = ApiGenerator.getBaseNetServer();
    }

    public static ApiHome getInstance() {

        if (instance == null) {
            synchronized (ApiHome.class) {
                if (instance == null) {
                    instance = new ApiHome();
                }
            }
        }

        return instance;
    }

    //获取配置数据http://h5test.newaircloud.com/api/getconfig?sid=xy
    public Call<String> getConfigFromServer(String sid) {
        if (baseService == null) {
            baseService = ApiGenerator.getBaseNetServer();
        }
        return baseService.baseGetRequest(getConfigUrl(sid));
    }

    private String getConfigUrl(String sid) {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("http://h5test.newaircloud.com/api/getconfig?sid=").append(sid);
        return stringBuffer.toString();
    }

    //获取列表数据
    public Call<String> getConfigFromServer1(String sid) {

        if (baseService == null) {
            baseService = ApiGenerator.getBaseNetServer();
        }
        return baseService.baseGetRequest(getConfigUrl(sid));
    }


}
