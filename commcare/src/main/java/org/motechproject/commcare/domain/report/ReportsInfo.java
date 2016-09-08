package org.motechproject.commcare.domain.report;

import java.util.List;

/**
 * Wrapper class for storing list of instances of the {@link ReportInfo} class. It's a part of the MOTECH model.
 */
public class ReportsInfo {

    private List<ReportInfo> reportsInfoList;

    public List<ReportInfo> getReportsInfoList() {
        return reportsInfoList;
    }

    public void setReportsInfoList(List<ReportInfo> reportsInfoList) {
        this.reportsInfoList = reportsInfoList;
    }
}