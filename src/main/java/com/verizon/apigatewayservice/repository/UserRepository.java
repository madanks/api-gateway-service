/**
 * 
 */
package com.verizon.apigatewayservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.apigatewayservice.bean.User;

/**
 * 
 * @author madan Date Apr 7, 2019
 *
 */

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}