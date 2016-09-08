package org.motechproject.commcare.service;

import org.motechproject.commcare.domain.report.ReportInfo;

import java.util.List;

/**
 *  This service provides features: Interacting with CommCareHQ's programmatic report APIs.
 */
public interface CommcareReportService {

    /**
     * Query CommCareHQ for all reports.
     *
     * @param configName  the name of the configuration used for connecting to CommcareHQ, null means default configuration
     * @return  the list of ReportInfo objects representing reports found on the given CommcareHQ
     *          configuration
     */
    List<ReportInfo> getReports(String configName);

    /**
     * Same as {@link #getReports(String)} but uses default Commcare configuration.
     */
    List<ReportInfo> getReports();
}