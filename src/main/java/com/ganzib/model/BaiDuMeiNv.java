package com.ganzib.model;

import java.util.List;

/**
 * Created by GanZiB on 16/12/14.
 */
public class BaiDuMeiNv {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2016-03-06 14:11","title":"[TGOD推女神] 泳池美人虞 75F乳神于姬Una私房泳装","description":"美女图片","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2015/04/m.xxxiao.com_3e6ffd8abf2d3fbd1040b02edb6bcb66-760x500.jpg","url":"http://m.xxxiao.com/370"},{"ctime":"2016-03-06 14:11","title":"乳神张优红装演绎古代美女魅惑人心写真","description":"美女图片","picUrl":"http://t1.27270.com/uploads/150725/8-150H5101Q1N6.jpg","url":"http://www.27270.com/ent/meinvtupian/2015/50954.html"},{"ctime":"2016-03-06 14:11","title":"火辣红妆爆乳车模张雅琦魅惑壁纸","description":"美女图片","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2015/04/m.xxxiao.com_a8d2ec85eaf98407310b72eb73dda2474-760x500.jpg","url":"http://m.xxxiao.com/419"},{"ctime":"2016-03-06 14:11","title":"巨乳杉原杏璃 Anri Sugihara 写真集 Gravure Idols &#038; Misty B","description":"美女图片","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2015/06/m.xxxiao.com_b4524af8c20484f4638795ea1515db29-760x500.jpg","url":"http://m.xxxiao.com/1588"},{"ctime":"2016-03-06 14:11","title":"大胸美女佘贝拉白毛巾遮体诱惑私房照","description":"美女图片","picUrl":"http://t1.27270.com/uploads/tu/201507/417/slt.jpg","url":"http://www.27270.com/ent/meinvtupian/2015/123122.html"},{"ctime":"2016-03-06 14:11","title":"穿花瓣式内衣的性感美女妖娆写真图片","description":"THE美女","picUrl":"http://img1.wyss.net.cn/uploadfiles/cover/2015/08/16/20150816141038453.jpg","url":"http://www.the6688.com/sexmv/1661.html"},{"ctime":"2016-03-06 14:11","title":"性感美女制服诱惑极品爆乳小蛮腰图片","description":"THE美女","picUrl":"http://img1.wyss.net.cn/uploadfiles/cover/2015/08/19/20150819113554906.jpg","url":"http://www.the6688.com/sexmv/1670.html"},{"ctime":"2016-03-06 14:11","title":"性感女郎孟狐狸私房大胆写真照","description":"美女图片","picUrl":"http://t1.27270.com/uploads/tu/201508/0047/slt.jpg","url":"http://www.27270.com/ent/meinvtupian/2015/131462.html"},{"ctime":"2016-03-06 14:11","title":"美胸嫩模诗朵雅私房高清写真照","description":"美女图片","picUrl":"http://t1.27270.com/uploads/tu/201508/0045/slt.jpg","url":"http://www.27270.com/ent/meinvtupian/2015/131460.html"},{"ctime":"2016-03-06 14:11","title":"尤果美女王轶玲私房性感写真照","description":"美女图片","picUrl":"http://t1.27270.com/uploads/tu/201508/0040/slt.jpg","url":"http://www.27270.com/ent/meinvtupian/2015/131455.html"}]
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
         * ctime : 2016-03-06 14:11
         * title : [TGOD推女神] 泳池美人虞 75F乳神于姬Una私房泳装
         * description : 美女图片
         * picUrl : http://m.xxxiao.com/wp-content/uploads/sites/3/2015/04/m.xxxiao.com_3e6ffd8abf2d3fbd1040b02edb6bcb66-760x500.jpg
         * url : http://m.xxxiao.com/370
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
