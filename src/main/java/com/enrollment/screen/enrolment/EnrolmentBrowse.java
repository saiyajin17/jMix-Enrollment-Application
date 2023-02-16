package com.enrollment.screen.enrolment;

import io.jmix.ui.screen.*;
import com.enrollment.entity.Enrolment;

@UiController("Enrolment.browse")
@UiDescriptor("enrolment-browse.xml")
@LookupComponent("enrolmentsTable")
public class EnrolmentBrowse extends StandardLookup<Enrolment> {
}