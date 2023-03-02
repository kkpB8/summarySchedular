/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.devglan.tenant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.devglan.model.UsersRoleRightsMapEntity;

import java.math.BigInteger;
import java.util.Optional;

@Repository
public interface UsersRoleRightsMapDao extends JpaRepository<UsersRoleRightsMapEntity, Long> {

  //Optional<UsersRoleRightsMapEntity> findByUserRoleRightsMapId(final String userId);

	/*
	 * @Query("FROM UsersRoleRightsMapEntity c WHERE c.userId = :userId")
	 * UsersRoleRightsMapEntity findByUserId(@Param("userId") final String userId);
	 */
  @Query("FROM UsersRoleRightsMapEntity c WHERE c.userId = :userId and c.roleId =:roleId")
  UsersRoleRightsMapEntity findByUserId(@Param("userId") final String userId,@Param("roleId") final String roleId);

}
