package com.ganzib.model;

import java.util.List;

/**
 * 百度脑筋急转弯接口生成类
 * Created by GanZiB on 16/12/14.
 */
public class Joke {

    /**
     * code : 200
     * msg : success
     * newslist : [{"id":"1135","quest":"什么最会弄虚做假？","result":"魔术师 "}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * id : 1135
         * quest : 什么最会弄虚做假？
         * result : 魔术师
         */

        private String id;
        private String quest;
        private String result;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getQuest() {
            return quest;
        }

        public void setQuest(String quest) {
            this.quest = quest;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }
    }
}
