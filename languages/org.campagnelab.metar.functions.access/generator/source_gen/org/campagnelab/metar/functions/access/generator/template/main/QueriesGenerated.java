package org.campagnelab.metar.functions.access.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

@Generated
public class QueriesGenerated {
  public final boolean NEEDS_OPCONTEXT = false;
  public static SNode sourceNodeQuery_1669016037359836706(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x64c9046609b241abL, 0x89f85085b3b9eca7L, 0xfa69225966133a1L, 0xfa69225966133a2L, "call")), MetaAdapterFactory.getContainmentLink(0x64c9046609b241abL, 0x89f85085b3b9eca7L, 0xfa69225978829dcL, 0xfa69225978829ddL, "call"));
  }
  public static SNode sourceNodeQuery_7174230558147545331(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x64c9046609b241abL, 0x89f85085b3b9eca7L, 0xfa69225978829dcL, 0xfa69225978829ddL, "call"));
  }
}
