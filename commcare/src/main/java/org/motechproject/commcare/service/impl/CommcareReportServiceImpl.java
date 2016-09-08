package org.motechproject.commcare.service.impl;

import org.motechproject.commcare.domain.report.ReportInfo;
import org.motechproject.commcare.service.CommcareReportService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommcareReportServiceImpl implements CommcareReportService {

    @Override
    public List<ReportInfo> getReports(String configName) {
        return null; // TO DO
    }

    @Override
    public List<ReportInfo> getReports() {
        return getReports(null);
    }
}