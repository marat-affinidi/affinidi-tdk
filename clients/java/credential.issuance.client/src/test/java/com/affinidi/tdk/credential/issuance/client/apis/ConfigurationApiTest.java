/*
 * CredentialIssuanceService
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.credential.issuance.client.apis;

import com.affinidi.tdk.credential.issuance.client.ApiException;
import com.affinidi.tdk.credential.issuance.client.models.CreateIssuanceConfig400Response;
import com.affinidi.tdk.credential.issuance.client.models.CreateIssuanceConfigInput;
import com.affinidi.tdk.credential.issuance.client.models.InvalidParameterError;
import com.affinidi.tdk.credential.issuance.client.models.IssuanceConfigDto;
import com.affinidi.tdk.credential.issuance.client.models.IssuanceConfigListResponse;
import com.affinidi.tdk.credential.issuance.client.models.NotFoundError;
import com.affinidi.tdk.credential.issuance.client.models.UpdateIssuanceConfigInput;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConfigurationApi
 */
@Disabled
public class ConfigurationApiTest {

    private final ConfigurationApi api = new ConfigurationApi();

    /**
     * Create issuance configuration, project have only one configuration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIssuanceConfigTest() throws ApiException {
        CreateIssuanceConfigInput createIssuanceConfigInput = null;
        IssuanceConfigDto response = api.createIssuanceConfig(createIssuanceConfigInput);

        // TODO: test validations
    }
    /**
     * Delete project issuance configuration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIssuanceConfigByIdTest() throws ApiException {
        String configurationId = null;
        api.deleteIssuanceConfigById(configurationId);

        // TODO: test validations
    }
    /**
     * Get issuance configuration by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssuanceConfigByIdTest() throws ApiException {
        String configurationId = null;
        IssuanceConfigDto response = api.getIssuanceConfigById(configurationId);

        // TODO: test validations
    }
    /**
     * Get issuance configuration for my selected project
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssuanceConfigListTest() throws ApiException {
        IssuanceConfigListResponse response = api.getIssuanceConfigList();

        // TODO: test validations
    }
    /**
     * Update issuance configuration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIssuanceConfigByIdTest() throws ApiException {
        String configurationId = null;
        UpdateIssuanceConfigInput updateIssuanceConfigInput = null;
        IssuanceConfigDto response = api.updateIssuanceConfigById(configurationId, updateIssuanceConfigInput);

        // TODO: test validations
    }
}
