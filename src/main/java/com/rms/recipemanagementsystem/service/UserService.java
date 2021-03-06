package com.rms.recipemanagementsystem.service;

import com.rms.recipemanagementsystem.vo.UserVO;

public interface UserService {
	public UserVO selectAll(String email);
}