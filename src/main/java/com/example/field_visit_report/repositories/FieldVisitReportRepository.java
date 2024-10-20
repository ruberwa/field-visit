package com.example.field_visit_report.repositories;

import com.example.field_visit_report.entities.FieldVisitReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldVisitReportRepository extends JpaRepository<FieldVisitReport, Long> {
    // Custom query methods can be defined here if needed
}