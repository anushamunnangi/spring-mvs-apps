package com.ojas.AttendenceEntity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity
@Table(name = "Attendance")
public class Attendance implements Serializable {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date employeeLoginTime;
	@Column
	
	@JsonFormat(pattern = "YYYY-MM-dd hh:mm:ss")
	private Date employeeLogoutTime;

	public Date getEmployeeLoginTime() {
		return employeeLoginTime;
	}

	public void setEmployeeLoginTime(Date employeeLoginTime) {
		this.employeeLoginTime = employeeLoginTime;
	}

	public Date getEmployeeLogoutTime() {
		return employeeLogoutTime;
	}

	public void setEmployeeLogoutTime(Date employeeLogoutTime) {
		this.employeeLogoutTime = employeeLogoutTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
}
