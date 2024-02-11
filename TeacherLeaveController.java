
  package com.mydata.controller;
  
  import java.util.List;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Controller; import
  org.springframework.ui.Model; import
  org.springframework.web.bind.annotation.GetMapping; import
  org.springframework.web.bind.annotation.ModelAttribute; import
  org.springframework.web.bind.annotation.PostMapping;
  
  import com.mydata.model.TeacherLeave; import
  com.mydata.service.TeacherLeaveService;
  
  @Controller public class TeacherLeaveController {
  
  @Autowired TeacherLeaveService teacherLeaveService;
  
  @GetMapping("/teacherleave") public String opnteacherleaveController(Model
  model) { TeacherLeave tl = new TeacherLeave();
  model.addAttribute("Teacherleave", tl); return "Teacherleave.html";
  
  }
  
  @PostMapping("/teacherleave") public String
  saveTeacherleave(@ModelAttribute("Teacherleave") TeacherLeave teacherLeave) {
  teacherLeaveService.saveteacherleave(teacherLeave); return "home.html";
  
  }
  
  @GetMapping("/viewallteacherleave") public String viewallteacherleave(Model
  model) { List<TeacherLeave> teacherLeaveList =
  teacherLeaveService.viewallTeacherLeave();
  model.addAttribute("TeacherleaveList", teacherLeaveList);
 
  TeacherLeave t1 = new TeacherLeave(); model.addAttribute("Teacherleave", t1);
  return "allteacherleaves.html"; } }
 