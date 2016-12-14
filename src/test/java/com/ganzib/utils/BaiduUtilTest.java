package com.ganzib.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by GanZiB on 16/12/14.
 */
public class BaiduUtilTest {

    @Test
    public void test(){
        String httpUrl = DispatcherCode.MEI_NV_API_URL;
        String httpArg = "num=10";
        String jsonResult = BaiduUtil.request(httpUrl, httpArg);
        System.out.println(jsonResult);
    }

}