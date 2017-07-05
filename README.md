package com.pingan.haofang.goldcenter.vo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.dozer.Mapping;

import com.pingan.haofang.goldcenter.common.date.DateUtil;
import com.pingan.haofang.goldcenter.enums.BusinessIdEnum;
import com.pingan.haofang.goldcenter.enums.LoanStatusEnum;
import com.pingan.haofang.goldcenter.enums.OrderSourceEnum;
import com.pingan.haofang.goldcenter.enums.OrderStatusEnum;
import com.pingan.haofang.goldcenter.enums.OrderTypeEnum;

/**
 * 
 * @ClassName: OrderVo
 * @Description: 订单列表信息展示vo
 * @author EX-GONGDAOSHUN700
 * @date 2016年11月25日 上午10:50:17
 */
public class OrderVo {
    private String applierName; // 租客姓名
    private String applierCardNo; // 身份证信息
    private String applierMobile; // 手机号
    private String remainedCreditStatus;// 授信状态
    private String applyDate;// 申请时间
    private String houseId;// 房源id
    private String agentName;// 房源所属房行名称
    private String agencyId;// 房行id
    private String relatedRentOrderId;// 对应租房的编号
    private String rentContractNo;// 租赁合同号
    private String loanContractStartDate;// 租期开始时间
    private String loanContractEndDate;// 租期结束时间
    private String orderType;// 订单的性质
    private String orderTypeName;// 订单性质对应的Name
    private String orderId;// 贷款订单号
    private String loanContractNo;// 贷款合同编号
    private String rentPerMonth;// 月租金
    private String loanTerm;// 分期期数
    private String orderStatus;// 订单状态
    private String loandStatus;// 贷款状态
    private String loandStatusName;// 贷款状态对应的Name
    private String orderStatusName;// 订单状态对应的Name
    private String loandStartTime; // 贷款开始时间
    private String loandEndTime; // 贷款结束时间
    private String storeName; // 门店信息
    private String applyTime; // 申请时间
    private String actualLimit;// 实际放款额度（本金）
    private String houseAddress;// 房源地址
    private String banNo;// 楼栋
    private String houseNo;// 室号
    private String authDate;// 授权时间
    private String applyLimit;// 申请额度
    private String realLoad;// 实际放款额
    private String advancedInterest;// 预提利息
    private String realInterest;// 实付利息
    private String handingCharge;// 手续费
    private String orderTerminatingReason;// 订单终止原因
    private String getFundingTime;// 放款时间
    private String orderCity;// 城市名
    private String orderDistrict;// 区域
    private String orderNo;// 贷款订单编号
	private String businessId;//业务类型 businessId
    private String businessIdName;//业务类型名
    private String orderSource;//订单来源
    private String orderSourceName;//订单来源名
    private String finRejectReason;//财务驳回原因
    private String applierDepartmentType;//申请人单位类型
    private String rentalRoomNo;//房间号
    private String creditGrantFailedreason;//授信失败原因
    private String supplementaryMaterialReason;//激活补件原因
    /** 
     * @Fields withholdAgreementKey :代扣协议
     */
    private String withholdAgreementKey;
     
     
     /** 
     * @Fields serviceAgreementKey : 服务协议
     */
    private String serviceAgreementKey;
    private List<RepayMentInfoVo> repaymentList;// 还款流水
    
    @Mapping("contractPdfKey")
    private String contractKey;// 借款合同

    public String getRentalRoomNo() {
        return rentalRoomNo;
    }

    public void setRentalRoomNo(String rentalRoomNo) {
        this.rentalRoomNo = rentalRoomNo;
    }

    public String getCreditGrantFailedreason() {
        return creditGrantFailedreason;
    }

    public void setCreditGrantFailedreason(String creditGrantFailedreason) {
        this.creditGrantFailedreason = creditGrantFailedreason;
    }

    public String getSupplementaryMaterialReason() {
        return supplementaryMaterialReason;
    }

    public void setSupplementaryMaterialReason(String supplementaryMaterialReason) {
        this.supplementaryMaterialReason = supplementaryMaterialReason;
    }

    public String getApplierName() {
        return applierName;
    }

    public void setApplierName(String applierName) {
        this.applierName = applierName;
    }

    public String getApplierCardNo() {
        return applierCardNo;
    }

