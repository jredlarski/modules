package org.motechproject.commcare.domain.report;

/**
 * Represents a single CommCareHQ report column. It's a part of the MOTECH model.
 */
public class Column {

    private String id;
    private String display;
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}