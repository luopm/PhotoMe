package com.luopm.photome.model;

import java.util.ArrayList;
import java.util.List;

public class UserDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDetailExample() {
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

        public Criteria andPhotomeUserdetailIdIsNull() {
            addCriterion("photome_userdetail_id is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdIsNotNull() {
            addCriterion("photome_userdetail_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdEqualTo(Integer value) {
            addCriterion("photome_userdetail_id =", value, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdNotEqualTo(Integer value) {
            addCriterion("photome_userdetail_id <>", value, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdGreaterThan(Integer value) {
            addCriterion("photome_userdetail_id >", value, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("photome_userdetail_id >=", value, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdLessThan(Integer value) {
            addCriterion("photome_userdetail_id <", value, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("photome_userdetail_id <=", value, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdIn(List<Integer> values) {
            addCriterion("photome_userdetail_id in", values, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdNotIn(List<Integer> values) {
            addCriterion("photome_userdetail_id not in", values, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdBetween(Integer value1, Integer value2) {
            addCriterion("photome_userdetail_id between", value1, value2, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("photome_userdetail_id not between", value1, value2, "photomeUserdetailId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameIsNull() {
            addCriterion("photome_userdetail_username is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameIsNotNull() {
            addCriterion("photome_userdetail_username is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameEqualTo(String value) {
            addCriterion("photome_userdetail_username =", value, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameNotEqualTo(String value) {
            addCriterion("photome_userdetail_username <>", value, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameGreaterThan(String value) {
            addCriterion("photome_userdetail_username >", value, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_username >=", value, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameLessThan(String value) {
            addCriterion("photome_userdetail_username <", value, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameLessThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_username <=", value, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameLike(String value) {
            addCriterion("photome_userdetail_username like", value, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameNotLike(String value) {
            addCriterion("photome_userdetail_username not like", value, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameIn(List<String> values) {
            addCriterion("photome_userdetail_username in", values, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameNotIn(List<String> values) {
            addCriterion("photome_userdetail_username not in", values, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameBetween(String value1, String value2) {
            addCriterion("photome_userdetail_username between", value1, value2, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsernameNotBetween(String value1, String value2) {
            addCriterion("photome_userdetail_username not between", value1, value2, "photomeUserdetailUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercoverIsNull() {
            addCriterion("photome_userdetail_usercover is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercoverIsNotNull() {
            addCriterion("photome_userdetail_usercover is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercoverEqualTo(String value) {
            addCriterion("photome_userdetail_usercover =", value, "photomeUserdetailUsercover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercoverNotEqualTo(String value) {
            addCriterion("photome_userdetail_usercover <>", value, "photomeUserdetailUsercover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercoverGreaterThan(String value) {
            addCriterion("photome_userdetail_usercover >", value, "photomeUserdetailUsercover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercoverGreaterThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_usercover >=", value, "photomeUserdetailUsercover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercoverLessThan(String value) {
            addCriterion("photome_userdetail_usercover <", value, "photomeUserdetailUsercover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercoverLessThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_usercover <=", value, "photomeUserdetailUsercover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercoverLike(String value) {
            addCriterion("photome_userdetail_usercover like", value, "photomeUserdetailUsercover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercoverNotLike(String value) {
            addCriterion("photome_userdetail_usercover not like", value, "photomeUserdetailUsercover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercoverIn(List<String> values) {
            addCriterion("photome_userdetail_usercover in", values, "photomeUserdetailUsercover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercoverNotIn(List<String> values) {
            addCriterion("photome_userdetail_usercover not in", values, "photomeUserdetailUsercover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercoverBetween(String value1, String value2) {
            addCriterion("photome_userdetail_usercover between", value1, value2, "photomeUserdetailUsercover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercoverNotBetween(String value1, String value2) {
            addCriterion("photome_userdetail_usercover not between", value1, value2, "photomeUserdetailUsercover");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionIsNull() {
            addCriterion("photome_userdetail_userintroduction is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionIsNotNull() {
            addCriterion("photome_userdetail_userintroduction is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionEqualTo(String value) {
            addCriterion("photome_userdetail_userintroduction =", value, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionNotEqualTo(String value) {
            addCriterion("photome_userdetail_userintroduction <>", value, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionGreaterThan(String value) {
            addCriterion("photome_userdetail_userintroduction >", value, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_userintroduction >=", value, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionLessThan(String value) {
            addCriterion("photome_userdetail_userintroduction <", value, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionLessThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_userintroduction <=", value, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionLike(String value) {
            addCriterion("photome_userdetail_userintroduction like", value, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionNotLike(String value) {
            addCriterion("photome_userdetail_userintroduction not like", value, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionIn(List<String> values) {
            addCriterion("photome_userdetail_userintroduction in", values, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionNotIn(List<String> values) {
            addCriterion("photome_userdetail_userintroduction not in", values, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionBetween(String value1, String value2) {
            addCriterion("photome_userdetail_userintroduction between", value1, value2, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUserintroductionNotBetween(String value1, String value2) {
            addCriterion("photome_userdetail_userintroduction not between", value1, value2, "photomeUserdetailUserintroduction");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercommentIsNull() {
            addCriterion("photome_userdetail_usercomment is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercommentIsNotNull() {
            addCriterion("photome_userdetail_usercomment is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercommentEqualTo(String value) {
            addCriterion("photome_userdetail_usercomment =", value, "photomeUserdetailUsercomment");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercommentNotEqualTo(String value) {
            addCriterion("photome_userdetail_usercomment <>", value, "photomeUserdetailUsercomment");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercommentGreaterThan(String value) {
            addCriterion("photome_userdetail_usercomment >", value, "photomeUserdetailUsercomment");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercommentGreaterThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_usercomment >=", value, "photomeUserdetailUsercomment");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercommentLessThan(String value) {
            addCriterion("photome_userdetail_usercomment <", value, "photomeUserdetailUsercomment");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercommentLessThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_usercomment <=", value, "photomeUserdetailUsercomment");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercommentLike(String value) {
            addCriterion("photome_userdetail_usercomment like", value, "photomeUserdetailUsercomment");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercommentNotLike(String value) {
            addCriterion("photome_userdetail_usercomment not like", value, "photomeUserdetailUsercomment");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercommentIn(List<String> values) {
            addCriterion("photome_userdetail_usercomment in", values, "photomeUserdetailUsercomment");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercommentNotIn(List<String> values) {
            addCriterion("photome_userdetail_usercomment not in", values, "photomeUserdetailUsercomment");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercommentBetween(String value1, String value2) {
            addCriterion("photome_userdetail_usercomment between", value1, value2, "photomeUserdetailUsercomment");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsercommentNotBetween(String value1, String value2) {
            addCriterion("photome_userdetail_usercomment not between", value1, value2, "photomeUserdetailUsercomment");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicIsNull() {
            addCriterion("photome_userdetail_usermusic is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicIsNotNull() {
            addCriterion("photome_userdetail_usermusic is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicEqualTo(String value) {
            addCriterion("photome_userdetail_usermusic =", value, "photomeUserdetailUsermusic");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicNotEqualTo(String value) {
            addCriterion("photome_userdetail_usermusic <>", value, "photomeUserdetailUsermusic");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicGreaterThan(String value) {
            addCriterion("photome_userdetail_usermusic >", value, "photomeUserdetailUsermusic");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicGreaterThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_usermusic >=", value, "photomeUserdetailUsermusic");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicLessThan(String value) {
            addCriterion("photome_userdetail_usermusic <", value, "photomeUserdetailUsermusic");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicLessThanOrEqualTo(String value) {
            addCriterion("photome_userdetail_usermusic <=", value, "photomeUserdetailUsermusic");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicLike(String value) {
            addCriterion("photome_userdetail_usermusic like", value, "photomeUserdetailUsermusic");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicNotLike(String value) {
            addCriterion("photome_userdetail_usermusic not like", value, "photomeUserdetailUsermusic");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicIn(List<String> values) {
            addCriterion("photome_userdetail_usermusic in", values, "photomeUserdetailUsermusic");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicNotIn(List<String> values) {
            addCriterion("photome_userdetail_usermusic not in", values, "photomeUserdetailUsermusic");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicBetween(String value1, String value2) {
            addCriterion("photome_userdetail_usermusic between", value1, value2, "photomeUserdetailUsermusic");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserdetailUsermusicNotBetween(String value1, String value2) {
            addCriterion("photome_userdetail_usermusic not between", value1, value2, "photomeUserdetailUsermusic");
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