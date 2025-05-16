package SpringProject.Spring.AppointmentManager.repository;

import SpringProject.Spring.AppointmentManager.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.time.LocalDateTime;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    @Query("SELECT a FROM Appointment a WHERE (a.startTime < ?2 AND a.endTime > ?1)")
    List<Appointment> findConflictingAppointments(LocalDateTime start, LocalDateTime end);
}
