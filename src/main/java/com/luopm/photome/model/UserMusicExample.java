package com.luopm.photome.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserMusicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserMusicExample() {
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

        public Criteria andPhotomeUsermusicIdIsNull() {
            addCriterion("photome_usermusic_id is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicIdIsNotNull() {
            addCriterion("photome_usermusic_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicIdEqualTo(Integer value) {
            addCriterion("photome_usermusic_id =", value, "photomeUsermusicId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicIdNotEqualTo(Integer value) {
            addCriterion("photome_usermusic_id <>", value, "photomeUsermusicId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicIdGreaterThan(Integer value) {
            addCriterion("photome_usermusic_id >", value, "photomeUsermusicId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("photome_usermusic_id >=", value, "photomeUsermusicId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicIdLessThan(Integer value) {
            addCriterion("photome_usermusic_id <", value, "photomeUsermusicId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicIdLessThanOrEqualTo(Integer value) {
            addCriterion("photome_usermusic_id <=", value, "photomeUsermusicId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicIdIn(List<Integer> values) {
            addCriterion("photome_usermusic_id in", values, "photomeUsermusicId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicIdNotIn(List<Integer> values) {
            addCriterion("photome_usermusic_id not in", values, "photomeUsermusicId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicIdBetween(Integer value1, Integer value2) {
            addCriterion("photome_usermusic_id between", value1, value2, "photomeUsermusicId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("photome_usermusic_id not between", value1, value2, "photomeUsermusicId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccodeIsNull() {
            addCriterion("photome_usermusic_musiccode is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccodeIsNotNull() {
            addCriterion("photome_usermusic_musiccode is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccodeEqualTo(String value) {
            addCriterion("photome_usermusic_musiccode =", value, "photomeUsermusicMusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccodeNotEqualTo(String value) {
            addCriterion("photome_usermusic_musiccode <>", value, "photomeUsermusicMusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccodeGreaterThan(String value) {
            addCriterion("photome_usermusic_musiccode >", value, "photomeUsermusicMusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccodeGreaterThanOrEqualTo(String value) {
            addCriterion("photome_usermusic_musiccode >=", value, "photomeUsermusicMusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccodeLessThan(String value) {
            addCriterion("photome_usermusic_musiccode <", value, "photomeUsermusicMusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccodeLessThanOrEqualTo(String value) {
            addCriterion("photome_usermusic_musiccode <=", value, "photomeUsermusicMusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccodeLike(String value) {
            addCriterion("photome_usermusic_musiccode like", value, "photomeUsermusicMusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccodeNotLike(String value) {
            addCriterion("photome_usermusic_musiccode not like", value, "photomeUsermusicMusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccodeIn(List<String> values) {
            addCriterion("photome_usermusic_musiccode in", values, "photomeUsermusicMusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccodeNotIn(List<String> values) {
            addCriterion("photome_usermusic_musiccode not in", values, "photomeUsermusicMusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccodeBetween(String value1, String value2) {
            addCriterion("photome_usermusic_musiccode between", value1, value2, "photomeUsermusicMusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccodeNotBetween(String value1, String value2) {
            addCriterion("photome_usermusic_musiccode not between", value1, value2, "photomeUsermusicMusiccode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccreatdateIsNull() {
            addCriterion("photome_usermusic_musiccreatdate is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccreatdateIsNotNull() {
            addCriterion("photome_usermusic_musiccreatdate is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccreatdateEqualTo(Date value) {
            addCriterion("photome_usermusic_musiccreatdate =", value, "photomeUsermusicMusiccreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccreatdateNotEqualTo(Date value) {
            addCriterion("photome_usermusic_musiccreatdate <>", value, "photomeUsermusicMusiccreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccreatdateGreaterThan(Date value) {
            addCriterion("photome_usermusic_musiccreatdate >", value, "photomeUsermusicMusiccreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccreatdateGreaterThanOrEqualTo(Date value) {
            addCriterion("photome_usermusic_musiccreatdate >=", value, "photomeUsermusicMusiccreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccreatdateLessThan(Date value) {
            addCriterion("photome_usermusic_musiccreatdate <", value, "photomeUsermusicMusiccreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccreatdateLessThanOrEqualTo(Date value) {
            addCriterion("photome_usermusic_musiccreatdate <=", value, "photomeUsermusicMusiccreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccreatdateIn(List<Date> values) {
            addCriterion("photome_usermusic_musiccreatdate in", values, "photomeUsermusicMusiccreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccreatdateNotIn(List<Date> values) {
            addCriterion("photome_usermusic_musiccreatdate not in", values, "photomeUsermusicMusiccreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccreatdateBetween(Date value1, Date value2) {
            addCriterion("photome_usermusic_musiccreatdate between", value1, value2, "photomeUsermusicMusiccreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiccreatdateNotBetween(Date value1, Date value2) {
            addCriterion("photome_usermusic_musiccreatdate not between", value1, value2, "photomeUsermusicMusiccreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicnameIsNull() {
            addCriterion("photome_usermusic_musicname is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicnameIsNotNull() {
            addCriterion("photome_usermusic_musicname is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicnameEqualTo(String value) {
            addCriterion("photome_usermusic_musicname =", value, "photomeUsermusicMusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicnameNotEqualTo(String value) {
            addCriterion("photome_usermusic_musicname <>", value, "photomeUsermusicMusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicnameGreaterThan(String value) {
            addCriterion("photome_usermusic_musicname >", value, "photomeUsermusicMusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicnameGreaterThanOrEqualTo(String value) {
            addCriterion("photome_usermusic_musicname >=", value, "photomeUsermusicMusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicnameLessThan(String value) {
            addCriterion("photome_usermusic_musicname <", value, "photomeUsermusicMusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicnameLessThanOrEqualTo(String value) {
            addCriterion("photome_usermusic_musicname <=", value, "photomeUsermusicMusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicnameLike(String value) {
            addCriterion("photome_usermusic_musicname like", value, "photomeUsermusicMusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicnameNotLike(String value) {
            addCriterion("photome_usermusic_musicname not like", value, "photomeUsermusicMusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicnameIn(List<String> values) {
            addCriterion("photome_usermusic_musicname in", values, "photomeUsermusicMusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicnameNotIn(List<String> values) {
            addCriterion("photome_usermusic_musicname not in", values, "photomeUsermusicMusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicnameBetween(String value1, String value2) {
            addCriterion("photome_usermusic_musicname between", value1, value2, "photomeUsermusicMusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicnameNotBetween(String value1, String value2) {
            addCriterion("photome_usermusic_musicname not between", value1, value2, "photomeUsermusicMusicname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsingerIsNull() {
            addCriterion("photome_usermusic_musicsinger is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsingerIsNotNull() {
            addCriterion("photome_usermusic_musicsinger is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsingerEqualTo(String value) {
            addCriterion("photome_usermusic_musicsinger =", value, "photomeUsermusicMusicsinger");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsingerNotEqualTo(String value) {
            addCriterion("photome_usermusic_musicsinger <>", value, "photomeUsermusicMusicsinger");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsingerGreaterThan(String value) {
            addCriterion("photome_usermusic_musicsinger >", value, "photomeUsermusicMusicsinger");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsingerGreaterThanOrEqualTo(String value) {
            addCriterion("photome_usermusic_musicsinger >=", value, "photomeUsermusicMusicsinger");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsingerLessThan(String value) {
            addCriterion("photome_usermusic_musicsinger <", value, "photomeUsermusicMusicsinger");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsingerLessThanOrEqualTo(String value) {
            addCriterion("photome_usermusic_musicsinger <=", value, "photomeUsermusicMusicsinger");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsingerLike(String value) {
            addCriterion("photome_usermusic_musicsinger like", value, "photomeUsermusicMusicsinger");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsingerNotLike(String value) {
            addCriterion("photome_usermusic_musicsinger not like", value, "photomeUsermusicMusicsinger");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsingerIn(List<String> values) {
            addCriterion("photome_usermusic_musicsinger in", values, "photomeUsermusicMusicsinger");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsingerNotIn(List<String> values) {
            addCriterion("photome_usermusic_musicsinger not in", values, "photomeUsermusicMusicsinger");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsingerBetween(String value1, String value2) {
            addCriterion("photome_usermusic_musicsinger between", value1, value2, "photomeUsermusicMusicsinger");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsingerNotBetween(String value1, String value2) {
            addCriterion("photome_usermusic_musicsinger not between", value1, value2, "photomeUsermusicMusicsinger");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicalbumIsNull() {
            addCriterion("photome_usermusic_musicalbum is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicalbumIsNotNull() {
            addCriterion("photome_usermusic_musicalbum is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicalbumEqualTo(String value) {
            addCriterion("photome_usermusic_musicalbum =", value, "photomeUsermusicMusicalbum");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicalbumNotEqualTo(String value) {
            addCriterion("photome_usermusic_musicalbum <>", value, "photomeUsermusicMusicalbum");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicalbumGreaterThan(String value) {
            addCriterion("photome_usermusic_musicalbum >", value, "photomeUsermusicMusicalbum");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicalbumGreaterThanOrEqualTo(String value) {
            addCriterion("photome_usermusic_musicalbum >=", value, "photomeUsermusicMusicalbum");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicalbumLessThan(String value) {
            addCriterion("photome_usermusic_musicalbum <", value, "photomeUsermusicMusicalbum");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicalbumLessThanOrEqualTo(String value) {
            addCriterion("photome_usermusic_musicalbum <=", value, "photomeUsermusicMusicalbum");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicalbumLike(String value) {
            addCriterion("photome_usermusic_musicalbum like", value, "photomeUsermusicMusicalbum");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicalbumNotLike(String value) {
            addCriterion("photome_usermusic_musicalbum not like", value, "photomeUsermusicMusicalbum");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicalbumIn(List<String> values) {
            addCriterion("photome_usermusic_musicalbum in", values, "photomeUsermusicMusicalbum");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicalbumNotIn(List<String> values) {
            addCriterion("photome_usermusic_musicalbum not in", values, "photomeUsermusicMusicalbum");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicalbumBetween(String value1, String value2) {
            addCriterion("photome_usermusic_musicalbum between", value1, value2, "photomeUsermusicMusicalbum");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicalbumNotBetween(String value1, String value2) {
            addCriterion("photome_usermusic_musicalbum not between", value1, value2, "photomeUsermusicMusicalbum");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicdurationIsNull() {
            addCriterion("photome_usermusic_musicduration is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicdurationIsNotNull() {
            addCriterion("photome_usermusic_musicduration is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicdurationEqualTo(Integer value) {
            addCriterion("photome_usermusic_musicduration =", value, "photomeUsermusicMusicduration");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicdurationNotEqualTo(Integer value) {
            addCriterion("photome_usermusic_musicduration <>", value, "photomeUsermusicMusicduration");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicdurationGreaterThan(Integer value) {
            addCriterion("photome_usermusic_musicduration >", value, "photomeUsermusicMusicduration");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicdurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("photome_usermusic_musicduration >=", value, "photomeUsermusicMusicduration");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicdurationLessThan(Integer value) {
            addCriterion("photome_usermusic_musicduration <", value, "photomeUsermusicMusicduration");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicdurationLessThanOrEqualTo(Integer value) {
            addCriterion("photome_usermusic_musicduration <=", value, "photomeUsermusicMusicduration");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicdurationIn(List<Integer> values) {
            addCriterion("photome_usermusic_musicduration in", values, "photomeUsermusicMusicduration");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicdurationNotIn(List<Integer> values) {
            addCriterion("photome_usermusic_musicduration not in", values, "photomeUsermusicMusicduration");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicdurationBetween(Integer value1, Integer value2) {
            addCriterion("photome_usermusic_musicduration between", value1, value2, "photomeUsermusicMusicduration");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicdurationNotBetween(Integer value1, Integer value2) {
            addCriterion("photome_usermusic_musicduration not between", value1, value2, "photomeUsermusicMusicduration");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsizeIsNull() {
            addCriterion("photome_usermusic_musicsize is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsizeIsNotNull() {
            addCriterion("photome_usermusic_musicsize is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsizeEqualTo(Integer value) {
            addCriterion("photome_usermusic_musicsize =", value, "photomeUsermusicMusicsize");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsizeNotEqualTo(Integer value) {
            addCriterion("photome_usermusic_musicsize <>", value, "photomeUsermusicMusicsize");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsizeGreaterThan(Integer value) {
            addCriterion("photome_usermusic_musicsize >", value, "photomeUsermusicMusicsize");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("photome_usermusic_musicsize >=", value, "photomeUsermusicMusicsize");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsizeLessThan(Integer value) {
            addCriterion("photome_usermusic_musicsize <", value, "photomeUsermusicMusicsize");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsizeLessThanOrEqualTo(Integer value) {
            addCriterion("photome_usermusic_musicsize <=", value, "photomeUsermusicMusicsize");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsizeIn(List<Integer> values) {
            addCriterion("photome_usermusic_musicsize in", values, "photomeUsermusicMusicsize");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsizeNotIn(List<Integer> values) {
            addCriterion("photome_usermusic_musicsize not in", values, "photomeUsermusicMusicsize");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsizeBetween(Integer value1, Integer value2) {
            addCriterion("photome_usermusic_musicsize between", value1, value2, "photomeUsermusicMusicsize");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("photome_usermusic_musicsize not between", value1, value2, "photomeUsermusicMusicsize");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicimgIsNull() {
            addCriterion("photome_usermusic_musicimg is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicimgIsNotNull() {
            addCriterion("photome_usermusic_musicimg is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicimgEqualTo(String value) {
            addCriterion("photome_usermusic_musicimg =", value, "photomeUsermusicMusicimg");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicimgNotEqualTo(String value) {
            addCriterion("photome_usermusic_musicimg <>", value, "photomeUsermusicMusicimg");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicimgGreaterThan(String value) {
            addCriterion("photome_usermusic_musicimg >", value, "photomeUsermusicMusicimg");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicimgGreaterThanOrEqualTo(String value) {
            addCriterion("photome_usermusic_musicimg >=", value, "photomeUsermusicMusicimg");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicimgLessThan(String value) {
            addCriterion("photome_usermusic_musicimg <", value, "photomeUsermusicMusicimg");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicimgLessThanOrEqualTo(String value) {
            addCriterion("photome_usermusic_musicimg <=", value, "photomeUsermusicMusicimg");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicimgLike(String value) {
            addCriterion("photome_usermusic_musicimg like", value, "photomeUsermusicMusicimg");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicimgNotLike(String value) {
            addCriterion("photome_usermusic_musicimg not like", value, "photomeUsermusicMusicimg");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicimgIn(List<String> values) {
            addCriterion("photome_usermusic_musicimg in", values, "photomeUsermusicMusicimg");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicimgNotIn(List<String> values) {
            addCriterion("photome_usermusic_musicimg not in", values, "photomeUsermusicMusicimg");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicimgBetween(String value1, String value2) {
            addCriterion("photome_usermusic_musicimg between", value1, value2, "photomeUsermusicMusicimg");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicimgNotBetween(String value1, String value2) {
            addCriterion("photome_usermusic_musicimg not between", value1, value2, "photomeUsermusicMusicimg");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiclrcIsNull() {
            addCriterion("photome_usermusic_musiclrc is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiclrcIsNotNull() {
            addCriterion("photome_usermusic_musiclrc is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiclrcEqualTo(String value) {
            addCriterion("photome_usermusic_musiclrc =", value, "photomeUsermusicMusiclrc");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiclrcNotEqualTo(String value) {
            addCriterion("photome_usermusic_musiclrc <>", value, "photomeUsermusicMusiclrc");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiclrcGreaterThan(String value) {
            addCriterion("photome_usermusic_musiclrc >", value, "photomeUsermusicMusiclrc");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiclrcGreaterThanOrEqualTo(String value) {
            addCriterion("photome_usermusic_musiclrc >=", value, "photomeUsermusicMusiclrc");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiclrcLessThan(String value) {
            addCriterion("photome_usermusic_musiclrc <", value, "photomeUsermusicMusiclrc");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiclrcLessThanOrEqualTo(String value) {
            addCriterion("photome_usermusic_musiclrc <=", value, "photomeUsermusicMusiclrc");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiclrcLike(String value) {
            addCriterion("photome_usermusic_musiclrc like", value, "photomeUsermusicMusiclrc");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiclrcNotLike(String value) {
            addCriterion("photome_usermusic_musiclrc not like", value, "photomeUsermusicMusiclrc");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiclrcIn(List<String> values) {
            addCriterion("photome_usermusic_musiclrc in", values, "photomeUsermusicMusiclrc");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiclrcNotIn(List<String> values) {
            addCriterion("photome_usermusic_musiclrc not in", values, "photomeUsermusicMusiclrc");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiclrcBetween(String value1, String value2) {
            addCriterion("photome_usermusic_musiclrc between", value1, value2, "photomeUsermusicMusiclrc");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusiclrcNotBetween(String value1, String value2) {
            addCriterion("photome_usermusic_musiclrc not between", value1, value2, "photomeUsermusicMusiclrc");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicurlIsNull() {
            addCriterion("photome_usermusic_musicurl is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicurlIsNotNull() {
            addCriterion("photome_usermusic_musicurl is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicurlEqualTo(String value) {
            addCriterion("photome_usermusic_musicurl =", value, "photomeUsermusicMusicurl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicurlNotEqualTo(String value) {
            addCriterion("photome_usermusic_musicurl <>", value, "photomeUsermusicMusicurl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicurlGreaterThan(String value) {
            addCriterion("photome_usermusic_musicurl >", value, "photomeUsermusicMusicurl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicurlGreaterThanOrEqualTo(String value) {
            addCriterion("photome_usermusic_musicurl >=", value, "photomeUsermusicMusicurl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicurlLessThan(String value) {
            addCriterion("photome_usermusic_musicurl <", value, "photomeUsermusicMusicurl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicurlLessThanOrEqualTo(String value) {
            addCriterion("photome_usermusic_musicurl <=", value, "photomeUsermusicMusicurl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicurlLike(String value) {
            addCriterion("photome_usermusic_musicurl like", value, "photomeUsermusicMusicurl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicurlNotLike(String value) {
            addCriterion("photome_usermusic_musicurl not like", value, "photomeUsermusicMusicurl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicurlIn(List<String> values) {
            addCriterion("photome_usermusic_musicurl in", values, "photomeUsermusicMusicurl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicurlNotIn(List<String> values) {
            addCriterion("photome_usermusic_musicurl not in", values, "photomeUsermusicMusicurl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicurlBetween(String value1, String value2) {
            addCriterion("photome_usermusic_musicurl between", value1, value2, "photomeUsermusicMusicurl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsermusicMusicurlNotBetween(String value1, String value2) {
            addCriterion("photome_usermusic_musicurl not between", value1, value2, "photomeUsermusicMusicurl");
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