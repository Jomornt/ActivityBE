package cn.edu.hznu.jomornt.bean;

import java.util.ArrayList;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSponsorIsNull() {
            addCriterion("sponsor is null");
            return (Criteria) this;
        }

        public Criteria andSponsorIsNotNull() {
            addCriterion("sponsor is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorEqualTo(String value) {
            addCriterion("sponsor =", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotEqualTo(String value) {
            addCriterion("sponsor <>", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorGreaterThan(String value) {
            addCriterion("sponsor >", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorGreaterThanOrEqualTo(String value) {
            addCriterion("sponsor >=", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLessThan(String value) {
            addCriterion("sponsor <", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLessThanOrEqualTo(String value) {
            addCriterion("sponsor <=", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorLike(String value) {
            addCriterion("sponsor like", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotLike(String value) {
            addCriterion("sponsor not like", value, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorIn(List<String> values) {
            addCriterion("sponsor in", values, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotIn(List<String> values) {
            addCriterion("sponsor not in", values, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorBetween(String value1, String value2) {
            addCriterion("sponsor between", value1, value2, "sponsor");
            return (Criteria) this;
        }

        public Criteria andSponsorNotBetween(String value1, String value2) {
            addCriterion("sponsor not between", value1, value2, "sponsor");
            return (Criteria) this;
        }

        public Criteria andLocaleIsNull() {
            addCriterion("locale is null");
            return (Criteria) this;
        }

        public Criteria andLocaleIsNotNull() {
            addCriterion("locale is not null");
            return (Criteria) this;
        }

        public Criteria andLocaleEqualTo(String value) {
            addCriterion("locale =", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotEqualTo(String value) {
            addCriterion("locale <>", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleGreaterThan(String value) {
            addCriterion("locale >", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleGreaterThanOrEqualTo(String value) {
            addCriterion("locale >=", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLessThan(String value) {
            addCriterion("locale <", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLessThanOrEqualTo(String value) {
            addCriterion("locale <=", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLike(String value) {
            addCriterion("locale like", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotLike(String value) {
            addCriterion("locale not like", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleIn(List<String> values) {
            addCriterion("locale in", values, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotIn(List<String> values) {
            addCriterion("locale not in", values, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleBetween(String value1, String value2) {
            addCriterion("locale between", value1, value2, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotBetween(String value1, String value2) {
            addCriterion("locale not between", value1, value2, "locale");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("startTime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("startTime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("endTime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("endTime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andActLimIsNull() {
            addCriterion("act_lim is null");
            return (Criteria) this;
        }

        public Criteria andActLimIsNotNull() {
            addCriterion("act_lim is not null");
            return (Criteria) this;
        }

        public Criteria andActLimEqualTo(Integer value) {
            addCriterion("act_lim =", value, "actLim");
            return (Criteria) this;
        }

        public Criteria andActLimNotEqualTo(Integer value) {
            addCriterion("act_lim <>", value, "actLim");
            return (Criteria) this;
        }

        public Criteria andActLimGreaterThan(Integer value) {
            addCriterion("act_lim >", value, "actLim");
            return (Criteria) this;
        }

        public Criteria andActLimGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_lim >=", value, "actLim");
            return (Criteria) this;
        }

        public Criteria andActLimLessThan(Integer value) {
            addCriterion("act_lim <", value, "actLim");
            return (Criteria) this;
        }

        public Criteria andActLimLessThanOrEqualTo(Integer value) {
            addCriterion("act_lim <=", value, "actLim");
            return (Criteria) this;
        }

        public Criteria andActLimIn(List<Integer> values) {
            addCriterion("act_lim in", values, "actLim");
            return (Criteria) this;
        }

        public Criteria andActLimNotIn(List<Integer> values) {
            addCriterion("act_lim not in", values, "actLim");
            return (Criteria) this;
        }

        public Criteria andActLimBetween(Integer value1, Integer value2) {
            addCriterion("act_lim between", value1, value2, "actLim");
            return (Criteria) this;
        }

        public Criteria andActLimNotBetween(Integer value1, Integer value2) {
            addCriterion("act_lim not between", value1, value2, "actLim");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andParticiIsNull() {
            addCriterion("partici is null");
            return (Criteria) this;
        }

        public Criteria andParticiIsNotNull() {
            addCriterion("partici is not null");
            return (Criteria) this;
        }

        public Criteria andParticiEqualTo(Integer value) {
            addCriterion("partici =", value, "partici");
            return (Criteria) this;
        }

        public Criteria andParticiNotEqualTo(Integer value) {
            addCriterion("partici <>", value, "partici");
            return (Criteria) this;
        }

        public Criteria andParticiGreaterThan(Integer value) {
            addCriterion("partici >", value, "partici");
            return (Criteria) this;
        }

        public Criteria andParticiGreaterThanOrEqualTo(Integer value) {
            addCriterion("partici >=", value, "partici");
            return (Criteria) this;
        }

        public Criteria andParticiLessThan(Integer value) {
            addCriterion("partici <", value, "partici");
            return (Criteria) this;
        }

        public Criteria andParticiLessThanOrEqualTo(Integer value) {
            addCriterion("partici <=", value, "partici");
            return (Criteria) this;
        }

        public Criteria andParticiIn(List<Integer> values) {
            addCriterion("partici in", values, "partici");
            return (Criteria) this;
        }

        public Criteria andParticiNotIn(List<Integer> values) {
            addCriterion("partici not in", values, "partici");
            return (Criteria) this;
        }

        public Criteria andParticiBetween(Integer value1, Integer value2) {
            addCriterion("partici between", value1, value2, "partici");
            return (Criteria) this;
        }

        public Criteria andParticiNotBetween(Integer value1, Integer value2) {
            addCriterion("partici not between", value1, value2, "partici");
            return (Criteria) this;
        }

        public Criteria andTitlepicIsNull() {
            addCriterion("titlePic is null");
            return (Criteria) this;
        }

        public Criteria andTitlepicIsNotNull() {
            addCriterion("titlePic is not null");
            return (Criteria) this;
        }

        public Criteria andTitlepicEqualTo(String value) {
            addCriterion("titlePic =", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicNotEqualTo(String value) {
            addCriterion("titlePic <>", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicGreaterThan(String value) {
            addCriterion("titlePic >", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicGreaterThanOrEqualTo(String value) {
            addCriterion("titlePic >=", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicLessThan(String value) {
            addCriterion("titlePic <", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicLessThanOrEqualTo(String value) {
            addCriterion("titlePic <=", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicLike(String value) {
            addCriterion("titlePic like", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicNotLike(String value) {
            addCriterion("titlePic not like", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicIn(List<String> values) {
            addCriterion("titlePic in", values, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicNotIn(List<String> values) {
            addCriterion("titlePic not in", values, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicBetween(String value1, String value2) {
            addCriterion("titlePic between", value1, value2, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicNotBetween(String value1, String value2) {
            addCriterion("titlePic not between", value1, value2, "titlepic");
            return (Criteria) this;
        }

        public Criteria andLocdetailIsNull() {
            addCriterion("locDetail is null");
            return (Criteria) this;
        }

        public Criteria andLocdetailIsNotNull() {
            addCriterion("locDetail is not null");
            return (Criteria) this;
        }

        public Criteria andLocdetailEqualTo(String value) {
            addCriterion("locDetail =", value, "locdetail");
            return (Criteria) this;
        }

        public Criteria andLocdetailNotEqualTo(String value) {
            addCriterion("locDetail <>", value, "locdetail");
            return (Criteria) this;
        }

        public Criteria andLocdetailGreaterThan(String value) {
            addCriterion("locDetail >", value, "locdetail");
            return (Criteria) this;
        }

        public Criteria andLocdetailGreaterThanOrEqualTo(String value) {
            addCriterion("locDetail >=", value, "locdetail");
            return (Criteria) this;
        }

        public Criteria andLocdetailLessThan(String value) {
            addCriterion("locDetail <", value, "locdetail");
            return (Criteria) this;
        }

        public Criteria andLocdetailLessThanOrEqualTo(String value) {
            addCriterion("locDetail <=", value, "locdetail");
            return (Criteria) this;
        }

        public Criteria andLocdetailLike(String value) {
            addCriterion("locDetail like", value, "locdetail");
            return (Criteria) this;
        }

        public Criteria andLocdetailNotLike(String value) {
            addCriterion("locDetail not like", value, "locdetail");
            return (Criteria) this;
        }

        public Criteria andLocdetailIn(List<String> values) {
            addCriterion("locDetail in", values, "locdetail");
            return (Criteria) this;
        }

        public Criteria andLocdetailNotIn(List<String> values) {
            addCriterion("locDetail not in", values, "locdetail");
            return (Criteria) this;
        }

        public Criteria andLocdetailBetween(String value1, String value2) {
            addCriterion("locDetail between", value1, value2, "locdetail");
            return (Criteria) this;
        }

        public Criteria andLocdetailNotBetween(String value1, String value2) {
            addCriterion("locDetail not between", value1, value2, "locdetail");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}