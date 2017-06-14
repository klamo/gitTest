# gitTest

@RequestMapping("/v1/api/orders")	OrderAPIForC	给C端提供的订单相关的API
creditGrant		处理C端的授信申请
creditActivate		授信激活
cancelOrderById		取消订单
queryOrdersByUserId	根据用户id查询订单列表
queryOrderDetailWithBillsByOrderId	根据订单ID查询账单详情
queryOrderContractsByOrderId		根据订单ID查询合同
noticeActivateResult		给风控系统调用的激活/补件结果通知接口
getContractInfo		获取合同信息
validateLoanResult		风控包7：确认分期、确认要款
contractKeyChange		更新合同快照文件的key值


@RequestMapping("/v1/api/auth")	AuthAPIForC	为C端提供的鉴权相关的接口
authBankCard		银行卡鉴权接口
zmxyCallBack		给C端提供的芝麻信用授权回调接口

@RequestMapping("/v1/api/bill")	BillingManageAPI	开票管理API
updateBillingForResult		小贷,财务 ： 消息反馈通知


@RequestMapping(value = "/v1/api/erp")	OrderAPIForErp	订单相关提供给erp系统的所有外部api接口
queryOrder		erp系统订单查询接口
queryOrderDetail		erp根据订单id查询订单的详情信息
queryOrderForExport		erp系统导出订单列表
orderCount		erp系统订单统计
refundInfo		erp查询退款试算信息
refundApply		erp发起退款申请
refundDetail		erp查询退款详情
accountQuery		erp单个对账信息查询
accountQueryForList		erp查看批量对账是的信息
accountConfirm		erp通知对账结果的接口

@RequestMapping(value = "/v1/api/xd")	OrderAPIForXd	订单相关提供给小贷系统的所有外部api接口
loanNotice		放款结果通知接口
caseEnd			案件终止的接口
accountNotice		对账通知
repaymentNotice		扣款通知接口
overdueNotice		逾期通知接口
queryCaseId		案件处理接口
caseCancelCase		贷前终止
caseApplyFunds		申请小贷放款
adjustmentResult		罚金调整审核结果通知

@RequestMapping(value = "/v1/api/rc")	RcForOrderAPI	风控调用运营
getContractInfo		风控人工捞回

@RequestMapping("/v1/api/rentalContract")	RentalContractAPI	为寓见提供的租房合同相关的API
gainRentalContract		新增租房合同的接口
changeContractStatus		更新租房合同状态
getRentalContract		获取租房合同
getOrderStatusToApi		为好房API提供查询订单状态的接口
gainRentalUpwardLease		新增向上租约信息
getCustomerInfo			批量获取订单个人客户信息

@RequestMapping("/v1/api/riskcontrolpackages")	RiskControlPackagesAPIForC	为C端提供的风控包API
validateInstalmentsQualification		验证是否有分期付款资格
validateActivateQualification		风控包5

@RequestMapping("/v1/api/users")	UserAPIForC	给C端提供的用户相关的API
getMetaData		个人基础信息选项查询接口
getMetaDataAll		获取个人基础信息
getAuthBanks		获取个人银行列表

@RequestMapping("/v1/api/yujian")	YujianTrdAPI	寓见-对接交易API
queryLoanRst		查询放款结果
queryRefundRst		查询还款账单状态
refundInfo		查询退款试算
refundApply		申请退款，根据参数获取对应的退款试算信息，然后插入到本地的退款信息表中
refundDetail		退款信息查询

@RequestMapping("/v1/web/bill")	BillingController	开票管理Web请求业务方法
queryAgencyOptions		对房行名称进行模糊匹配查询
queryCityOptions		对城市进行模糊匹配查询
selectBillingList		搜索开票申请记录的：开票累计接口
billingApply		开票： 申请开票
selectBillingDetail		查看开票申请记录的：费用收取详情接口
billsDownLoad		开票明细导出

@RequestMapping("/common/")	CommonController
sendDataToRisk		手动推送房源数据给风控

@RequestMapping(value="/v1/goldcenterProduct")	GoldcenterProductController	金融产品配置Controller
queryList		列表查询
addGoldcenterProduct		新增金融产品
getXdProduct		拉取小贷产品列表
getXdProductById		获取小贷产品详情
getProductInfo		查看金融产品详情
onOffLine		金融产品上下架
queryGoldcenterProductType		获取产品类型列表
insertSelective		编辑新增产品类型校验并保存

