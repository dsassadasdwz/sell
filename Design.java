package com.jeeplus.modules.gz.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.List;
import com.google.common.collect.Lists;
import com.jeeplus.core.persistence.ActEntity;
import com.jeeplus.modules.gz.annotation.RelationFiled;
import com.jeeplus.common.utils.excel.annotation.ExcelField;

/**
 * 工装设计Entity
 * @author lishihe
 * @version 2020-02-29
 */
public class Design extends ActEntity<Design> {
	
	private static final long serialVersionUID = 1L;
	@RelationFiled(value = "薪酬主管初审", relationName = "assigneeName", name = "number")
	private String number;		// 编号
	@RelationFiled(value = "薪酬主管初审", relationName = "comment", name = "useCompany")
	private String useCompany;		// 使用单位
	@RelationFiled(value = "集团人力资源部部长审核", relationName = "assigneeName", name = "designCompany")
	private String designCompany;		// 设计单位
	@RelationFiled(value = "集团人力资源部部长审核", relationName = "comment", name = "model")
	private String model;		// 型号
	private String name;		// 工艺装备名称
	private String category;		// 类别
	private Date applyTime;		// 申请时间
	private Date finishTime;		// 完成时间
	private String demand;		// 技术要求
	private String technologist;		// 工艺师(员)
	private String proof;		// 校对
	private String audit;		// 审核
	private String opinion;		// 复审意见
	private String approval;		// 批准
	private String uploadFile;		// 上传附件
	private String procInsId;		// 流程实例id
	private String state;		// 申请状态:0、待申请，1、办理中，2、完结，3、销毁
	private List<DesignChild> designChildList = Lists.newArrayList();		// 子表列表
	
	public Design() {
		super();
	}

	public Design(String id){
		super(id);
	}

	@ExcelField(title="编号", align=2, sort=6)
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	@ExcelField(title="使用单位", align=2, sort=7)
	public String getUseCompany() {
		return useCompany;
	}

	public void setUseCompany(String useCompany) {
		this.useCompany = useCompany;
	}
	
	@ExcelField(title="设计单位", align=2, sort=8)
	public String getDesignCompany() {
		return designCompany;
	}

	public void setDesignCompany(String designCompany) {
		this.designCompany = designCompany;
	}
	
	@ExcelField(title="型号", align=2, sort=9)
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	@ExcelField(title="工艺装备名称", align=2, sort=10)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@ExcelField(title="类别", align=2, sort=11)
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ExcelField(title="申请时间", align=2, sort=12)
	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ExcelField(title="完成时间", align=2, sort=13)
	public Date getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	
	@ExcelField(title="技术要求", align=2, sort=14)
	public String getDemand() {
		return demand;
	}

	public void setDemand(String demand) {
		this.demand = demand;
	}
	
	@ExcelField(title="工艺师(员)", align=2, sort=15)
	public String getTechnologist() {
		return technologist;
	}

	public void setTechnologist(String technologist) {
		this.technologist = technologist;
	}
	
	@ExcelField(title="校对", align=2, sort=16)
	public String getProof() {
		return proof;
	}

	public void setProof(String proof) {
		this.proof = proof;
	}
	
	@ExcelField(title="审核", align=2, sort=17)
	public String getAudit() {
		return audit;
	}

	public void setAudit(String audit) {
		this.audit = audit;
	}
	
	@ExcelField(title="复审意见", align=2, sort=18)
	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	
	@ExcelField(title="批准", align=2, sort=19)
	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}
	
	@ExcelField(title="上传附件", align=2, sort=20)
	public String getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(String uploadFile) {
		this.uploadFile = uploadFile;
	}
	
	public String getProcInsId() {
		return procInsId;
	}

	public void setProcInsId(String procInsId) {
		this.procInsId = procInsId;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public List<DesignChild> getDesignChildList() {
		return designChildList;
	}

	public void setDesignChildList(List<DesignChild> designChildList) {
		this.designChildList = designChildList;
	}
}