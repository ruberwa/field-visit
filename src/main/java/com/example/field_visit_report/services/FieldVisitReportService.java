package com.example.field_visit_report.services;

import com.example.field_visit_report.dtos.FieldVisitReportDTO;
import com.example.field_visit_report.entities.FieldVisitReport;
import com.example.field_visit_report.repositories.FieldVisitReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldVisitReportService {
    private final FieldVisitReportRepository repository;

    @Autowired
    public FieldVisitReportService(FieldVisitReportRepository repository) {
        this.repository = repository;
    }

    public FieldVisitReport createFieldVisitReport(FieldVisitReportDTO dto) {
        // Convert DTO to Entity
        FieldVisitReport report = new FieldVisitReport();
        report.setVisitedArea(dto.getVisitedArea());
        report.setContactName(dto.getContactName());
        report.setContactRole(dto.getContactRole());
        report.setDescription(dto.getDescription());
        
        // Save the entity to the database
        return repository.save(report);
    }


}
