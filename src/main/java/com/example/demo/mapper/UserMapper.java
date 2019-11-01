package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.User;

/** 
* UserMapper
* @author yongxi
* @E-mail yongxi@chaoxing.com
* @date   2019年10月16日 下午3:52:19 
*/

@Mapper
public interface UserMapper {
	@Select("SELECT ID,USERNAME,AGE FROM USER")
	List<User> findAll();
}
 