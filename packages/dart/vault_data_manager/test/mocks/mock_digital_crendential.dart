import 'package:affinidi_tdk_vault/affinidi_tdk_vault.dart';
import 'package:mocktail/mocktail.dart';
import 'package:ssi/ssi.dart';

class MockDigitalCredential extends Mock implements DigitalCredential {
  final VerifiableCredential _vc;
  final String _id;

  MockDigitalCredential(this._vc, {required String id}) : _id = id;

  @override
  VerifiableCredential get verifiableCredential => _vc;

  @override
  String get id => _id;
}
