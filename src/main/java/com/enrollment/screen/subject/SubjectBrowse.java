package com.enrollment.screen.subject;

import io.jmix.ui.screen.*;
import com.enrollment.entity.Subject;

@UiController("Subject.browse")
@UiDescriptor("subject-browse.xml")
@LookupComponent("subjectsTable")
public class SubjectBrowse extends StandardLookup<Subject> {
}