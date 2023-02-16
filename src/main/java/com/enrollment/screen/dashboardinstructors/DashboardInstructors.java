package com.enrollment.screen.dashboardinstructors;

import com.enrollment.entity.Instructor;
import com.enrollment.entity.Student;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.screen.Screen;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("DashboardInstructors")
@UiDescriptor("dashboard-Instructors.xml")
public class DashboardInstructors extends Screen {
    @Autowired
    private CollectionLoader<Instructor> instructorsDl;
    @Autowired
    private CollectionLoader<Student> studentsDl;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        instructorsDl.load();
        studentsDl.load();
    }


}