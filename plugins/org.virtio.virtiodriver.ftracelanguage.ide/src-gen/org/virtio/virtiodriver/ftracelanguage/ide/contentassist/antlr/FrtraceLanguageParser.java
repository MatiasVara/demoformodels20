/*
 * generated by Xtext 2.21.0
 */
package org.virtio.virtiodriver.ftracelanguage.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.virtio.virtiodriver.ftracelanguage.ide.contentassist.antlr.internal.InternalFrtraceLanguageParser;
import org.virtio.virtiodriver.ftracelanguage.services.FrtraceLanguageGrammarAccess;

public class FrtraceLanguageParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(FrtraceLanguageGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, FrtraceLanguageGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTraceAccess().getGroup(), "rule__Trace__Group__0");
			builder.put(grammarAccess.getTraceModelAccess().getTracesAssignment(), "rule__TraceModel__TracesAssignment");
			builder.put(grammarAccess.getTraceAccess().getFirstAssignment_0(), "rule__Trace__FirstAssignment_0");
			builder.put(grammarAccess.getTraceAccess().getSecondAssignment_2(), "rule__Trace__SecondAssignment_2");
			builder.put(grammarAccess.getTraceAccess().getTimestampAssignment_5(), "rule__Trace__TimestampAssignment_5");
			builder.put(grammarAccess.getTraceAccess().getDecAssignment_7(), "rule__Trace__DecAssignment_7");
			builder.put(grammarAccess.getTraceAccess().getFunctionAssignment_9(), "rule__Trace__FunctionAssignment_9");
			builder.put(grammarAccess.getTraceAccess().getNameAssignment_11(), "rule__Trace__NameAssignment_11");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private FrtraceLanguageGrammarAccess grammarAccess;

	@Override
	protected InternalFrtraceLanguageParser createParser() {
		InternalFrtraceLanguageParser result = new InternalFrtraceLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FrtraceLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FrtraceLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}