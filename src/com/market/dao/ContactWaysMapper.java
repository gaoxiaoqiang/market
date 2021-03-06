package com.market.dao;

import com.market.model.ContactWays;

public interface ContactWaysMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(ContactWays record);

	int insertSelective(ContactWays record);

	ContactWays selectByPrimaryKey(Integer id);

	ContactWays selectByKey(Integer gid);

	int updateByPrimaryKeySelective(ContactWays record);

	int updateByPrimaryKey(ContactWays record);
}