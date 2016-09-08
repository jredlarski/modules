package org.motechproject.commcare.domain.report;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

/**
 * Represents a single CommCareHQ report. It's a part of the CommCareHQ model.
 */
public class ReportJson {

    // There is probably a need for a wrapper class for ReportJson which would hold the list of RaportJson objects and metadata

    @SerializedName("columns")
    private List<Map<String, String>> columns;

    @SerializedName("filters")
    private List<Map<String, String>> filters;

    @SerializedName("title")
    private String title;

    @SerializedName("id")
    private String id;

    @SerializedName("resource")
    private String resource;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResource() {
        return resource;
    }

    public void setResource() {
        this.resource = resource;
    }

}