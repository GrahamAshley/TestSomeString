package com.test.admin.model.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andActListIdIsNull() {
            addCriterion("act_list_id is null");
            return (Criteria) this;
        }

        public Criteria andActListIdIsNotNull() {
            addCriterion("act_list_id is not null");
            return (Criteria) this;
        }

        public Criteria andActListIdEqualTo(Integer value) {
            addCriterion("act_list_id =", value, "actListId");
            return (Criteria) this;
        }

        public Criteria andActListIdNotEqualTo(Integer value) {
            addCriterion("act_list_id <>", value, "actListId");
            return (Criteria) this;
        }

        public Criteria andActListIdGreaterThan(Integer value) {
            addCriterion("act_list_id >", value, "actListId");
            return (Criteria) this;
        }

        public Criteria andActListIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_list_id >=", value, "actListId");
            return (Criteria) this;
        }

        public Criteria andActListIdLessThan(Integer value) {
            addCriterion("act_list_id <", value, "actListId");
            return (Criteria) this;
        }

        public Criteria andActListIdLessThanOrEqualTo(Integer value) {
            addCriterion("act_list_id <=", value, "actListId");
            return (Criteria) this;
        }

        public Criteria andActListIdIn(List<Integer> values) {
            addCriterion("act_list_id in", values, "actListId");
            return (Criteria) this;
        }

        public Criteria andActListIdNotIn(List<Integer> values) {
            addCriterion("act_list_id not in", values, "actListId");
            return (Criteria) this;
        }

        public Criteria andActListIdBetween(Integer value1, Integer value2) {
            addCriterion("act_list_id between", value1, value2, "actListId");
            return (Criteria) this;
        }

        public Criteria andActListIdNotBetween(Integer value1, Integer value2) {
            addCriterion("act_list_id not between", value1, value2, "actListId");
            return (Criteria) this;
        }

        public Criteria andActTitleIsNull() {
            addCriterion("act_title is null");
            return (Criteria) this;
        }

        public Criteria andActTitleIsNotNull() {
            addCriterion("act_title is not null");
            return (Criteria) this;
        }

        public Criteria andActTitleEqualTo(String value) {
            addCriterion("act_title =", value, "actTitle");
            return (Criteria) this;
        }

        public Criteria andActTitleNotEqualTo(String value) {
            addCriterion("act_title <>", value, "actTitle");
            return (Criteria) this;
        }

        public Criteria andActTitleGreaterThan(String value) {
            addCriterion("act_title >", value, "actTitle");
            return (Criteria) this;
        }

        public Criteria andActTitleGreaterThanOrEqualTo(String value) {
            addCriterion("act_title >=", value, "actTitle");
            return (Criteria) this;
        }

        public Criteria andActTitleLessThan(String value) {
            addCriterion("act_title <", value, "actTitle");
            return (Criteria) this;
        }

        public Criteria andActTitleLessThanOrEqualTo(String value) {
            addCriterion("act_title <=", value, "actTitle");
            return (Criteria) this;
        }

        public Criteria andActTitleLike(String value) {
            addCriterion("act_title like", value, "actTitle");
            return (Criteria) this;
        }

        public Criteria andActTitleNotLike(String value) {
            addCriterion("act_title not like", value, "actTitle");
            return (Criteria) this;
        }

        public Criteria andActTitleIn(List<String> values) {
            addCriterion("act_title in", values, "actTitle");
            return (Criteria) this;
        }

        public Criteria andActTitleNotIn(List<String> values) {
            addCriterion("act_title not in", values, "actTitle");
            return (Criteria) this;
        }

        public Criteria andActTitleBetween(String value1, String value2) {
            addCriterion("act_title between", value1, value2, "actTitle");
            return (Criteria) this;
        }

        public Criteria andActTitleNotBetween(String value1, String value2) {
            addCriterion("act_title not between", value1, value2, "actTitle");
            return (Criteria) this;
        }

        public Criteria andActContentIsNull() {
            addCriterion("act_content is null");
            return (Criteria) this;
        }

        public Criteria andActContentIsNotNull() {
            addCriterion("act_content is not null");
            return (Criteria) this;
        }

        public Criteria andActContentEqualTo(String value) {
            addCriterion("act_content =", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentNotEqualTo(String value) {
            addCriterion("act_content <>", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentGreaterThan(String value) {
            addCriterion("act_content >", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentGreaterThanOrEqualTo(String value) {
            addCriterion("act_content >=", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentLessThan(String value) {
            addCriterion("act_content <", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentLessThanOrEqualTo(String value) {
            addCriterion("act_content <=", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentLike(String value) {
            addCriterion("act_content like", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentNotLike(String value) {
            addCriterion("act_content not like", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentIn(List<String> values) {
            addCriterion("act_content in", values, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentNotIn(List<String> values) {
            addCriterion("act_content not in", values, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentBetween(String value1, String value2) {
            addCriterion("act_content between", value1, value2, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentNotBetween(String value1, String value2) {
            addCriterion("act_content not between", value1, value2, "actContent");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeIsNull() {
            addCriterion("act_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeIsNotNull() {
            addCriterion("act_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeEqualTo(Date value) {
            addCriterion("act_begin_time =", value, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeNotEqualTo(Date value) {
            addCriterion("act_begin_time <>", value, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeGreaterThan(Date value) {
            addCriterion("act_begin_time >", value, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("act_begin_time >=", value, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeLessThan(Date value) {
            addCriterion("act_begin_time <", value, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("act_begin_time <=", value, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeIn(List<Date> values) {
            addCriterion("act_begin_time in", values, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeNotIn(List<Date> values) {
            addCriterion("act_begin_time not in", values, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeBetween(Date value1, Date value2) {
            addCriterion("act_begin_time between", value1, value2, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("act_begin_time not between", value1, value2, "actBeginTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeIsNull() {
            addCriterion("act_end_time is null");
            return (Criteria) this;
        }

        public Criteria andActEndTimeIsNotNull() {
            addCriterion("act_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andActEndTimeEqualTo(Date value) {
            addCriterion("act_end_time =", value, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeNotEqualTo(Date value) {
            addCriterion("act_end_time <>", value, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeGreaterThan(Date value) {
            addCriterion("act_end_time >", value, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("act_end_time >=", value, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeLessThan(Date value) {
            addCriterion("act_end_time <", value, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("act_end_time <=", value, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeIn(List<Date> values) {
            addCriterion("act_end_time in", values, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeNotIn(List<Date> values) {
            addCriterion("act_end_time not in", values, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeBetween(Date value1, Date value2) {
            addCriterion("act_end_time between", value1, value2, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("act_end_time not between", value1, value2, "actEndTime");
            return (Criteria) this;
        }

        public Criteria andActRuleIsNull() {
            addCriterion("act_rule is null");
            return (Criteria) this;
        }

        public Criteria andActRuleIsNotNull() {
            addCriterion("act_rule is not null");
            return (Criteria) this;
        }

        public Criteria andActRuleEqualTo(String value) {
            addCriterion("act_rule =", value, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleNotEqualTo(String value) {
            addCriterion("act_rule <>", value, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleGreaterThan(String value) {
            addCriterion("act_rule >", value, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleGreaterThanOrEqualTo(String value) {
            addCriterion("act_rule >=", value, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleLessThan(String value) {
            addCriterion("act_rule <", value, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleLessThanOrEqualTo(String value) {
            addCriterion("act_rule <=", value, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleLike(String value) {
            addCriterion("act_rule like", value, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleNotLike(String value) {
            addCriterion("act_rule not like", value, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleIn(List<String> values) {
            addCriterion("act_rule in", values, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleNotIn(List<String> values) {
            addCriterion("act_rule not in", values, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleBetween(String value1, String value2) {
            addCriterion("act_rule between", value1, value2, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleNotBetween(String value1, String value2) {
            addCriterion("act_rule not between", value1, value2, "actRule");
            return (Criteria) this;
        }

        public Criteria andBgPictureAppIsNull() {
            addCriterion("bg_picture_app is null");
            return (Criteria) this;
        }

        public Criteria andBgPictureAppIsNotNull() {
            addCriterion("bg_picture_app is not null");
            return (Criteria) this;
        }

        public Criteria andBgPictureAppEqualTo(String value) {
            addCriterion("bg_picture_app =", value, "bgPictureApp");
            return (Criteria) this;
        }

        public Criteria andBgPictureAppNotEqualTo(String value) {
            addCriterion("bg_picture_app <>", value, "bgPictureApp");
            return (Criteria) this;
        }

        public Criteria andBgPictureAppGreaterThan(String value) {
            addCriterion("bg_picture_app >", value, "bgPictureApp");
            return (Criteria) this;
        }

        public Criteria andBgPictureAppGreaterThanOrEqualTo(String value) {
            addCriterion("bg_picture_app >=", value, "bgPictureApp");
            return (Criteria) this;
        }

        public Criteria andBgPictureAppLessThan(String value) {
            addCriterion("bg_picture_app <", value, "bgPictureApp");
            return (Criteria) this;
        }

        public Criteria andBgPictureAppLessThanOrEqualTo(String value) {
            addCriterion("bg_picture_app <=", value, "bgPictureApp");
            return (Criteria) this;
        }

        public Criteria andBgPictureAppLike(String value) {
            addCriterion("bg_picture_app like", value, "bgPictureApp");
            return (Criteria) this;
        }

        public Criteria andBgPictureAppNotLike(String value) {
            addCriterion("bg_picture_app not like", value, "bgPictureApp");
            return (Criteria) this;
        }

        public Criteria andBgPictureAppIn(List<String> values) {
            addCriterion("bg_picture_app in", values, "bgPictureApp");
            return (Criteria) this;
        }

        public Criteria andBgPictureAppNotIn(List<String> values) {
            addCriterion("bg_picture_app not in", values, "bgPictureApp");
            return (Criteria) this;
        }

        public Criteria andBgPictureAppBetween(String value1, String value2) {
            addCriterion("bg_picture_app between", value1, value2, "bgPictureApp");
            return (Criteria) this;
        }

        public Criteria andBgPictureAppNotBetween(String value1, String value2) {
            addCriterion("bg_picture_app not between", value1, value2, "bgPictureApp");
            return (Criteria) this;
        }

        public Criteria andPopPicturePcIsNull() {
            addCriterion("pop_picture_pc is null");
            return (Criteria) this;
        }

        public Criteria andPopPicturePcIsNotNull() {
            addCriterion("pop_picture_pc is not null");
            return (Criteria) this;
        }

        public Criteria andPopPicturePcEqualTo(String value) {
            addCriterion("pop_picture_pc =", value, "popPicturePc");
            return (Criteria) this;
        }

        public Criteria andPopPicturePcNotEqualTo(String value) {
            addCriterion("pop_picture_pc <>", value, "popPicturePc");
            return (Criteria) this;
        }

        public Criteria andPopPicturePcGreaterThan(String value) {
            addCriterion("pop_picture_pc >", value, "popPicturePc");
            return (Criteria) this;
        }

        public Criteria andPopPicturePcGreaterThanOrEqualTo(String value) {
            addCriterion("pop_picture_pc >=", value, "popPicturePc");
            return (Criteria) this;
        }

        public Criteria andPopPicturePcLessThan(String value) {
            addCriterion("pop_picture_pc <", value, "popPicturePc");
            return (Criteria) this;
        }

        public Criteria andPopPicturePcLessThanOrEqualTo(String value) {
            addCriterion("pop_picture_pc <=", value, "popPicturePc");
            return (Criteria) this;
        }

        public Criteria andPopPicturePcLike(String value) {
            addCriterion("pop_picture_pc like", value, "popPicturePc");
            return (Criteria) this;
        }

        public Criteria andPopPicturePcNotLike(String value) {
            addCriterion("pop_picture_pc not like", value, "popPicturePc");
            return (Criteria) this;
        }

        public Criteria andPopPicturePcIn(List<String> values) {
            addCriterion("pop_picture_pc in", values, "popPicturePc");
            return (Criteria) this;
        }

        public Criteria andPopPicturePcNotIn(List<String> values) {
            addCriterion("pop_picture_pc not in", values, "popPicturePc");
            return (Criteria) this;
        }

        public Criteria andPopPicturePcBetween(String value1, String value2) {
            addCriterion("pop_picture_pc between", value1, value2, "popPicturePc");
            return (Criteria) this;
        }

        public Criteria andPopPicturePcNotBetween(String value1, String value2) {
            addCriterion("pop_picture_pc not between", value1, value2, "popPicturePc");
            return (Criteria) this;
        }

        public Criteria andBgPicturePcIsNull() {
            addCriterion("bg_picture_pc is null");
            return (Criteria) this;
        }

        public Criteria andBgPicturePcIsNotNull() {
            addCriterion("bg_picture_pc is not null");
            return (Criteria) this;
        }

        public Criteria andBgPicturePcEqualTo(String value) {
            addCriterion("bg_picture_pc =", value, "bgPicturePc");
            return (Criteria) this;
        }

        public Criteria andBgPicturePcNotEqualTo(String value) {
            addCriterion("bg_picture_pc <>", value, "bgPicturePc");
            return (Criteria) this;
        }

        public Criteria andBgPicturePcGreaterThan(String value) {
            addCriterion("bg_picture_pc >", value, "bgPicturePc");
            return (Criteria) this;
        }

        public Criteria andBgPicturePcGreaterThanOrEqualTo(String value) {
            addCriterion("bg_picture_pc >=", value, "bgPicturePc");
            return (Criteria) this;
        }

        public Criteria andBgPicturePcLessThan(String value) {
            addCriterion("bg_picture_pc <", value, "bgPicturePc");
            return (Criteria) this;
        }

        public Criteria andBgPicturePcLessThanOrEqualTo(String value) {
            addCriterion("bg_picture_pc <=", value, "bgPicturePc");
            return (Criteria) this;
        }

        public Criteria andBgPicturePcLike(String value) {
            addCriterion("bg_picture_pc like", value, "bgPicturePc");
            return (Criteria) this;
        }

        public Criteria andBgPicturePcNotLike(String value) {
            addCriterion("bg_picture_pc not like", value, "bgPicturePc");
            return (Criteria) this;
        }

        public Criteria andBgPicturePcIn(List<String> values) {
            addCriterion("bg_picture_pc in", values, "bgPicturePc");
            return (Criteria) this;
        }

        public Criteria andBgPicturePcNotIn(List<String> values) {
            addCriterion("bg_picture_pc not in", values, "bgPicturePc");
            return (Criteria) this;
        }

        public Criteria andBgPicturePcBetween(String value1, String value2) {
            addCriterion("bg_picture_pc between", value1, value2, "bgPicturePc");
            return (Criteria) this;
        }

        public Criteria andBgPicturePcNotBetween(String value1, String value2) {
            addCriterion("bg_picture_pc not between", value1, value2, "bgPicturePc");
            return (Criteria) this;
        }

        public Criteria andSharePictureIsNull() {
            addCriterion("share_picture is null");
            return (Criteria) this;
        }

        public Criteria andSharePictureIsNotNull() {
            addCriterion("share_picture is not null");
            return (Criteria) this;
        }

        public Criteria andSharePictureEqualTo(String value) {
            addCriterion("share_picture =", value, "sharePicture");
            return (Criteria) this;
        }

        public Criteria andSharePictureNotEqualTo(String value) {
            addCriterion("share_picture <>", value, "sharePicture");
            return (Criteria) this;
        }

        public Criteria andSharePictureGreaterThan(String value) {
            addCriterion("share_picture >", value, "sharePicture");
            return (Criteria) this;
        }

        public Criteria andSharePictureGreaterThanOrEqualTo(String value) {
            addCriterion("share_picture >=", value, "sharePicture");
            return (Criteria) this;
        }

        public Criteria andSharePictureLessThan(String value) {
            addCriterion("share_picture <", value, "sharePicture");
            return (Criteria) this;
        }

        public Criteria andSharePictureLessThanOrEqualTo(String value) {
            addCriterion("share_picture <=", value, "sharePicture");
            return (Criteria) this;
        }

        public Criteria andSharePictureLike(String value) {
            addCriterion("share_picture like", value, "sharePicture");
            return (Criteria) this;
        }

        public Criteria andSharePictureNotLike(String value) {
            addCriterion("share_picture not like", value, "sharePicture");
            return (Criteria) this;
        }

        public Criteria andSharePictureIn(List<String> values) {
            addCriterion("share_picture in", values, "sharePicture");
            return (Criteria) this;
        }

        public Criteria andSharePictureNotIn(List<String> values) {
            addCriterion("share_picture not in", values, "sharePicture");
            return (Criteria) this;
        }

        public Criteria andSharePictureBetween(String value1, String value2) {
            addCriterion("share_picture between", value1, value2, "sharePicture");
            return (Criteria) this;
        }

        public Criteria andSharePictureNotBetween(String value1, String value2) {
            addCriterion("share_picture not between", value1, value2, "sharePicture");
            return (Criteria) this;
        }

        public Criteria andPopUpIsNull() {
            addCriterion("pop_up is null");
            return (Criteria) this;
        }

        public Criteria andPopUpIsNotNull() {
            addCriterion("pop_up is not null");
            return (Criteria) this;
        }

        public Criteria andPopUpEqualTo(Byte value) {
            addCriterion("pop_up =", value, "popUp");
            return (Criteria) this;
        }

        public Criteria andPopUpNotEqualTo(Byte value) {
            addCriterion("pop_up <>", value, "popUp");
            return (Criteria) this;
        }

        public Criteria andPopUpGreaterThan(Byte value) {
            addCriterion("pop_up >", value, "popUp");
            return (Criteria) this;
        }

        public Criteria andPopUpGreaterThanOrEqualTo(Byte value) {
            addCriterion("pop_up >=", value, "popUp");
            return (Criteria) this;
        }

        public Criteria andPopUpLessThan(Byte value) {
            addCriterion("pop_up <", value, "popUp");
            return (Criteria) this;
        }

        public Criteria andPopUpLessThanOrEqualTo(Byte value) {
            addCriterion("pop_up <=", value, "popUp");
            return (Criteria) this;
        }

        public Criteria andPopUpIn(List<Byte> values) {
            addCriterion("pop_up in", values, "popUp");
            return (Criteria) this;
        }

        public Criteria andPopUpNotIn(List<Byte> values) {
            addCriterion("pop_up not in", values, "popUp");
            return (Criteria) this;
        }

        public Criteria andPopUpBetween(Byte value1, Byte value2) {
            addCriterion("pop_up between", value1, value2, "popUp");
            return (Criteria) this;
        }

        public Criteria andPopUpNotBetween(Byte value1, Byte value2) {
            addCriterion("pop_up not between", value1, value2, "popUp");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(String value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(String value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(String value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(String value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(String value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLike(String value) {
            addCriterion("create_id like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotLike(String value) {
            addCriterion("create_id not like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<String> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<String> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(String value1, String value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(String value1, String value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(String value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(String value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(String value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(String value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(String value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(String value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLike(String value) {
            addCriterion("update_id like", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotLike(String value) {
            addCriterion("update_id not like", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<String> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<String> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(String value1, String value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(String value1, String value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andActMoneyIsNull() {
            addCriterion("act_money is null");
            return (Criteria) this;
        }

        public Criteria andActMoneyIsNotNull() {
            addCriterion("act_money is not null");
            return (Criteria) this;
        }

        public Criteria andActMoneyEqualTo(BigDecimal value) {
            addCriterion("act_money =", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyNotEqualTo(BigDecimal value) {
            addCriterion("act_money <>", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyGreaterThan(BigDecimal value) {
            addCriterion("act_money >", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("act_money >=", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyLessThan(BigDecimal value) {
            addCriterion("act_money <", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("act_money <=", value, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyIn(List<BigDecimal> values) {
            addCriterion("act_money in", values, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyNotIn(List<BigDecimal> values) {
            addCriterion("act_money not in", values, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("act_money between", value1, value2, "actMoney");
            return (Criteria) this;
        }

        public Criteria andActMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("act_money not between", value1, value2, "actMoney");
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