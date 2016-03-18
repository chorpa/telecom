package com.mkk.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
/**
 * 用户类
 * @author 阿术
 *
 */
@Component
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int userid;
	private String userName;
	private String password;
	private int credits;
	private String lastIp;
	private Date lastVisit;
	@Autowired
	private LoginLog loginLog;
	
}
