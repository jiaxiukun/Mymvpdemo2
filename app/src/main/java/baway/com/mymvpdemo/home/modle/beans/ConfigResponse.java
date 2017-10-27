package baway.com.mymvpdemo.home.modle.beans;

import java.util.List;

/**
 * Created by 贾秀坤 on 2017/7/7.
 */

public class ConfigResponse {


    /**
     * ucUrl :
     * mallUrl :
     * templateUrl : http://oss.newaircloud.com/zjrb/att/201612/23/7e7e663a-1481-46b0-b189-0ca9882a59ae.zip
     * adv : [{"advID":76,"title":"宝马中国!","type":0,"style":0,"imgUrl":"http://img.newaircloud.com/xy/pic/201605/13/b7fe080a-9921-428e-b64d-ad7d19a8f470.png","contentUrl":"http://www.bmw.com.cn/cn_mobi/zh/index.html","sizeScale":0,"startTime":"2016-05-10 00:00:00","endTime":"2027-07-20 23:59:59","pageTime":3}]
     * configUrl : http://oss.newaircloud.com/global/user/xy/mobile/config
     * androidVer : 2.0.8
     * androidDes : 增加扫一扫功能

     * androidUrl : http://newaircloud.oss-cn-hangzhou.aliyuncs.com/global/user/xy/mobile/config/newaircloudV2.0.8.apk
     * iOSVer : 1.0.0
     * iOSDes : 1/修复bug；
     2/调整UI；
     * iOSUrl : http://itunes.apple.com/cn/app/id375380948?mt=8
     * appName :
     * forceUpdate : 0
     * webUrl : http://h5.newaircloud.com
     * activityUrl : http://ac.newaircloud.com
     * founderBDAppID :
     * founderBDUrl :
     */

    public String ucUrl;
    public String mallUrl;
    public String templateUrl;
    public String configUrl;
    public String androidVer;
    public String androidDes;
    public String androidUrl;
    public String iOSVer;
    public String iOSDes;
    public String iOSUrl;
    public String appName;
    public int forceUpdate;
    public String webUrl;
    public String activityUrl;
    public String founderBDAppID;
    public String founderBDUrl;
    public List<AdvBean> adv;

    public static ConfigResponse objectFromData(String str) {

        return new com.google.gson.Gson().fromJson(str, ConfigResponse.class);
    }

    public static class AdvBean {
        /**
         * advID : 76
         * title : 宝马中国!
         * type : 0
         * style : 0
         * imgUrl : http://img.newaircloud.com/xy/pic/201605/13/b7fe080a-9921-428e-b64d-ad7d19a8f470.png
         * contentUrl : http://www.bmw.com.cn/cn_mobi/zh/index.html
         * sizeScale : 0
         * startTime : 2016-05-10 00:00:00
         * endTime : 2027-07-20 23:59:59
         * pageTime : 3
         */

        public int advID;
        public String title;
        public int type;
        public int style;
        public String imgUrl;
        public String contentUrl;
        public int sizeScale;
        public String startTime;
        public String endTime;
        public int pageTime;

        public static AdvBean objectFromData(String str) {

            return new com.google.gson.Gson().fromJson(str, AdvBean.class);
        }
    }
}
