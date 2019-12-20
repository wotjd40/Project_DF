package org.sweeter.application.model.dto;

import java.sql.Timestamp;

import lombok.Data;


@Data
public class Jobs {
	
	private int id;
	private String title;
	private String writer;
	private Timestamp writeDate;
	private Timestamp modifyDate;
	private String salary;
	private String career;
	private String content;
}
