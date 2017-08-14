package com.ganzib.controller;

import com.ganzib.utils.SearchServlet;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GanZiB on 17/1/3.
 */
@Controller
public class SearchController{

    @RequestMapping(value = "/search")
    protected void doGet(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
        requset.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //首先获得客户端发送的数据
        String keyword = requset.getParameter("keyword");
        //获得关键字之后的处理
        List<String> listData = getData(keyword);
        //返回json格式数据
        response.getWriter().write(JSONArray.fromObject(listData).toString());
    }

    /**
     * 关联数据的方法
     * @param keyword
     * @return
     */
    public static List<String> getData(String keyword){
        List<String> datas = new ArrayList<String>();

        //模拟数据
        datas.add("ajax");
        datas.add("ajax post");
        datas.add("ajax get");
        datas.add("ajax 把妹");
        datas.add("ajax spring");
        datas.add("ajax servlet");
        List<String> list = new ArrayList<String>();
        for (String data : datas){
            if(data.contains(keyword)){
                list.add(data);
            }
        }
        return list;
    }
}
