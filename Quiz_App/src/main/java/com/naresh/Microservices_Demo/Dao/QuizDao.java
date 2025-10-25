package com.naresh.Microservices_Demo.Dao;

import com.naresh.Microservices_Demo.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizDao extends JpaRepository<Quiz,Integer> {



}
