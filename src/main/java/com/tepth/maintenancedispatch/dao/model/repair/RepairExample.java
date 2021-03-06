package com.tepth.maintenancedispatch.dao.model.repair;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andAdditionalIsNull() {
            addCriterion("additional is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalIsNotNull() {
            addCriterion("additional is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalEqualTo(String value) {
            addCriterion("additional =", value, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalNotEqualTo(String value) {
            addCriterion("additional <>", value, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalGreaterThan(String value) {
            addCriterion("additional >", value, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalGreaterThanOrEqualTo(String value) {
            addCriterion("additional >=", value, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalLessThan(String value) {
            addCriterion("additional <", value, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalLessThanOrEqualTo(String value) {
            addCriterion("additional <=", value, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalLike(String value) {
            addCriterion("additional like", value, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalNotLike(String value) {
            addCriterion("additional not like", value, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalIn(List<String> values) {
            addCriterion("additional in", values, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalNotIn(List<String> values) {
            addCriterion("additional not in", values, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalBetween(String value1, String value2) {
            addCriterion("additional between", value1, value2, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalNotBetween(String value1, String value2) {
            addCriterion("additional not between", value1, value2, "additional");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("`type` not between", value1, value2, "type");
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

        public Criteria andCategoryEqualTo(Byte value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Byte value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Byte value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Byte value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Byte value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Byte value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Byte> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Byte> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Byte value1, Byte value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Byte value1, Byte value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andRescueIsNull() {
            addCriterion("rescue is null");
            return (Criteria) this;
        }

        public Criteria andRescueIsNotNull() {
            addCriterion("rescue is not null");
            return (Criteria) this;
        }

        public Criteria andRescueEqualTo(Boolean value) {
            addCriterion("rescue =", value, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueNotEqualTo(Boolean value) {
            addCriterion("rescue <>", value, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueGreaterThan(Boolean value) {
            addCriterion("rescue >", value, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueGreaterThanOrEqualTo(Boolean value) {
            addCriterion("rescue >=", value, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueLessThan(Boolean value) {
            addCriterion("rescue <", value, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueLessThanOrEqualTo(Boolean value) {
            addCriterion("rescue <=", value, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueIn(List<Boolean> values) {
            addCriterion("rescue in", values, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueNotIn(List<Boolean> values) {
            addCriterion("rescue not in", values, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueBetween(Boolean value1, Boolean value2) {
            addCriterion("rescue between", value1, value2, "rescue");
            return (Criteria) this;
        }

        public Criteria andRescueNotBetween(Boolean value1, Boolean value2) {
            addCriterion("rescue not between", value1, value2, "rescue");
            return (Criteria) this;
        }

        public Criteria andAccidentIsNull() {
            addCriterion("accident is null");
            return (Criteria) this;
        }

        public Criteria andAccidentIsNotNull() {
            addCriterion("accident is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentEqualTo(Boolean value) {
            addCriterion("accident =", value, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentNotEqualTo(Boolean value) {
            addCriterion("accident <>", value, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentGreaterThan(Boolean value) {
            addCriterion("accident >", value, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("accident >=", value, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentLessThan(Boolean value) {
            addCriterion("accident <", value, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentLessThanOrEqualTo(Boolean value) {
            addCriterion("accident <=", value, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentIn(List<Boolean> values) {
            addCriterion("accident in", values, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentNotIn(List<Boolean> values) {
            addCriterion("accident not in", values, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentBetween(Boolean value1, Boolean value2) {
            addCriterion("accident between", value1, value2, "accident");
            return (Criteria) this;
        }

        public Criteria andAccidentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("accident not between", value1, value2, "accident");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNull() {
            addCriterion("arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNotNull() {
            addCriterion("arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeEqualTo(Date value) {
            addCriterion("arrival_time =", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotEqualTo(Date value) {
            addCriterion("arrival_time <>", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThan(Date value) {
            addCriterion("arrival_time >", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrival_time >=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThan(Date value) {
            addCriterion("arrival_time <", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThanOrEqualTo(Date value) {
            addCriterion("arrival_time <=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIn(List<Date> values) {
            addCriterion("arrival_time in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotIn(List<Date> values) {
            addCriterion("arrival_time not in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeBetween(Date value1, Date value2) {
            addCriterion("arrival_time between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotBetween(Date value1, Date value2) {
            addCriterion("arrival_time not between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("leave_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("leave_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Date value) {
            addCriterion("leave_time =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Date value) {
            addCriterion("leave_time <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Date value) {
            addCriterion("leave_time >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("leave_time >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Date value) {
            addCriterion("leave_time <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("leave_time <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Date> values) {
            addCriterion("leave_time in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Date> values) {
            addCriterion("leave_time not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Date value1, Date value2) {
            addCriterion("leave_time between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("leave_time not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andJobProcessStatusIsNull() {
            addCriterion("job_process_status is null");
            return (Criteria) this;
        }

        public Criteria andJobProcessStatusIsNotNull() {
            addCriterion("job_process_status is not null");
            return (Criteria) this;
        }

        public Criteria andJobProcessStatusEqualTo(Byte value) {
            addCriterion("job_process_status =", value, "jobProcessStatus");
            return (Criteria) this;
        }

        public Criteria andJobProcessStatusNotEqualTo(Byte value) {
            addCriterion("job_process_status <>", value, "jobProcessStatus");
            return (Criteria) this;
        }

        public Criteria andJobProcessStatusGreaterThan(Byte value) {
            addCriterion("job_process_status >", value, "jobProcessStatus");
            return (Criteria) this;
        }

        public Criteria andJobProcessStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("job_process_status >=", value, "jobProcessStatus");
            return (Criteria) this;
        }

        public Criteria andJobProcessStatusLessThan(Byte value) {
            addCriterion("job_process_status <", value, "jobProcessStatus");
            return (Criteria) this;
        }

        public Criteria andJobProcessStatusLessThanOrEqualTo(Byte value) {
            addCriterion("job_process_status <=", value, "jobProcessStatus");
            return (Criteria) this;
        }

        public Criteria andJobProcessStatusIn(List<Byte> values) {
            addCriterion("job_process_status in", values, "jobProcessStatus");
            return (Criteria) this;
        }

        public Criteria andJobProcessStatusNotIn(List<Byte> values) {
            addCriterion("job_process_status not in", values, "jobProcessStatus");
            return (Criteria) this;
        }

        public Criteria andJobProcessStatusBetween(Byte value1, Byte value2) {
            addCriterion("job_process_status between", value1, value2, "jobProcessStatus");
            return (Criteria) this;
        }

        public Criteria andJobProcessStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("job_process_status not between", value1, value2, "jobProcessStatus");
            return (Criteria) this;
        }

        public Criteria andRescueStatusIsNull() {
            addCriterion("rescue_status is null");
            return (Criteria) this;
        }

        public Criteria andRescueStatusIsNotNull() {
            addCriterion("rescue_status is not null");
            return (Criteria) this;
        }

        public Criteria andRescueStatusEqualTo(Byte value) {
            addCriterion("rescue_status =", value, "rescueStatus");
            return (Criteria) this;
        }

        public Criteria andRescueStatusNotEqualTo(Byte value) {
            addCriterion("rescue_status <>", value, "rescueStatus");
            return (Criteria) this;
        }

        public Criteria andRescueStatusGreaterThan(Byte value) {
            addCriterion("rescue_status >", value, "rescueStatus");
            return (Criteria) this;
        }

        public Criteria andRescueStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("rescue_status >=", value, "rescueStatus");
            return (Criteria) this;
        }

        public Criteria andRescueStatusLessThan(Byte value) {
            addCriterion("rescue_status <", value, "rescueStatus");
            return (Criteria) this;
        }

        public Criteria andRescueStatusLessThanOrEqualTo(Byte value) {
            addCriterion("rescue_status <=", value, "rescueStatus");
            return (Criteria) this;
        }

        public Criteria andRescueStatusIn(List<Byte> values) {
            addCriterion("rescue_status in", values, "rescueStatus");
            return (Criteria) this;
        }

        public Criteria andRescueStatusNotIn(List<Byte> values) {
            addCriterion("rescue_status not in", values, "rescueStatus");
            return (Criteria) this;
        }

        public Criteria andRescueStatusBetween(Byte value1, Byte value2) {
            addCriterion("rescue_status between", value1, value2, "rescueStatus");
            return (Criteria) this;
        }

        public Criteria andRescueStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("rescue_status not between", value1, value2, "rescueStatus");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andFaultPhenomenonIdIsNull() {
            addCriterion("fault_phenomenon_id is null");
            return (Criteria) this;
        }

        public Criteria andFaultPhenomenonIdIsNotNull() {
            addCriterion("fault_phenomenon_id is not null");
            return (Criteria) this;
        }

        public Criteria andFaultPhenomenonIdEqualTo(String value) {
            addCriterion("fault_phenomenon_id =", value, "faultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andFaultPhenomenonIdNotEqualTo(String value) {
            addCriterion("fault_phenomenon_id <>", value, "faultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andFaultPhenomenonIdGreaterThan(String value) {
            addCriterion("fault_phenomenon_id >", value, "faultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andFaultPhenomenonIdGreaterThanOrEqualTo(String value) {
            addCriterion("fault_phenomenon_id >=", value, "faultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andFaultPhenomenonIdLessThan(String value) {
            addCriterion("fault_phenomenon_id <", value, "faultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andFaultPhenomenonIdLessThanOrEqualTo(String value) {
            addCriterion("fault_phenomenon_id <=", value, "faultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andFaultPhenomenonIdLike(String value) {
            addCriterion("fault_phenomenon_id like", value, "faultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andFaultPhenomenonIdNotLike(String value) {
            addCriterion("fault_phenomenon_id not like", value, "faultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andFaultPhenomenonIdIn(List<String> values) {
            addCriterion("fault_phenomenon_id in", values, "faultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andFaultPhenomenonIdNotIn(List<String> values) {
            addCriterion("fault_phenomenon_id not in", values, "faultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andFaultPhenomenonIdBetween(String value1, String value2) {
            addCriterion("fault_phenomenon_id between", value1, value2, "faultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andFaultPhenomenonIdNotBetween(String value1, String value2) {
            addCriterion("fault_phenomenon_id not between", value1, value2, "faultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andTempFaultPhenomenonIdIsNull() {
            addCriterion("temp_fault_phenomenon_id is null");
            return (Criteria) this;
        }

        public Criteria andTempFaultPhenomenonIdIsNotNull() {
            addCriterion("temp_fault_phenomenon_id is not null");
            return (Criteria) this;
        }

        public Criteria andTempFaultPhenomenonIdEqualTo(String value) {
            addCriterion("temp_fault_phenomenon_id =", value, "tempFaultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andTempFaultPhenomenonIdNotEqualTo(String value) {
            addCriterion("temp_fault_phenomenon_id <>", value, "tempFaultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andTempFaultPhenomenonIdGreaterThan(String value) {
            addCriterion("temp_fault_phenomenon_id >", value, "tempFaultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andTempFaultPhenomenonIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_fault_phenomenon_id >=", value, "tempFaultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andTempFaultPhenomenonIdLessThan(String value) {
            addCriterion("temp_fault_phenomenon_id <", value, "tempFaultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andTempFaultPhenomenonIdLessThanOrEqualTo(String value) {
            addCriterion("temp_fault_phenomenon_id <=", value, "tempFaultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andTempFaultPhenomenonIdLike(String value) {
            addCriterion("temp_fault_phenomenon_id like", value, "tempFaultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andTempFaultPhenomenonIdNotLike(String value) {
            addCriterion("temp_fault_phenomenon_id not like", value, "tempFaultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andTempFaultPhenomenonIdIn(List<String> values) {
            addCriterion("temp_fault_phenomenon_id in", values, "tempFaultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andTempFaultPhenomenonIdNotIn(List<String> values) {
            addCriterion("temp_fault_phenomenon_id not in", values, "tempFaultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andTempFaultPhenomenonIdBetween(String value1, String value2) {
            addCriterion("temp_fault_phenomenon_id between", value1, value2, "tempFaultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andTempFaultPhenomenonIdNotBetween(String value1, String value2) {
            addCriterion("temp_fault_phenomenon_id not between", value1, value2, "tempFaultPhenomenonId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdIsNull() {
            addCriterion("sys_fault_diagnostic_id is null");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdIsNotNull() {
            addCriterion("sys_fault_diagnostic_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdEqualTo(String value) {
            addCriterion("sys_fault_diagnostic_id =", value, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdNotEqualTo(String value) {
            addCriterion("sys_fault_diagnostic_id <>", value, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdGreaterThan(String value) {
            addCriterion("sys_fault_diagnostic_id >", value, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_fault_diagnostic_id >=", value, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdLessThan(String value) {
            addCriterion("sys_fault_diagnostic_id <", value, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdLessThanOrEqualTo(String value) {
            addCriterion("sys_fault_diagnostic_id <=", value, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdLike(String value) {
            addCriterion("sys_fault_diagnostic_id like", value, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdNotLike(String value) {
            addCriterion("sys_fault_diagnostic_id not like", value, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdIn(List<String> values) {
            addCriterion("sys_fault_diagnostic_id in", values, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdNotIn(List<String> values) {
            addCriterion("sys_fault_diagnostic_id not in", values, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdBetween(String value1, String value2) {
            addCriterion("sys_fault_diagnostic_id between", value1, value2, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdNotBetween(String value1, String value2) {
            addCriterion("sys_fault_diagnostic_id not between", value1, value2, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdIsNull() {
            addCriterion("temp_fault_diagnostic_id is null");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdIsNotNull() {
            addCriterion("temp_fault_diagnostic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdEqualTo(String value) {
            addCriterion("temp_fault_diagnostic_id =", value, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdNotEqualTo(String value) {
            addCriterion("temp_fault_diagnostic_id <>", value, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdGreaterThan(String value) {
            addCriterion("temp_fault_diagnostic_id >", value, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_fault_diagnostic_id >=", value, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdLessThan(String value) {
            addCriterion("temp_fault_diagnostic_id <", value, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdLessThanOrEqualTo(String value) {
            addCriterion("temp_fault_diagnostic_id <=", value, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdLike(String value) {
            addCriterion("temp_fault_diagnostic_id like", value, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdNotLike(String value) {
            addCriterion("temp_fault_diagnostic_id not like", value, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdIn(List<String> values) {
            addCriterion("temp_fault_diagnostic_id in", values, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdNotIn(List<String> values) {
            addCriterion("temp_fault_diagnostic_id not in", values, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdBetween(String value1, String value2) {
            addCriterion("temp_fault_diagnostic_id between", value1, value2, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdNotBetween(String value1, String value2) {
            addCriterion("temp_fault_diagnostic_id not between", value1, value2, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDispatchUserIdIsNull() {
            addCriterion("dispatch_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDispatchUserIdIsNotNull() {
            addCriterion("dispatch_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchUserIdEqualTo(Integer value) {
            addCriterion("dispatch_user_id =", value, "dispatchUserId");
            return (Criteria) this;
        }

        public Criteria andDispatchUserIdNotEqualTo(Integer value) {
            addCriterion("dispatch_user_id <>", value, "dispatchUserId");
            return (Criteria) this;
        }

        public Criteria andDispatchUserIdGreaterThan(Integer value) {
            addCriterion("dispatch_user_id >", value, "dispatchUserId");
            return (Criteria) this;
        }

        public Criteria andDispatchUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dispatch_user_id >=", value, "dispatchUserId");
            return (Criteria) this;
        }

        public Criteria andDispatchUserIdLessThan(Integer value) {
            addCriterion("dispatch_user_id <", value, "dispatchUserId");
            return (Criteria) this;
        }

        public Criteria andDispatchUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("dispatch_user_id <=", value, "dispatchUserId");
            return (Criteria) this;
        }

        public Criteria andDispatchUserIdIn(List<Integer> values) {
            addCriterion("dispatch_user_id in", values, "dispatchUserId");
            return (Criteria) this;
        }

        public Criteria andDispatchUserIdNotIn(List<Integer> values) {
            addCriterion("dispatch_user_id not in", values, "dispatchUserId");
            return (Criteria) this;
        }

        public Criteria andDispatchUserIdBetween(Integer value1, Integer value2) {
            addCriterion("dispatch_user_id between", value1, value2, "dispatchUserId");
            return (Criteria) this;
        }

        public Criteria andDispatchUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dispatch_user_id not between", value1, value2, "dispatchUserId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNull() {
            addCriterion("vehicle_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNotNull() {
            addCriterion("vehicle_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdEqualTo(Integer value) {
            addCriterion("vehicle_id =", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotEqualTo(Integer value) {
            addCriterion("vehicle_id <>", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThan(Integer value) {
            addCriterion("vehicle_id >", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vehicle_id >=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThan(Integer value) {
            addCriterion("vehicle_id <", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThanOrEqualTo(Integer value) {
            addCriterion("vehicle_id <=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIn(List<Integer> values) {
            addCriterion("vehicle_id in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotIn(List<Integer> values) {
            addCriterion("vehicle_id not in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_id between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_id not between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andOrgMaintenanceIdIsNull() {
            addCriterion("org_maintenance_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgMaintenanceIdIsNotNull() {
            addCriterion("org_maintenance_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgMaintenanceIdEqualTo(Integer value) {
            addCriterion("org_maintenance_id =", value, "orgMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andOrgMaintenanceIdNotEqualTo(Integer value) {
            addCriterion("org_maintenance_id <>", value, "orgMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andOrgMaintenanceIdGreaterThan(Integer value) {
            addCriterion("org_maintenance_id >", value, "orgMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andOrgMaintenanceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_maintenance_id >=", value, "orgMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andOrgMaintenanceIdLessThan(Integer value) {
            addCriterion("org_maintenance_id <", value, "orgMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andOrgMaintenanceIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_maintenance_id <=", value, "orgMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andOrgMaintenanceIdIn(List<Integer> values) {
            addCriterion("org_maintenance_id in", values, "orgMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andOrgMaintenanceIdNotIn(List<Integer> values) {
            addCriterion("org_maintenance_id not in", values, "orgMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andOrgMaintenanceIdBetween(Integer value1, Integer value2) {
            addCriterion("org_maintenance_id between", value1, value2, "orgMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andOrgMaintenanceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_maintenance_id not between", value1, value2, "orgMaintenanceId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdIsNull() {
            addCriterion("org_group_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdIsNotNull() {
            addCriterion("org_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdEqualTo(Integer value) {
            addCriterion("org_group_id =", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdNotEqualTo(Integer value) {
            addCriterion("org_group_id <>", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdGreaterThan(Integer value) {
            addCriterion("org_group_id >", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_group_id >=", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdLessThan(Integer value) {
            addCriterion("org_group_id <", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_group_id <=", value, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdIn(List<Integer> values) {
            addCriterion("org_group_id in", values, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdNotIn(List<Integer> values) {
            addCriterion("org_group_id not in", values, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("org_group_id between", value1, value2, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andOrgGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_group_id not between", value1, value2, "orgGroupId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIsNull() {
            addCriterion("worker_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIsNotNull() {
            addCriterion("worker_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdEqualTo(String value) {
            addCriterion("worker_id =", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotEqualTo(String value) {
            addCriterion("worker_id <>", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThan(String value) {
            addCriterion("worker_id >", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThanOrEqualTo(String value) {
            addCriterion("worker_id >=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThan(String value) {
            addCriterion("worker_id <", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThanOrEqualTo(String value) {
            addCriterion("worker_id <=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLike(String value) {
            addCriterion("worker_id like", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotLike(String value) {
            addCriterion("worker_id not like", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIn(List<String> values) {
            addCriterion("worker_id in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotIn(List<String> values) {
            addCriterion("worker_id not in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdBetween(String value1, String value2) {
            addCriterion("worker_id between", value1, value2, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotBetween(String value1, String value2) {
            addCriterion("worker_id not between", value1, value2, "workerId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdIsNull() {
            addCriterion("factory_area_id is null");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdIsNotNull() {
            addCriterion("factory_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdEqualTo(Integer value) {
            addCriterion("factory_area_id =", value, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdNotEqualTo(Integer value) {
            addCriterion("factory_area_id <>", value, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdGreaterThan(Integer value) {
            addCriterion("factory_area_id >", value, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("factory_area_id >=", value, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdLessThan(Integer value) {
            addCriterion("factory_area_id <", value, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("factory_area_id <=", value, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdIn(List<Integer> values) {
            addCriterion("factory_area_id in", values, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdNotIn(List<Integer> values) {
            addCriterion("factory_area_id not in", values, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("factory_area_id between", value1, value2, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("factory_area_id not between", value1, value2, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andPassUserIdIsNull() {
            addCriterion("pass_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPassUserIdIsNotNull() {
            addCriterion("pass_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPassUserIdEqualTo(String value) {
            addCriterion("pass_user_id =", value, "passUserId");
            return (Criteria) this;
        }

        public Criteria andPassUserIdNotEqualTo(String value) {
            addCriterion("pass_user_id <>", value, "passUserId");
            return (Criteria) this;
        }

        public Criteria andPassUserIdGreaterThan(String value) {
            addCriterion("pass_user_id >", value, "passUserId");
            return (Criteria) this;
        }

        public Criteria andPassUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("pass_user_id >=", value, "passUserId");
            return (Criteria) this;
        }

        public Criteria andPassUserIdLessThan(String value) {
            addCriterion("pass_user_id <", value, "passUserId");
            return (Criteria) this;
        }

        public Criteria andPassUserIdLessThanOrEqualTo(String value) {
            addCriterion("pass_user_id <=", value, "passUserId");
            return (Criteria) this;
        }

        public Criteria andPassUserIdLike(String value) {
            addCriterion("pass_user_id like", value, "passUserId");
            return (Criteria) this;
        }

        public Criteria andPassUserIdNotLike(String value) {
            addCriterion("pass_user_id not like", value, "passUserId");
            return (Criteria) this;
        }

        public Criteria andPassUserIdIn(List<String> values) {
            addCriterion("pass_user_id in", values, "passUserId");
            return (Criteria) this;
        }

        public Criteria andPassUserIdNotIn(List<String> values) {
            addCriterion("pass_user_id not in", values, "passUserId");
            return (Criteria) this;
        }

        public Criteria andPassUserIdBetween(String value1, String value2) {
            addCriterion("pass_user_id between", value1, value2, "passUserId");
            return (Criteria) this;
        }

        public Criteria andPassUserIdNotBetween(String value1, String value2) {
            addCriterion("pass_user_id not between", value1, value2, "passUserId");
            return (Criteria) this;
        }

        public Criteria andCompleteUserIdIsNull() {
            addCriterion("complete_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCompleteUserIdIsNotNull() {
            addCriterion("complete_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteUserIdEqualTo(String value) {
            addCriterion("complete_user_id =", value, "completeUserId");
            return (Criteria) this;
        }

        public Criteria andCompleteUserIdNotEqualTo(String value) {
            addCriterion("complete_user_id <>", value, "completeUserId");
            return (Criteria) this;
        }

        public Criteria andCompleteUserIdGreaterThan(String value) {
            addCriterion("complete_user_id >", value, "completeUserId");
            return (Criteria) this;
        }

        public Criteria andCompleteUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("complete_user_id >=", value, "completeUserId");
            return (Criteria) this;
        }

        public Criteria andCompleteUserIdLessThan(String value) {
            addCriterion("complete_user_id <", value, "completeUserId");
            return (Criteria) this;
        }

        public Criteria andCompleteUserIdLessThanOrEqualTo(String value) {
            addCriterion("complete_user_id <=", value, "completeUserId");
            return (Criteria) this;
        }

        public Criteria andCompleteUserIdLike(String value) {
            addCriterion("complete_user_id like", value, "completeUserId");
            return (Criteria) this;
        }

        public Criteria andCompleteUserIdNotLike(String value) {
            addCriterion("complete_user_id not like", value, "completeUserId");
            return (Criteria) this;
        }

        public Criteria andCompleteUserIdIn(List<String> values) {
            addCriterion("complete_user_id in", values, "completeUserId");
            return (Criteria) this;
        }

        public Criteria andCompleteUserIdNotIn(List<String> values) {
            addCriterion("complete_user_id not in", values, "completeUserId");
            return (Criteria) this;
        }

        public Criteria andCompleteUserIdBetween(String value1, String value2) {
            addCriterion("complete_user_id between", value1, value2, "completeUserId");
            return (Criteria) this;
        }

        public Criteria andCompleteUserIdNotBetween(String value1, String value2) {
            addCriterion("complete_user_id not between", value1, value2, "completeUserId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNull() {
            addCriterion("process_instance_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNotNull() {
            addCriterion("process_instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdEqualTo(String value) {
            addCriterion("process_instance_id =", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotEqualTo(String value) {
            addCriterion("process_instance_id <>", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThan(String value) {
            addCriterion("process_instance_id >", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("process_instance_id >=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThan(String value) {
            addCriterion("process_instance_id <", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThanOrEqualTo(String value) {
            addCriterion("process_instance_id <=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLike(String value) {
            addCriterion("process_instance_id like", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotLike(String value) {
            addCriterion("process_instance_id not like", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIn(List<String> values) {
            addCriterion("process_instance_id in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotIn(List<String> values) {
            addCriterion("process_instance_id not in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdBetween(String value1, String value2) {
            addCriterion("process_instance_id between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotBetween(String value1, String value2) {
            addCriterion("process_instance_id not between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }
    }

    /**
     */
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