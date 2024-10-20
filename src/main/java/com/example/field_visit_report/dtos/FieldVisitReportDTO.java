package com.example.field_visit_report.dtos;

public class FieldVisitReportDTO {
    private String visitedArea;
    private String contactName;
    private String contactRole;
    private String description;

    // Getters and Setters
    public String getVisitedArea() {
        return visitedArea;
    }

    public void setVisitedArea(String visitedArea) {
        this.visitedArea = visitedArea;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactRole() {
        return contactRole;
    }

    public void setContactRole(String contactRole) {
        this.contactRole = contactRole;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