@RequestMapping(value="/v1/houseAgency")	HouseAgencyController	房行管理
getHouseAgencyList			获取房行基础信息列表
getHouseAgencyInfo			获取房行详细信息
saveHouseAgencyDetail		编辑页面保存
saveAndOnOffLine			编辑页面上架并保存
lookDepositInfo				查看保证金凭证
addDepositInfo				添加保证金凭证
getDepositInfo				查看保证金流水
getHouseAgencyDetail		点击房行ID弹框显示详情
onOffLineHouseAgency		上架，下架，冻结，解冻，申请退回保证金，申请驳回
queryBankList				获取银行列表
queryCostCenter				获取成本中心段
querProductByMonth			根据期数匹配对应金融产品
getUploadFileUrl			获取上传文件服务器地址
getUploadDocumentUrl		获取非加密上传文件服务器地址
insertFile					插入图片
downFile					文件下载
volidateDownFileAndUploadFile		配置还款日表格上传
addRepaymentRecord		房行还款金额录入
getRepaymentRecords		查询房行还款录入记录
getAllOnLineAgency		获取可以还款的房行信息
getAgencyContractByAgencyId		根据房行id查询房行合同信息


@RequestMapping("/v1/api/agency")	AgencyAPI	所有房行相关的对外接口信息
deleteStore		给机构提供门店删去
editStore		给机构提供门店新增或修改
agencyCreditApply		给机构提供房行授信申请
depositInfo		给机构调用授信保证金查询
interestRates		给风控提供房行分期信息
agencyCreditNotice	给风控房行授信结果通知
agencyStatus		给ERP提供查询房行状态信息
agencyInfoList		给C端调用所有城市房行信息列表
remainedCreditQuery	根据房行id获取房行剩余授信额度的接口
deductDepositApply	给小贷调用保证金扣款申请
depositArrivalConfirm	给财务调用保证金到账通知
approvalStatus		付款审批结果通知
paymentStatus		付款支付状态通知
actStatus		对账状态通知
xdPaymentStatus		财务放款支付状态通知
confirm Deduct		财务的确认扣除通知

@RequestMapping(value="/v1/house/")	HouseController	房源控制器
initPage		初始化页面
queryHouse		查询房源信息
optHouse		操作房源
queryHouseDetail		查询房源
getAgencyName		获取房行提示
queryCity		获取城市提示名称

@RequestMapping("/v1/api/")	HouseAPIForHouse	房源相关接口
riskHouse		接收房源推送的数据
riskHouserResult		接收风控结果
houseDetail		风控获取详情

@RequestMapping(value = "/v1/operationLog/")	OperationLogController	操作日志管理
getOperationLogOptionList		组装联动下拉数据格式
getOperationLogList		获取操作日志列表信息

@RequestMapping(value = "/v1/order/")	OrderController	订单管理
initPage		初始化页面
queryRegion		查询城市区域列表
getOrderList		获取订单列表
getOrderDetail		获取订单详情
endOrder		终止订单
refundCost		退还费用接口
updateRefundCost		提交退还费用接口
applyPayment		申请支付接口（知识库上是这个）
updateApplyPayment		点击提交申请支付接口
applyLending		申请放款接口（知识库上是这个）
getAgencyList		模糊查询房行Id/房行名称
approvalStatus		批准状态
applyForXDDeduction		申请小贷扣款
queryOrderRefund		查询退款详情
applyLoan		放款申请
applyLoanConfirm		放款申请确认
getOrderStatusFlowNote		返回订单的各个节点的最新情况
getOrderCurrentFlowNote		获取订单当前节点的详细状态情况
caseApplyFunds		向小贷要款，当erp对账完成时，如果调用小贷接口进行要款失败时，运营后台通过此接口进行要款
orderDownload		导出订单数据
contractDownload		下载借款合同
insertReplaymentPlan		手动生成还款计划表，防止通知财务放款时扣款计划表生成失败，手动调用生成代扣款计划表

@RequestMapping("/v1/user")	UserController
loginPage		到登录页
login		到登录页

@RequestMapping(value = "/v1/login/")	UserLoginController	用户登录权限控制方法
loginIn		到登录页
checkMenu		获取选中的当前菜单
getLoginStatusByToken		获取登陆状态
getLoginInfoByToken		将假token换取真token
userMenus		获取菜单
checkAdmin		获取用户角色信息判断是否是管理员
logout		用户登出
checkForLogin		判断是否登录，做重定向
userMenusSecond		获取第二级菜单

