package com.enrollment.screen.instructor;

import io.jmix.ui.screen.*;
import com.enrollment.entity.Instructor;

@UiController("Instructor.edit")
@UiDescriptor("instructor-edit.xml")
@EditedEntityContainer("instructorDc")
public class InstructorEdit extends StandardEditor<Instructor> {
}