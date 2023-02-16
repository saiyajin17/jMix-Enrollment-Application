package com.enrollment.screen.instructor;

import io.jmix.ui.screen.*;
import com.enrollment.entity.Instructor;

@UiController("Instructor.browse")
@UiDescriptor("instructor-browse.xml")
@LookupComponent("instructorsTable")
public class InstructorBrowse extends StandardLookup<Instructor> {
}