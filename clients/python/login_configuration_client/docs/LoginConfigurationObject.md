# LoginConfigurationObject

## Properties

| Name                           | Type                                                                                    | Description                                                                                                                                                                                                     | Notes      |
| ------------------------------ | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **ari**                        | **str**                                                                                 | Configuration ari                                                                                                                                                                                               |
| **configuration_id**           | **str**                                                                                 | Configuration id                                                                                                                                                                                                | [optional] |
| **project_id**                 | **str**                                                                                 | Project id                                                                                                                                                                                                      |
| **name**                       | **str**                                                                                 | User defined login configuration name                                                                                                                                                                           |
| **redirect_uris**              | **List[str]**                                                                           | OAuth 2.0 Redirect URIs                                                                                                                                                                                         | [optional] |
| **post_logout_redirect_uris**  | **List[str]**                                                                           | Post Logout Redirect URIs, Used to redirect the user&#39;s browser to a specified URL after the logout process is complete. Must match the domain, port, scheme of at least one of the registered redirect URIs | [optional] |
| **scope**                      | **str**                                                                                 | OAuth 2.0 Client Scope                                                                                                                                                                                          | [optional] |
| **client_id**                  | **str**                                                                                 | OAuth 2.0 Client ID                                                                                                                                                                                             | [optional] |
| **creation_date**              | **str**                                                                                 | OAuth 2.0 Client Creation Date                                                                                                                                                                                  |
| **vp_definition**              | **str**                                                                                 | VP definition in JSON stringify format                                                                                                                                                                          | [optional] |
| **presentation_definition**    | **object**                                                                              | Presentation Definition                                                                                                                                                                                         | [optional] |
| **id_token_mapping**           | [**List[IdTokenMappingItem]**](IdTokenMappingItem.md)                                   | Fields name/path mapping between the vp_token and the id_token                                                                                                                                                  |
| **client_metadata**            | [**LoginConfigurationClientMetadataOutput**](LoginConfigurationClientMetadataOutput.md) |                                                                                                                                                                                                                 |
| **token_endpoint_auth_method** | [**TokenEndpointAuthMethod**](TokenEndpointAuthMethod.md)                               |                                                                                                                                                                                                                 |

## Example

```python
from affinidi_tdk_login_configuration_client.models.login_configuration_object import LoginConfigurationObject

# TODO update the JSON string below
json = "{}"
# create an instance of LoginConfigurationObject from a JSON string
login_configuration_object_instance = LoginConfigurationObject.from_json(json)
# print the JSON string representation of the object
print LoginConfigurationObject.to_json()

# convert the object into a dict
login_configuration_object_dict = login_configuration_object_instance.to_dict()
# create an instance of LoginConfigurationObject from a dict
login_configuration_object_from_dict = LoginConfigurationObject.from_dict(login_configuration_object_dict)
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
