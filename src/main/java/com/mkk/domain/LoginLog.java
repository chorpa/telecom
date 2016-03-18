package com.mkk.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
/**
 * 日志类
 * @author 阿术
 *
 */
@Component
public class LoginLog implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int loginLogId;
	private int userId;
	private String ip;
	private Date loginDate;
	
}
