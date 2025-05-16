package SpringProject.Spring.AppointmentManager.controller;

import SpringProject.Spring.AppointmentManager.model.Appointment;
import SpringProject.Spring.AppointmentManager.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentService.create(appointment);
    }
}