    public void setApplierCardNo(String applierCardNo) {
        this.applierCardNo = StringUtils.left(applierCardNo, 4)
                .concat(StringUtils
                        .removeStart(
                                StringUtils.leftPad(
                                        StringUtils.right(applierCardNo, 4),
                                        StringUtils.length(applierCardNo), "*"),
                                "****"));
    }

    public String getApplierMobile() {
        return applierMobile;
    }

    public void setApplierMobile(String applierMobile) {
        this.applierMobile = applierMobile;
    }

    public String getRemainedCreditStatus() {
        return remainedCreditStatus;
    }

    public void setRemainedCreditStatus(String remainedCreditStatus) {
        this.remainedCreditStatus = remainedCreditStatus;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getRelatedRentOrderId() {
        return relatedRentOrderId;
    }

    public void setRelatedRentOrderId(String relatedRentOrderId) {
        this.relatedRentOrderId = relatedRentOrderId;
    }

    public String getRentContractNo() {
        return rentContractNo;
    }

    public void setRentContractNo(String rentContractNo) {
        this.rentContractNo = rentContractNo;
    }

    public String getLoanContractStartDate() {
        return loanContractStartDate;
    }

    public void setLoanContractStartDate(String loanContractStartDate) {
        this.loanContractStartDate = loanContractStartDate;
    }

    public String getLoanContractEndDate() {
        return loanContractEndDate;
    }

    public void setLoanContractEndDate(String loanContractEndDate) {
        this.loanContractEndDate = loanContractEndDate;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
        OrderTypeEnum orderTypeEnum = OrderTypeEnum
                .valuesOf(Integer.parseInt(orderType));
        this.orderTypeName = orderTypeEnum == null ? ""
                : orderTypeEnum.getName();
    }


    public String getOrderSource() {
        return orderSource;
    }
    
    /**
     * 
    * @Title: setBusinessType 
    * @Description: 订单来源转成中文 
    * @param businessType
    * @throws
     */
    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
        OrderSourceEnum orderSourceEnum = OrderSourceEnum.valuesOf(Integer.parseInt(orderSource));
        this.orderSourceName = orderSourceEnum == null ? "" : orderSourceEnum.getName();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getLoanContractNo() {
        return loanContractNo;
    }

    public void setLoanContractNo(String loanContractNo) {
        this.loanContractNo = loanContractNo;
    }

    public String getRentPerMonth() {
        return rentPerMonth;
    }

    public void setRentPerMonth(String rentPerMonth) {
        this.rentPerMonth = fenToYuan(rentPerMonth);
    }

    public String getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(String loanTerm) {
        if (StringUtils.isNotBlank(loanTerm)
                && StringUtils.isNotBlank(this.getFundingTime)) {
            Date fundingDate = DateUtil.strToDateByFmt(getFundingTime,
                    DateUtil.LONGFMT19);
            this.loandStartTime = DateUtil.dateToStringByFmt(fundingDate,
                    DateUtil.SHORTFMT10);
            Integer loanPeriod = Integer.parseInt(loanTerm);
            Calendar calendar = Calendar.getInstance();// 日历对象
            calendar.setTime(fundingDate);// 设置当前日期
            calendar.add(Calendar.MONTH, loanPeriod);
            calendar.add(Calendar.DATE, -1);// 减一天
            // 设置贷款结束时间
            this.loandEndTime = DateUtil.dateToStringByFmt(calendar.getTime(),
                    DateUtil.SHORTFMT10);
        }
        this.loanTerm = loanTerm;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        this.orderStatusName = OrderStatusEnum
                .valuesOf(Integer.parseInt(orderStatus)).getName();
        Integer status = Integer.parseInt(orderStatus);
        if(status == OrderStatusEnum.ON_AUDIT.getCode()){
            this.remainedCreditStatus = "未授信";
        } else if(status == OrderStatusEnum.CREDIT_FAILURE.getCode()){
            this.remainedCreditStatus = "授信失效";
        } else if(status == OrderStatusEnum.CREDIT_REJECT.getCode()){
            this.remainedCreditStatus = "授信驳回";
        } else if(status == OrderStatusEnum.CREDIT_UNDO.getCode()){
            this.remainedCreditStatus = "授信撤销";
        } else {
            this.remainedCreditStatus = "授信成功";
        }
    }

    public String getLoandStatus() {
        return loandStatus;
    }

    public void setLoandStatus(String loandStatus) {
        this.loandStatus = loandStatus;
        this.loandStatusName = LoanStatusEnum
                .valuesOf(Integer.parseInt(loandStatus)).getName();
    }

    public String getLoandStartTime() {
        return loandStartTime;
    }

    public void setLoandStartTime(String loandStartTime) {
        this.loandStartTime = loandStartTime;
    }

    public String getLoandEndTime() {
        return loandEndTime;
    }

    public void setLoandEndTime(String loandEndTime) {
        this.loandEndTime = loandEndTime;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getActualLimit() {
        return actualLimit;
    }

    public void setActualLimit(String actualLimit) {
        this.actualLimit = fenToYuan(actualLimit);
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getBanNo() {
        return banNo;
    }

    public void setBanNo(String banNo) {
        this.banNo = banNo;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public List<RepayMentInfoVo> getRepaymentList() {
        return repaymentList;
    }

    public void setRepaymentList(List<RepayMentInfoVo> repaymentList) {
        this.repaymentList = repaymentList;
    }

    public String getAuthDate() {
        return authDate;
    }

    public void setAuthDate(String authDate) {
        this.authDate = authDate;
    }

    @Override
    public String toString() {
        return "OrderVo [applierName=" + applierName + ", applierCardNo="
                + applierCardNo + ", applierMobile=" + applierMobile
                + ", remainedCreditStatus=" + remainedCreditStatus
                + ", applyDate=" + applyDate + ", houseId=" + houseId
                + ", agentName=" + agentName + ", relatedRentOrderId="
                + relatedRentOrderId + ", rentContractNo=" + rentContractNo
                + ", loanContractStartDate=" + loanContractStartDate
                + ", loanContractEndDate=" + loanContractEndDate
                + ", orderType=" + orderType + ", orderId=" + orderId
                + ", loanContractNo=" + loanContractNo + ", rentPerMonth="
                + rentPerMonth + ", loanTerm=" + loanTerm + ", applyLimit="
                + applyLimit + ", orderStatus=" + orderStatus + ", loandStatus="
                + loandStatus + ", loandStartTime=" + loandStartTime
                + ", loandEndTime=" + loandEndTime + ", storeName=" + storeName
                + ", applyTime=" + applyTime + ", actualLimit=" + actualLimit
                + ", houseAddress=" + houseAddress + ", banNo=" + banNo
                + ", houseNo=" + houseNo + ", authDate=" + authDate
                + ", repaymentList=" + repaymentList + ", advancedInterest="
                + advancedInterest + ", realLoad=" + realLoad
                + ", realInterest=" + realInterest + ", handingCharge="
                + handingCharge + ", rentalRoomNo=" + rentalRoomNo + ", creditGrantFailedreason=" + creditGrantFailedreason + ", supplementaryMaterialReason=" + supplementaryMaterialReason + "]";
    }

    public String getApplyLimit() {
        return applyLimit;
    }

    public void setApplyLimit(String applyLimit) {
        this.applyLimit = fenToYuan(applyLimit);
    }

    public String getRealLoad() {
        return realLoad;
    }

    public void setRealLoad(String realLoad) {
        this.realLoad = fenToYuan(realLoad);
    }

    public String getAdvancedInterest() {
        return advancedInterest;
    }

    public void setAdvancedInterest(String advancedInterest) {
        this.advancedInterest = fenToYuan(advancedInterest);
    }

    public String getRealInterest() {
        return realInterest;
    }

    public void setRealInterest(String realInterest) {
        this.realInterest = fenToYuan(realInterest);
    }

    public String getHandingCharge() {
        return handingCharge;
    }

    public void setHandingCharge(String handingCharge) {
        this.handingCharge = fenToYuan(handingCharge);
    }

    // 将分转换为元的方法（如：1分 = 0.01元，1000分 = 10.00元）
    private static String fenToYuan(String str) {
        if (!StringUtils.isEmpty(str)) {
            NumberFormat nf = new DecimalFormat("###,##0.00");
            return nf.format(Double.parseDouble(str) / 100);
        }
        return "0.00";
    }

    public String getLoandStatusName() {
        return loandStatusName;
    }

    public void setLoandStatusName(String loandStatusName) {
        this.loandStatusName = loandStatusName;
    }

    public String getOrderStatusName() {
        return orderStatusName;
    }

    public void setOrderStatusName(String orderStatusName) {
        this.orderStatusName = orderStatusName;
    }

    public String getOrderTypeName() {
        return orderTypeName;
    }

    public void setOrderTypeName(String orderTypeName) {
        this.orderTypeName = orderTypeName;
    }
    

    
    /** 
    * @return withholdAgreementKey 
    */
    public String getWithholdAgreementKey() {
        return withholdAgreementKey;
    }

    
    /** 
    * @param withholdAgreementKey 要设置的 withholdAgreementKey 
    */
    public void setWithholdAgreementKey(String withholdAgreementKey) {
        this.withholdAgreementKey = withholdAgreementKey;
    }

    
    /** 
    * @return serviceAgreementKey 
    */
    public String getServiceAgreementKey() {
        return serviceAgreementKey;
    }

    
    /** 
    * @param serviceAgreementKey 要设置的 serviceAgreementKey 
    */
    public void setServiceAgreementKey(String serviceAgreementKey) {
        this.serviceAgreementKey = serviceAgreementKey;
    }

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public String getOrderTerminatingReason() {
        return orderTerminatingReason;
    }

    public void setOrderTerminatingReason(String orderTerminatingReason) {
        this.orderTerminatingReason = orderTerminatingReason;
    }

    public String getGetFundingTime() {
        return getFundingTime;
    }

    public void setGetFundingTime(String getFundingTime) {
        if (StringUtils.isNotBlank(getFundingTime)
                && StringUtils.isNotBlank(this.loanTerm)) {
            Date fundingDate = DateUtil.strToDateByFmt(getFundingTime,
                    DateUtil.LONGFMT19);
            this.loandStartTime = DateUtil.dateToStringByFmt(fundingDate,
                    DateUtil.SHORTFMT10);
            Integer loanTerm = Integer.parseInt(this.loanTerm);
            Calendar calendar = Calendar.getInstance();// 日历对象
            calendar.setTime(fundingDate);// 设置当前日期
            calendar.add(Calendar.MONTH, loanTerm);
            calendar.add(Calendar.DATE, -1);// 减一天
            // 设置贷款结束时间
            this.loandEndTime = DateUtil.dateToStringByFmt(calendar.getTime(),
                    DateUtil.SHORTFMT10);
        }
        this.getFundingTime = getFundingTime;
    }

    public String getOrderCity() {
        return orderCity;
    }

    public void setOrderCity(String orderCity) {
        this.orderCity = orderCity;
    }

    public String getOrderDistrict() {
        return orderDistrict;
    }

    public void setOrderDistrict(String orderDistrict) {
        this.orderDistrict = orderDistrict;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
	

    public String getOrderSourceName() {
        return orderSourceName;
    }

    public void setOrderSourceName(String orderSourceName) {
        this.orderSourceName = orderSourceName;
    }

    public String getBusinessId() {
        return businessId;
    }


    /**
     * 
    * @Title: setBusinessId 
    * @Description: 业物类型
    * @param businessId
    * @throws
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
        System.out.println("businessId:" + businessId);
        BusinessIdEnum businessIdEnum = BusinessIdEnum.valuesOf(Integer.parseInt(businessId));
        this.businessIdName = businessIdEnum == null ? "" : businessIdEnum.getName();
    }

    public String getBusinessIdName() {
        return businessIdName;
    }

    public void setBusinessIdName(String businessIdName) {
        this.businessIdName = businessIdName;
    }

    public String getFinRejectReason() {
        return finRejectReason;
    }

    public void setFinRejectReason(String finRejectReason) {
        this.finRejectReason = finRejectReason;
    }

    public String getApplierDepartmentType() {
        return applierDepartmentType;
    }

    public void setApplierDepartmentType(String applierDepartmentType) {
        this.applierDepartmentType = applierDepartmentType;
    }

    public String getContractKey() {
        return contractKey;
    }

    public void setContractKey(String contractKey) {
        this.contractKey = contractKey;
    }


    
}
CREATE TABLE `t_business_type` (
`id`  int(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID，也是业务类型ID' ,
`business_name`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '业务类型名称' ,
`business_status`  tinyint(1) UNSIGNED NOT NULL DEFAULT 1 COMMENT '业务类型状态：0.已删除 , 1.可用' ,
PRIMARY KEY (`id`)
)
;
