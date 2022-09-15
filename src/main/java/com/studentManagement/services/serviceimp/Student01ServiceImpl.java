package com.studentManagement.services.serviceimp;


import com.studentManagement.entites.entite.Student01;
import com.studentManagement.repo.Student01Repository;
import com.studentManagement.services.Student01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import java.util.List;

@Service
public class Student01ServiceImpl implements Student01Service {
    @Autowired
    Student01Repository student01Repository;
    @Autowired
    EntityManager entityManager;

    @Override
    public Student01 addStudent(Student01 student01) {
        return student01Repository.save(student01);
    }

    @Override
    public Student01 updateStudent(Student01 student01) {
        return student01Repository.save(student01);
    }

    @Override
    public void deleteStudent(Integer id) {
        student01Repository.deleteById(id);
    }

    @Override
    public List<Student01> getAllStudent01() {
        System.out.println("This is Service layer method");
        return student01Repository.findAllStudent01();
        //return student01Repository.findAll();
    }
    @Override
    @Transactional
    public List<Student01> findByName(String name) {
      /*  CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student01> criteriaQuery = criteriaBuilder.createQuery(Student01.class);
        Root<Student01> root = criteriaQuery.from(Student01.class);
        Predicate namePredicate= criteriaBuilder.equal(root.get("name"),name);
        criteriaQuery.where(namePredicate);
        TypedQuery<Student01> query= entityManager.createQuery(criteriaQuery);
        System.out.println("*********criteriaBuilder***************"+criteriaBuilder);
        System.out.println("result set size  " + query.getResultList().size());

        List<Student01> resultList = query.getResultList();
        System.out.println(resultList);
        return resultList;*/

           System.out.println("service impl");
           List<Student01> student01s = student01Repository.findByName(name);
           System.out.println(student01s.size());
           student01s.forEach(s-> System.out.println(s.getSubjects()));
          /* student01s.forEach(s-> System.out.println(s.getAddress01()));
           student01s.forEach(s-> System.out.println(s.getSubjects()));
           student01s.forEach(s-> System.out.println(s.getStandard()));*/
            return student01s;
    }
}
