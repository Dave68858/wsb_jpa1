package com.jpacourse.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.jpacourse.persistence.entity.MedicalTreatmentEntity;

public class VisitTO implements Serializable {
    private Long id;
    private String description;
    private LocalDateTime time;
    private String doctorFirstName;
    private String doctorLastName;
    private List<MedicalTreatmentEntity> treatmentTypes;

    public void setId(Long id2) { this.id = id2; }
    public void setIdDescription(String description2) { this.description = description2; }
    public void setTime(LocalDateTime time2) { this.time = time2; }
    public void setDoctorFirstName(String firstName) { this.doctorFirstName = firstName; }
    public void setDoctorLastName(String lastName) { this.doctorLastName = lastName; }
    public void setTreatmentTypes(List<MedicalTreatmentEntity> collect) { this.treatmentTypes = collect; }
}
