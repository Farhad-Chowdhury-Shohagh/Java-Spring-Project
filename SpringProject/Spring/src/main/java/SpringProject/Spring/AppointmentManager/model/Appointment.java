package SpringProject.Spring.AppointmentManager.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")  // Ensure the table name matches
public class Appointment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "client_name")
        private String clientName;

        @Column(name = "service_type")
        private String serviceType;

        @Column(name = "start_time")
        private LocalDateTime startTime;

        @Column(name = "end_time")
        private LocalDateTime endTime;

        @Column(name = "notes")
        private String notes;

        // Getter and Setter for id
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        // Getter and Setter for clientName
        public String getClientName() {
                return clientName;
        }

        public void setClientName(String clientName) {
                this.clientName = clientName;
        }

        // Getter and Setter for serviceType
        public String getServiceType() {
                return serviceType;
        }

        public void setServiceType(String serviceType) {
                this.serviceType = serviceType;
        }

        // Getter and Setter for startTime
        public LocalDateTime getStartTime() {
                return startTime;
        }

        public void setStartTime(LocalDateTime startTime) {
                this.startTime = startTime;
        }

        // Getter and Setter for endTime
        public LocalDateTime getEndTime() {
                return endTime;
        }

        public void setEndTime(LocalDateTime endTime) {
                this.endTime = endTime;
        }

        // Getter and Setter for notes
        public String getNotes() {
                return notes;
        }

        public void setNotes(String notes) {
                this.notes = notes;
        }
}
