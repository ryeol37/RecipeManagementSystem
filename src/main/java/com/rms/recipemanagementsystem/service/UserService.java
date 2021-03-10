package com.rms.recipemanagementsystem.service;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.rms.recipemanagementsystem.dao.UserMapper;
import com.rms.recipemanagementsystem.vo.UserVO;

@Service
public class UserService {
	
	@Resource(name="SqlSessionTemplate")
	private SqlSession session;
	
	public UserVO selectAllEmail() {
		// Mapper 인터페이스 객체 반환
		UserMapper mapper = session.getMapper(UserMapper.class);
		// xml 내용대로 오버라이딩된 인터페이스의 메소드 실행
		UserVO vo = mapper.selectAllEmail();
		return vo;
	}
}