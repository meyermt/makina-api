package com.meyermt.makina.makinaapi.repo;

import com.meyermt.makina.makinaapi.beans.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
  List<User> findByName(@Param("name") String name);
}
