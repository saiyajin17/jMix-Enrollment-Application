package com.enrollment.screen.dashboardsubject;

import com.enrollment.entity.Student;
import com.enrollment.entity.Subject;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.screen.Screen;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Dashboardsubject")
@UiDescriptor("Dashboardsubject.xml")
public class Dashboardsubject extends Screen {
    @Autowired
    private CollectionLoader<Student> studentsDl;
    @Autowired
    private CollectionLoader<Subject> subjectsDl;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        studentsDl.load();
        subjectsDl.load();
    }


}