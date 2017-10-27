package baway.com.mymvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import baway.com.mymvpdemo.home.modle.beans.ConfigResponse;
import baway.com.mymvpdemo.home.modle.presenter.ConfigPresenterImpl;
import baway.com.mymvpdemo.home.modle.view.ConfigViewInterface;

public class MainActivity extends AppCompatActivity implements ConfigViewInterface<ConfigResponse> {

    private TextView tvConfigTest;
    private ProgressBar progressBarConfigTest;
    private ConfigPresenterImpl configPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initView() {
        tvConfigTest = (TextView) findViewById(R.id.tv_config_test);
        progressBarConfigTest = (ProgressBar) findViewById(R.id.progressbar_config_test);
    }

    private void initData() {
        //ConfigService.getInstance().getConfig("xy");
        configPresenter = new ConfigPresenterImpl(this);
    }

    public void onClickLoadData(View view) {
        configPresenter.loadData("xy");
    }

    @Override
    public void showOrHideProgress(boolean flag) {
        if (flag && progressBarConfigTest != null) {
            progressBarConfigTest.setVisibility(View.VISIBLE);
        } else {
            if (progressBarConfigTest != null) {
                progressBarConfigTest .setVisibility(View.GONE);
            }
        }
    }

    @Override
    public void showOrHideErrorView(boolean flag) {

    }

    @Override
    public void refreshView(ConfigResponse configResponse) {
        if (tvConfigTest != null && configResponse !=null){
            tvConfigTest.setText(configResponse.androidDes);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        configPresenter.detachView();
    }
}
