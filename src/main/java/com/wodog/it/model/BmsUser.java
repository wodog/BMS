package com.wodog.it.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BmsUser {
	private Integer id;

	private String username;

	private String password;

	private String nickname;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date effectDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date expiredDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname == null ? null : nickname.trim();
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getEffectDate() {
		return effectDate;
	}

	public void setEffectDate(Date effectDate) {
		this.effectDate = effectDate;
	}

	public Date getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	@Override
	public String toString() {
		return "BmsUser [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", createDate=" + createDate + ", effectDate=" + effectDate + ", expiredDate=" + expiredDate + "]";
	}
}