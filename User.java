package com.shxt.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class User {
	/**主键ID*/
	private int accountId;
	/**账号*/
	private String account;
	/**用户姓名*/
	private String userName;
	/**用户密码*/
	private String password;
	/**联系电话*/
	private String telphone;
	/**用户性别*/
	private String sex = "男";
	/**职务名称*/
	private String position;
	/**创建日期*/
	private Date createTime = new Date();
	/**生日*/
	private Date birthday = new Date();
	/**身份证号*/
	private String IDNum;
	/**创建人*/
	private String createCount = "admin";
	/**访问的页面*/
	private String homePage;
	/**电子邮件*/
	private String email;
	/**删除标识 1:可删 2:不可以*/
	private String isDel = "1";
	/**用户状态: 1:可用 2:禁用*/
	private String accountStatus = "1";
	/**用户头像*/
	private String photo;
	
	private Org org;
	
	private Set<Role> roleSet = new HashSet<Role>();
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateCount() {
		return createCount;
	}
	public void setCreateCount(String createCount) {
		this.createCount = createCount;
	}
	public String getHomePage() {
		return homePage;
	}
	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIsDel() {
		return isDel;
	}
	public void setIsDel(String isDel) {
		this.isDel = isDel;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getIDNum() {
		return IDNum;
	}
	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}
	public Org getOrg() {
		return org;
	}
	public void setOrg(Org org) {
		this.org = org;
	}
	public Set<Role> getRoleSet() {
		return roleSet;
	}
	public void setRoleSet(Set<Role> roleSet) {
		this.roleSet = roleSet;
	}
	@Override
	public String toString() {
		return "User [account=" + account + ", accountId=" + accountId
				+ ", accountStatus=" + accountStatus + ", createCount="
				+ createCount + ", createTime=" + createTime + ", email="
				+ email + ", homePage=" + homePage + ", isDel=" + isDel
				+ ", password=" + password + ", photo=" + photo + ", position="
				+ position + ", sex=" + sex + ", telphone=" + telphone
				+ ", userName=" + userName + "]";
	}
}
