package id.codigo.mamlib.service.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetProgramListResponse {

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
        @SerializedName("program_list")
        private Program_list program_list;
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

        public Program_list getProgram_list() {
            return program_list;
        }

        public void setProgram_list(Program_list program_list) {
            this.program_list = program_list;
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

    public static class Program_list {
        @Expose
        @SerializedName("program")
        private List<Program> program;

        public List<Program> getProgram() {
            return program;
        }

        public void setProgram(List<Program> program) {
            this.program = program;
        }
    }

    public static class Program {
        @Expose
        @SerializedName("cr_address")
        private String cr_address;
        @Expose
        @SerializedName("category_ids")
        private String category_ids;
        @Expose
        @SerializedName("language")
        private String language;
        @Expose
        @SerializedName("program_id")
        private String program_id;
        @Expose
        @SerializedName("def_rule_access")
        private String def_rule_access;
        @Expose
        @SerializedName("ads_instream")
        private String ads_instream;
        @Expose
        @SerializedName("com_ratings")
        private String com_ratings;
        @Expose
        @SerializedName("com_responses")
        private String com_responses;
        @Expose
        @SerializedName("source_id")
        private String source_id;
        @Expose
        @SerializedName("deleted")
        private String deleted;
        @Expose
        @SerializedName("category_names")
        private Category_names category_names;
        @Expose
        @SerializedName("crew_members")
        private String crew_members;
        @Expose
        @SerializedName("cr_phone")
        private String cr_phone;
        @Expose
        @SerializedName("ads_adsense")
        private String ads_adsense;
        @Expose
        @SerializedName("subratings")
        private Subratings subratings;
        @Expose
        @SerializedName("ads_has_postroll")
        private String ads_has_postroll;
        @Expose
        @SerializedName("com_comments")
        private String com_comments;
        @Expose
        @SerializedName("cr_owner")
        private String cr_owner;
        @Expose
        @SerializedName("ads_has_preroll")
        private String ads_has_preroll;
        @Expose
        @SerializedName("com_embedding")
        private String com_embedding;
        @Expose
        @SerializedName("folder_id")
        private String folder_id;
        @Expose
        @SerializedName("custom_fields")
        private Custom_fields custom_fields;
        @Expose
        @SerializedName("cr_year")
        private String cr_year;
        @Expose
        @SerializedName("def_cdn_id")
        private String def_cdn_id;
        @Expose
        @SerializedName("tags")
        private String tags;
        @Expose
        @SerializedName("description")
        private String description;
        @Expose
        @SerializedName("program_title")
        private String program_title;
        @Expose
        @SerializedName("cr_email")
        private String cr_email;
        @Expose
        @SerializedName("rule_ids")
        private Rule_ids rule_ids;
        @Expose
        @SerializedName("rating")
        private String rating;
        @Expose
        @SerializedName("def_profile_set_id")
        private String def_profile_set_id;
        @Expose
        @SerializedName("ts_added")
        private String ts_added;
        @Expose
        @SerializedName("ads_invideo")
        private String ads_invideo;
        @Expose
        @SerializedName("auto_cdn_push")
        private String auto_cdn_push;

        public String getCr_address() {
            return cr_address;
        }

        public void setCr_address(String cr_address) {
            this.cr_address = cr_address;
        }

        public String getCategory_ids() {
            return category_ids;
        }

        public void setCategory_ids(String category_ids) {
            this.category_ids = category_ids;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getProgram_id() {
            return program_id;
        }

        public void setProgram_id(String program_id) {
            this.program_id = program_id;
        }

        public String getDef_rule_access() {
            return def_rule_access;
        }

        public void setDef_rule_access(String def_rule_access) {
            this.def_rule_access = def_rule_access;
        }

        public String getAds_instream() {
            return ads_instream;
        }

        public void setAds_instream(String ads_instream) {
            this.ads_instream = ads_instream;
        }

        public String getCom_ratings() {
            return com_ratings;
        }

        public void setCom_ratings(String com_ratings) {
            this.com_ratings = com_ratings;
        }

        public String getCom_responses() {
            return com_responses;
        }

        public void setCom_responses(String com_responses) {
            this.com_responses = com_responses;
        }

        public String getSource_id() {
            return source_id;
        }

        public void setSource_id(String source_id) {
            this.source_id = source_id;
        }

        public String getDeleted() {
            return deleted;
        }

        public void setDeleted(String deleted) {
            this.deleted = deleted;
        }

        public Category_names getCategory_names() {
            return category_names;
        }

        public void setCategory_names(Category_names category_names) {
            this.category_names = category_names;
        }

        public String getCrew_members() {
            return crew_members;
        }

        public void setCrew_members(String crew_members) {
            this.crew_members = crew_members;
        }

        public String getCr_phone() {
            return cr_phone;
        }

        public void setCr_phone(String cr_phone) {
            this.cr_phone = cr_phone;
        }

        public String getAds_adsense() {
            return ads_adsense;
        }

        public void setAds_adsense(String ads_adsense) {
            this.ads_adsense = ads_adsense;
        }

        public Subratings getSubratings() {
            return subratings;
        }

        public void setSubratings(Subratings subratings) {
            this.subratings = subratings;
        }

        public String getAds_has_postroll() {
            return ads_has_postroll;
        }

        public void setAds_has_postroll(String ads_has_postroll) {
            this.ads_has_postroll = ads_has_postroll;
        }

        public String getCom_comments() {
            return com_comments;
        }

        public void setCom_comments(String com_comments) {
            this.com_comments = com_comments;
        }

        public String getCr_owner() {
            return cr_owner;
        }

        public void setCr_owner(String cr_owner) {
            this.cr_owner = cr_owner;
        }

        public String getAds_has_preroll() {
            return ads_has_preroll;
        }

        public void setAds_has_preroll(String ads_has_preroll) {
            this.ads_has_preroll = ads_has_preroll;
        }

        public String getCom_embedding() {
            return com_embedding;
        }

        public void setCom_embedding(String com_embedding) {
            this.com_embedding = com_embedding;
        }

        public String getFolder_id() {
            return folder_id;
        }

        public void setFolder_id(String folder_id) {
            this.folder_id = folder_id;
        }

        public Custom_fields getCustom_fields() {
            return custom_fields;
        }

        public void setCustom_fields(Custom_fields custom_fields) {
            this.custom_fields = custom_fields;
        }

        public String getCr_year() {
            return cr_year;
        }

        public void setCr_year(String cr_year) {
            this.cr_year = cr_year;
        }

        public String getDef_cdn_id() {
            return def_cdn_id;
        }

        public void setDef_cdn_id(String def_cdn_id) {
            this.def_cdn_id = def_cdn_id;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getProgram_title() {
            return program_title;
        }

        public void setProgram_title(String program_title) {
            this.program_title = program_title;
        }

        public String getCr_email() {
            return cr_email;
        }

        public void setCr_email(String cr_email) {
            this.cr_email = cr_email;
        }

        public Rule_ids getRule_ids() {
            return rule_ids;
        }

        public void setRule_ids(Rule_ids rule_ids) {
            this.rule_ids = rule_ids;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getDef_profile_set_id() {
            return def_profile_set_id;
        }

        public void setDef_profile_set_id(String def_profile_set_id) {
            this.def_profile_set_id = def_profile_set_id;
        }

        public String getTs_added() {
            return ts_added;
        }

        public void setTs_added(String ts_added) {
            this.ts_added = ts_added;
        }

        public String getAds_invideo() {
            return ads_invideo;
        }

        public void setAds_invideo(String ads_invideo) {
            this.ads_invideo = ads_invideo;
        }

        public String getAuto_cdn_push() {
            return auto_cdn_push;
        }

        public void setAuto_cdn_push(String auto_cdn_push) {
            this.auto_cdn_push = auto_cdn_push;
        }
    }

    public static class Category_names {
        @Expose
        @SerializedName("category_name")
        private String category_name;

        public String getCategory_name() {
            return category_name;
        }

        public void setCategory_name(String category_name) {
            this.category_name = category_name;
        }
    }

    public static class Subratings {
        @Expose
        @SerializedName("subrating")
        private String subrating;

        public String getSubrating() {
            return subrating;
        }

        public void setSubrating(String subrating) {
            this.subrating = subrating;
        }
    }

    public static class Custom_fields {
        @Expose
        @SerializedName("field")
        private Field field;

        public Field getField() {
            return field;
        }

        public void setField(Field field) {
            this.field = field;
        }
    }

    public static class Field {
        @Expose
        @SerializedName("value")
        private String value;
        @Expose
        @SerializedName("name")
        private String name;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Rule_ids {
        @Expose
        @SerializedName("rule_id")
        private String rule_id;

        public String getRule_id() {
            return rule_id;
        }

        public void setRule_id(String rule_id) {
            this.rule_id = rule_id;
        }
    }

    public static class Request_parameters_list {
        @Expose
        @SerializedName("external_id")
        private String external_id;
        @Expose
        @SerializedName("program_id")
        private String program_id;

        public String getExternal_id() {
            return external_id;
        }

        public void setExternal_id(String external_id) {
            this.external_id = external_id;
        }

        public String getProgram_id() {
            return program_id;
        }

        public void setProgram_id(String program_id) {
            this.program_id = program_id;
        }
    }
}
