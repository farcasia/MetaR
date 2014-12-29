package org.campagnelab.metar.expressions.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.campagnelab.metar.tables.generationhelpers.NameHelper;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;

@Generated
public class QueriesGenerated {
  public final boolean NEEDS_OPCONTEXT = false;

  public static boolean baseMappingRule_Condition_8044300460862745704(final BaseMappingRuleContext _context) {
    return false;
  }

  public static Object propertyMacro_GetPropertyValue_548459537434164940(final PropertyMacroContext _context) {
    return BehaviorReflection.invokeVirtual(String.class, _context.getNode(), "virtual_getPresentation_1213877396640", new Object[]{});
  }

  public static Object propertyMacro_GetPropertyValue_7783277237109521443(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "value");
  }

  public static Object propertyMacro_GetPropertyValue_2826789978053353317(final PropertyMacroContext _context) {
    return Integer.toString(SPropertyOperations.getInteger(_context.getNode(), "value"));
  }

  public static Object propertyMacro_GetPropertyValue_8044300460862479313(final PropertyMacroContext _context) {
    return Boolean.toString(SPropertyOperations.getBoolean(_context.getNode(), "value")).toUpperCase();
  }

  public static Object propertyMacro_GetPropertyValue_7783277237109724852(final PropertyMacroContext _context) {
    return NameHelper.RName(SPropertyOperations.getString(SNodeOperations.getAncestor(SLinkOperations.getTarget(_context.getNode(), "column", false), "org.campagnelab.metar.tables.structure.Table", false, false), "name")) + "$" + SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "column", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_4140623938104565278(final PropertyMacroContext _context) {
    return NameHelper.RName(SPropertyOperations.getString(SNodeOperations.cast(SNodeOperations.getParent(SLinkOperations.getTarget(_context.getNode(), "column", false)), "org.campagnelab.metar.tables.structure.Table"), "name"));
  }

  public static Object propertyMacro_GetPropertyValue_4140623938104483050(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "column", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_5821174364903479560(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "value");
  }

  public static SNode sourceNodeQuery_548459537434081223(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_548459537434080975(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_2807244893518306976(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static SNode sourceNodeQuery_2826789978062877903(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static Iterable<SNode> sourceNodesQuery_8044300460862701718(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "expression", true);
  }
}
