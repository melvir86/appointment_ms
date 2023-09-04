package project.appointment.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "appointment")
public class Appointment {

    //Appointment object to hold information pertaining to appointment
    @Id
    private ObjectId _id;

    @Field(name = "appointment_gp")
    private String gp;

    private String appointment_type;
    private String appointment_symptom;
    private String appointment_cause;
    private String appointment_worry;
    private String appointment_duration;
    private String appointment_symptomstatus;
    private String appointment_improvement;
    private String appointment_doctor;
    private String appointment_datetime;

    private String consent_contact;
    private String consent_sms;
    private String consent_email;

    private String user;
    private String status;
    private String gp_comments;

    @CreatedDate
    @Column(updatable = false)
    public LocalDateTime createdDate;
    @LastModifiedDate
    public LocalDateTime lastModifiedDate;
    //private Date createdDate = new Date();

    // ObjectId needs to be converted to string
    public String get_id() { return _id.toHexString(); }
    public void set_id(ObjectId _id) { this._id = _id; }
}
