/*
 * generated by Xtext 2.21.0
 */
package org.virtio.virtiodriver.ftracelanguage.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractFrtraceLanguageValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.FrtraceLanguagePackage.eINSTANCE);
		return result;
	}
}