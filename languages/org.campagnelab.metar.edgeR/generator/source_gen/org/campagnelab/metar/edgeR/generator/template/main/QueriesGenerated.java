package org.campagnelab.metar.edgeR.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.campagnelab.metar.tables.generationhelpers.NameHelper;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;

@Generated
public class QueriesGenerated {
  public final boolean NEEDS_OPCONTEXT = false;

  public static Object propertyMacro_GetPropertyValue_8031339867717094839(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "alias");
  }

  public static Object propertyMacro_GetPropertyValue_8031339867717141124(final PropertyMacroContext _context) {
    final SNode table = SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "org.campagnelab.metar.edgeR.structure.EdgeRTest", false, false), "countsTable", true), "table", false);
    return IterableUtils.join(ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "org.campagnelab.metar.edgeR.structure.GroupRef", false, new String[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, "group", false) != null);
      }
    }).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, "group", false);
      }
    }).select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return NameHelper.RName(SPropertyOperations.getString(table, "name")) + "$\"" + SPropertyOperations.getString(it, "name") + "\"";
      }
    }), "+");
  }

  public static Object propertyMacro_GetPropertyValue_8031339867717110858(final PropertyMacroContext _context) {
    return Integer.toString(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "groups", true)).count());
  }

  public static SNode sourceNodeQuery_8031339867717093522(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "groupExpression", true);
  }

  public static SNode sourceNodeQuery_8031339867717094626(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "left", true);
  }

  public static SNode sourceNodeQuery_8031339867717099255(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "right", true);
  }

  public static SNode sourceNodeQuery_8031339867717136229(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "contrasts", true);
  }
}