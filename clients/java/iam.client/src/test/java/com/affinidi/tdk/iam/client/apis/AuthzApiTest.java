/*
 * Iam
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.iam.client.apis;

import com.affinidi.tdk.iam.client.ApiException;
import com.affinidi.tdk.iam.client.models.GrantAccessInput;
import com.affinidi.tdk.iam.client.models.GrantAccessOutput;
import com.affinidi.tdk.iam.client.models.UnauthorizedError;
import com.affinidi.tdk.iam.client.models.UnexpectedError;
import com.affinidi.tdk.iam.client.models.UpdateAccessInput;
import com.affinidi.tdk.iam.client.models.UpdateAccessOutput;
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
 * API tests for AuthzApi
 */
@Disabled
public class AuthzApiTest {

    private final AuthzApi api = new AuthzApi();

    /**
     * delete access of granteeDid
     *
     * deleteAccessVfs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAccessVfsTest() throws ApiException {
        String granteeDid = null;
        api.deleteAccessVfs(granteeDid);

        // TODO: test validations
    }
    /**
     * Grant access to the virtual file system
     *
     * Grants access rights to a subject for the virtual file system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void grantAccessVfsTest() throws ApiException {
        GrantAccessInput grantAccessInput = null;
        GrantAccessOutput response = api.grantAccessVfs(grantAccessInput);

        // TODO: test validations
    }
    /**
     * Update access of granteeDid
     *
     * updateAccessVfs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAccessVfsTest() throws ApiException {
        String granteeDid = null;
        UpdateAccessInput updateAccessInput = null;
        UpdateAccessOutput response = api.updateAccessVfs(granteeDid, updateAccessInput);

        // TODO: test validations
    }
}
