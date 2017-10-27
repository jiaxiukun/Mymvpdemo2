package baway.com.mymvpdemo.home.modle.presenter;

import baway.com.mymvpdemo.core.net.CallbackListener;
import baway.com.mymvpdemo.home.modle.HomeService;
import baway.com.mymvpdemo.home.modle.beans.ConfigResponse;
import baway.com.mymvpdemo.home.modle.view.ConfigViewInterface;

/**
 * Created by 贾秀坤 on 2017/7/7.
 */

public class ConfigPresenterImpl implements ConfigPresenterInterface {
    private ConfigViewInterface configview;

    private ConfigPresenterImpl() {

    }

    public ConfigPresenterImpl(ConfigViewInterface configview)     {
        this.configview = configview;
    }

    @Override
    public void loadData(String sid) {

        HomeService.getInstance().getConfig(sid, new CallbackListener<ConfigResponse>() {
            @Override
            public void onNetStart() {

                showOrHiderProgress(true);
            }

            @Override
            public void onNetSuccess(ConfigResponse configResponse) {
                showOrHiderProgress(false);
                if (configview != null) {
                    if (configResponse != null) {
                        configview.refreshView(configResponse);
                    } else {
                        configview.showOrHideErrorView(true);
                    }
                }

            }

            @Override
            public void onNetFail(ConfigResponse o) {

                showOrHiderProgress(false);

            }
        });

    }

    private void showOrHiderProgress(boolean flag) {
        if (configview != null) {
            configview.showOrHideProgress(flag);
        }
    }

    @Override
    public void detachView() {
        if (configview != null) {
            configview = null;
        }

    }
}
