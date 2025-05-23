# affinidi_tdk_iam_client.api.TokensApi

## Load the API package

```dart
import 'package:affinidi_tdk_iam_client/api.dart';
```

All URIs are relative to *https://apse1.api.affinidi.io/iam*

| Method                                                      | HTTP request                          | Description |
| ----------------------------------------------------------- | ------------------------------------- | ----------- |
| [**createToken**](TokensApi.md#createtoken)                 | **POST** /v1/tokens                   |
| [**deleteToken**](TokensApi.md#deletetoken)                 | **DELETE** /v1/tokens/{tokenId}       |
| [**getToken**](TokensApi.md#gettoken)                       | **GET** /v1/tokens/{tokenId}          |
| [**listProjectsOfToken**](TokensApi.md#listprojectsoftoken) | **GET** /v1/tokens/{tokenId}/projects |
| [**listToken**](TokensApi.md#listtoken)                     | **GET** /v1/tokens                    |
| [**updateToken**](TokensApi.md#updatetoken)                 | **PATCH** /v1/tokens/{tokenId}        |

# **createToken**

> TokenDto createToken(createTokenInput)

### Example

```dart
import 'package:affinidi_tdk_iam_client/api.dart';
// TODO Configure API key authorization: UserTokenAuth
//defaultApiClient.getAuthentication<ApiKeyAuth>('UserTokenAuth').apiKey = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//defaultApiClient.getAuthentication<ApiKeyAuth>('UserTokenAuth').apiKeyPrefix = 'Bearer';

final api = AffinidiTdkIamClient().getTokensApi();
final CreateTokenInput createTokenInput = ; // CreateTokenInput | CreateToken

try {
    final response = api.createToken(createTokenInput);
    print(response);
} catch on DioException (e) {
    print('Exception when calling TokensApi->createToken: $e\n');
}
```

### Parameters

| Name                 | Type                                        | Description | Notes |
| -------------------- | ------------------------------------------- | ----------- | ----- |
| **createTokenInput** | [**CreateTokenInput**](CreateTokenInput.md) | CreateToken |

### Return type

[**TokenDto**](TokenDto.md)

### Authorization

[UserTokenAuth](../README.md#UserTokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteToken**

> deleteToken(tokenId)

### Example

```dart
import 'package:affinidi_tdk_iam_client/api.dart';
// TODO Configure API key authorization: UserTokenAuth
//defaultApiClient.getAuthentication<ApiKeyAuth>('UserTokenAuth').apiKey = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//defaultApiClient.getAuthentication<ApiKeyAuth>('UserTokenAuth').apiKeyPrefix = 'Bearer';

final api = AffinidiTdkIamClient().getTokensApi();
final String tokenId = 38400000-8cf0-11bd-b23e-10b96e4ef00d; // String |

try {
    api.deleteToken(tokenId);
} catch on DioException (e) {
    print('Exception when calling TokensApi->deleteToken: $e\n');
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **tokenId** | **String** |             |

### Return type

void (empty response body)

### Authorization

[UserTokenAuth](../README.md#UserTokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getToken**

> TokenDto getToken(tokenId)

### Example

```dart
import 'package:affinidi_tdk_iam_client/api.dart';
// TODO Configure API key authorization: UserTokenAuth
//defaultApiClient.getAuthentication<ApiKeyAuth>('UserTokenAuth').apiKey = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//defaultApiClient.getAuthentication<ApiKeyAuth>('UserTokenAuth').apiKeyPrefix = 'Bearer';

final api = AffinidiTdkIamClient().getTokensApi();
final String tokenId = 38400000-8cf0-11bd-b23e-10b96e4ef00d; // String |

try {
    final response = api.getToken(tokenId);
    print(response);
} catch on DioException (e) {
    print('Exception when calling TokensApi->getToken: $e\n');
}
```

### Parameters

| Name        | Type       | Description | Notes |
| ----------- | ---------- | ----------- | ----- |
| **tokenId** | **String** |             |

### Return type

[**TokenDto**](TokenDto.md)

### Authorization

[UserTokenAuth](../README.md#UserTokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listProjectsOfToken**

> ProjectWithPolicyList listProjectsOfToken(tokenId, limit, exclusiveStartKey)

### Example

```dart
import 'package:affinidi_tdk_iam_client/api.dart';
// TODO Configure API key authorization: UserTokenAuth
//defaultApiClient.getAuthentication<ApiKeyAuth>('UserTokenAuth').apiKey = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//defaultApiClient.getAuthentication<ApiKeyAuth>('UserTokenAuth').apiKeyPrefix = 'Bearer';

final api = AffinidiTdkIamClient().getTokensApi();
final String tokenId = 38400000-8cf0-11bd-b23e-10b96e4ef00d; // String |
final int limit = 56; // int | Maximum number of records to fetch in a list
final String exclusiveStartKey = exclusiveStartKey_example; // String | The base64url encoded key of the first item that this operation will evaluate (it is not returned). Use the value that was returned in the previous operation.

try {
    final response = api.listProjectsOfToken(tokenId, limit, exclusiveStartKey);
    print(response);
} catch on DioException (e) {
    print('Exception when calling TokensApi->listProjectsOfToken: $e\n');
}
```

### Parameters

| Name                  | Type       | Description                                                                                                                                                    | Notes                       |
| --------------------- | ---------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------- |
| **tokenId**           | **String** |                                                                                                                                                                |
| **limit**             | **int**    | Maximum number of records to fetch in a list                                                                                                                   | [optional] [default to 100] |
| **exclusiveStartKey** | **String** | The base64url encoded key of the first item that this operation will evaluate (it is not returned). Use the value that was returned in the previous operation. | [optional]                  |

### Return type

[**ProjectWithPolicyList**](ProjectWithPolicyList.md)

### Authorization

[UserTokenAuth](../README.md#UserTokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listToken**

> TokenList listToken(limit, exclusiveStartKey)

### Example

```dart
import 'package:affinidi_tdk_iam_client/api.dart';
// TODO Configure API key authorization: UserTokenAuth
//defaultApiClient.getAuthentication<ApiKeyAuth>('UserTokenAuth').apiKey = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//defaultApiClient.getAuthentication<ApiKeyAuth>('UserTokenAuth').apiKeyPrefix = 'Bearer';

final api = AffinidiTdkIamClient().getTokensApi();
final int limit = 56; // int | Maximum number of records to fetch in a list
final String exclusiveStartKey = exclusiveStartKey_example; // String | The base64url encoded key of the first item that this operation will evaluate (it is not returned). Use the value that was returned in the previous operation.

try {
    final response = api.listToken(limit, exclusiveStartKey);
    print(response);
} catch on DioException (e) {
    print('Exception when calling TokensApi->listToken: $e\n');
}
```

### Parameters

| Name                  | Type       | Description                                                                                                                                                    | Notes                       |
| --------------------- | ---------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------- |
| **limit**             | **int**    | Maximum number of records to fetch in a list                                                                                                                   | [optional] [default to 100] |
| **exclusiveStartKey** | **String** | The base64url encoded key of the first item that this operation will evaluate (it is not returned). Use the value that was returned in the previous operation. | [optional]                  |

### Return type

[**TokenList**](TokenList.md)

### Authorization

[UserTokenAuth](../README.md#UserTokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateToken**

> TokenDto updateToken(tokenId, updateTokenInput)

### Example

```dart
import 'package:affinidi_tdk_iam_client/api.dart';
// TODO Configure API key authorization: UserTokenAuth
//defaultApiClient.getAuthentication<ApiKeyAuth>('UserTokenAuth').apiKey = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//defaultApiClient.getAuthentication<ApiKeyAuth>('UserTokenAuth').apiKeyPrefix = 'Bearer';

final api = AffinidiTdkIamClient().getTokensApi();
final String tokenId = 38400000-8cf0-11bd-b23e-10b96e4ef00d; // String |
final UpdateTokenInput updateTokenInput = ; // UpdateTokenInput | UpdateToken

try {
    final response = api.updateToken(tokenId, updateTokenInput);
    print(response);
} catch on DioException (e) {
    print('Exception when calling TokensApi->updateToken: $e\n');
}
```

### Parameters

| Name                 | Type                                        | Description | Notes |
| -------------------- | ------------------------------------------- | ----------- | ----- |
| **tokenId**          | **String**                                  |             |
| **updateTokenInput** | [**UpdateTokenInput**](UpdateTokenInput.md) | UpdateToken |

### Return type

[**TokenDto**](TokenDto.md)

### Authorization

[UserTokenAuth](../README.md#UserTokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
