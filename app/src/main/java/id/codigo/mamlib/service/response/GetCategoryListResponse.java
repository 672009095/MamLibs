package id.codigo.mamlib.service.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import id.codigo.mamlib.service.base.BaseModel;

public class GetCategoryListResponse extends BaseModel {

    @Expose
    @SerializedName("data")
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {
        @Expose
        @SerializedName("num_items_in_page")
        private String num_items_in_page;
        @Expose
        @SerializedName("total_items")
        private String total_items;
        @Expose
        @SerializedName("category_list")
        private Category_list category_list;
        @Expose
        @SerializedName("request_parameters_list")
        private Request_parameters_list request_parameters_list;
        @Expose
        @SerializedName("page_sz")
        private String page_sz;
        @Expose
        @SerializedName("page_no")
        private String page_no;
        @Expose
        @SerializedName("num_pages")
        private String num_pages;

        public String getNum_items_in_page() {
            return num_items_in_page;
        }

        public void setNum_items_in_page(String num_items_in_page) {
            this.num_items_in_page = num_items_in_page;
        }

        public String getTotal_items() {
            return total_items;
        }

        public void setTotal_items(String total_items) {
            this.total_items = total_items;
        }

        public Category_list getCategory_list() {
            return category_list;
        }

        public void setCategory_list(Category_list category_list) {
            this.category_list = category_list;
        }

        public Request_parameters_list getRequest_parameters_list() {
            return request_parameters_list;
        }

        public void setRequest_parameters_list(Request_parameters_list request_parameters_list) {
            this.request_parameters_list = request_parameters_list;
        }

        public String getPage_sz() {
            return page_sz;
        }

        public void setPage_sz(String page_sz) {
            this.page_sz = page_sz;
        }

        public String getPage_no() {
            return page_no;
        }

        public void setPage_no(String page_no) {
            this.page_no = page_no;
        }

        public String getNum_pages() {
            return num_pages;
        }

        public void setNum_pages(String num_pages) {
            this.num_pages = num_pages;
        }
    }

    public static class Category_list {
        @Expose
        @SerializedName("category")
        private List<Category> category;

        public List<Category> getCategory() {
            return category;
        }

        public void setCategory(List<Category> category) {
            this.category = category;
        }
    }

    public static class Category {
        @Expose
        @SerializedName("category_id")
        private String category_id;
        @Expose
        @SerializedName("category_title")
        private String category_title;

        public String getCategory_id() {
            return category_id;
        }

        public void setCategory_id(String category_id) {
            this.category_id = category_id;
        }

        public String getCategory_title() {
            return category_title;
        }

        public void setCategory_title(String category_title) {
            this.category_title = category_title;
        }
    }

    public static class Request_parameters_list {
        @Expose
        @SerializedName("video_category_id")
        private String video_category_id;

        public String getVideo_category_id() {
            return video_category_id;
        }

        public void setVideo_category_id(String video_category_id) {
            this.video_category_id = video_category_id;
        }
    }
}
