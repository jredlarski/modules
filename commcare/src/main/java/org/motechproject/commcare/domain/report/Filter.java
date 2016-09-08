package org.motechproject.commcare.domain.report;

/**
 * Represents a single CommCareHQ report filter. It's a part of the MOTECH model.
 */
public class Filter {

    private String datatype;
    private String slug;
    private String type;

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}