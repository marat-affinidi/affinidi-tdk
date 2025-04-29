part of 'token_provider.dart';

/// CIS Token Provider class for generating tokens required to claim credentials.
class CisTokenProvider extends TokenProvider {
  static final String _tokenEndpoint = Environment.fetchConsumerCisUrl();

  @override
  Future<String> getToken(Uint8List seed) async {
    final myDiD = _getDID(seed);
    final header = _getHeader(_getKid(myDiD));
    return await _getJwtToken(seed, header, _tokenEndpoint);
  }

  Map<String, dynamic> _getHeader(String kid) {
    return {'alg': 'ES256K', 'kid': kid, 'typ': 'openid4vci-proof+jwt'};
  }

  /// Exchanges a pre-authorization code for an access token and authorization details.
  Future<({String accessToken, List<dynamic>? authorizationDetails})>
      exchangePreAuthCodeForToken(
          {required String tokenEndpoint,
          required String preAuthCode,
          String? txCode}) async {
    final dio = Dio();

    final formData = {
      "grant_type": "urn:ietf:params:oauth:grant-type:pre-authorized_code",
      'pre-authorized_code': preAuthCode,
      if (txCode != null) 'tx_code': txCode,
    };

    try {
      final response = await dio.post(
        tokenEndpoint,
        data: formData,
        options: Options(
          contentType: 'application/x-www-form-urlencoded',
        ),
      );

      return (
        accessToken: response.data['access_token'] as String,
        authorizationDetails:
            response.data['authorization_details'] as List<dynamic>?
      );
    } on DioException catch (e) {
      throw Exception(
          'Failed to exchange pre-auth code for token: ${e.message}');
    }
  }
}
