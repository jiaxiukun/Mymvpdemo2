package baway.com.mymvpdemo.core.net;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by 贾秀坤 on 2017/7/6.
 */

public class ApiGenerator {

    static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://h5test.newaircloud.com/api/")
            .addConverterFactory(ScalarsConverterFactory.create())
            .build();

    public static BaseService getBaseNetServer() {
        return retrofit.create(BaseService.class);


    }
}


