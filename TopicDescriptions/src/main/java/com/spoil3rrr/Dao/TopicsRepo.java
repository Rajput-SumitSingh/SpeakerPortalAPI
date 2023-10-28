package com.spoil3rrr.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spoil3rrr.Entity.Topics;
@Repository
public interface TopicsRepo extends JpaRepository<Topics, Integer>{

}
