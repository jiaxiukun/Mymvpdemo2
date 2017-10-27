package baway.com.mymvpdemo.home.modle.view;

/**
 * Created by 贾秀坤 on 2017/7/7.
 */

public interface ConfigViewInterface<T> {
    //所有视图变化
   /*
    void showProgress();

    void hideProgress();
    void showErrorView();
    void hideErrorView();
    void refreshView();
    */

    void showOrHideProgress(boolean flag);

    void showOrHideErrorView(boolean flag);

    void refreshView(T t);

}
