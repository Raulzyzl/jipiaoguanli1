package jp.dao;

import java.util.List;

import jp.entity.Jipiao;

public interface JipiaoDao {
	
	/**
	 * 获取所有的机票信息
	 * @param date
	 * @return
	 */
	public List<Jipiao> getAlljipiao(String date);

}
