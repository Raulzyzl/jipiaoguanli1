package jp.entity;

public class Dingdan {

	private int id;
	private User user_id;
	private Jipiao jipiao_id;
	private String goumairiqi;
	private Integer jpstatus;
	private int yiwaixian;
	private int yanwuxian;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser_id() {
		return user_id;
	}
	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}
	public Jipiao getJipiao_id() {
		return jipiao_id;
	}
	public void setJipiao_id(Jipiao jipiao_id) {
		this.jipiao_id = jipiao_id;
	}
	public String getGoumairiqi() {
		return goumairiqi;
	}
	public void setGoumairiqi(String goumairiqi) {
		this.goumairiqi = goumairiqi;
	}
	public Integer getJpstatus() {
		return jpstatus;
	}
	public void setJpstatus(Integer jpstatus) {
		this.jpstatus = jpstatus;
	}
	public int getYiwaixian() {
		return yiwaixian;
	}
	public void setYiwaixian(int yiwaixian) {
		this.yiwaixian = yiwaixian;
	}
	public int getYanwuxian() {
		return yanwuxian;
	}
	public void setYanwuxian(int yanwuxian) {
		this.yanwuxian = yanwuxian;
	}
	
	@Override
	public String toString() {
		return "Dingdan [id=" + id + ", user_id=" + user_id + ", jipiao_id=" + jipiao_id + 
				", goumairiqi=" + goumairiqi
				+ ", jpstatus=" + jpstatus + ", yiwaixian=" + yiwaixian + ", yanwuxian=" + yanwuxian + "]";
	}
	
	
	
	
}
