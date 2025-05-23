# affinidi_tdk_login_configuration_client.model.OAuth2Token

## Load the model package

```dart
import 'package:affinidi_tdk_login_configuration_client/api.dart';
```

## Properties

| Name                     | Type                                                                                                 | Description                                                                                                                                                                  | Notes      |
| ------------------------ | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **accessToken**          | **String**                                                                                           | The access token issued by the authorization server.                                                                                                                         | [optional] |
| **expiresIn**            | **int**                                                                                              | The lifetime in seconds of the access token. For example, the value \"3600\" denotes that the access token will expire in one hour from the time the response was generated. | [optional] |
| **idToken**              | **int**                                                                                              | To retrieve a refresh token request the id_token scope.                                                                                                                      | [optional] |
| **refreshToken**         | **String**                                                                                           | The refresh token, which can be used to obtain new access tokens. To retrieve it add the scope \"offline\" to your access token request.                                     | [optional] |
| **scope**                | **String**                                                                                           | The scope of the access token                                                                                                                                                | [optional] |
| **tokenType**            | **String**                                                                                           | The type of the token issued                                                                                                                                                 | [optional] |
| **authorizationDetails** | [**BuiltList&lt;OAuth2TokenAuthorizationDetailsInner&gt;**](OAuth2TokenAuthorizationDetailsInner.md) | is used to request issuance of a certain Credential type. This optional field is only applicable in batch credential operations.                                             | [optional] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
