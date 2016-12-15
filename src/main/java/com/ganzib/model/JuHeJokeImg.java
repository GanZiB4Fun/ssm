package com.ganzib.model;

import java.util.List;

/**
 * Created by GanZiB on 16/12/15.
 */
public class JuHeJokeImg {

    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"算了这次就不拿给基 友闻味了","hashId":"F05DC2D31D48A058D548C7E89DD40B37","unixtime":1481774710,"updatetime":"2016-12-15 12:05:10","url":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201612/15/F05DC2D31D48A058D548C7E89DD40B37.gif"}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * content : 算了这次就不拿给基 友闻味了
             * hashId : F05DC2D31D48A058D548C7E89DD40B37
             * unixtime : 1481774710
             * updatetime : 2016-12-15 12:05:10
             * url : http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201612/15/F05DC2D31D48A058D548C7E89DD40B37.gif
             */

            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;
            private String url;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getHashId() {
                return hashId;
            }

            public void setHashId(String hashId) {
                this.hashId = hashId;
            }

            public int getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(int unixtime) {
                this.unixtime = unixtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
