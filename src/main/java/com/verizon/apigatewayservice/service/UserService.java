/**
 * 
 */
package com.verizon.apigatewayservice.service;

import com.verizon.apigatewayservice.bean.User;

/**
 * @author madan Date Apr 7, 2019
 *
 */
public interface UserService {

	public User findUserByEmail(String email);

	public void saveUser(User user);
}
