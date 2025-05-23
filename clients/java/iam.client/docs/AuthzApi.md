# AuthzApi

All URIs are relative to *https://apse1.api.affinidi.io/iam*

| Method                                             | HTTP request                                 | Description                             |
| -------------------------------------------------- | -------------------------------------------- | --------------------------------------- |
| [**deleteAccessVfs**](AuthzApi.md#deleteAccessVfs) | **DELETE** /v1/authz/vfs/access/{granteeDid} | delete access of granteeDid             |
| [**grantAccessVfs**](AuthzApi.md#grantAccessVfs)   | **POST** /v1/authz/vfs/access                | Grant access to the virtual file system |
| [**updateAccessVfs**](AuthzApi.md#updateAccessVfs) | **PUT** /v1/authz/vfs/access/{granteeDid}    | Update access of granteeDid             |

## deleteAccessVfs

> deleteAccessVfs(granteeDid)

delete access of granteeDid

deleteAccessVfs

### Example

```java
// Import classes:
import com.affinidi.tdk.iam.client.ApiClient;
import com.affinidi.tdk.iam.client.ApiException;
import com.affinidi.tdk.iam.client.Configuration;
import com.affinidi.tdk.iam.client.auth.*;
import com.affinidi.tdk.iam.client.models.*;
import com.affinidi.tdk.iam.client.apis.AuthzApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://apse1.api.affinidi.io/iam");

        // Configure API key authorization: ConsumerTokenAuth
        ApiKeyAuth ConsumerTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("ConsumerTokenAuth");
        ConsumerTokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ConsumerTokenAuth.setApiKeyPrefix("Token");

        AuthzApi apiInstance = new AuthzApi(defaultClient);
        String granteeDid = "granteeDid_example"; // String |
        try {
            apiInstance.deleteAccessVfs(granteeDid);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthzApi#deleteAccessVfs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name           | Type       | Description | Notes |
| -------------- | ---------- | ----------- | ----- |
| **granteeDid** | **String** |             |       |

### Return type

null (empty response body)

### Authorization

[ConsumerTokenAuth](../README.md#ConsumerTokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description     | Response headers |
| ----------- | --------------- | ---------------- |
| **204**     | Ok              | -                |
| **403**     | ForbiddenError  | -                |
| **500**     | UnexpectedError | -                |

## grantAccessVfs

> GrantAccessOutput grantAccessVfs(grantAccessInput)

Grant access to the virtual file system

Grants access rights to a subject for the virtual file system

### Example

```java
// Import classes:
import com.affinidi.tdk.iam.client.ApiClient;
import com.affinidi.tdk.iam.client.ApiException;
import com.affinidi.tdk.iam.client.Configuration;
import com.affinidi.tdk.iam.client.auth.*;
import com.affinidi.tdk.iam.client.models.*;
import com.affinidi.tdk.iam.client.apis.AuthzApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://apse1.api.affinidi.io/iam");

        // Configure API key authorization: ConsumerTokenAuth
        ApiKeyAuth ConsumerTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("ConsumerTokenAuth");
        ConsumerTokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ConsumerTokenAuth.setApiKeyPrefix("Token");

        AuthzApi apiInstance = new AuthzApi(defaultClient);
        GrantAccessInput grantAccessInput = new GrantAccessInput(); // GrantAccessInput | Grant access to virtual file system
        try {
            GrantAccessOutput result = apiInstance.grantAccessVfs(grantAccessInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthzApi#grantAccessVfs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                 | Type                                        | Description                         | Notes |
| -------------------- | ------------------------------------------- | ----------------------------------- | ----- |
| **grantAccessInput** | [**GrantAccessInput**](GrantAccessInput.md) | Grant access to virtual file system |       |

### Return type

[**GrantAccessOutput**](GrantAccessOutput.md)

### Authorization

[ConsumerTokenAuth](../README.md#ConsumerTokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description                            | Response headers |
| ----------- | -------------------------------------- | ---------------- |
| **200**     | Successfully granted access to Service | -                |
| **403**     | ForbiddenError                         | -                |
| **500**     | UnexpectedError                        | -                |

## updateAccessVfs

> UpdateAccessOutput updateAccessVfs(granteeDid, updateAccessInput)

Update access of granteeDid

updateAccessVfs

### Example

```java
// Import classes:
import com.affinidi.tdk.iam.client.ApiClient;
import com.affinidi.tdk.iam.client.ApiException;
import com.affinidi.tdk.iam.client.Configuration;
import com.affinidi.tdk.iam.client.auth.*;
import com.affinidi.tdk.iam.client.models.*;
import com.affinidi.tdk.iam.client.apis.AuthzApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://apse1.api.affinidi.io/iam");

        // Configure API key authorization: ConsumerTokenAuth
        ApiKeyAuth ConsumerTokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("ConsumerTokenAuth");
        ConsumerTokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ConsumerTokenAuth.setApiKeyPrefix("Token");

        AuthzApi apiInstance = new AuthzApi(defaultClient);
        String granteeDid = "granteeDid_example"; // String |
        UpdateAccessInput updateAccessInput = new UpdateAccessInput(); // UpdateAccessInput | update access to virtual file system
        try {
            UpdateAccessOutput result = apiInstance.updateAccessVfs(granteeDid, updateAccessInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthzApi#updateAccessVfs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                  | Type                                          | Description                          | Notes |
| --------------------- | --------------------------------------------- | ------------------------------------ | ----- |
| **granteeDid**        | **String**                                    |                                      |       |
| **updateAccessInput** | [**UpdateAccessInput**](UpdateAccessInput.md) | update access to virtual file system |       |

### Return type

[**UpdateAccessOutput**](UpdateAccessOutput.md)

### Authorization

[ConsumerTokenAuth](../README.md#ConsumerTokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description                            | Response headers |
| ----------- | -------------------------------------- | ---------------- |
| **200**     | Successfully updated access to Service | -                |
| **403**     | ForbiddenError                         | -                |
| **500**     | UnexpectedError                        | -                |
