package com.enrollment.screen.enrolment;

import io.jmix.ui.screen.*;
import com.enrollment.entity.Enrolment;

@UiController("Enrolment.edit")
@UiDescriptor("enrolment-edit.xml")
@EditedEntityContainer("enrolmentDc")
public class EnrolmentEdit extends StandardEditor<Enrolment> {
}