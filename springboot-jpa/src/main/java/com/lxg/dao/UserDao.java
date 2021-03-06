package com.lxg.dao;

import com.lxg.model.JpaUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @author LXG
 */
public interface UserDao  extends JpaRepository<JpaUser,String>, JpaSpecificationExecutor<JpaUser> {
    /**
     * 更新
     * @param id
     * @param age
     */
    @Modifying
    @Query("update JpaUser u set u.age =?2 where u.id =?1")
    void update(String id, Integer age);
}
