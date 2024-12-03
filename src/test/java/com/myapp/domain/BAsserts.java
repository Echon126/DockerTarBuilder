package com.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class BAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertBAllPropertiesEquals(B expected, B actual) {
        assertBAutoGeneratedPropertiesEquals(expected, actual);
        assertBAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertBAllUpdatablePropertiesEquals(B expected, B actual) {
        assertBUpdatableFieldsEquals(expected, actual);
        assertBUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertBAutoGeneratedPropertiesEquals(B expected, B actual) {
        assertThat(expected)
            .as("Verify B auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertBUpdatableFieldsEquals(B expected, B actual) {
        // empty method

    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertBUpdatableRelationshipsEquals(B expected, B actual) {
        assertThat(expected).as("Verify B relationships").satisfies(e -> assertThat(e.getA()).as("check a").isEqualTo(actual.getA()));
    }
}
