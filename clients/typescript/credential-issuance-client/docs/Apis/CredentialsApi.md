# CredentialsApi

All URIs are relative to *https://apse1.api.affinidi.io/cis*

| Method                                                                                 | HTTP request                                                                                | Description                                           |
| -------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ----------------------------------------------------- |
| [**batchCredential**](CredentialsApi.md#batchCredential)                               | **POST** /v1/{projectId}/batch_credential                                                   | Allows wallets to claim multiple credentials at once. |
| [**generateCredentials**](CredentialsApi.md#generateCredentials)                       | **POST** /v1/{projectId}/credential                                                         |                                                       |
| [**getClaimedCredentials**](CredentialsApi.md#getClaimedCredentials)                   | **GET** /v1/{projectId}/configurations/{configurationId}/credentials                        | Get claimed credential in the specified range         |
| [**getIssuanceIdClaimedCredential**](CredentialsApi.md#getIssuanceIdClaimedCredential) | **GET** /v1/{projectId}/configurations/{configurationId}/issuances/{issuanceId}/credentials | Get claimed VC linked to the issuanceId               |

<a name="batchCredential"></a>

# **batchCredential**

> BatchCredentialResponse batchCredential(projectId, BatchCredentialInput)

Allows wallets to claim multiple credentials at once.

    Allows wallets to claim multiple credentials at once. For authentication, it uses a token from the authorization server

### Parameters

| Name                     | Type                                                          | Description                       | Notes             |
| ------------------------ | ------------------------------------------------------------- | --------------------------------- | ----------------- |
| **projectId**            | **String**                                                    | Affinidi project id               | [default to null] |
| **BatchCredentialInput** | [**BatchCredentialInput**](../Models/BatchCredentialInput.md) | Request body for batch credential |                   |

### Return type

[**BatchCredentialResponse**](../Models/BatchCredentialResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="generateCredentials"></a>

# **generateCredentials**

> CredentialResponse generateCredentials(projectId, CreateCredentialInput)

    Issue credential for end user upon presentation a valid access token. Since we don&#39;t immediate issue credential It&#39;s expected to return &#x60;transaction_id&#x60; and use this &#x60;transaction_id&#x60; to get the deferred credentials

### Parameters

| Name                      | Type                                                            | Description                       | Notes             |
| ------------------------- | --------------------------------------------------------------- | --------------------------------- | ----------------- |
| **projectId**             | **String**                                                      | Affinidi project id               | [default to null] |
| **CreateCredentialInput** | [**CreateCredentialInput**](../Models/CreateCredentialInput.md) | Request body to issue credentials |                   |

### Return type

[**CredentialResponse**](../Models/CredentialResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="getClaimedCredentials"></a>

# **getClaimedCredentials**

> ClaimedCredentialListResponse getClaimedCredentials(projectId, configurationId, rangeStartTime, rangeEndTime, exclusiveStartKey, limit)

Get claimed credential in the specified range

    Get claimed credential in the specified range

### Parameters

| Name                  | Type        | Description                                              | Notes                        |
| --------------------- | ----------- | -------------------------------------------------------- | ---------------------------- |
| **projectId**         | **String**  | project id                                               | [default to null]            |
| **configurationId**   | **String**  | configuration id                                         | [default to null]            |
| **rangeStartTime**    | **String**  |                                                          | [default to null]            |
| **rangeEndTime**      | **String**  |                                                          | [optional] [default to null] |
| **exclusiveStartKey** | **String**  | exclusiveStartKey for retrieving the next batch of data. | [optional] [default to null] |
| **limit**             | **Integer** |                                                          | [optional] [default to 20]   |

### Return type

[**ClaimedCredentialListResponse**](../Models/ClaimedCredentialListResponse.md)

### Authorization

[ProjectTokenAuth](../README.md#ProjectTokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getIssuanceIdClaimedCredential"></a>

# **getIssuanceIdClaimedCredential**

> ClaimedCredentialResponse getIssuanceIdClaimedCredential(projectId, configurationId, issuanceId)

Get claimed VC linked to the issuanceId

    Get claimed VC linked to the issuanceId

### Parameters

| Name                | Type       | Description      | Notes             |
| ------------------- | ---------- | ---------------- | ----------------- |
| **projectId**       | **String** | project id       | [default to null] |
| **configurationId** | **String** | configuration id | [default to null] |
| **issuanceId**      | **String** | issuance id      | [default to null] |

### Return type

[**ClaimedCredentialResponse**](../Models/ClaimedCredentialResponse.md)

### Authorization

[ProjectTokenAuth](../README.md#ProjectTokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json
