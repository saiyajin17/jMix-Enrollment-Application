package com.enrollment.screen.school;

import io.jmix.ui.screen.*;
import com.enrollment.entity.School;

@UiController("School.browse")
@UiDescriptor("school-browse.xml")
@LookupComponent("schoolsTable")
public class SchoolBrowse extends StandardLookup<School> {
}