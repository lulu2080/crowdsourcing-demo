package com.funci.demo.order.common.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    private static final long serialVersionUID = 1L;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andRecCreatorIsNull() {
            addCriterion("REC_CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andRecCreatorIsNotNull() {
            addCriterion("REC_CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andRecCreatorEqualTo(String value) {
            addCriterion("REC_CREATOR =", value, "recCreator");
            return (Criteria) this;
        }

        public Criteria andRecCreatorNotEqualTo(String value) {
            addCriterion("REC_CREATOR <>", value, "recCreator");
            return (Criteria) this;
        }

        public Criteria andRecCreatorGreaterThan(String value) {
            addCriterion("REC_CREATOR >", value, "recCreator");
            return (Criteria) this;
        }

        public Criteria andRecCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("REC_CREATOR >=", value, "recCreator");
            return (Criteria) this;
        }

        public Criteria andRecCreatorLessThan(String value) {
            addCriterion("REC_CREATOR <", value, "recCreator");
            return (Criteria) this;
        }

        public Criteria andRecCreatorLessThanOrEqualTo(String value) {
            addCriterion("REC_CREATOR <=", value, "recCreator");
            return (Criteria) this;
        }

        public Criteria andRecCreatorLike(String value) {
            addCriterion("REC_CREATOR like", value, "recCreator");
            return (Criteria) this;
        }

        public Criteria andRecCreatorNotLike(String value) {
            addCriterion("REC_CREATOR not like", value, "recCreator");
            return (Criteria) this;
        }

        public Criteria andRecCreatorIn(List<String> values) {
            addCriterion("REC_CREATOR in", values, "recCreator");
            return (Criteria) this;
        }

        public Criteria andRecCreatorNotIn(List<String> values) {
            addCriterion("REC_CREATOR not in", values, "recCreator");
            return (Criteria) this;
        }

        public Criteria andRecCreatorBetween(String value1, String value2) {
            addCriterion("REC_CREATOR between", value1, value2, "recCreator");
            return (Criteria) this;
        }

        public Criteria andRecCreatorNotBetween(String value1, String value2) {
            addCriterion("REC_CREATOR not between", value1, value2, "recCreator");
            return (Criteria) this;
        }

        public Criteria andRecCreateTimeIsNull() {
            addCriterion("REC_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRecCreateTimeIsNotNull() {
            addCriterion("REC_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRecCreateTimeEqualTo(Date value) {
            addCriterion("REC_CREATE_TIME =", value, "recCreateTime");
            return (Criteria) this;
        }

        public Criteria andRecCreateTimeNotEqualTo(Date value) {
            addCriterion("REC_CREATE_TIME <>", value, "recCreateTime");
            return (Criteria) this;
        }

        public Criteria andRecCreateTimeGreaterThan(Date value) {
            addCriterion("REC_CREATE_TIME >", value, "recCreateTime");
            return (Criteria) this;
        }

        public Criteria andRecCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REC_CREATE_TIME >=", value, "recCreateTime");
            return (Criteria) this;
        }

        public Criteria andRecCreateTimeLessThan(Date value) {
            addCriterion("REC_CREATE_TIME <", value, "recCreateTime");
            return (Criteria) this;
        }

        public Criteria andRecCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("REC_CREATE_TIME <=", value, "recCreateTime");
            return (Criteria) this;
        }

        public Criteria andRecCreateTimeIn(List<Date> values) {
            addCriterion("REC_CREATE_TIME in", values, "recCreateTime");
            return (Criteria) this;
        }

        public Criteria andRecCreateTimeNotIn(List<Date> values) {
            addCriterion("REC_CREATE_TIME not in", values, "recCreateTime");
            return (Criteria) this;
        }

        public Criteria andRecCreateTimeBetween(Date value1, Date value2) {
            addCriterion("REC_CREATE_TIME between", value1, value2, "recCreateTime");
            return (Criteria) this;
        }

        public Criteria andRecCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("REC_CREATE_TIME not between", value1, value2, "recCreateTime");
            return (Criteria) this;
        }

        public Criteria andRecRevisorIsNull() {
            addCriterion("REC_REVISOR is null");
            return (Criteria) this;
        }

        public Criteria andRecRevisorIsNotNull() {
            addCriterion("REC_REVISOR is not null");
            return (Criteria) this;
        }

        public Criteria andRecRevisorEqualTo(String value) {
            addCriterion("REC_REVISOR =", value, "recRevisor");
            return (Criteria) this;
        }

        public Criteria andRecRevisorNotEqualTo(String value) {
            addCriterion("REC_REVISOR <>", value, "recRevisor");
            return (Criteria) this;
        }

        public Criteria andRecRevisorGreaterThan(String value) {
            addCriterion("REC_REVISOR >", value, "recRevisor");
            return (Criteria) this;
        }

        public Criteria andRecRevisorGreaterThanOrEqualTo(String value) {
            addCriterion("REC_REVISOR >=", value, "recRevisor");
            return (Criteria) this;
        }

        public Criteria andRecRevisorLessThan(String value) {
            addCriterion("REC_REVISOR <", value, "recRevisor");
            return (Criteria) this;
        }

        public Criteria andRecRevisorLessThanOrEqualTo(String value) {
            addCriterion("REC_REVISOR <=", value, "recRevisor");
            return (Criteria) this;
        }

        public Criteria andRecRevisorLike(String value) {
            addCriterion("REC_REVISOR like", value, "recRevisor");
            return (Criteria) this;
        }

        public Criteria andRecRevisorNotLike(String value) {
            addCriterion("REC_REVISOR not like", value, "recRevisor");
            return (Criteria) this;
        }

        public Criteria andRecRevisorIn(List<String> values) {
            addCriterion("REC_REVISOR in", values, "recRevisor");
            return (Criteria) this;
        }

        public Criteria andRecRevisorNotIn(List<String> values) {
            addCriterion("REC_REVISOR not in", values, "recRevisor");
            return (Criteria) this;
        }

        public Criteria andRecRevisorBetween(String value1, String value2) {
            addCriterion("REC_REVISOR between", value1, value2, "recRevisor");
            return (Criteria) this;
        }

        public Criteria andRecRevisorNotBetween(String value1, String value2) {
            addCriterion("REC_REVISOR not between", value1, value2, "recRevisor");
            return (Criteria) this;
        }

        public Criteria andRecReviseTimeIsNull() {
            addCriterion("REC_REVISE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRecReviseTimeIsNotNull() {
            addCriterion("REC_REVISE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRecReviseTimeEqualTo(Date value) {
            addCriterion("REC_REVISE_TIME =", value, "recReviseTime");
            return (Criteria) this;
        }

        public Criteria andRecReviseTimeNotEqualTo(Date value) {
            addCriterion("REC_REVISE_TIME <>", value, "recReviseTime");
            return (Criteria) this;
        }

        public Criteria andRecReviseTimeGreaterThan(Date value) {
            addCriterion("REC_REVISE_TIME >", value, "recReviseTime");
            return (Criteria) this;
        }

        public Criteria andRecReviseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REC_REVISE_TIME >=", value, "recReviseTime");
            return (Criteria) this;
        }

        public Criteria andRecReviseTimeLessThan(Date value) {
            addCriterion("REC_REVISE_TIME <", value, "recReviseTime");
            return (Criteria) this;
        }

        public Criteria andRecReviseTimeLessThanOrEqualTo(Date value) {
            addCriterion("REC_REVISE_TIME <=", value, "recReviseTime");
            return (Criteria) this;
        }

        public Criteria andRecReviseTimeIn(List<Date> values) {
            addCriterion("REC_REVISE_TIME in", values, "recReviseTime");
            return (Criteria) this;
        }

        public Criteria andRecReviseTimeNotIn(List<Date> values) {
            addCriterion("REC_REVISE_TIME not in", values, "recReviseTime");
            return (Criteria) this;
        }

        public Criteria andRecReviseTimeBetween(Date value1, Date value2) {
            addCriterion("REC_REVISE_TIME between", value1, value2, "recReviseTime");
            return (Criteria) this;
        }

        public Criteria andRecReviseTimeNotBetween(Date value1, Date value2) {
            addCriterion("REC_REVISE_TIME not between", value1, value2, "recReviseTime");
            return (Criteria) this;
        }

        public Criteria andRecFlagIsNull() {
            addCriterion("REC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andRecFlagIsNotNull() {
            addCriterion("REC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andRecFlagEqualTo(String value) {
            addCriterion("REC_FLAG =", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagNotEqualTo(String value) {
            addCriterion("REC_FLAG <>", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagGreaterThan(String value) {
            addCriterion("REC_FLAG >", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagGreaterThanOrEqualTo(String value) {
            addCriterion("REC_FLAG >=", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagLessThan(String value) {
            addCriterion("REC_FLAG <", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagLessThanOrEqualTo(String value) {
            addCriterion("REC_FLAG <=", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagLike(String value) {
            addCriterion("REC_FLAG like", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagNotLike(String value) {
            addCriterion("REC_FLAG not like", value, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagIn(List<String> values) {
            addCriterion("REC_FLAG in", values, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagNotIn(List<String> values) {
            addCriterion("REC_FLAG not in", values, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagBetween(String value1, String value2) {
            addCriterion("REC_FLAG between", value1, value2, "recFlag");
            return (Criteria) this;
        }

        public Criteria andRecFlagNotBetween(String value1, String value2) {
            addCriterion("REC_FLAG not between", value1, value2, "recFlag");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("TENANT_ID like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("TENANT_ID not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLikeInsensitive(String value) {
            addCriterion("upper(ORDER_ID) like", value.toUpperCase(), "orderId");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andRecCreatorLikeInsensitive(String value) {
            addCriterion("upper(REC_CREATOR) like", value.toUpperCase(), "recCreator");
            return (Criteria) this;
        }

        public Criteria andRecRevisorLikeInsensitive(String value) {
            addCriterion("upper(REC_REVISOR) like", value.toUpperCase(), "recRevisor");
            return (Criteria) this;
        }

        public Criteria andRecFlagLikeInsensitive(String value) {
            addCriterion("upper(REC_FLAG) like", value.toUpperCase(), "recFlag");
            return (Criteria) this;
        }

        public Criteria andTenantIdLikeInsensitive(String value) {
            addCriterion("upper(TENANT_ID) like", value.toUpperCase(), "tenantId");
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