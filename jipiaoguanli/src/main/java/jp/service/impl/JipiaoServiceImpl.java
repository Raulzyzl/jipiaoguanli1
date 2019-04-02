package jp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import jp.dao.JipiaoDao;
import jp.entity.Jipiao;
import jp.service.JipiaoService;

@Service("jipiaoService")
public class JipiaoServiceImpl implements JipiaoService{

	@Resource
	private JipiaoDao jipiaoDao;
	
	public List<Jipiao> getAlljipiao(String date) {
		return jipiaoDao.getAlljipiao(date);
	}

}
