package com.example.demo.Config;

import com.example.demo.Controllers.MethodsService;
import com.example.demo.Models.*;
import com.example.demo.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    AppRoleRepository appRoleRepository;

    @Autowired
    AppUserRepository appUserRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ProgrammeRepository programmeRepository;
    @Autowired
    MethodsService methodsService;

    LocalDateTime localDateTime;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Loading data ...");
        AppRole role = new AppRole();
        role.setRoleName("STUDENT");
        appRoleRepository.save(role);

        role = new AppRole();
        role.setRoleName("ADMIN");
        appRoleRepository.save(role);

        // USERS
        // STUDENTS
        Student student = new Student();
        // Student 1
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setUserEmail("g1@gmail.com");
        student.setAppPassword("password1");
        student.setEnglishLang(3);
        student.setEmployment(2);
        student.setComputerSkill(2);
        student.setItInterest(3);
        student.setEducation(4);
        student.setMajorCS(true);
        student.setLegalUS(true);
        student.setOopUnderstanding(3);
        student.setOolExperience(1);
        student.setGradYear(2012);
        student.setCurrentEarning(35000);
        methodsService.registerStudent(student);
        // Student 2
        student = new Student();
        student.setFirstName("Jacob");
        student.setLastName("Smith");
        student.setUserEmail("g2@gmail.com");
        student.setAppPassword("password2");
        student.setEnglishLang(1);
        student.setEmployment(1);
        student.setComputerSkill(1);
        student.setItInterest(1);
        student.setEducation(1);
        student.setMajorCS(false);
        student.setLegalUS(false);
        student.setOopUnderstanding(1);
        student.setOolExperience(1);
        student.setGradYear(1995);
        student.setCurrentEarning(0);
        methodsService.registerStudent(student);
        // Student 3
        student = new Student();
        student.setFirstName("Jane");
        student.setLastName("Pane");
        student.setUserEmail("g3@gmail.com");
        student.setAppPassword("password3");
        student.setEnglishLang(3);
        student.setEmployment(3);
        student.setComputerSkill(3);
        student.setItInterest(3);
        student.setEducation(5);
        student.setMajorCS(true);
        student.setLegalUS(true);
        student.setOopUnderstanding(3);
        student.setOolExperience(3);
        student.setGradYear(2015);
        student.setCurrentEarning(100000);
        methodsService.registerStudent(student);
        // Student 4
        student = new Student();
        student.setFirstName("Mary");
        student.setLastName("Kerry");
        student.setUserEmail("g4@gmail.com");
        student.setAppPassword("password4");
        student.setEnglishLang(2);
        student.setEmployment(2);
        student.setComputerSkill(2);
        student.setItInterest(2);
        student.setEducation(2);
        student.setMajorCS(false);
        student.setLegalUS(false);
        student.setOopUnderstanding(1);
        student.setOolExperience(1);
        student.setGradYear(2008);
        student.setCurrentEarning(43000);
        methodsService.registerStudent(student);
        // Student 5
        student = new Student();
        student.setFirstName("William");
        student.setLastName("Williamson");
        student.setUserEmail("g5@gmail.com");
        student.setAppPassword("password5");
        student.setEnglishLang(3);
        student.setEmployment(1);
        student.setComputerSkill(2);
        student.setItInterest(3);
        student.setEducation(4);
        student.setMajorCS(true);
        student.setLegalUS(true);
        student.setOopUnderstanding(3);
        student.setOolExperience(3);
        student.setGradYear(2001);
        student.setCurrentEarning(0);
        methodsService.registerStudent(student);
        // Student 6
        student = new Student();
        student.setFirstName("Jill");
        student.setLastName("Hill");
        student.setUserEmail("g6@gmail.com");
        student.setAppPassword("password6");
        student.setEnglishLang(2);
        student.setEmployment(2);
        student.setComputerSkill(2);
        student.setItInterest(1);
        student.setEducation(3);
        student.setMajorCS(false);
        student.setLegalUS(true);
        student.setOopUnderstanding(3);
        student.setOolExperience(3);
        student.setGradYear(2011);
        student.setCurrentEarning(50000);
        methodsService.registerStudent(student);
        // Student 7
        student = new Student();
        student.setFirstName("Fred");
        student.setLastName("Krueger");
        student.setUserEmail("g7@gmail.com");
        student.setAppPassword("password7");
        student.setEnglishLang(null);
        student.setEmployment(null);
        student.setComputerSkill(null);
        student.setItInterest(null);
        student.setEducation(null);
        student.setMajorCS(null);
        student.setLegalUS(null);
        student.setOopUnderstanding(null);
        student.setOolExperience(null);
        student.setGradYear(null);
        student.setCurrentEarning(null);
        methodsService.registerStudent(student);

        // ADMINS
        AppUser user = new AppUser();
        // Admin 1
        user.setAppUsername("Brandon@bmail.com");
        user.setAppPassword("password");
        methodsService.addAdministrator(user);

        // Admin 1
        user = new AppUser();
        user.setAppUsername("Dave@dmail.com");
        user.setAppPassword("password7");
        methodsService.addAdministrator(user);

        // PROGRAMS
        Programme programme = new Programme();
        // Program 1
        programme.setProgramName("Hiring in Tech");
        programme.setProgramDescription("Tech Hiring");
        programme.setCriteriaDescription("");
        programme.setNumberAccepted(0);
        programme.setNumberApplicants(0);
        programme.setEnglishLang(3);
        programme.setEmployment(1);
        programme.setComputerSkill(2);
        programme.setItInterest(3);
        programme.setEducation(2);
        programme.setMajorCS(null);
        programme.setLegalUS(true);
        programme.setOopUnderstanding(null);
        programme.setOolExperience(null);
        programme.setGradYear(null);
        programme.setCurrentEarning(null);
        programmeRepository.save(programme);
        // Program 2
        programme = new Programme();
        programme.setProgramName("Promising the Future");
        programme.setProgramDescription("Future Promising");
        programme.setCriteriaDescription("");
        programme.setNumberAccepted(0);
        programme.setNumberApplicants(0);
        programme.setEnglishLang(null);
        programme.setEmployment(null);
        programme.setComputerSkill(1);
        programme.setItInterest(null);
        programme.setEducation(null);
        programme.setMajorCS(true);
        programme.setLegalUS(true);
        programme.setOopUnderstanding(2);
        programme.setOolExperience(2);
        programme.setGradYear(6);
        programme.setCurrentEarning(42000);
        programmeRepository.save(programme);

        // METHOD Testing
        // Checking qualifications
        methodsService.qualifyStudents(studentRepository,programmeRepository);






    }
}