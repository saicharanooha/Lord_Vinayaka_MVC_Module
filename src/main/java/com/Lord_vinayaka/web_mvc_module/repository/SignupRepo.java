package com.Lord_vinayaka.web_mvc_module.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Lord_vinayaka.web_mvc_module.entity.UserProfile;
@Repository
public interface SignupRepo extends CrudRepository<UserProfile,Short> {

}
