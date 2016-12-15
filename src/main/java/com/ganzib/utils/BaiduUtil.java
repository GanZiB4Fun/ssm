package com.ganzib.utils;

import com.alibaba.fastjson.JSONObject;
import com.ganzib.model.BaiDuJoke;
import com.ganzib.model.BaiDuMeiNv;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by GanZiB on 16/12/14.
 */
public class BaiduUtil {

    /**
     * 获取脑筋急转弯
     * @return
     */
   public static BaiDuJoke resultJoke(){
       String httpUrl = DispatcherCode.NAO_WAN_API_URL;
       String httpArg = "";
       String jsonResult = request(httpUrl, httpArg);
       BaiDuJoke baiDuJoke = (BaiDuJoke) JSONObject.parseObject(jsonResult,BaiDuJoke.class);
       return baiDuJoke;
   }

    /**
     * 获取百度美女图片
     * @return
     */
   public static BaiDuMeiNv resultMeiNv(){
       String httpUrl = DispatcherCode.MEI_NV_API_URL;
       String httpArg = "num=9";
       String jsonResult = request(httpUrl,httpArg);
       BaiDuMeiNv baiDuMeiNv = (BaiDuMeiNv)JSONObject.parseObject(jsonResult,BaiDuMeiNv.class);
       return baiDuMeiNv;
   }



    /**
     * @param httpUrl
     *            :请求接口
     * @param httpArg
     *            :参数
     * @return 返回结果
     */
    public static String request(String httpUrl, String httpArg) {
        BufferedReader reader = null;
        String result = null;
        StringBuffer sbf = new StringBuffer();
        httpUrl = httpUrl + "?" + httpArg;

        try {
            URL url = new URL(httpUrl);
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setRequestMethod("GET");
            // 填入apikey到HTTP header
            connection.setRequestProperty("apikey",  DispatcherCode.API_KEY);
            connection.connect();
            InputStream is = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sbf.append(strRead);
                sbf.append("\r\n");
            }
            reader.close();
            result = sbf.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
