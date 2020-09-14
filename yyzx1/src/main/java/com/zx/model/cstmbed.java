package com.zx.model;

import java.util.Date;

public class cstmbed {
    private int customer_id;
    private String content_id;
    private Date nursing_time;
    private String nursing_content;
    private String nursing_count;
    private String staffinfo_id;
    private String nursing_id;
    private int is_deleted;

    public cstmbed() {
    }

    public cstmbed(int customer_id, String content_id, Date nursing_time, String nursing_content, String nursing_count, String staffinfo_id, String nursing_id, int is_deleted) {
        this.customer_id = customer_id;
        this.content_id = content_id;
        this.nursing_time = nursing_time;
        this.nursing_content = nursing_content;
        this.nursing_count = nursing_count;
        this.staffinfo_id = staffinfo_id;
        this.nursing_id = nursing_id;
        this.is_deleted = is_deleted;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getContent_id() {
        return content_id;
    }

    public void setContent_id(String content_id) {
        this.content_id = content_id;
    }

    public Date getNursing_time() {
        return nursing_time;
    }

    public void setNursing_time(Date nursing_time) {
        this.nursing_time = nursing_time;
    }

    public String getNursing_content() {
        return nursing_content;
    }

    public void setNursing_content(String nursing_content) {
        this.nursing_content = nursing_content;
    }

    public String getNursing_count() {
        return nursing_count;
    }

    public void setNursing_count(String nursing_count) {
        this.nursing_count = nursing_count;
    }

    public String getStaffinfo_id() {
        return staffinfo_id;
    }

    public void setStaffinfo_id(String staffinfo_id) {
        this.staffinfo_id = staffinfo_id;
    }

    public String getNursing_id() {
        return nursing_id;
    }

    public void setNursing_id(String nursing_id) {
        this.nursing_id = nursing_id;
    }

    public int getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(int is_deleted) {
        this.is_deleted = is_deleted;
    }


    @Override
    public String toString() {
        return "cstmbed{" +
                "customer_id=" + customer_id +
                ", content_id='" + content_id + '\'' +
                ", nursing_time=" + nursing_time +
                ", nursing_content='" + nursing_content + '\'' +
                ", nursing_count='" + nursing_count + '\'' +
                ", staffinfo_id='" + staffinfo_id + '\'' +
                ", nursing_id='" + nursing_id + '\'' +
                ", is_deleted=" + is_deleted +
                '}';
    }
}
