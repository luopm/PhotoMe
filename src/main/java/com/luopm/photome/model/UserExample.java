package com.luopm.photome.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andPhotomeUserIdIsNull() {
            addCriterion("photome_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserIdIsNotNull() {
            addCriterion("photome_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserIdEqualTo(Integer value) {
            addCriterion("photome_user_id =", value, "photomeUserId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserIdNotEqualTo(Integer value) {
            addCriterion("photome_user_id <>", value, "photomeUserId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserIdGreaterThan(Integer value) {
            addCriterion("photome_user_id >", value, "photomeUserId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("photome_user_id >=", value, "photomeUserId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserIdLessThan(Integer value) {
            addCriterion("photome_user_id <", value, "photomeUserId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("photome_user_id <=", value, "photomeUserId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserIdIn(List<Integer> values) {
            addCriterion("photome_user_id in", values, "photomeUserId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserIdNotIn(List<Integer> values) {
            addCriterion("photome_user_id not in", values, "photomeUserId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserIdBetween(Integer value1, Integer value2) {
            addCriterion("photome_user_id between", value1, value2, "photomeUserId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("photome_user_id not between", value1, value2, "photomeUserId");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsernameIsNull() {
            addCriterion("photome_user_username is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsernameIsNotNull() {
            addCriterion("photome_user_username is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsernameEqualTo(String value) {
            addCriterion("photome_user_username =", value, "photomeUserUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsernameNotEqualTo(String value) {
            addCriterion("photome_user_username <>", value, "photomeUserUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsernameGreaterThan(String value) {
            addCriterion("photome_user_username >", value, "photomeUserUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("photome_user_username >=", value, "photomeUserUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsernameLessThan(String value) {
            addCriterion("photome_user_username <", value, "photomeUserUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsernameLessThanOrEqualTo(String value) {
            addCriterion("photome_user_username <=", value, "photomeUserUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsernameLike(String value) {
            addCriterion("photome_user_username like", value, "photomeUserUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsernameNotLike(String value) {
            addCriterion("photome_user_username not like", value, "photomeUserUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsernameIn(List<String> values) {
            addCriterion("photome_user_username in", values, "photomeUserUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsernameNotIn(List<String> values) {
            addCriterion("photome_user_username not in", values, "photomeUserUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsernameBetween(String value1, String value2) {
            addCriterion("photome_user_username between", value1, value2, "photomeUserUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsernameNotBetween(String value1, String value2) {
            addCriterion("photome_user_username not between", value1, value2, "photomeUserUsername");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserpasswordIsNull() {
            addCriterion("photome_user_userpassword is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserpasswordIsNotNull() {
            addCriterion("photome_user_userpassword is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserpasswordEqualTo(String value) {
            addCriterion("photome_user_userpassword =", value, "photomeUserUserpassword");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserpasswordNotEqualTo(String value) {
            addCriterion("photome_user_userpassword <>", value, "photomeUserUserpassword");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserpasswordGreaterThan(String value) {
            addCriterion("photome_user_userpassword >", value, "photomeUserUserpassword");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("photome_user_userpassword >=", value, "photomeUserUserpassword");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserpasswordLessThan(String value) {
            addCriterion("photome_user_userpassword <", value, "photomeUserUserpassword");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("photome_user_userpassword <=", value, "photomeUserUserpassword");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserpasswordLike(String value) {
            addCriterion("photome_user_userpassword like", value, "photomeUserUserpassword");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserpasswordNotLike(String value) {
            addCriterion("photome_user_userpassword not like", value, "photomeUserUserpassword");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserpasswordIn(List<String> values) {
            addCriterion("photome_user_userpassword in", values, "photomeUserUserpassword");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserpasswordNotIn(List<String> values) {
            addCriterion("photome_user_userpassword not in", values, "photomeUserUserpassword");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserpasswordBetween(String value1, String value2) {
            addCriterion("photome_user_userpassword between", value1, value2, "photomeUserUserpassword");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserpasswordNotBetween(String value1, String value2) {
            addCriterion("photome_user_userpassword not between", value1, value2, "photomeUserUserpassword");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserphoneIsNull() {
            addCriterion("photome_user_userphone is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserphoneIsNotNull() {
            addCriterion("photome_user_userphone is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserphoneEqualTo(String value) {
            addCriterion("photome_user_userphone =", value, "photomeUserUserphone");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserphoneNotEqualTo(String value) {
            addCriterion("photome_user_userphone <>", value, "photomeUserUserphone");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserphoneGreaterThan(String value) {
            addCriterion("photome_user_userphone >", value, "photomeUserUserphone");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("photome_user_userphone >=", value, "photomeUserUserphone");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserphoneLessThan(String value) {
            addCriterion("photome_user_userphone <", value, "photomeUserUserphone");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserphoneLessThanOrEqualTo(String value) {
            addCriterion("photome_user_userphone <=", value, "photomeUserUserphone");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserphoneLike(String value) {
            addCriterion("photome_user_userphone like", value, "photomeUserUserphone");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserphoneNotLike(String value) {
            addCriterion("photome_user_userphone not like", value, "photomeUserUserphone");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserphoneIn(List<String> values) {
            addCriterion("photome_user_userphone in", values, "photomeUserUserphone");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserphoneNotIn(List<String> values) {
            addCriterion("photome_user_userphone not in", values, "photomeUserUserphone");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserphoneBetween(String value1, String value2) {
            addCriterion("photome_user_userphone between", value1, value2, "photomeUserUserphone");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserphoneNotBetween(String value1, String value2) {
            addCriterion("photome_user_userphone not between", value1, value2, "photomeUserUserphone");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsermailIsNull() {
            addCriterion("photome_user_usermail is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsermailIsNotNull() {
            addCriterion("photome_user_usermail is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsermailEqualTo(String value) {
            addCriterion("photome_user_usermail =", value, "photomeUserUsermail");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsermailNotEqualTo(String value) {
            addCriterion("photome_user_usermail <>", value, "photomeUserUsermail");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsermailGreaterThan(String value) {
            addCriterion("photome_user_usermail >", value, "photomeUserUsermail");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsermailGreaterThanOrEqualTo(String value) {
            addCriterion("photome_user_usermail >=", value, "photomeUserUsermail");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsermailLessThan(String value) {
            addCriterion("photome_user_usermail <", value, "photomeUserUsermail");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsermailLessThanOrEqualTo(String value) {
            addCriterion("photome_user_usermail <=", value, "photomeUserUsermail");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsermailLike(String value) {
            addCriterion("photome_user_usermail like", value, "photomeUserUsermail");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsermailNotLike(String value) {
            addCriterion("photome_user_usermail not like", value, "photomeUserUsermail");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsermailIn(List<String> values) {
            addCriterion("photome_user_usermail in", values, "photomeUserUsermail");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsermailNotIn(List<String> values) {
            addCriterion("photome_user_usermail not in", values, "photomeUserUsermail");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsermailBetween(String value1, String value2) {
            addCriterion("photome_user_usermail between", value1, value2, "photomeUserUsermail");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsermailNotBetween(String value1, String value2) {
            addCriterion("photome_user_usermail not between", value1, value2, "photomeUserUsermail");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserismasterIsNull() {
            addCriterion("photome_user_userismaster is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserismasterIsNotNull() {
            addCriterion("photome_user_userismaster is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserismasterEqualTo(String value) {
            addCriterion("photome_user_userismaster =", value, "photomeUserUserismaster");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserismasterNotEqualTo(String value) {
            addCriterion("photome_user_userismaster <>", value, "photomeUserUserismaster");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserismasterGreaterThan(String value) {
            addCriterion("photome_user_userismaster >", value, "photomeUserUserismaster");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserismasterGreaterThanOrEqualTo(String value) {
            addCriterion("photome_user_userismaster >=", value, "photomeUserUserismaster");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserismasterLessThan(String value) {
            addCriterion("photome_user_userismaster <", value, "photomeUserUserismaster");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserismasterLessThanOrEqualTo(String value) {
            addCriterion("photome_user_userismaster <=", value, "photomeUserUserismaster");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserismasterLike(String value) {
            addCriterion("photome_user_userismaster like", value, "photomeUserUserismaster");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserismasterNotLike(String value) {
            addCriterion("photome_user_userismaster not like", value, "photomeUserUserismaster");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserismasterIn(List<String> values) {
            addCriterion("photome_user_userismaster in", values, "photomeUserUserismaster");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserismasterNotIn(List<String> values) {
            addCriterion("photome_user_userismaster not in", values, "photomeUserUserismaster");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserismasterBetween(String value1, String value2) {
            addCriterion("photome_user_userismaster between", value1, value2, "photomeUserUserismaster");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserismasterNotBetween(String value1, String value2) {
            addCriterion("photome_user_userismaster not between", value1, value2, "photomeUserUserismaster");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserisvipIsNull() {
            addCriterion("photome_user_userisvip is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserisvipIsNotNull() {
            addCriterion("photome_user_userisvip is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserisvipEqualTo(String value) {
            addCriterion("photome_user_userisvip =", value, "photomeUserUserisvip");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserisvipNotEqualTo(String value) {
            addCriterion("photome_user_userisvip <>", value, "photomeUserUserisvip");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserisvipGreaterThan(String value) {
            addCriterion("photome_user_userisvip >", value, "photomeUserUserisvip");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserisvipGreaterThanOrEqualTo(String value) {
            addCriterion("photome_user_userisvip >=", value, "photomeUserUserisvip");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserisvipLessThan(String value) {
            addCriterion("photome_user_userisvip <", value, "photomeUserUserisvip");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserisvipLessThanOrEqualTo(String value) {
            addCriterion("photome_user_userisvip <=", value, "photomeUserUserisvip");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserisvipLike(String value) {
            addCriterion("photome_user_userisvip like", value, "photomeUserUserisvip");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserisvipNotLike(String value) {
            addCriterion("photome_user_userisvip not like", value, "photomeUserUserisvip");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserisvipIn(List<String> values) {
            addCriterion("photome_user_userisvip in", values, "photomeUserUserisvip");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserisvipNotIn(List<String> values) {
            addCriterion("photome_user_userisvip not in", values, "photomeUserUserisvip");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserisvipBetween(String value1, String value2) {
            addCriterion("photome_user_userisvip between", value1, value2, "photomeUserUserisvip");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUserisvipNotBetween(String value1, String value2) {
            addCriterion("photome_user_userisvip not between", value1, value2, "photomeUserUserisvip");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsercreatdateIsNull() {
            addCriterion("photome_user_usercreatdate is null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsercreatdateIsNotNull() {
            addCriterion("photome_user_usercreatdate is not null");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsercreatdateEqualTo(Date value) {
            addCriterion("photome_user_usercreatdate =", value, "photomeUserUsercreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsercreatdateNotEqualTo(Date value) {
            addCriterion("photome_user_usercreatdate <>", value, "photomeUserUsercreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsercreatdateGreaterThan(Date value) {
            addCriterion("photome_user_usercreatdate >", value, "photomeUserUsercreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsercreatdateGreaterThanOrEqualTo(Date value) {
            addCriterion("photome_user_usercreatdate >=", value, "photomeUserUsercreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsercreatdateLessThan(Date value) {
            addCriterion("photome_user_usercreatdate <", value, "photomeUserUsercreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsercreatdateLessThanOrEqualTo(Date value) {
            addCriterion("photome_user_usercreatdate <=", value, "photomeUserUsercreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsercreatdateIn(List<Date> values) {
            addCriterion("photome_user_usercreatdate in", values, "photomeUserUsercreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsercreatdateNotIn(List<Date> values) {
            addCriterion("photome_user_usercreatdate not in", values, "photomeUserUsercreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsercreatdateBetween(Date value1, Date value2) {
            addCriterion("photome_user_usercreatdate between", value1, value2, "photomeUserUsercreatdate");
            return (Criteria) this;
        }

        public Criteria andPhotomeUserUsercreatdateNotBetween(Date value1, Date value2) {
            addCriterion("photome_user_usercreatdate not between", value1, value2, "photomeUserUsercreatdate");
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