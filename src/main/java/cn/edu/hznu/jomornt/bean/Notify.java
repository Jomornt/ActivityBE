package cn.edu.hznu.jomornt.bean;

public class Notify {
    private Integer id;

    private String createtime;

    private String title;

    private String creator;

    private String content;

    public Notify() {
    }

    public Notify(String createtime, String title, String creator, String content) {
        this.createtime = createtime;
        this.title = title;
        this.creator = creator;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}