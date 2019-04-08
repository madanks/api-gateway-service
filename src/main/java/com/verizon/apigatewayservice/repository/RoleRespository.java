/**
 * 
 */
package com.verizon.apigatewayservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.apigatewayservice.bean.Role;

/**
 * 
 * @author madan Date Apr 7, 2019
 *
 */
@Repository("roleRepository")
public interface RoleRespository extends JpaRepository<Role, Integer> {

	Role findByRole(String role);
}
