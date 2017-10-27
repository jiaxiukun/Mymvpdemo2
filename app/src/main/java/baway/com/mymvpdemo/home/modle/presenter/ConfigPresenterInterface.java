package baway.com.mymvpdemo.home.modle.presenter;

/**
 * Created by 贾秀坤 on 2017/7/7.
 */

public interface ConfigPresenterInterface {
    //可操作的业务逻辑 手指头触发的
    void loadData(String sid);

    void detachView();
}
