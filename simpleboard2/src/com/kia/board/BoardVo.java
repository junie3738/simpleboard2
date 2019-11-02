package com.kia.board;

public class BoardVo {
	private int i_board;
	private String title;
	private String content;
	private String regdatetime;		
	
	public BoardVo(int i_board, String title, String content, String regdatetime) {		
		this.i_board = i_board;
		this.title = title;
		this.content = content;
		this.regdatetime = regdatetime;
	}
	public int getI_board() {
		return i_board;
	}
	public void setI_board(int i_board) {
		this.i_board = i_board;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdatetime() {
		return regdatetime;
	}
	public void setRegdatetime(String regdatetime) {
		this.regdatetime = regdatetime;
	}

}
