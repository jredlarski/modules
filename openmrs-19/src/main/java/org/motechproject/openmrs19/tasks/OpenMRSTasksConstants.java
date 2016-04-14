package org.motechproject.openmrs19.tasks;

/**
 * A class grouping OpenMRS constants, which are used in tasks module.
 */
public final class OpenMRSTasksConstants {
    public static final String NAME = "openMRS";
    public static final String PACKAGE_ROOT = "org.motechproject.openmrs19.domain";

    // Lookup names
    public static final String BY_MOTECH_ID = "openMRS.lookup.motechId";
    public static final String BY_UUID = "openMRS.lookup.uuid";

    // Lookup objects
    public static final String ENCOUNTER = "Encounter";
    public static final String PATIENT = "Patient";
    public static final String PROVIDER = "Provider";

    // Field names
    public static final String MOTECH_ID = "openMRS.motechId";
    public static final String UUID = "openMRS.uuid";

    private OpenMRSTasksConstants() {

    }
}