package cn.edu.hznu.jomornt.bean;

public class Activity {
    private String id;

    private String title;

    private String sponsor;

    private String locale;

    private String starttime;

    private String endtime;

    private String content;

    private Integer actLim;

    private String pic;

    private String category;

    private Integer partici;

    private String titlepic;

    private String locdetail;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor == null ? null : sponsor.trim();
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale == null ? null : locale.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getActLim() {
        return actLim;
    }

    public void setActLim(Integer actLim) {
        this.actLim = actLim;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Integer getPartici() {
        return partici;
    }

    public void setPartici(Integer partici) {
        this.partici = partici;
    }

    public String getTitlepic() {
        return titlepic;
    }

    public void setTitlepic(String titlepic) {
        this.titlepic = titlepic == null ? null : titlepic.trim();
    }

    public String getLocdetail() {
        return locdetail;
    }

    public void setLocdetail(String locdetail) {
        this.locdetail = locdetail == null ? null : locdetail.trim();
    }
}