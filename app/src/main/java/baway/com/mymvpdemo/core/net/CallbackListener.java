package baway.com.mymvpdemo.core.net;

/**
 * Created by 贾秀坤 on 2017/7/6.
 */

public interface CallbackListener<T> {

    public void onNetStart();
    public void onNetSuccess(T t);
    public void onNetFail(T t);

}
