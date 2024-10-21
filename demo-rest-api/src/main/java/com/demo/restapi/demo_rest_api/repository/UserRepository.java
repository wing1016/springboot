package com.demo.restapi.demo_rest_api.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.restapi.demo_rest_api.entity.UserEntity;



// ! Hibernate/ JPA
// 1. During compile time, generate Class to implement this interface
// 2. Implement the all the method according to the DB driver
// 3. Construct the corresponding Entity Java Object
@Repository // bean
public interface UserRepository extends JpaRepository<UserEntity, Long> {
  // save() -> insert into Users value (...) / similar Map.put -> create or update
  // findAll() -> select * from Users; -> return List<User>
  // findById() -> select * from Users where id = ?

  // saveAll(userEntities) -> Many insert into ... given List<UserEntity>
  // deleteById()

  // select * from Users where name = ?
  List<UserEntity> findByName(String name); //

  // select * from Users where name = ? and website = ?
  List<UserEntity> findByNameAndWebsite(String name, String website);

  // select * from Users where name = ? or website = ?
  List<UserEntity> findByNameOrWebsite(String name, String website);

}
