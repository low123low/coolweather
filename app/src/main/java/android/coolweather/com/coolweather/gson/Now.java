package android.coolweather.com.coolweather.gson;

import android.support.v4.view.ViewCompat;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/4/16.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
