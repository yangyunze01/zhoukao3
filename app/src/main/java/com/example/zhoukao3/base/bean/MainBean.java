package com.example.zhoukao3.base.bean;

import java.util.List;

/**
 * Created by 杨运泽 on 2018/6/25.
 */

public class MainBean {

    private List<JsonBean> json;
    private List<LikeBean> like;

    public List<JsonBean> getJson() {
        return json;
    }

    public void setJson(List<JsonBean> json) {
        this.json = json;
    }

    public List<LikeBean> getLike() {
        return like;
    }

    public void setLike(List<LikeBean> like) {
        this.like = like;
    }

    public static class JsonBean {
        /**
         * id : 0
         * image : http://p6563v2ck.bkt.clouddn.com/t1.jpg
         * name : DC FIRST INFANTRY M TEES 短袖T恤
         * price : 299.00
         * agio : 400.00
         * amount : 10
         * chart : http://p6563v2ck.bkt.clouddn.com/t1.jpg
         * swiper : [{"img":"http://p6563v2ck.bkt.clouddn.com/t1.jpg"},{"img":"http://p6563v2ck.bkt.clouddn.com/t1.jpg"}]
         */

        private int id;
        private String image;
        private String name;
        private String price;
        private String agio;
        private String amount;
        private String chart;
        private List<SwiperBean> swiper;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getAgio() {
            return agio;
        }

        public void setAgio(String agio) {
            this.agio = agio;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getChart() {
            return chart;
        }

        public void setChart(String chart) {
            this.chart = chart;
        }

        public List<SwiperBean> getSwiper() {
            return swiper;
        }

        public void setSwiper(List<SwiperBean> swiper) {
            this.swiper = swiper;
        }

        public static class SwiperBean {
            /**
             * img : http://p6563v2ck.bkt.clouddn.com/t1.jpg
             */

            private String img;

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }
        }
    }

    public static class LikeBean {
        /**
         * id : 5
         * image : http://p6563v2ck.bkt.clouddn.com/c1.jpg
         * name : corade 藏青格纹冲锋衣
         * price : 138.00
         * amount : 10
         * chart : http://p6563v2ck.bkt.clouddn.com/c1.jpg
         * swiper : [{"img":"http://p6563v2ck.bkt.clouddn.com/c1.jpg"},{"img":"http://p6563v2ck.bkt.clouddn.com/c1.jpg"}]
         */

        private int id;
        private String image;
        private String name;
        private String price;
        private String amount;
        private String chart;
        private List<SwiperBeanX> swiper;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getChart() {
            return chart;
        }

        public void setChart(String chart) {
            this.chart = chart;
        }

        public List<SwiperBeanX> getSwiper() {
            return swiper;
        }

        public void setSwiper(List<SwiperBeanX> swiper) {
            this.swiper = swiper;
        }

        public static class SwiperBeanX {
            /**
             * img : http://p6563v2ck.bkt.clouddn.com/c1.jpg
             */

            private String img;

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }
        }
    }
}
