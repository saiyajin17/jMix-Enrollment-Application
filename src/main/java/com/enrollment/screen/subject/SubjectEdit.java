package com.enrollment.screen.subject;

import io.jmix.ui.screen.*;
import com.enrollment.entity.Subject;

@UiController("Subject.edit")
@UiDescriptor("subject-edit.xml")
@EditedEntityContainer("subjectDc")
public class SubjectEdit extends StandardEditor<Subject> {
}