package com.luopm.photome.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCommentExample() {
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

        public Criteria andPhotomeUsercommentIdIsNull() {
            addCriterion("photome_usercomment_id is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentIdIsNotNull() {
            addCriterion("photome_usercomment_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentIdEqualTo(Integer value) {
            addCriterion("photome_usercomment_id =", value, "photomeUsercommentId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentIdNotEqualTo(Integer value) {
            addCriterion("photome_usercomment_id <>", value, "photomeUsercommentId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentIdGreaterThan(Integer value) {
            addCriterion("photome_usercomment_id >", value, "photomeUsercommentId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("photome_usercomment_id >=", value, "photomeUsercommentId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentIdLessThan(Integer value) {
            addCriterion("photome_usercomment_id <", value, "photomeUsercommentId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("photome_usercomment_id <=", value, "photomeUsercommentId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentIdIn(List<Integer> values) {
            addCriterion("photome_usercomment_id in", values, "photomeUsercommentId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentIdNotIn(List<Integer> values) {
            addCriterion("photome_usercomment_id not in", values, "photomeUsercommentId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentIdBetween(Integer value1, Integer value2) {
            addCriterion("photome_usercomment_id between", value1, value2, "photomeUsercommentId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("photome_usercomment_id not between", value1, value2, "photomeUsercommentId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcodeIsNull() {
            addCriterion("photome_usercomment_commentcode is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcodeIsNotNull() {
            addCriterion("photome_usercomment_commentcode is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcodeEqualTo(String value) {
            addCriterion("photome_usercomment_commentcode =", value, "photomeUsercommentCommentcode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcodeNotEqualTo(String value) {
            addCriterion("photome_usercomment_commentcode <>", value, "photomeUsercommentCommentcode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcodeGreaterThan(String value) {
            addCriterion("photome_usercomment_commentcode >", value, "photomeUsercommentCommentcode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("photome_usercomment_commentcode >=", value, "photomeUsercommentCommentcode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcodeLessThan(String value) {
            addCriterion("photome_usercomment_commentcode <", value, "photomeUsercommentCommentcode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcodeLessThanOrEqualTo(String value) {
            addCriterion("photome_usercomment_commentcode <=", value, "photomeUsercommentCommentcode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcodeLike(String value) {
            addCriterion("photome_usercomment_commentcode like", value, "photomeUsercommentCommentcode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcodeNotLike(String value) {
            addCriterion("photome_usercomment_commentcode not like", value, "photomeUsercommentCommentcode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcodeIn(List<String> values) {
            addCriterion("photome_usercomment_commentcode in", values, "photomeUsercommentCommentcode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcodeNotIn(List<String> values) {
            addCriterion("photome_usercomment_commentcode not in", values, "photomeUsercommentCommentcode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcodeBetween(String value1, String value2) {
            addCriterion("photome_usercomment_commentcode between", value1, value2, "photomeUsercommentCommentcode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcodeNotBetween(String value1, String value2) {
            addCriterion("photome_usercomment_commentcode not between", value1, value2, "photomeUsercommentCommentcode");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommenteduserIsNull() {
            addCriterion("photome_usercomment_commenteduser is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommenteduserIsNotNull() {
            addCriterion("photome_usercomment_commenteduser is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommenteduserEqualTo(String value) {
            addCriterion("photome_usercomment_commenteduser =", value, "photomeUsercommentCommenteduser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommenteduserNotEqualTo(String value) {
            addCriterion("photome_usercomment_commenteduser <>", value, "photomeUsercommentCommenteduser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommenteduserGreaterThan(String value) {
            addCriterion("photome_usercomment_commenteduser >", value, "photomeUsercommentCommenteduser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommenteduserGreaterThanOrEqualTo(String value) {
            addCriterion("photome_usercomment_commenteduser >=", value, "photomeUsercommentCommenteduser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommenteduserLessThan(String value) {
            addCriterion("photome_usercomment_commenteduser <", value, "photomeUsercommentCommenteduser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommenteduserLessThanOrEqualTo(String value) {
            addCriterion("photome_usercomment_commenteduser <=", value, "photomeUsercommentCommenteduser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommenteduserLike(String value) {
            addCriterion("photome_usercomment_commenteduser like", value, "photomeUsercommentCommenteduser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommenteduserNotLike(String value) {
            addCriterion("photome_usercomment_commenteduser not like", value, "photomeUsercommentCommenteduser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommenteduserIn(List<String> values) {
            addCriterion("photome_usercomment_commenteduser in", values, "photomeUsercommentCommenteduser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommenteduserNotIn(List<String> values) {
            addCriterion("photome_usercomment_commenteduser not in", values, "photomeUsercommentCommenteduser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommenteduserBetween(String value1, String value2) {
            addCriterion("photome_usercomment_commenteduser between", value1, value2, "photomeUsercommentCommenteduser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommenteduserNotBetween(String value1, String value2) {
            addCriterion("photome_usercomment_commenteduser not between", value1, value2, "photomeUsercommentCommenteduser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentuserIsNull() {
            addCriterion("photome_usercomment_commentuser is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentuserIsNotNull() {
            addCriterion("photome_usercomment_commentuser is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentuserEqualTo(String value) {
            addCriterion("photome_usercomment_commentuser =", value, "photomeUsercommentCommentuser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentuserNotEqualTo(String value) {
            addCriterion("photome_usercomment_commentuser <>", value, "photomeUsercommentCommentuser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentuserGreaterThan(String value) {
            addCriterion("photome_usercomment_commentuser >", value, "photomeUsercommentCommentuser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentuserGreaterThanOrEqualTo(String value) {
            addCriterion("photome_usercomment_commentuser >=", value, "photomeUsercommentCommentuser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentuserLessThan(String value) {
            addCriterion("photome_usercomment_commentuser <", value, "photomeUsercommentCommentuser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentuserLessThanOrEqualTo(String value) {
            addCriterion("photome_usercomment_commentuser <=", value, "photomeUsercommentCommentuser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentuserLike(String value) {
            addCriterion("photome_usercomment_commentuser like", value, "photomeUsercommentCommentuser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentuserNotLike(String value) {
            addCriterion("photome_usercomment_commentuser not like", value, "photomeUsercommentCommentuser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentuserIn(List<String> values) {
            addCriterion("photome_usercomment_commentuser in", values, "photomeUsercommentCommentuser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentuserNotIn(List<String> values) {
            addCriterion("photome_usercomment_commentuser not in", values, "photomeUsercommentCommentuser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentuserBetween(String value1, String value2) {
            addCriterion("photome_usercomment_commentuser between", value1, value2, "photomeUsercommentCommentuser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentuserNotBetween(String value1, String value2) {
            addCriterion("photome_usercomment_commentuser not between", value1, value2, "photomeUsercommentCommentuser");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentdateIsNull() {
            addCriterion("photome_usercomment_commentdate is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentdateIsNotNull() {
            addCriterion("photome_usercomment_commentdate is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentdateEqualTo(Date value) {
            addCriterion("photome_usercomment_commentdate =", value, "photomeUsercommentCommentdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentdateNotEqualTo(Date value) {
            addCriterion("photome_usercomment_commentdate <>", value, "photomeUsercommentCommentdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentdateGreaterThan(Date value) {
            addCriterion("photome_usercomment_commentdate >", value, "photomeUsercommentCommentdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentdateGreaterThanOrEqualTo(Date value) {
            addCriterion("photome_usercomment_commentdate >=", value, "photomeUsercommentCommentdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentdateLessThan(Date value) {
            addCriterion("photome_usercomment_commentdate <", value, "photomeUsercommentCommentdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentdateLessThanOrEqualTo(Date value) {
            addCriterion("photome_usercomment_commentdate <=", value, "photomeUsercommentCommentdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentdateIn(List<Date> values) {
            addCriterion("photome_usercomment_commentdate in", values, "photomeUsercommentCommentdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentdateNotIn(List<Date> values) {
            addCriterion("photome_usercomment_commentdate not in", values, "photomeUsercommentCommentdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentdateBetween(Date value1, Date value2) {
            addCriterion("photome_usercomment_commentdate between", value1, value2, "photomeUsercommentCommentdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentdateNotBetween(Date value1, Date value2) {
            addCriterion("photome_usercomment_commentdate not between", value1, value2, "photomeUsercommentCommentdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcontentIsNull() {
            addCriterion("photome_usercomment_commentcontent is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcontentIsNotNull() {
            addCriterion("photome_usercomment_commentcontent is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcontentEqualTo(String value) {
            addCriterion("photome_usercomment_commentcontent =", value, "photomeUsercommentCommentcontent");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcontentNotEqualTo(String value) {
            addCriterion("photome_usercomment_commentcontent <>", value, "photomeUsercommentCommentcontent");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcontentGreaterThan(String value) {
            addCriterion("photome_usercomment_commentcontent >", value, "photomeUsercommentCommentcontent");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcontentGreaterThanOrEqualTo(String value) {
            addCriterion("photome_usercomment_commentcontent >=", value, "photomeUsercommentCommentcontent");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcontentLessThan(String value) {
            addCriterion("photome_usercomment_commentcontent <", value, "photomeUsercommentCommentcontent");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcontentLessThanOrEqualTo(String value) {
            addCriterion("photome_usercomment_commentcontent <=", value, "photomeUsercommentCommentcontent");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcontentLike(String value) {
            addCriterion("photome_usercomment_commentcontent like", value, "photomeUsercommentCommentcontent");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcontentNotLike(String value) {
            addCriterion("photome_usercomment_commentcontent not like", value, "photomeUsercommentCommentcontent");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcontentIn(List<String> values) {
            addCriterion("photome_usercomment_commentcontent in", values, "photomeUsercommentCommentcontent");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcontentNotIn(List<String> values) {
            addCriterion("photome_usercomment_commentcontent not in", values, "photomeUsercommentCommentcontent");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcontentBetween(String value1, String value2) {
            addCriterion("photome_usercomment_commentcontent between", value1, value2, "photomeUsercommentCommentcontent");
            return (Criteria) this;
        }

        public Criteria andPhotomeUsercommentCommentcontentNotBetween(String value1, String value2) {
            addCriterion("photome_usercomment_commentcontent not between", value1, value2, "photomeUsercommentCommentcontent");
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