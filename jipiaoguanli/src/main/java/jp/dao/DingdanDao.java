package jp.dao;

import java.util.List;

import jp.entity.Dingdan;

public interface DingdanDao {
	
	/**
	 * 获取用户所有订单
	 * @param username
	 * @return
	 */
	public List<Dingdan> getdingdan(String username);
	
	/**
	 * 更改订单状态
	 * @param status
	 * @return
	 */
	public Integer updateStatus(Integer status);

}
