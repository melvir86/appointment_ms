package project.appointment.services;

import lombok.extern.slf4j.Slf4j;
import project.appointment.entities.Appointment;
import project.appointment.repositories.AppointmentRepository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository AppointmentRepository;

    public AppointmentService(AppointmentRepository AppointmentRepository) {
        this.AppointmentRepository = AppointmentRepository;
    }

    //Retrieve all Appointments
    public List<Appointment> getAllAppointments() {
        return AppointmentRepository.findAll();
    }
 
    //Retrieve 1 Appointment
     public Appointment getAppointment(String id) {
 
         return AppointmentRepository.findById(id).get();
     }

    //Creates a Appointment
     public Appointment saveAppointment(Appointment Appointment) {

        return AppointmentRepository.save(Appointment);
     }

    //Updates an existing Appointment
    public Appointment updateAppointment(String id, Appointment Appointment) {
        
        Appointment existAppointment = getAppointment(id);
        existAppointment.setGp(Appointment.getGp());
        existAppointment.setAppointment_type(Appointment.getAppointment_type());
        existAppointment.setAppointment_symptom(Appointment.getAppointment_symptom());
        existAppointment.setAppointment_cause(Appointment.getAppointment_cause());
        existAppointment.setAppointment_worry(Appointment.getAppointment_worry());
        existAppointment.setAppointment_duration(Appointment.getAppointment_duration());
        existAppointment.setAppointment_symptomstatus(Appointment.getAppointment_symptomstatus());
        existAppointment.setAppointment_improvement(Appointment.getAppointment_improvement());
        existAppointment.setAppointment_doctor(Appointment.getAppointment_doctor());
        existAppointment.setAppointment_datetime(Appointment.getAppointment_datetime());

        existAppointment.setConsent_contact(Appointment.getConsent_contact());
        existAppointment.setConsent_sms(Appointment.getConsent_sms());
        existAppointment.setConsent_email(Appointment.getConsent_email());

        existAppointment.setStatus(Appointment.getStatus());
        existAppointment.setGp_comments(Appointment.getGp_comments());

        existAppointment.setLastModifiedDate(Appointment.getLastModifiedDate());
        AppointmentRepository.save(existAppointment);
        return existAppointment;
    }
 
    //Retrieve Appointment by User
    public List<Appointment> getAppointmentByUser(String user) {
    
        List<Appointment> AppointmentList = AppointmentRepository.findByUser(user);
        return AppointmentList;
    }

    //Retrieve Appointment by GP
    public List<Appointment> getAppointmentByGP(String gp) {
    
        List<Appointment> AppointmentList = AppointmentRepository.findByGp(gp);
        return AppointmentList;
    }

    //Retrieve Appointment by Id
    public List<Appointment> getFeedbackByObjectId(ObjectId id) {

        List<Appointment> AppointmentList = AppointmentRepository.findBy_id(id);
        return AppointmentList;
    }

    //Delete a Appointment
     public void deleteAppointment(String id) {
 
        AppointmentRepository.deleteById(id);
     }

    //Retrieve Appointment by Id
    public List<Appointment> getAppointmentByObjectId(ObjectId id) {

        List<Appointment> Appointment = AppointmentRepository.findBy_id(id);
        return Appointment;
    }

}
