/*
 * generated by Xtext 2.21.0
 */
package org.virtio.virtiodriver.ftracelanguage;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class FrtraceLanguageStandaloneSetup extends FrtraceLanguageStandaloneSetupGenerated {

	public static void doSetup() {
		new FrtraceLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}