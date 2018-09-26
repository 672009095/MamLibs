package id.codigo.mamlib.service.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import id.codigo.mamlib.service.base.BaseModel;

public class SearchTagResponse extends BaseModel {

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
        @SerializedName("defaults")
        private Defaults defaults;
        @Expose
        @SerializedName("docs")
        private List<Docs> docs;
        @Expose
        @SerializedName("start")
        private int start;
        @Expose
        @SerializedName("numFound")
        private int numFound;

        public Defaults getDefaults() {
            return defaults;
        }

        public void setDefaults(Defaults defaults) {
            this.defaults = defaults;
        }

        public List<Docs> getDocs() {
            return docs;
        }

        public void setDocs(List<Docs> docs) {
            this.docs = docs;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getNumFound() {
            return numFound;
        }

        public void setNumFound(int numFound) {
            this.numFound = numFound;
        }
    }

    public static class Defaults {
        @Expose
        @SerializedName("timezone")
        private String timezone;

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }
    }

    public static class Docs {
        @Expose
        @SerializedName("thumbnails")
        private List<Thumbnails> thumbnails;
        @Expose
        @SerializedName("info")
        private Info info;
        @Expose
        @SerializedName("c_description_s")
        private String c_description_s;
        @Expose
        @SerializedName("c_title_s")
        private String c_title_s;
        @Expose
        @SerializedName("obj_id")
        private String obj_id;
        @Expose
        @SerializedName("obj_type")
        private String obj_type;
        @Expose
        @SerializedName("obj_realm")
        private String obj_realm;

        public List<Thumbnails> getThumbnails() {
            return thumbnails;
        }

        public void setThumbnails(List<Thumbnails> thumbnails) {
            this.thumbnails = thumbnails;
        }

        public Info getInfo() {
            return info;
        }

        public void setInfo(Info info) {
            this.info = info;
        }

        public String getC_description_s() {
            return c_description_s;
        }

        public void setC_description_s(String c_description_s) {
            this.c_description_s = c_description_s;
        }

        public String getC_title_s() {
            return c_title_s;
        }

        public void setC_title_s(String c_title_s) {
            this.c_title_s = c_title_s;
        }

        public String getObj_id() {
            return obj_id;
        }

        public void setObj_id(String obj_id) {
            this.obj_id = obj_id;
        }

        public String getObj_type() {
            return obj_type;
        }

        public void setObj_type(String obj_type) {
            this.obj_type = obj_type;
        }

        public String getObj_realm() {
            return obj_realm;
        }

        public void setObj_realm(String obj_realm) {
            this.obj_realm = obj_realm;
        }
    }

    public static class Thumbnails {
        @Expose
        @SerializedName("height")
        private int height;
        @Expose
        @SerializedName("width")
        private int width;
        @Expose
        @SerializedName("role")
        private String role;
        @Expose
        @SerializedName("url")
        private String url;
        @Expose
        @SerializedName("type")
        private String type;

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class Info {
        @Expose
        @SerializedName("categories")
        private List<Categories> categories;
        @Expose
        @SerializedName("program_name")
        private String program_name;
        @Expose
        @SerializedName("duration")
        private String duration;

        public List<Categories> getCategories() {
            return categories;
        }

        public void setCategories(List<Categories> categories) {
            this.categories = categories;
        }

        public String getProgram_name() {
            return program_name;
        }

        public void setProgram_name(String program_name) {
            this.program_name = program_name;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }
    }

    public static class Categories {
        @Expose
        @SerializedName("name")
        private String name;
        @Expose
        @SerializedName("id")
        private String id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
