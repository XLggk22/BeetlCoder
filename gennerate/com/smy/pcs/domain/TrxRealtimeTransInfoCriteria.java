package com.smy.pcs.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrxRealtimeTransInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public TrxRealtimeTransInfoCriteria() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return pageSize;
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

       

		 public Criteria andTransSeqnoIsNull() {
            addCriterion("TRANS_SEQNO is null");
            return (Criteria) this;
        }

        public Criteria andTransSeqnoIsNotNull() {
            addCriterion("TRANS_SEQNO is not null");
            return (Criteria) this;
        }

        public Criteria andTransSeqnoEqualTo(String value) {
            addCriterion("TRANS_SEQNO =", value, "transSeqno");
            return (Criteria) this;
        }

        public Criteria andTransSeqnoNotEqualTo(String value) {
            addCriterion("TRANS_SEQNO <>", value, "transSeqno");
            return (Criteria) this;
        }

        public Criteria andTransSeqnoGreaterThan(String value) {
            addCriterion("TRANS_SEQNO >", value, "transSeqno");
            return (Criteria) this;
        }

        public Criteria andTransSeqnoGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_SEQNO >=", value, "transSeqno");
            return (Criteria) this;
        }

        public Criteria andTransSeqnoLessThan(String value) {
            addCriterion("TRANS_SEQNO <", value, "transSeqno");
            return (Criteria) this;
        }

        public Criteria andTransSeqnoLessThanOrEqualTo(String value) {
            addCriterion("TRANS_SEQNO <=", value, "transSeqno");
            return (Criteria) this;
        }

        public Criteria andTransSeqnoLike(String value) {
            addCriterion("TRANS_SEQNO like", value, "transSeqno");
            return (Criteria) this;
        }

        public Criteria andTransSeqnoNotLike(String value) {
            addCriterion("TRANS_SEQNO not like", value, "transSeqno");
            return (Criteria) this;
        }

        public Criteria andTransSeqnoIn(List<String> values) {
            addCriterion("TRANS_SEQNO in", values, "transSeqno");
            return (Criteria) this;
        }

        public Criteria andTransSeqnoNotIn(List<String> values) {
            addCriterion("TRANS_SEQNO not in", values, "transSeqno");
            return (Criteria) this;
        }

        public Criteria andTransSeqnoBetween(String value1, String value2) {
            addCriterion("TRANS_SEQNO between", value1, value2, "transSeqno");
            return (Criteria) this;
        }

        public Criteria andTransSeqnoNotBetween(String value1, String value2) {
            addCriterion("TRANS_SEQNO not between", value1, value2, "transSeqno");
            return (Criteria) this;
        }
		
		 public Criteria andOrgTransSeqnoIsNull() {
            addCriterion("ORG_TRANS_SEQNO is null");
            return (Criteria) this;
        }

        public Criteria andOrgTransSeqnoIsNotNull() {
            addCriterion("ORG_TRANS_SEQNO is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTransSeqnoEqualTo(String value) {
            addCriterion("ORG_TRANS_SEQNO =", value, "orgTransSeqno");
            return (Criteria) this;
        }

        public Criteria andOrgTransSeqnoNotEqualTo(String value) {
            addCriterion("ORG_TRANS_SEQNO <>", value, "orgTransSeqno");
            return (Criteria) this;
        }

        public Criteria andOrgTransSeqnoGreaterThan(String value) {
            addCriterion("ORG_TRANS_SEQNO >", value, "orgTransSeqno");
            return (Criteria) this;
        }

        public Criteria andOrgTransSeqnoGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_TRANS_SEQNO >=", value, "orgTransSeqno");
            return (Criteria) this;
        }

        public Criteria andOrgTransSeqnoLessThan(String value) {
            addCriterion("ORG_TRANS_SEQNO <", value, "orgTransSeqno");
            return (Criteria) this;
        }

        public Criteria andOrgTransSeqnoLessThanOrEqualTo(String value) {
            addCriterion("ORG_TRANS_SEQNO <=", value, "orgTransSeqno");
            return (Criteria) this;
        }

        public Criteria andOrgTransSeqnoLike(String value) {
            addCriterion("ORG_TRANS_SEQNO like", value, "orgTransSeqno");
            return (Criteria) this;
        }

        public Criteria andOrgTransSeqnoNotLike(String value) {
            addCriterion("ORG_TRANS_SEQNO not like", value, "orgTransSeqno");
            return (Criteria) this;
        }

        public Criteria andOrgTransSeqnoIn(List<String> values) {
            addCriterion("ORG_TRANS_SEQNO in", values, "orgTransSeqno");
            return (Criteria) this;
        }

        public Criteria andOrgTransSeqnoNotIn(List<String> values) {
            addCriterion("ORG_TRANS_SEQNO not in", values, "orgTransSeqno");
            return (Criteria) this;
        }

        public Criteria andOrgTransSeqnoBetween(String value1, String value2) {
            addCriterion("ORG_TRANS_SEQNO between", value1, value2, "orgTransSeqno");
            return (Criteria) this;
        }

        public Criteria andOrgTransSeqnoNotBetween(String value1, String value2) {
            addCriterion("ORG_TRANS_SEQNO not between", value1, value2, "orgTransSeqno");
            return (Criteria) this;
        }
		
		 public Criteria andCustNoIsNull() {
            addCriterion("CUST_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustNoIsNotNull() {
            addCriterion("CUST_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustNoEqualTo(String value) {
            addCriterion("CUST_NO =", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotEqualTo(String value) {
            addCriterion("CUST_NO <>", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThan(String value) {
            addCriterion("CUST_NO >", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NO >=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThan(String value) {
            addCriterion("CUST_NO <", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThanOrEqualTo(String value) {
            addCriterion("CUST_NO <=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLike(String value) {
            addCriterion("CUST_NO like", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotLike(String value) {
            addCriterion("CUST_NO not like", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoIn(List<String> values) {
            addCriterion("CUST_NO in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotIn(List<String> values) {
            addCriterion("CUST_NO not in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoBetween(String value1, String value2) {
            addCriterion("CUST_NO between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotBetween(String value1, String value2) {
            addCriterion("CUST_NO not between", value1, value2, "custNo");
            return (Criteria) this;
        }
		
		 public Criteria andBankCardNoIsNull() {
            addCriterion("BANK_CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNotNull() {
            addCriterion("BANK_CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoEqualTo(String value) {
            addCriterion("BANK_CARD_NO =", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotEqualTo(String value) {
            addCriterion("BANK_CARD_NO <>", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThan(String value) {
            addCriterion("BANK_CARD_NO >", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_NO >=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThan(String value) {
            addCriterion("BANK_CARD_NO <", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_NO <=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLike(String value) {
            addCriterion("BANK_CARD_NO like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotLike(String value) {
            addCriterion("BANK_CARD_NO not like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIn(List<String> values) {
            addCriterion("BANK_CARD_NO in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotIn(List<String> values) {
            addCriterion("BANK_CARD_NO not in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoBetween(String value1, String value2) {
            addCriterion("BANK_CARD_NO between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotBetween(String value1, String value2) {
            addCriterion("BANK_CARD_NO not between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }
		
		 public Criteria andBankCardTypeIsNull() {
            addCriterion("BANK_CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeIsNotNull() {
            addCriterion("BANK_CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeEqualTo(String value) {
            addCriterion("BANK_CARD_TYPE =", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotEqualTo(String value) {
            addCriterion("BANK_CARD_TYPE <>", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeGreaterThan(String value) {
            addCriterion("BANK_CARD_TYPE >", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_TYPE >=", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeLessThan(String value) {
            addCriterion("BANK_CARD_TYPE <", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeLessThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_TYPE <=", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeLike(String value) {
            addCriterion("BANK_CARD_TYPE like", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotLike(String value) {
            addCriterion("BANK_CARD_TYPE not like", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeIn(List<String> values) {
            addCriterion("BANK_CARD_TYPE in", values, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotIn(List<String> values) {
            addCriterion("BANK_CARD_TYPE not in", values, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeBetween(String value1, String value2) {
            addCriterion("BANK_CARD_TYPE between", value1, value2, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotBetween(String value1, String value2) {
            addCriterion("BANK_CARD_TYPE not between", value1, value2, "bankCardType");
            return (Criteria) this;
        }
		
		 public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
            return (Criteria) this;
        }
		
		 public Criteria andTransAmtIsNull() {
            addCriterion("TRANS_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTransAmtIsNotNull() {
            addCriterion("TRANS_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTransAmtEqualTo(String value) {
            addCriterion("TRANS_AMT =", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotEqualTo(String value) {
            addCriterion("TRANS_AMT <>", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtGreaterThan(String value) {
            addCriterion("TRANS_AMT >", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_AMT >=", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtLessThan(String value) {
            addCriterion("TRANS_AMT <", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtLessThanOrEqualTo(String value) {
            addCriterion("TRANS_AMT <=", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtLike(String value) {
            addCriterion("TRANS_AMT like", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotLike(String value) {
            addCriterion("TRANS_AMT not like", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtIn(List<String> values) {
            addCriterion("TRANS_AMT in", values, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotIn(List<String> values) {
            addCriterion("TRANS_AMT not in", values, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtBetween(String value1, String value2) {
            addCriterion("TRANS_AMT between", value1, value2, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotBetween(String value1, String value2) {
            addCriterion("TRANS_AMT not between", value1, value2, "transAmt");
            return (Criteria) this;
        }
		
		 public Criteria andTransTypeIsNull() {
            addCriterion("TRANS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNotNull() {
            addCriterion("TRANS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransTypeEqualTo(String value) {
            addCriterion("TRANS_TYPE =", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotEqualTo(String value) {
            addCriterion("TRANS_TYPE <>", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThan(String value) {
            addCriterion("TRANS_TYPE >", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_TYPE >=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThan(String value) {
            addCriterion("TRANS_TYPE <", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThanOrEqualTo(String value) {
            addCriterion("TRANS_TYPE <=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLike(String value) {
            addCriterion("TRANS_TYPE like", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotLike(String value) {
            addCriterion("TRANS_TYPE not like", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeIn(List<String> values) {
            addCriterion("TRANS_TYPE in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotIn(List<String> values) {
            addCriterion("TRANS_TYPE not in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeBetween(String value1, String value2) {
            addCriterion("TRANS_TYPE between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotBetween(String value1, String value2) {
            addCriterion("TRANS_TYPE not between", value1, value2, "transType");
            return (Criteria) this;
        }
		
		 public Criteria andTransFromIsNull() {
            addCriterion("TRANS_FROM is null");
            return (Criteria) this;
        }

        public Criteria andTransFromIsNotNull() {
            addCriterion("TRANS_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andTransFromEqualTo(String value) {
            addCriterion("TRANS_FROM =", value, "transFrom");
            return (Criteria) this;
        }

        public Criteria andTransFromNotEqualTo(String value) {
            addCriterion("TRANS_FROM <>", value, "transFrom");
            return (Criteria) this;
        }

        public Criteria andTransFromGreaterThan(String value) {
            addCriterion("TRANS_FROM >", value, "transFrom");
            return (Criteria) this;
        }

        public Criteria andTransFromGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_FROM >=", value, "transFrom");
            return (Criteria) this;
        }

        public Criteria andTransFromLessThan(String value) {
            addCriterion("TRANS_FROM <", value, "transFrom");
            return (Criteria) this;
        }

        public Criteria andTransFromLessThanOrEqualTo(String value) {
            addCriterion("TRANS_FROM <=", value, "transFrom");
            return (Criteria) this;
        }

        public Criteria andTransFromLike(String value) {
            addCriterion("TRANS_FROM like", value, "transFrom");
            return (Criteria) this;
        }

        public Criteria andTransFromNotLike(String value) {
            addCriterion("TRANS_FROM not like", value, "transFrom");
            return (Criteria) this;
        }

        public Criteria andTransFromIn(List<String> values) {
            addCriterion("TRANS_FROM in", values, "transFrom");
            return (Criteria) this;
        }

        public Criteria andTransFromNotIn(List<String> values) {
            addCriterion("TRANS_FROM not in", values, "transFrom");
            return (Criteria) this;
        }

        public Criteria andTransFromBetween(String value1, String value2) {
            addCriterion("TRANS_FROM between", value1, value2, "transFrom");
            return (Criteria) this;
        }

        public Criteria andTransFromNotBetween(String value1, String value2) {
            addCriterion("TRANS_FROM not between", value1, value2, "transFrom");
            return (Criteria) this;
        }
		
		 public Criteria andTransDescIsNull() {
            addCriterion("TRANS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTransDescIsNotNull() {
            addCriterion("TRANS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTransDescEqualTo(String value) {
            addCriterion("TRANS_DESC =", value, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescNotEqualTo(String value) {
            addCriterion("TRANS_DESC <>", value, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescGreaterThan(String value) {
            addCriterion("TRANS_DESC >", value, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_DESC >=", value, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescLessThan(String value) {
            addCriterion("TRANS_DESC <", value, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescLessThanOrEqualTo(String value) {
            addCriterion("TRANS_DESC <=", value, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescLike(String value) {
            addCriterion("TRANS_DESC like", value, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescNotLike(String value) {
            addCriterion("TRANS_DESC not like", value, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescIn(List<String> values) {
            addCriterion("TRANS_DESC in", values, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescNotIn(List<String> values) {
            addCriterion("TRANS_DESC not in", values, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescBetween(String value1, String value2) {
            addCriterion("TRANS_DESC between", value1, value2, "transDesc");
            return (Criteria) this;
        }

        public Criteria andTransDescNotBetween(String value1, String value2) {
            addCriterion("TRANS_DESC not between", value1, value2, "transDesc");
            return (Criteria) this;
        }
		
		 public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }
		
		 public Criteria andValidCodeIsNull() {
            addCriterion("VALID_CODE is null");
            return (Criteria) this;
        }

        public Criteria andValidCodeIsNotNull() {
            addCriterion("VALID_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andValidCodeEqualTo(String value) {
            addCriterion("VALID_CODE =", value, "validCode");
            return (Criteria) this;
        }

        public Criteria andValidCodeNotEqualTo(String value) {
            addCriterion("VALID_CODE <>", value, "validCode");
            return (Criteria) this;
        }

        public Criteria andValidCodeGreaterThan(String value) {
            addCriterion("VALID_CODE >", value, "validCode");
            return (Criteria) this;
        }

        public Criteria andValidCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VALID_CODE >=", value, "validCode");
            return (Criteria) this;
        }

        public Criteria andValidCodeLessThan(String value) {
            addCriterion("VALID_CODE <", value, "validCode");
            return (Criteria) this;
        }

        public Criteria andValidCodeLessThanOrEqualTo(String value) {
            addCriterion("VALID_CODE <=", value, "validCode");
            return (Criteria) this;
        }

        public Criteria andValidCodeLike(String value) {
            addCriterion("VALID_CODE like", value, "validCode");
            return (Criteria) this;
        }

        public Criteria andValidCodeNotLike(String value) {
            addCriterion("VALID_CODE not like", value, "validCode");
            return (Criteria) this;
        }

        public Criteria andValidCodeIn(List<String> values) {
            addCriterion("VALID_CODE in", values, "validCode");
            return (Criteria) this;
        }

        public Criteria andValidCodeNotIn(List<String> values) {
            addCriterion("VALID_CODE not in", values, "validCode");
            return (Criteria) this;
        }

        public Criteria andValidCodeBetween(String value1, String value2) {
            addCriterion("VALID_CODE between", value1, value2, "validCode");
            return (Criteria) this;
        }

        public Criteria andValidCodeNotBetween(String value1, String value2) {
            addCriterion("VALID_CODE not between", value1, value2, "validCode");
            return (Criteria) this;
        }
		
		 public Criteria andStorablePanIsNull() {
            addCriterion("STORABLE_PAN is null");
            return (Criteria) this;
        }

        public Criteria andStorablePanIsNotNull() {
            addCriterion("STORABLE_PAN is not null");
            return (Criteria) this;
        }

        public Criteria andStorablePanEqualTo(String value) {
            addCriterion("STORABLE_PAN =", value, "storablePan");
            return (Criteria) this;
        }

        public Criteria andStorablePanNotEqualTo(String value) {
            addCriterion("STORABLE_PAN <>", value, "storablePan");
            return (Criteria) this;
        }

        public Criteria andStorablePanGreaterThan(String value) {
            addCriterion("STORABLE_PAN >", value, "storablePan");
            return (Criteria) this;
        }

        public Criteria andStorablePanGreaterThanOrEqualTo(String value) {
            addCriterion("STORABLE_PAN >=", value, "storablePan");
            return (Criteria) this;
        }

        public Criteria andStorablePanLessThan(String value) {
            addCriterion("STORABLE_PAN <", value, "storablePan");
            return (Criteria) this;
        }

        public Criteria andStorablePanLessThanOrEqualTo(String value) {
            addCriterion("STORABLE_PAN <=", value, "storablePan");
            return (Criteria) this;
        }

        public Criteria andStorablePanLike(String value) {
            addCriterion("STORABLE_PAN like", value, "storablePan");
            return (Criteria) this;
        }

        public Criteria andStorablePanNotLike(String value) {
            addCriterion("STORABLE_PAN not like", value, "storablePan");
            return (Criteria) this;
        }

        public Criteria andStorablePanIn(List<String> values) {
            addCriterion("STORABLE_PAN in", values, "storablePan");
            return (Criteria) this;
        }

        public Criteria andStorablePanNotIn(List<String> values) {
            addCriterion("STORABLE_PAN not in", values, "storablePan");
            return (Criteria) this;
        }

        public Criteria andStorablePanBetween(String value1, String value2) {
            addCriterion("STORABLE_PAN between", value1, value2, "storablePan");
            return (Criteria) this;
        }

        public Criteria andStorablePanNotBetween(String value1, String value2) {
            addCriterion("STORABLE_PAN not between", value1, value2, "storablePan");
            return (Criteria) this;
        }
		
		 public Criteria andTransDateIsNull() {
            addCriterion("TRANS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNotNull() {
            addCriterion("TRANS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransDateEqualTo(String value) {
            addCriterion("TRANS_DATE =", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotEqualTo(String value) {
            addCriterion("TRANS_DATE <>", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThan(String value) {
            addCriterion("TRANS_DATE >", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_DATE >=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThan(String value) {
            addCriterion("TRANS_DATE <", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThanOrEqualTo(String value) {
            addCriterion("TRANS_DATE <=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLike(String value) {
            addCriterion("TRANS_DATE like", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotLike(String value) {
            addCriterion("TRANS_DATE not like", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateIn(List<String> values) {
            addCriterion("TRANS_DATE in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotIn(List<String> values) {
            addCriterion("TRANS_DATE not in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateBetween(String value1, String value2) {
            addCriterion("TRANS_DATE between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotBetween(String value1, String value2) {
            addCriterion("TRANS_DATE not between", value1, value2, "transDate");
            return (Criteria) this;
        }
		
		 public Criteria andTransTimeIsNull() {
            addCriterion("TRANS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNotNull() {
            addCriterion("TRANS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTransTimeEqualTo(String value) {
            addCriterion("TRANS_TIME =", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotEqualTo(String value) {
            addCriterion("TRANS_TIME <>", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThan(String value) {
            addCriterion("TRANS_TIME >", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_TIME >=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThan(String value) {
            addCriterion("TRANS_TIME <", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThanOrEqualTo(String value) {
            addCriterion("TRANS_TIME <=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLike(String value) {
            addCriterion("TRANS_TIME like", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotLike(String value) {
            addCriterion("TRANS_TIME not like", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeIn(List<String> values) {
            addCriterion("TRANS_TIME in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotIn(List<String> values) {
            addCriterion("TRANS_TIME not in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeBetween(String value1, String value2) {
            addCriterion("TRANS_TIME between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotBetween(String value1, String value2) {
            addCriterion("TRANS_TIME not between", value1, value2, "transTime");
            return (Criteria) this;
        }
		
		 public Criteria andSettleDateIsNull() {
            addCriterion("SETTLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSettleDateIsNotNull() {
            addCriterion("SETTLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSettleDateEqualTo(String value) {
            addCriterion("SETTLE_DATE =", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotEqualTo(String value) {
            addCriterion("SETTLE_DATE <>", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateGreaterThan(String value) {
            addCriterion("SETTLE_DATE >", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_DATE >=", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLessThan(String value) {
            addCriterion("SETTLE_DATE <", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_DATE <=", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateLike(String value) {
            addCriterion("SETTLE_DATE like", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotLike(String value) {
            addCriterion("SETTLE_DATE not like", value, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateIn(List<String> values) {
            addCriterion("SETTLE_DATE in", values, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotIn(List<String> values) {
            addCriterion("SETTLE_DATE not in", values, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateBetween(String value1, String value2) {
            addCriterion("SETTLE_DATE between", value1, value2, "settleDate");
            return (Criteria) this;
        }

        public Criteria andSettleDateNotBetween(String value1, String value2) {
            addCriterion("SETTLE_DATE not between", value1, value2, "settleDate");
            return (Criteria) this;
        }
		
		 public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }
		
		 public Criteria andThirdTransStatusIsNull() {
            addCriterion("THIRD_TRANS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andThirdTransStatusIsNotNull() {
            addCriterion("THIRD_TRANS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andThirdTransStatusEqualTo(String value) {
            addCriterion("THIRD_TRANS_STATUS =", value, "thirdTransStatus");
            return (Criteria) this;
        }

        public Criteria andThirdTransStatusNotEqualTo(String value) {
            addCriterion("THIRD_TRANS_STATUS <>", value, "thirdTransStatus");
            return (Criteria) this;
        }

        public Criteria andThirdTransStatusGreaterThan(String value) {
            addCriterion("THIRD_TRANS_STATUS >", value, "thirdTransStatus");
            return (Criteria) this;
        }

        public Criteria andThirdTransStatusGreaterThanOrEqualTo(String value) {
            addCriterion("THIRD_TRANS_STATUS >=", value, "thirdTransStatus");
            return (Criteria) this;
        }

        public Criteria andThirdTransStatusLessThan(String value) {
            addCriterion("THIRD_TRANS_STATUS <", value, "thirdTransStatus");
            return (Criteria) this;
        }

        public Criteria andThirdTransStatusLessThanOrEqualTo(String value) {
            addCriterion("THIRD_TRANS_STATUS <=", value, "thirdTransStatus");
            return (Criteria) this;
        }

        public Criteria andThirdTransStatusLike(String value) {
            addCriterion("THIRD_TRANS_STATUS like", value, "thirdTransStatus");
            return (Criteria) this;
        }

        public Criteria andThirdTransStatusNotLike(String value) {
            addCriterion("THIRD_TRANS_STATUS not like", value, "thirdTransStatus");
            return (Criteria) this;
        }

        public Criteria andThirdTransStatusIn(List<String> values) {
            addCriterion("THIRD_TRANS_STATUS in", values, "thirdTransStatus");
            return (Criteria) this;
        }

        public Criteria andThirdTransStatusNotIn(List<String> values) {
            addCriterion("THIRD_TRANS_STATUS not in", values, "thirdTransStatus");
            return (Criteria) this;
        }

        public Criteria andThirdTransStatusBetween(String value1, String value2) {
            addCriterion("THIRD_TRANS_STATUS between", value1, value2, "thirdTransStatus");
            return (Criteria) this;
        }

        public Criteria andThirdTransStatusNotBetween(String value1, String value2) {
            addCriterion("THIRD_TRANS_STATUS not between", value1, value2, "thirdTransStatus");
            return (Criteria) this;
        }
		
		 public Criteria andReturnCodeIsNull() {
            addCriterion("RETURN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIsNotNull() {
            addCriterion("RETURN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCodeEqualTo(String value) {
            addCriterion("RETURN_CODE =", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotEqualTo(String value) {
            addCriterion("RETURN_CODE <>", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeGreaterThan(String value) {
            addCriterion("RETURN_CODE >", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_CODE >=", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLessThan(String value) {
            addCriterion("RETURN_CODE <", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLessThanOrEqualTo(String value) {
            addCriterion("RETURN_CODE <=", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLike(String value) {
            addCriterion("RETURN_CODE like", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotLike(String value) {
            addCriterion("RETURN_CODE not like", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIn(List<String> values) {
            addCriterion("RETURN_CODE in", values, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotIn(List<String> values) {
            addCriterion("RETURN_CODE not in", values, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeBetween(String value1, String value2) {
            addCriterion("RETURN_CODE between", value1, value2, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotBetween(String value1, String value2) {
            addCriterion("RETURN_CODE not between", value1, value2, "returnCode");
            return (Criteria) this;
        }
		
		 public Criteria andReturnMsgIsNull() {
            addCriterion("RETURN_MSG is null");
            return (Criteria) this;
        }

        public Criteria andReturnMsgIsNotNull() {
            addCriterion("RETURN_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMsgEqualTo(String value) {
            addCriterion("RETURN_MSG =", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotEqualTo(String value) {
            addCriterion("RETURN_MSG <>", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgGreaterThan(String value) {
            addCriterion("RETURN_MSG >", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_MSG >=", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgLessThan(String value) {
            addCriterion("RETURN_MSG <", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgLessThanOrEqualTo(String value) {
            addCriterion("RETURN_MSG <=", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgLike(String value) {
            addCriterion("RETURN_MSG like", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotLike(String value) {
            addCriterion("RETURN_MSG not like", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgIn(List<String> values) {
            addCriterion("RETURN_MSG in", values, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotIn(List<String> values) {
            addCriterion("RETURN_MSG not in", values, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgBetween(String value1, String value2) {
            addCriterion("RETURN_MSG between", value1, value2, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotBetween(String value1, String value2) {
            addCriterion("RETURN_MSG not between", value1, value2, "returnMsg");
            return (Criteria) this;
        }
		
		 public Criteria andBalStatusIsNull() {
            addCriterion("BAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andBalStatusIsNotNull() {
            addCriterion("BAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBalStatusEqualTo(String value) {
            addCriterion("BAL_STATUS =", value, "balStatus");
            return (Criteria) this;
        }

        public Criteria andBalStatusNotEqualTo(String value) {
            addCriterion("BAL_STATUS <>", value, "balStatus");
            return (Criteria) this;
        }

        public Criteria andBalStatusGreaterThan(String value) {
            addCriterion("BAL_STATUS >", value, "balStatus");
            return (Criteria) this;
        }

        public Criteria andBalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BAL_STATUS >=", value, "balStatus");
            return (Criteria) this;
        }

        public Criteria andBalStatusLessThan(String value) {
            addCriterion("BAL_STATUS <", value, "balStatus");
            return (Criteria) this;
        }

        public Criteria andBalStatusLessThanOrEqualTo(String value) {
            addCriterion("BAL_STATUS <=", value, "balStatus");
            return (Criteria) this;
        }

        public Criteria andBalStatusLike(String value) {
            addCriterion("BAL_STATUS like", value, "balStatus");
            return (Criteria) this;
        }

        public Criteria andBalStatusNotLike(String value) {
            addCriterion("BAL_STATUS not like", value, "balStatus");
            return (Criteria) this;
        }

        public Criteria andBalStatusIn(List<String> values) {
            addCriterion("BAL_STATUS in", values, "balStatus");
            return (Criteria) this;
        }

        public Criteria andBalStatusNotIn(List<String> values) {
            addCriterion("BAL_STATUS not in", values, "balStatus");
            return (Criteria) this;
        }

        public Criteria andBalStatusBetween(String value1, String value2) {
            addCriterion("BAL_STATUS between", value1, value2, "balStatus");
            return (Criteria) this;
        }

        public Criteria andBalStatusNotBetween(String value1, String value2) {
            addCriterion("BAL_STATUS not between", value1, value2, "balStatus");
            return (Criteria) this;
        }
		
		 public Criteria andBalResultIsNull() {
            addCriterion("BAL_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andBalResultIsNotNull() {
            addCriterion("BAL_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andBalResultEqualTo(String value) {
            addCriterion("BAL_RESULT =", value, "balResult");
            return (Criteria) this;
        }

        public Criteria andBalResultNotEqualTo(String value) {
            addCriterion("BAL_RESULT <>", value, "balResult");
            return (Criteria) this;
        }

        public Criteria andBalResultGreaterThan(String value) {
            addCriterion("BAL_RESULT >", value, "balResult");
            return (Criteria) this;
        }

        public Criteria andBalResultGreaterThanOrEqualTo(String value) {
            addCriterion("BAL_RESULT >=", value, "balResult");
            return (Criteria) this;
        }

        public Criteria andBalResultLessThan(String value) {
            addCriterion("BAL_RESULT <", value, "balResult");
            return (Criteria) this;
        }

        public Criteria andBalResultLessThanOrEqualTo(String value) {
            addCriterion("BAL_RESULT <=", value, "balResult");
            return (Criteria) this;
        }

        public Criteria andBalResultLike(String value) {
            addCriterion("BAL_RESULT like", value, "balResult");
            return (Criteria) this;
        }

        public Criteria andBalResultNotLike(String value) {
            addCriterion("BAL_RESULT not like", value, "balResult");
            return (Criteria) this;
        }

        public Criteria andBalResultIn(List<String> values) {
            addCriterion("BAL_RESULT in", values, "balResult");
            return (Criteria) this;
        }

        public Criteria andBalResultNotIn(List<String> values) {
            addCriterion("BAL_RESULT not in", values, "balResult");
            return (Criteria) this;
        }

        public Criteria andBalResultBetween(String value1, String value2) {
            addCriterion("BAL_RESULT between", value1, value2, "balResult");
            return (Criteria) this;
        }

        public Criteria andBalResultNotBetween(String value1, String value2) {
            addCriterion("BAL_RESULT not between", value1, value2, "balResult");
            return (Criteria) this;
        }
		
		 public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }
		
		 public Criteria andCustNameIsNull() {
            addCriterion("CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME not between", value1, value2, "custName");
            return (Criteria) this;
        }
		
		 public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("ID_TYPE like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("ID_TYPE not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
            return (Criteria) this;
        }
		
		 public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
            return (Criteria) this;
        }
		
		 public Criteria andMobileNoIsNull() {
            addCriterion("MOBILE_NO is null");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNotNull() {
            addCriterion("MOBILE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNoEqualTo(String value) {
            addCriterion("MOBILE_NO =", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotEqualTo(String value) {
            addCriterion("MOBILE_NO <>", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThan(String value) {
            addCriterion("MOBILE_NO >", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_NO >=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThan(String value) {
            addCriterion("MOBILE_NO <", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_NO <=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLike(String value) {
            addCriterion("MOBILE_NO like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotLike(String value) {
            addCriterion("MOBILE_NO not like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoIn(List<String> values) {
            addCriterion("MOBILE_NO in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotIn(List<String> values) {
            addCriterion("MOBILE_NO not in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoBetween(String value1, String value2) {
            addCriterion("MOBILE_NO between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotBetween(String value1, String value2) {
            addCriterion("MOBILE_NO not between", value1, value2, "mobileNo");
            return (Criteria) this;
        }
		
		 public Criteria andRealtimeThirdPartyCodeIsNull() {
            addCriterion("REALTIME_THIRD_PARTY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRealtimeThirdPartyCodeIsNotNull() {
            addCriterion("REALTIME_THIRD_PARTY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRealtimeThirdPartyCodeEqualTo(String value) {
            addCriterion("REALTIME_THIRD_PARTY_CODE =", value, "realtimeThirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andRealtimeThirdPartyCodeNotEqualTo(String value) {
            addCriterion("REALTIME_THIRD_PARTY_CODE <>", value, "realtimeThirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andRealtimeThirdPartyCodeGreaterThan(String value) {
            addCriterion("REALTIME_THIRD_PARTY_CODE >", value, "realtimeThirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andRealtimeThirdPartyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REALTIME_THIRD_PARTY_CODE >=", value, "realtimeThirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andRealtimeThirdPartyCodeLessThan(String value) {
            addCriterion("REALTIME_THIRD_PARTY_CODE <", value, "realtimeThirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andRealtimeThirdPartyCodeLessThanOrEqualTo(String value) {
            addCriterion("REALTIME_THIRD_PARTY_CODE <=", value, "realtimeThirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andRealtimeThirdPartyCodeLike(String value) {
            addCriterion("REALTIME_THIRD_PARTY_CODE like", value, "realtimeThirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andRealtimeThirdPartyCodeNotLike(String value) {
            addCriterion("REALTIME_THIRD_PARTY_CODE not like", value, "realtimeThirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andRealtimeThirdPartyCodeIn(List<String> values) {
            addCriterion("REALTIME_THIRD_PARTY_CODE in", values, "realtimeThirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andRealtimeThirdPartyCodeNotIn(List<String> values) {
            addCriterion("REALTIME_THIRD_PARTY_CODE not in", values, "realtimeThirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andRealtimeThirdPartyCodeBetween(String value1, String value2) {
            addCriterion("REALTIME_THIRD_PARTY_CODE between", value1, value2, "realtimeThirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andRealtimeThirdPartyCodeNotBetween(String value1, String value2) {
            addCriterion("REALTIME_THIRD_PARTY_CODE not between", value1, value2, "realtimeThirdPartyCode");
            return (Criteria) this;
        }
		
		 public Criteria andOpenBankNameIsNull() {
            addCriterion("OPEN_BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameIsNotNull() {
            addCriterion("OPEN_BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameEqualTo(String value) {
            addCriterion("OPEN_BANK_NAME =", value, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameNotEqualTo(String value) {
            addCriterion("OPEN_BANK_NAME <>", value, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameGreaterThan(String value) {
            addCriterion("OPEN_BANK_NAME >", value, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_BANK_NAME >=", value, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameLessThan(String value) {
            addCriterion("OPEN_BANK_NAME <", value, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameLessThanOrEqualTo(String value) {
            addCriterion("OPEN_BANK_NAME <=", value, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameLike(String value) {
            addCriterion("OPEN_BANK_NAME like", value, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameNotLike(String value) {
            addCriterion("OPEN_BANK_NAME not like", value, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameIn(List<String> values) {
            addCriterion("OPEN_BANK_NAME in", values, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameNotIn(List<String> values) {
            addCriterion("OPEN_BANK_NAME not in", values, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameBetween(String value1, String value2) {
            addCriterion("OPEN_BANK_NAME between", value1, value2, "openBankName");
            return (Criteria) this;
        }

        public Criteria andOpenBankNameNotBetween(String value1, String value2) {
            addCriterion("OPEN_BANK_NAME not between", value1, value2, "openBankName");
            return (Criteria) this;
        }
		
		 public Criteria andBankCodeIsNull() {
            addCriterion("BANK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("BANK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("BANK_CODE =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("BANK_CODE <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("BANK_CODE >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CODE >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("BANK_CODE <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("BANK_CODE <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("BANK_CODE like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("BANK_CODE not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("BANK_CODE in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("BANK_CODE not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("BANK_CODE between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("BANK_CODE not between", value1, value2, "bankCode");
            return (Criteria) this;
        }
		
		 public Criteria andOpenBankProvIsNull() {
            addCriterion("OPEN_BANK_PROV is null");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvIsNotNull() {
            addCriterion("OPEN_BANK_PROV is not null");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvEqualTo(String value) {
            addCriterion("OPEN_BANK_PROV =", value, "openBankProv");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvNotEqualTo(String value) {
            addCriterion("OPEN_BANK_PROV <>", value, "openBankProv");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvGreaterThan(String value) {
            addCriterion("OPEN_BANK_PROV >", value, "openBankProv");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_BANK_PROV >=", value, "openBankProv");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvLessThan(String value) {
            addCriterion("OPEN_BANK_PROV <", value, "openBankProv");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvLessThanOrEqualTo(String value) {
            addCriterion("OPEN_BANK_PROV <=", value, "openBankProv");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvLike(String value) {
            addCriterion("OPEN_BANK_PROV like", value, "openBankProv");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvNotLike(String value) {
            addCriterion("OPEN_BANK_PROV not like", value, "openBankProv");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvIn(List<String> values) {
            addCriterion("OPEN_BANK_PROV in", values, "openBankProv");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvNotIn(List<String> values) {
            addCriterion("OPEN_BANK_PROV not in", values, "openBankProv");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvBetween(String value1, String value2) {
            addCriterion("OPEN_BANK_PROV between", value1, value2, "openBankProv");
            return (Criteria) this;
        }

        public Criteria andOpenBankProvNotBetween(String value1, String value2) {
            addCriterion("OPEN_BANK_PROV not between", value1, value2, "openBankProv");
            return (Criteria) this;
        }
		
		 public Criteria andBizTypeIsNull() {
            addCriterion("BIZ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("BIZ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(String value) {
            addCriterion("BIZ_TYPE =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(String value) {
            addCriterion("BIZ_TYPE <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(String value) {
            addCriterion("BIZ_TYPE >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_TYPE >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(String value) {
            addCriterion("BIZ_TYPE <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(String value) {
            addCriterion("BIZ_TYPE <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLike(String value) {
            addCriterion("BIZ_TYPE like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotLike(String value) {
            addCriterion("BIZ_TYPE not like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<String> values) {
            addCriterion("BIZ_TYPE in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<String> values) {
            addCriterion("BIZ_TYPE not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(String value1, String value2) {
            addCriterion("BIZ_TYPE between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(String value1, String value2) {
            addCriterion("BIZ_TYPE not between", value1, value2, "bizType");
            return (Criteria) this;
        }
		
		 public Criteria andBizObjTypeIsNull() {
            addCriterion("BIZ_OBJ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBizObjTypeIsNotNull() {
            addCriterion("BIZ_OBJ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBizObjTypeEqualTo(String value) {
            addCriterion("BIZ_OBJ_TYPE =", value, "bizObjType");
            return (Criteria) this;
        }

        public Criteria andBizObjTypeNotEqualTo(String value) {
            addCriterion("BIZ_OBJ_TYPE <>", value, "bizObjType");
            return (Criteria) this;
        }

        public Criteria andBizObjTypeGreaterThan(String value) {
            addCriterion("BIZ_OBJ_TYPE >", value, "bizObjType");
            return (Criteria) this;
        }

        public Criteria andBizObjTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_OBJ_TYPE >=", value, "bizObjType");
            return (Criteria) this;
        }

        public Criteria andBizObjTypeLessThan(String value) {
            addCriterion("BIZ_OBJ_TYPE <", value, "bizObjType");
            return (Criteria) this;
        }

        public Criteria andBizObjTypeLessThanOrEqualTo(String value) {
            addCriterion("BIZ_OBJ_TYPE <=", value, "bizObjType");
            return (Criteria) this;
        }

        public Criteria andBizObjTypeLike(String value) {
            addCriterion("BIZ_OBJ_TYPE like", value, "bizObjType");
            return (Criteria) this;
        }

        public Criteria andBizObjTypeNotLike(String value) {
            addCriterion("BIZ_OBJ_TYPE not like", value, "bizObjType");
            return (Criteria) this;
        }

        public Criteria andBizObjTypeIn(List<String> values) {
            addCriterion("BIZ_OBJ_TYPE in", values, "bizObjType");
            return (Criteria) this;
        }

        public Criteria andBizObjTypeNotIn(List<String> values) {
            addCriterion("BIZ_OBJ_TYPE not in", values, "bizObjType");
            return (Criteria) this;
        }

        public Criteria andBizObjTypeBetween(String value1, String value2) {
            addCriterion("BIZ_OBJ_TYPE between", value1, value2, "bizObjType");
            return (Criteria) this;
        }

        public Criteria andBizObjTypeNotBetween(String value1, String value2) {
            addCriterion("BIZ_OBJ_TYPE not between", value1, value2, "bizObjType");
            return (Criteria) this;
        }
		
		 public Criteria andTokenIsNull() {
            addCriterion("TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("TOKEN =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("TOKEN <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("TOKEN >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("TOKEN <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("TOKEN <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("TOKEN like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("TOKEN not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("TOKEN in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("TOKEN not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("TOKEN between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("TOKEN not between", value1, value2, "token");
            return (Criteria) this;
        }
		
		 public Criteria andBussTransDateIsNull() {
            addCriterion("BUSS_TRANS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBussTransDateIsNotNull() {
            addCriterion("BUSS_TRANS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBussTransDateEqualTo(String value) {
            addCriterion("BUSS_TRANS_DATE =", value, "bussTransDate");
            return (Criteria) this;
        }

        public Criteria andBussTransDateNotEqualTo(String value) {
            addCriterion("BUSS_TRANS_DATE <>", value, "bussTransDate");
            return (Criteria) this;
        }

        public Criteria andBussTransDateGreaterThan(String value) {
            addCriterion("BUSS_TRANS_DATE >", value, "bussTransDate");
            return (Criteria) this;
        }

        public Criteria andBussTransDateGreaterThanOrEqualTo(String value) {
            addCriterion("BUSS_TRANS_DATE >=", value, "bussTransDate");
            return (Criteria) this;
        }

        public Criteria andBussTransDateLessThan(String value) {
            addCriterion("BUSS_TRANS_DATE <", value, "bussTransDate");
            return (Criteria) this;
        }

        public Criteria andBussTransDateLessThanOrEqualTo(String value) {
            addCriterion("BUSS_TRANS_DATE <=", value, "bussTransDate");
            return (Criteria) this;
        }

        public Criteria andBussTransDateLike(String value) {
            addCriterion("BUSS_TRANS_DATE like", value, "bussTransDate");
            return (Criteria) this;
        }

        public Criteria andBussTransDateNotLike(String value) {
            addCriterion("BUSS_TRANS_DATE not like", value, "bussTransDate");
            return (Criteria) this;
        }

        public Criteria andBussTransDateIn(List<String> values) {
            addCriterion("BUSS_TRANS_DATE in", values, "bussTransDate");
            return (Criteria) this;
        }

        public Criteria andBussTransDateNotIn(List<String> values) {
            addCriterion("BUSS_TRANS_DATE not in", values, "bussTransDate");
            return (Criteria) this;
        }

        public Criteria andBussTransDateBetween(String value1, String value2) {
            addCriterion("BUSS_TRANS_DATE between", value1, value2, "bussTransDate");
            return (Criteria) this;
        }

        public Criteria andBussTransDateNotBetween(String value1, String value2) {
            addCriterion("BUSS_TRANS_DATE not between", value1, value2, "bussTransDate");
            return (Criteria) this;
        }
		
		 public Criteria andBussTransSeqnoIsNull() {
            addCriterion("BUSS_TRANS_SEQNO is null");
            return (Criteria) this;
        }

        public Criteria andBussTransSeqnoIsNotNull() {
            addCriterion("BUSS_TRANS_SEQNO is not null");
            return (Criteria) this;
        }

        public Criteria andBussTransSeqnoEqualTo(String value) {
            addCriterion("BUSS_TRANS_SEQNO =", value, "bussTransSeqno");
            return (Criteria) this;
        }

        public Criteria andBussTransSeqnoNotEqualTo(String value) {
            addCriterion("BUSS_TRANS_SEQNO <>", value, "bussTransSeqno");
            return (Criteria) this;
        }

        public Criteria andBussTransSeqnoGreaterThan(String value) {
            addCriterion("BUSS_TRANS_SEQNO >", value, "bussTransSeqno");
            return (Criteria) this;
        }

        public Criteria andBussTransSeqnoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSS_TRANS_SEQNO >=", value, "bussTransSeqno");
            return (Criteria) this;
        }

        public Criteria andBussTransSeqnoLessThan(String value) {
            addCriterion("BUSS_TRANS_SEQNO <", value, "bussTransSeqno");
            return (Criteria) this;
        }

        public Criteria andBussTransSeqnoLessThanOrEqualTo(String value) {
            addCriterion("BUSS_TRANS_SEQNO <=", value, "bussTransSeqno");
            return (Criteria) this;
        }

        public Criteria andBussTransSeqnoLike(String value) {
            addCriterion("BUSS_TRANS_SEQNO like", value, "bussTransSeqno");
            return (Criteria) this;
        }

        public Criteria andBussTransSeqnoNotLike(String value) {
            addCriterion("BUSS_TRANS_SEQNO not like", value, "bussTransSeqno");
            return (Criteria) this;
        }

        public Criteria andBussTransSeqnoIn(List<String> values) {
            addCriterion("BUSS_TRANS_SEQNO in", values, "bussTransSeqno");
            return (Criteria) this;
        }

        public Criteria andBussTransSeqnoNotIn(List<String> values) {
            addCriterion("BUSS_TRANS_SEQNO not in", values, "bussTransSeqno");
            return (Criteria) this;
        }

        public Criteria andBussTransSeqnoBetween(String value1, String value2) {
            addCriterion("BUSS_TRANS_SEQNO between", value1, value2, "bussTransSeqno");
            return (Criteria) this;
        }

        public Criteria andBussTransSeqnoNotBetween(String value1, String value2) {
            addCriterion("BUSS_TRANS_SEQNO not between", value1, value2, "bussTransSeqno");
            return (Criteria) this;
        }
		
		 public Criteria andBatDetailIdIsNull() {
            addCriterion("BAT_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBatDetailIdIsNotNull() {
            addCriterion("BAT_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBatDetailIdEqualTo(String value) {
            addCriterion("BAT_DETAIL_ID =", value, "batDetailId");
            return (Criteria) this;
        }

        public Criteria andBatDetailIdNotEqualTo(String value) {
            addCriterion("BAT_DETAIL_ID <>", value, "batDetailId");
            return (Criteria) this;
        }

        public Criteria andBatDetailIdGreaterThan(String value) {
            addCriterion("BAT_DETAIL_ID >", value, "batDetailId");
            return (Criteria) this;
        }

        public Criteria andBatDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("BAT_DETAIL_ID >=", value, "batDetailId");
            return (Criteria) this;
        }

        public Criteria andBatDetailIdLessThan(String value) {
            addCriterion("BAT_DETAIL_ID <", value, "batDetailId");
            return (Criteria) this;
        }

        public Criteria andBatDetailIdLessThanOrEqualTo(String value) {
            addCriterion("BAT_DETAIL_ID <=", value, "batDetailId");
            return (Criteria) this;
        }

        public Criteria andBatDetailIdLike(String value) {
            addCriterion("BAT_DETAIL_ID like", value, "batDetailId");
            return (Criteria) this;
        }

        public Criteria andBatDetailIdNotLike(String value) {
            addCriterion("BAT_DETAIL_ID not like", value, "batDetailId");
            return (Criteria) this;
        }

        public Criteria andBatDetailIdIn(List<String> values) {
            addCriterion("BAT_DETAIL_ID in", values, "batDetailId");
            return (Criteria) this;
        }

        public Criteria andBatDetailIdNotIn(List<String> values) {
            addCriterion("BAT_DETAIL_ID not in", values, "batDetailId");
            return (Criteria) this;
        }

        public Criteria andBatDetailIdBetween(String value1, String value2) {
            addCriterion("BAT_DETAIL_ID between", value1, value2, "batDetailId");
            return (Criteria) this;
        }

        public Criteria andBatDetailIdNotBetween(String value1, String value2) {
            addCriterion("BAT_DETAIL_ID not between", value1, value2, "batDetailId");
            return (Criteria) this;
        }
		
		 public Criteria andBatIdIsNull() {
            addCriterion("BAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andBatIdIsNotNull() {
            addCriterion("BAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBatIdEqualTo(String value) {
            addCriterion("BAT_ID =", value, "batId");
            return (Criteria) this;
        }

        public Criteria andBatIdNotEqualTo(String value) {
            addCriterion("BAT_ID <>", value, "batId");
            return (Criteria) this;
        }

        public Criteria andBatIdGreaterThan(String value) {
            addCriterion("BAT_ID >", value, "batId");
            return (Criteria) this;
        }

        public Criteria andBatIdGreaterThanOrEqualTo(String value) {
            addCriterion("BAT_ID >=", value, "batId");
            return (Criteria) this;
        }

        public Criteria andBatIdLessThan(String value) {
            addCriterion("BAT_ID <", value, "batId");
            return (Criteria) this;
        }

        public Criteria andBatIdLessThanOrEqualTo(String value) {
            addCriterion("BAT_ID <=", value, "batId");
            return (Criteria) this;
        }

        public Criteria andBatIdLike(String value) {
            addCriterion("BAT_ID like", value, "batId");
            return (Criteria) this;
        }

        public Criteria andBatIdNotLike(String value) {
            addCriterion("BAT_ID not like", value, "batId");
            return (Criteria) this;
        }

        public Criteria andBatIdIn(List<String> values) {
            addCriterion("BAT_ID in", values, "batId");
            return (Criteria) this;
        }

        public Criteria andBatIdNotIn(List<String> values) {
            addCriterion("BAT_ID not in", values, "batId");
            return (Criteria) this;
        }

        public Criteria andBatIdBetween(String value1, String value2) {
            addCriterion("BAT_ID between", value1, value2, "batId");
            return (Criteria) this;
        }

        public Criteria andBatIdNotBetween(String value1, String value2) {
            addCriterion("BAT_ID not between", value1, value2, "batId");
            return (Criteria) this;
        }
		
		 public Criteria andNotifyCtsFlagIsNull() {
            addCriterion("NOTIFY_CTS_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andNotifyCtsFlagIsNotNull() {
            addCriterion("NOTIFY_CTS_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyCtsFlagEqualTo(String value) {
            addCriterion("NOTIFY_CTS_FLAG =", value, "notifyCtsFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyCtsFlagNotEqualTo(String value) {
            addCriterion("NOTIFY_CTS_FLAG <>", value, "notifyCtsFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyCtsFlagGreaterThan(String value) {
            addCriterion("NOTIFY_CTS_FLAG >", value, "notifyCtsFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyCtsFlagGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_CTS_FLAG >=", value, "notifyCtsFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyCtsFlagLessThan(String value) {
            addCriterion("NOTIFY_CTS_FLAG <", value, "notifyCtsFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyCtsFlagLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_CTS_FLAG <=", value, "notifyCtsFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyCtsFlagLike(String value) {
            addCriterion("NOTIFY_CTS_FLAG like", value, "notifyCtsFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyCtsFlagNotLike(String value) {
            addCriterion("NOTIFY_CTS_FLAG not like", value, "notifyCtsFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyCtsFlagIn(List<String> values) {
            addCriterion("NOTIFY_CTS_FLAG in", values, "notifyCtsFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyCtsFlagNotIn(List<String> values) {
            addCriterion("NOTIFY_CTS_FLAG not in", values, "notifyCtsFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyCtsFlagBetween(String value1, String value2) {
            addCriterion("NOTIFY_CTS_FLAG between", value1, value2, "notifyCtsFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyCtsFlagNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_CTS_FLAG not between", value1, value2, "notifyCtsFlag");
            return (Criteria) this;
        }
		
		 public Criteria andQueryCountIsNull() {
            addCriterion("QUERY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andQueryCountIsNotNull() {
            addCriterion("QUERY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andQueryCountEqualTo(String value) {
            addCriterion("QUERY_COUNT =", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountNotEqualTo(String value) {
            addCriterion("QUERY_COUNT <>", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountGreaterThan(String value) {
            addCriterion("QUERY_COUNT >", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountGreaterThanOrEqualTo(String value) {
            addCriterion("QUERY_COUNT >=", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountLessThan(String value) {
            addCriterion("QUERY_COUNT <", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountLessThanOrEqualTo(String value) {
            addCriterion("QUERY_COUNT <=", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountLike(String value) {
            addCriterion("QUERY_COUNT like", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountNotLike(String value) {
            addCriterion("QUERY_COUNT not like", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountIn(List<String> values) {
            addCriterion("QUERY_COUNT in", values, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountNotIn(List<String> values) {
            addCriterion("QUERY_COUNT not in", values, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountBetween(String value1, String value2) {
            addCriterion("QUERY_COUNT between", value1, value2, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountNotBetween(String value1, String value2) {
            addCriterion("QUERY_COUNT not between", value1, value2, "queryCount");
            return (Criteria) this;
        }
		
		 public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("VERSION like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("VERSION not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }
		
		 public Criteria andCreateDatetimeIsNull() {
            addCriterion("CREATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("CREATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(String value) {
            addCriterion("CREATE_DATETIME =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(String value) {
            addCriterion("CREATE_DATETIME <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(String value) {
            addCriterion("CREATE_DATETIME >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DATETIME >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(String value) {
            addCriterion("CREATE_DATETIME <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DATETIME <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLike(String value) {
            addCriterion("CREATE_DATETIME like", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotLike(String value) {
            addCriterion("CREATE_DATETIME not like", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<String> values) {
            addCriterion("CREATE_DATETIME in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<String> values) {
            addCriterion("CREATE_DATETIME not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(String value1, String value2) {
            addCriterion("CREATE_DATETIME between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_DATETIME not between", value1, value2, "createDatetime");
            return (Criteria) this;
        }
		
		 public Criteria andUpdateDatetimeIsNull() {
            addCriterion("UPDATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("UPDATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(String value) {
            addCriterion("UPDATE_DATETIME =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(String value) {
            addCriterion("UPDATE_DATETIME <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(String value) {
            addCriterion("UPDATE_DATETIME >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_DATETIME >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(String value) {
            addCriterion("UPDATE_DATETIME <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_DATETIME <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLike(String value) {
            addCriterion("UPDATE_DATETIME like", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotLike(String value) {
            addCriterion("UPDATE_DATETIME not like", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<String> values) {
            addCriterion("UPDATE_DATETIME in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<String> values) {
            addCriterion("UPDATE_DATETIME not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(String value1, String value2) {
            addCriterion("UPDATE_DATETIME between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_DATETIME not between", value1, value2, "updateDatetime");
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
