package com.demo.restapi.demo_rest_api.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.demo.restapi.demo_rest_api.entity.UserEntity;



// ! Hibernate/ JPA   -  Build in JPA Method
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

  // ! Customer JPA method
  // select * from Users where name = ?
  List<UserEntity> findByName(String name); //

  // select * from Users where name = ? and website = ?
  List<UserEntity> findByNameAndWebsite(String name, String website);

  // select * from Users where name = ? or website = ?
  List<UserEntity> findByNameOrWebsite(String name, String website);

  //! JPQL 
    // Syntax is similar to SQL
  //select from entity class
  //username -> entity's attribute
  //Support and, or ,order by, inner join, left join
  @Query("SELECT e from UserEntity e where e.username = :username")
  UserEntity findByUsername(@Param("username") String username);


  @Query("SELECT e from UserEntity e where e.username = :username ORDER BY e.website DESC")
  UserEntity findByUsernameOrderByWebsiteDesc(@Param("username") String username);

  // ! Native Query (SQL)
  //Disadvantage , product specific
  //username -> coloumn name
  @Query(value = "SELECT * from Users e where e.username = :username", nativeQuery = true)
  UserEntity findByUsername2(@Param("username") String username);


  //For all right operations, use @modifying !!!
  @Modifying
  @Query(value = "Update users set user_email = :useremail WHERE id = :id", nativeQuery = true)
  int updateUserEmail(@Param("useremail") String userEmail, @Param("id")Long id);
  

}
