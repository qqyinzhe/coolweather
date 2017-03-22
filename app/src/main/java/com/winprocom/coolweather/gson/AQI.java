package com.winprocom.coolweather.gson;

/**
 * Created by liuzq on 2017/3/22.
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
