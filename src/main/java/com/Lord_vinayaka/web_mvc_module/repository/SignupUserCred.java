package com.Lord_vinayaka.web_mvc_module.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Lord_vinayaka.web_mvc_module.entity.UserSignUpCredentials;

import jakarta.transaction.Transactional;
@Repository
public interface SignupUserCred extends CrudRepository<UserSignUpCredentials,Short> {
	
}
