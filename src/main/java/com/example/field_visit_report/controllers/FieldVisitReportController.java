package com.example.field_visit_report.controllers;

import com.example.field_visit_report.dtos.FieldVisitReportDTO;
import com.example.field_visit_report.entities.FieldVisitReport;
import com.example.field_visit_report.services.FieldVisitReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/field-visit-reports")
public class FieldVisitReportController {
    private final FieldVisitReportService service;

    @Autowired
    public FieldVisitReportController(FieldVisitReportService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<FieldVisitReport> createFieldVisitReport(@RequestBody FieldVisitReportDTO dto) {
        FieldVisitReport report = service.createFieldVisitReport(dto);
        return ResponseEntity.status(201).body(report);
    }


}
