package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

    private List<Subject> listOfSubjects;

    public SubjectService() {
        this.listOfSubjects = new ArrayList<>();
    }

    /**
     * Takes no parameter and returns list of subjects
     * @return it returns total list of subjects
     */

    public List<Subject> getAllSubjects() {
        return listOfSubjects;
    }

    /**
     * Takes id as string returns subject object
     * @param id
     * @return getSubject returns subject for given id
     */

    public Subject getSubject(String id) {

        for(int i = 0; i < listOfSubjects.size(); i++) {
           Subject subject = listOfSubjects.get(i);
           if(subject.getId().equals(id))
               return subject;
        }

        return null;
    }

    /**
     * Takes a object it adds a subject to list
     * @param subject
     * @return it returns a successful message after adding subject
     */

    public String addSubject(Subject subject) {
        listOfSubjects.add(subject);
        return "added";
    }

    /**
     * Takes object, id as input it updates subject object
     * @param subject
     * @param id
     * @return it returns updated message after updated
     */

    public String updateSubject(Subject subject, String id) {
        for(int i = 0; i < listOfSubjects.size(); i++){
            Subject s = listOfSubjects.get(i);
            if(s.getId().equals(id)) {
                listOfSubjects.set(i, subject);
                return "updated";
            }
        }

        return "not found";
    }

    /**
     * Takes id as string it deletes subject object in list for given id
     * @param id
     * @return it returns deleted message if found otherwise not found
     */

    public String deleteSubject(String id) {
        for(int i = 0; i < listOfSubjects.size(); i++) {
            Subject subject = listOfSubjects.get(i);
            if(subject.getId().equals(id)) {
                listOfSubjects.remove(subject);
                return "deleted";
            }
        }
        return "not found";
    }


}
