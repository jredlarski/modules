package org.motechproject.commcare.domain.report.constants;

/**
 * Utility class for storing report column and filter types.
 */
public final class Types {

    //Columns
    private static final String FIELD = "field";
    private static final String EXPANDED = "expanded";

    //Filters datatypes
    private static final String STRING = "string";
    private static final String INTEGER = "integer";
    private static final String DECIMAL = "decimal";

    //Filters types
    private static final String DATE = "date";
    private static final String CHOICE_LIST = "choice_list";
    private static final String DYNAMIC_CHOICE_LIST = "dynamic_choice_list";

    /**
     * Utility class, should not be initiated.
     */
    private Types() {
    }

}