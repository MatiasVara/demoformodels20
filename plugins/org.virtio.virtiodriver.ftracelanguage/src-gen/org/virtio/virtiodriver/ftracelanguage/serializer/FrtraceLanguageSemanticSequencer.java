/*
 * generated by Xtext 2.21.0
 */
package org.virtio.virtiodriver.ftracelanguage.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.FrtraceLanguagePackage;
import org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.Trace;
import org.virtio.virtiodriver.ftracelanguage.frtraceLanguage.TraceModel;
import org.virtio.virtiodriver.ftracelanguage.services.FrtraceLanguageGrammarAccess;

@SuppressWarnings("all")
public class FrtraceLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FrtraceLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FrtraceLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FrtraceLanguagePackage.TRACE:
				sequence_Trace(context, (Trace) semanticObject); 
				return; 
			case FrtraceLanguagePackage.TRACE_MODEL:
				sequence_TraceModel(context, (TraceModel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     TraceModel returns TraceModel
	 *
	 * Constraint:
	 *     Traces+=Trace+
	 */
	protected void sequence_TraceModel(ISerializationContext context, TraceModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Trace returns Trace
	 *
	 * Constraint:
	 *     (
	 *         first=ID 
	 *         second=INT 
	 *         timestamp=INT 
	 *         dec=INT 
	 *         function=ID 
	 *         name=ID
	 *     )
	 */
	protected void sequence_Trace(ISerializationContext context, Trace semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FrtraceLanguagePackage.Literals.TRACE__FIRST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FrtraceLanguagePackage.Literals.TRACE__FIRST));
			if (transientValues.isValueTransient(semanticObject, FrtraceLanguagePackage.Literals.TRACE__SECOND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FrtraceLanguagePackage.Literals.TRACE__SECOND));
			if (transientValues.isValueTransient(semanticObject, FrtraceLanguagePackage.Literals.TRACE__TIMESTAMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FrtraceLanguagePackage.Literals.TRACE__TIMESTAMP));
			if (transientValues.isValueTransient(semanticObject, FrtraceLanguagePackage.Literals.TRACE__DEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FrtraceLanguagePackage.Literals.TRACE__DEC));
			if (transientValues.isValueTransient(semanticObject, FrtraceLanguagePackage.Literals.TRACE__FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FrtraceLanguagePackage.Literals.TRACE__FUNCTION));
			if (transientValues.isValueTransient(semanticObject, FrtraceLanguagePackage.Literals.TRACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FrtraceLanguagePackage.Literals.TRACE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTraceAccess().getFirstIDTerminalRuleCall_0_0(), semanticObject.getFirst());
		feeder.accept(grammarAccess.getTraceAccess().getSecondINTTerminalRuleCall_2_0(), semanticObject.getSecond());
		feeder.accept(grammarAccess.getTraceAccess().getTimestampINTTerminalRuleCall_5_0(), semanticObject.getTimestamp());
		feeder.accept(grammarAccess.getTraceAccess().getDecINTTerminalRuleCall_7_0(), semanticObject.getDec());
		feeder.accept(grammarAccess.getTraceAccess().getFunctionIDTerminalRuleCall_9_0(), semanticObject.getFunction());
		feeder.accept(grammarAccess.getTraceAccess().getNameIDTerminalRuleCall_11_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
