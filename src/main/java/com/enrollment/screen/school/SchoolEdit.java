package com.enrollment.screen.school;

import io.jmix.ui.screen.*;
import com.enrollment.entity.School;

@UiController("School.edit")
@UiDescriptor("school-edit.xml")
@EditedEntityContainer("schoolDc")
public class SchoolEdit extends StandardEditor<School> {
}