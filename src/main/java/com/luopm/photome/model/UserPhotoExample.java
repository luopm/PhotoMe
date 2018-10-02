package com.luopm.photome.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPhotoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPhotoExample() {
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

        public Criteria andPhotomeUserphotoIdIsNull() {
            addCriterion("photome_userphoto_id is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoIdIsNotNull() {
            addCriterion("photome_userphoto_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoIdEqualTo(Integer value) {
            addCriterion("photome_userphoto_id =", value, "photomeUserphotoId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoIdNotEqualTo(Integer value) {
            addCriterion("photome_userphoto_id <>", value, "photomeUserphotoId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoIdGreaterThan(Integer value) {
            addCriterion("photome_userphoto_id >", value, "photomeUserphotoId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("photome_userphoto_id >=", value, "photomeUserphotoId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoIdLessThan(Integer value) {
            addCriterion("photome_userphoto_id <", value, "photomeUserphotoId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoIdLessThanOrEqualTo(Integer value) {
            addCriterion("photome_userphoto_id <=", value, "photomeUserphotoId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoIdIn(List<Integer> values) {
            addCriterion("photome_userphoto_id in", values, "photomeUserphotoId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoIdNotIn(List<Integer> values) {
            addCriterion("photome_userphoto_id not in", values, "photomeUserphotoId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoIdBetween(Integer value1, Integer value2) {
            addCriterion("photome_userphoto_id between", value1, value2, "photomeUserphotoId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("photome_userphoto_id not between", value1, value2, "photomeUserphotoId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocodeIsNull() {
            addCriterion("photome_userphoto_photocode is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocodeIsNotNull() {
            addCriterion("photome_userphoto_photocode is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocodeEqualTo(String value) {
            addCriterion("photome_userphoto_photocode =", value, "photomeUserphotoPhotocode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocodeNotEqualTo(String value) {
            addCriterion("photome_userphoto_photocode <>", value, "photomeUserphotoPhotocode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocodeGreaterThan(String value) {
            addCriterion("photome_userphoto_photocode >", value, "photomeUserphotoPhotocode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocodeGreaterThanOrEqualTo(String value) {
            addCriterion("photome_userphoto_photocode >=", value, "photomeUserphotoPhotocode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocodeLessThan(String value) {
            addCriterion("photome_userphoto_photocode <", value, "photomeUserphotoPhotocode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocodeLessThanOrEqualTo(String value) {
            addCriterion("photome_userphoto_photocode <=", value, "photomeUserphotoPhotocode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocodeLike(String value) {
            addCriterion("photome_userphoto_photocode like", value, "photomeUserphotoPhotocode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocodeNotLike(String value) {
            addCriterion("photome_userphoto_photocode not like", value, "photomeUserphotoPhotocode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocodeIn(List<String> values) {
            addCriterion("photome_userphoto_photocode in", values, "photomeUserphotoPhotocode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocodeNotIn(List<String> values) {
            addCriterion("photome_userphoto_photocode not in", values, "photomeUserphotoPhotocode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocodeBetween(String value1, String value2) {
            addCriterion("photome_userphoto_photocode between", value1, value2, "photomeUserphotoPhotocode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocodeNotBetween(String value1, String value2) {
            addCriterion("photome_userphoto_photocode not between", value1, value2, "photomeUserphotoPhotocode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotonameIsNull() {
            addCriterion("photome_userphoto_photoname is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotonameIsNotNull() {
            addCriterion("photome_userphoto_photoname is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotonameEqualTo(String value) {
            addCriterion("photome_userphoto_photoname =", value, "photomeUserphotoPhotoname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotonameNotEqualTo(String value) {
            addCriterion("photome_userphoto_photoname <>", value, "photomeUserphotoPhotoname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotonameGreaterThan(String value) {
            addCriterion("photome_userphoto_photoname >", value, "photomeUserphotoPhotoname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotonameGreaterThanOrEqualTo(String value) {
            addCriterion("photome_userphoto_photoname >=", value, "photomeUserphotoPhotoname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotonameLessThan(String value) {
            addCriterion("photome_userphoto_photoname <", value, "photomeUserphotoPhotoname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotonameLessThanOrEqualTo(String value) {
            addCriterion("photome_userphoto_photoname <=", value, "photomeUserphotoPhotoname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotonameLike(String value) {
            addCriterion("photome_userphoto_photoname like", value, "photomeUserphotoPhotoname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotonameNotLike(String value) {
            addCriterion("photome_userphoto_photoname not like", value, "photomeUserphotoPhotoname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotonameIn(List<String> values) {
            addCriterion("photome_userphoto_photoname in", values, "photomeUserphotoPhotoname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotonameNotIn(List<String> values) {
            addCriterion("photome_userphoto_photoname not in", values, "photomeUserphotoPhotoname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotonameBetween(String value1, String value2) {
            addCriterion("photome_userphoto_photoname between", value1, value2, "photomeUserphotoPhotoname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotonameNotBetween(String value1, String value2) {
            addCriterion("photome_userphoto_photoname not between", value1, value2, "photomeUserphotoPhotoname");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotourlIsNull() {
            addCriterion("photome_userphoto_photourl is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotourlIsNotNull() {
            addCriterion("photome_userphoto_photourl is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotourlEqualTo(String value) {
            addCriterion("photome_userphoto_photourl =", value, "photomeUserphotoPhotourl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotourlNotEqualTo(String value) {
            addCriterion("photome_userphoto_photourl <>", value, "photomeUserphotoPhotourl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotourlGreaterThan(String value) {
            addCriterion("photome_userphoto_photourl >", value, "photomeUserphotoPhotourl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotourlGreaterThanOrEqualTo(String value) {
            addCriterion("photome_userphoto_photourl >=", value, "photomeUserphotoPhotourl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotourlLessThan(String value) {
            addCriterion("photome_userphoto_photourl <", value, "photomeUserphotoPhotourl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotourlLessThanOrEqualTo(String value) {
            addCriterion("photome_userphoto_photourl <=", value, "photomeUserphotoPhotourl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotourlLike(String value) {
            addCriterion("photome_userphoto_photourl like", value, "photomeUserphotoPhotourl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotourlNotLike(String value) {
            addCriterion("photome_userphoto_photourl not like", value, "photomeUserphotoPhotourl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotourlIn(List<String> values) {
            addCriterion("photome_userphoto_photourl in", values, "photomeUserphotoPhotourl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotourlNotIn(List<String> values) {
            addCriterion("photome_userphoto_photourl not in", values, "photomeUserphotoPhotourl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotourlBetween(String value1, String value2) {
            addCriterion("photome_userphoto_photourl between", value1, value2, "photomeUserphotoPhotourl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotourlNotBetween(String value1, String value2) {
            addCriterion("photome_userphoto_photourl not between", value1, value2, "photomeUserphotoPhotourl");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotoiscoverIsNull() {
            addCriterion("photome_userphoto_photoiscover is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotoiscoverIsNotNull() {
            addCriterion("photome_userphoto_photoiscover is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotoiscoverEqualTo(String value) {
            addCriterion("photome_userphoto_photoiscover =", value, "photomeUserphotoPhotoiscover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotoiscoverNotEqualTo(String value) {
            addCriterion("photome_userphoto_photoiscover <>", value, "photomeUserphotoPhotoiscover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotoiscoverGreaterThan(String value) {
            addCriterion("photome_userphoto_photoiscover >", value, "photomeUserphotoPhotoiscover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotoiscoverGreaterThanOrEqualTo(String value) {
            addCriterion("photome_userphoto_photoiscover >=", value, "photomeUserphotoPhotoiscover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotoiscoverLessThan(String value) {
            addCriterion("photome_userphoto_photoiscover <", value, "photomeUserphotoPhotoiscover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotoiscoverLessThanOrEqualTo(String value) {
            addCriterion("photome_userphoto_photoiscover <=", value, "photomeUserphotoPhotoiscover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotoiscoverLike(String value) {
            addCriterion("photome_userphoto_photoiscover like", value, "photomeUserphotoPhotoiscover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotoiscoverNotLike(String value) {
            addCriterion("photome_userphoto_photoiscover not like", value, "photomeUserphotoPhotoiscover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotoiscoverIn(List<String> values) {
            addCriterion("photome_userphoto_photoiscover in", values, "photomeUserphotoPhotoiscover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotoiscoverNotIn(List<String> values) {
            addCriterion("photome_userphoto_photoiscover not in", values, "photomeUserphotoPhotoiscover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotoiscoverBetween(String value1, String value2) {
            addCriterion("photome_userphoto_photoiscover between", value1, value2, "photomeUserphotoPhotoiscover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotoiscoverNotBetween(String value1, String value2) {
            addCriterion("photome_userphoto_photoiscover not between", value1, value2, "photomeUserphotoPhotoiscover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotointroductionIsNull() {
            addCriterion("photome_userphoto_photointroduction is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotointroductionIsNotNull() {
            addCriterion("photome_userphoto_photointroduction is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotointroductionEqualTo(String value) {
            addCriterion("photome_userphoto_photointroduction =", value, "photomeUserphotoPhotointroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotointroductionNotEqualTo(String value) {
            addCriterion("photome_userphoto_photointroduction <>", value, "photomeUserphotoPhotointroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotointroductionGreaterThan(String value) {
            addCriterion("photome_userphoto_photointroduction >", value, "photomeUserphotoPhotointroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotointroductionGreaterThanOrEqualTo(String value) {
            addCriterion("photome_userphoto_photointroduction >=", value, "photomeUserphotoPhotointroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotointroductionLessThan(String value) {
            addCriterion("photome_userphoto_photointroduction <", value, "photomeUserphotoPhotointroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotointroductionLessThanOrEqualTo(String value) {
            addCriterion("photome_userphoto_photointroduction <=", value, "photomeUserphotoPhotointroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotointroductionLike(String value) {
            addCriterion("photome_userphoto_photointroduction like", value, "photomeUserphotoPhotointroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotointroductionNotLike(String value) {
            addCriterion("photome_userphoto_photointroduction not like", value, "photomeUserphotoPhotointroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotointroductionIn(List<String> values) {
            addCriterion("photome_userphoto_photointroduction in", values, "photomeUserphotoPhotointroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotointroductionNotIn(List<String> values) {
            addCriterion("photome_userphoto_photointroduction not in", values, "photomeUserphotoPhotointroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotointroductionBetween(String value1, String value2) {
            addCriterion("photome_userphoto_photointroduction between", value1, value2, "photomeUserphotoPhotointroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotointroductionNotBetween(String value1, String value2) {
            addCriterion("photome_userphoto_photointroduction not between", value1, value2, "photomeUserphotoPhotointroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocreatdateIsNull() {
            addCriterion("photome_userphoto_photocreatdate is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocreatdateIsNotNull() {
            addCriterion("photome_userphoto_photocreatdate is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocreatdateEqualTo(Date value) {
            addCriterion("photome_userphoto_photocreatdate =", value, "photomeUserphotoPhotocreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocreatdateNotEqualTo(Date value) {
            addCriterion("photome_userphoto_photocreatdate <>", value, "photomeUserphotoPhotocreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocreatdateGreaterThan(Date value) {
            addCriterion("photome_userphoto_photocreatdate >", value, "photomeUserphotoPhotocreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocreatdateGreaterThanOrEqualTo(Date value) {
            addCriterion("photome_userphoto_photocreatdate >=", value, "photomeUserphotoPhotocreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocreatdateLessThan(Date value) {
            addCriterion("photome_userphoto_photocreatdate <", value, "photomeUserphotoPhotocreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocreatdateLessThanOrEqualTo(Date value) {
            addCriterion("photome_userphoto_photocreatdate <=", value, "photomeUserphotoPhotocreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocreatdateIn(List<Date> values) {
            addCriterion("photome_userphoto_photocreatdate in", values, "photomeUserphotoPhotocreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocreatdateNotIn(List<Date> values) {
            addCriterion("photome_userphoto_photocreatdate not in", values, "photomeUserphotoPhotocreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocreatdateBetween(Date value1, Date value2) {
            addCriterion("photome_userphoto_photocreatdate between", value1, value2, "photomeUserphotoPhotocreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotocreatdateNotBetween(Date value1, Date value2) {
            addCriterion("photome_userphoto_photocreatdate not between", value1, value2, "photomeUserphotoPhotocreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotomodifydateIsNull() {
            addCriterion("photome_userphoto_photomodifydate is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotomodifydateIsNotNull() {
            addCriterion("photome_userphoto_photomodifydate is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotomodifydateEqualTo(Date value) {
            addCriterion("photome_userphoto_photomodifydate =", value, "photomeUserphotoPhotomodifydate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotomodifydateNotEqualTo(Date value) {
            addCriterion("photome_userphoto_photomodifydate <>", value, "photomeUserphotoPhotomodifydate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotomodifydateGreaterThan(Date value) {
            addCriterion("photome_userphoto_photomodifydate >", value, "photomeUserphotoPhotomodifydate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotomodifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("photome_userphoto_photomodifydate >=", value, "photomeUserphotoPhotomodifydate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotomodifydateLessThan(Date value) {
            addCriterion("photome_userphoto_photomodifydate <", value, "photomeUserphotoPhotomodifydate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotomodifydateLessThanOrEqualTo(Date value) {
            addCriterion("photome_userphoto_photomodifydate <=", value, "photomeUserphotoPhotomodifydate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotomodifydateIn(List<Date> values) {
            addCriterion("photome_userphoto_photomodifydate in", values, "photomeUserphotoPhotomodifydate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotomodifydateNotIn(List<Date> values) {
            addCriterion("photome_userphoto_photomodifydate not in", values, "photomeUserphotoPhotomodifydate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotomodifydateBetween(Date value1, Date value2) {
            addCriterion("photome_userphoto_photomodifydate between", value1, value2, "photomeUserphotoPhotomodifydate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserphotoPhotomodifydateNotBetween(Date value1, Date value2) {
            addCriterion("photome_userphoto_photomodifydate not between", value1, value2, "photomeUserphotoPhotomodifydate");
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