package com.jpacourse.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class PatientTO implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private String email;
    private String patientNumber;
    private LocalDate dateOfBirth;
    private List<VisitTO> visits;
    private Integer age; // Nowe pole

    public void setId(Long id2) { this.id = id2; }
    public void setFirstName(String firstName2) { this.firstName = firstName2; }

    public void setTelephoneNumber(String telephoneNumber2) { this.telephoneNumber = telephoneNumber2; }
    public void setEmail(String email2) { this.email = email2; }

    public void setPatientNumber(String patientNumber2) { this.patientNumber = patientNumber2; }
    public void setDateOfBirth(LocalDate dateOfBirth2) { this.dateOfBirth = dateOfBirth2; }

    public void setAge(Object age2) { this.age = (Integer) age2; }
    public void setVisits(List<VisitTO> collect) { this.visits = collect; }
    public Long getId() { return this.id; }
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public String getTelephoneNumber() { return this.telephoneNumber; }
    public String getEmail() { return this.email; }
    public String getPatientNumber() { return this.patientNumber; }
    public LocalDate getDateOfBirth() { return this.dateOfBirth; }
    public Integer getAge() { return this.age; }
    public void setLastName(String lastName2) { this.lastName = lastName2; }


}
