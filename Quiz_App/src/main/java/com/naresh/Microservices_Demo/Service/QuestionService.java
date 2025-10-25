package com.naresh.Microservices_Demo.Service;

import com.naresh.Microservices_Demo.Dao.QuestionDao;
import com.naresh.Microservices_Demo.Model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
     return    questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
       return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "success";
    }

    public String deleteById(int id) {
        questionDao.deleteById(id);
        return "deleted....";
    }
}
