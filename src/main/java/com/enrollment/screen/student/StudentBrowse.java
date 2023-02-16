package com.enrollment.screen.student;

import io.jmix.ui.screen.*;
import com.enrollment.entity.Student;

@UiController("Student.browse")
@UiDescriptor("student-browse.xml")
@LookupComponent("studentsTable")
public class StudentBrowse extends StandardLookup<Student> {
}