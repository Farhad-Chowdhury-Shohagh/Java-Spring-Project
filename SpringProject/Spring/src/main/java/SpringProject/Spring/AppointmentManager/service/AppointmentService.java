package SpringProject.Spring.AppointmentManager.service;

import SpringProject.Spring.AppointmentManager.model.Appointment;
import SpringProject.Spring.AppointmentManager.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment create(Appointment appointment) {

        List<Appointment> conflicts = appointmentRepository.findConflictingAppointments(
                appointment.getStartTime(), appointment.getEndTime());

        if (!conflicts.isEmpty()) {
            throw new IllegalArgumentException("Time conflict with existing appointment.");
        }

        return appointmentRepository.save(appointment);
    }
}
