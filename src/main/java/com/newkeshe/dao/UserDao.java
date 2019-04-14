package com.newkeshe.dao;

import com.newkeshe.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
    List<User> findAll();
    <S extends User>S save(S s);
    List<User> findByUPhone(String uPhone);
    List<User> findByUId(Integer uId);
    @Transactional
    @Modifying
    void deleteByUId(Integer uId);
}
