package com.enrollment.screen.student;

import io.jmix.ui.screen.*;
import com.enrollment.entity.Student;

@UiController("Student.edit")
@UiDescriptor("student-edit.xml")
@EditedEntityContainer("studentDc")
public class StudentEdit extends StandardEditor<Student> {
}