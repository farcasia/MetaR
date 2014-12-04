package org.campagnelab.metar.edgeR.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import org.campagnelab.metar.edgeR.behavior.GroupFormula_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.campagnelab.metar.edgeR.behavior.EdgeRTest_Behavior;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.campagnelab.metar.tables.generationhelpers.NameHelper;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.campagnelab.metar.tables.behavior.TableRef_Behavior;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import org.campagnelab.metar.tables.behavior.ColumnGroup_Behavior;

@Generated
public class QueriesGenerated {
  public final boolean NEEDS_OPCONTEXT = false;

  public static boolean baseMappingRule_Condition_8031339867717481518(final BaseMappingRuleContext _context) {
    return SNodeOperations.getConceptDeclaration(_context.getNode()) == SConceptOperations.findConceptDeclaration("org.campagnelab.metar.edgeR.structure.CommonDispersion");
  }

  public static boolean baseMappingRule_Condition_8031339867717546242(final BaseMappingRuleContext _context) {
    return SNodeOperations.getConceptDeclaration(_context.getNode()) == SConceptOperations.findConceptDeclaration("org.campagnelab.metar.edgeR.structure.TagWiseDispersion");
  }

  public static boolean baseMappingRule_Condition_8031339867717548105(final BaseMappingRuleContext _context) {
    return SNodeOperations.getConceptDeclaration(_context.getNode()) == SConceptOperations.findConceptDeclaration("org.campagnelab.metar.edgeR.structure.TrendedDispersion");
  }

  public static boolean baseMappingRule_Condition_8031339867717490894(final BaseMappingRuleContext _context) {
    return GroupFormula_Behavior.call_oneFactor_8031339867717509466(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "org.campagnelab.metar.edgeR.structure.EdgeRTest"), "modelFormula", true));
  }

  public static boolean baseMappingRule_Condition_8031339867719169483(final BaseMappingRuleContext _context) {
    return SNodeOperations.getConceptDeclaration(_context.getNode()) == SConceptOperations.findConceptDeclaration("org.campagnelab.metar.edgeR.structure.CommonDispersion");
  }

  public static boolean baseMappingRule_Condition_8031339867719169494(final BaseMappingRuleContext _context) {
    return SNodeOperations.getConceptDeclaration(_context.getNode()) == SConceptOperations.findConceptDeclaration("org.campagnelab.metar.edgeR.structure.TagWiseDispersion");
  }

  public static boolean baseMappingRule_Condition_8031339867719169505(final BaseMappingRuleContext _context) {
    return SNodeOperations.getConceptDeclaration(_context.getNode()) == SConceptOperations.findConceptDeclaration("org.campagnelab.metar.edgeR.structure.TrendedDispersion");
  }

  public static boolean baseMappingRule_Condition_8031339867719169517(final BaseMappingRuleContext _context) {
    return !(GroupFormula_Behavior.call_oneFactor_8031339867717509466(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "org.campagnelab.metar.edgeR.structure.EdgeRTest"), "modelFormula", true)));
  }

  public static Object propertyMacro_GetPropertyValue_8031339867717094839(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "alias");
  }

  public static Object propertyMacro_GetPropertyValue_8031339867717141124(final PropertyMacroContext _context) {

    SNode edgeR = SNodeOperations.getAncestor(_context.getNode(), "org.campagnelab.metar.edgeR.structure.EdgeRTest", false, false);
    return IterableUtils.join(Sequence.fromIterable(EdgeRTest_Behavior.call_enumerateFactorLevels_8031339867727856905(edgeR, SLinkOperations.getTargets(_context.getNode(), "groups", true))).select(new ISelector<String, String>() {
      public String select(String it) {
        return NameHelper.RName(it);
      }
    }), " +");
  }

  public static Object propertyMacro_GetPropertyValue_8031339867717110858(final PropertyMacroContext _context) {
    return Integer.toString(ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "groups", true)).count());
  }

  public static Object propertyMacro_GetPropertyValue_8031339867718843427(final PropertyMacroContext _context) {
    return ((String) _context.getVariable("countsTableName"));
  }

  public static Object propertyMacro_GetPropertyValue_8031339867718891262(final PropertyMacroContext _context) {
    return ((String) _context.getVariable("countsTableName"));
  }

  public static Object propertyMacro_GetPropertyValue_8031339867718432234(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(TableRef_Behavior.call_firstColumnWithGroup_8031339867718453028(SLinkOperations.getTarget(_context.getNode(), "countsTable", true), "ID"), "name");
  }

  public static Object propertyMacro_GetPropertyValue_8031339867718506089(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_8031339867719204674(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_8031339867722721665(final PropertyMacroContext _context) {
    // find the columns with usage 
    return IterableUtils.join(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(((SNode) _context.getVariable("countsTable")), "table", false), "columns", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode col) {
        return ListSequence.fromList(SLinkOperations.getTargets(AttributeOperations.getAttribute(col, new IAttributeDescriptor.NodeAttribute("org.campagnelab.metar.tables.structure.ColumnAnnotation")), "groups", true)).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return (SLinkOperations.getTarget(it, "columnGroup", false) != null);
          }
        }).select(new ISelector<SNode, SNode>() {
          public SNode select(SNode it) {
            return SLinkOperations.getTarget(it, "columnGroup", false);
          }
        }).translate(new ITranslator2<SNode, SNode>() {
          public Iterable<SNode> translate(SNode it) {
            return SLinkOperations.getTargets(it, "usesRefs", true);
          }
        }).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return (SLinkOperations.getTarget(it, "usage", false) != null);
          }
        }).select(new ISelector<SNode, SNode>() {
          public SNode select(SNode it) {
            return SLinkOperations.getTarget(it, "usage", false);
          }
        }).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode usage) {
            return eq_x583g4_a0a0a0a0a0a0a0a0a0a0a1a71(SPropertyOperations.getString(usage, "name"), SPropertyOperations.getString(_context.getNode(), "name"));
          }
        });
      }
    }).select(new ISelector<SNode, String>() {
      public String select(SNode column) {
        return "\"" + ListSequence.fromList(SLinkOperations.getTargets(AttributeOperations.getAttribute(column, new IAttributeDescriptor.NodeAttribute("org.campagnelab.metar.tables.structure.ColumnAnnotation")), "groups", true)).findFirst(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(it, "columnGroup", false), "usesRefs", true)).where(new IWhereFilter<SNode>() {
              public boolean accept(SNode it) {
                return (SLinkOperations.getTarget(it, "usage", false) != null);
              }
            }).select(new ISelector<SNode, SNode>() {
              public SNode select(SNode it) {
                return SLinkOperations.getTarget(it, "usage", false);
              }
            }).contains(_context.getNode());
          }
        }) + "\"";
      }
    }).select(new ISelector<String, String>() {
      public String select(String groupName) {
        return NameHelper.RName(groupName);
      }
    }), ", ");
  }

  public static Object propertyMacro_GetPropertyValue_8031339867724616579(final PropertyMacroContext _context) {
    return IterableUtils.join(Sequence.fromIterable(GroupFormula_Behavior.call_calculateGroupUsageNames_8031339867724617718(SLinkOperations.getTarget(_context.getNode(), "modelFormula", true))).select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return SPropertyOperations.getString(it, "name");
      }
    }), " +");
  }

  public static boolean ifMacro_Condition_8031339867726629965(final IfMacroContext _context) {
    return GroupFormula_Behavior.call_oneFactor_8031339867717509466(SLinkOperations.getTarget(_context.getNode(), "modelFormula", true));
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

  public static SNode sourceNodeQuery_8031339867719092263(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "dispersionMethod", true);
  }

  public static SNode sourceNodeQuery_8031339867726638648(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "contrasts", true);
  }

  public static SNode sourceNodeQuery_8031339867717136229(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "contrasts", true);
  }

  public static Object templateArgumentQuery_8031339867718393870(final TemplateQueryContext _context) {
    return NameHelper.RName(SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "countsTable", true), "table", false), "name"));
  }

  public static Object templateArgumentQuery_8031339867724001479(final TemplateQueryContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "countsTable", true);
  }

  public static Iterable<SNode> sourceNodesQuery_8031339867718491133(final SourceSubstituteMacroNodesContext _context) {
    // calculate the set of columns names to remove: 
    // remove each column that is not labeled with the counts group 
    return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "countsTable", true), "table", false), "columns", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return ListSequence.fromList(SLinkOperations.getTargets(AttributeOperations.getAttribute(it, new IAttributeDescriptor.NodeAttribute("org.campagnelab.metar.tables.structure.ColumnAnnotation")), "groups", true)).all(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return neq_x583g4_a0a0a0a0a0a0a0a0a0c0cb(SPropertyOperations.getString(SLinkOperations.getTarget(it, "columnGroup", false), "name"), "counts");
          }
        });
      }
    });
  }

  public static Iterable<SNode> sourceNodesQuery_8031339867718980790(final SourceSubstituteMacroNodesContext _context) {
    final Iterable<String> groupUsageNames = ListSequence.fromList(SNodeOperations.getDescendants(SLinkOperations.getTarget(_context.getNode(), "modelFormula", true), "org.campagnelab.metar.edgeR.structure.GroupUsageRef", false, new String[]{})).select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return SPropertyOperations.getString(SLinkOperations.getTarget(it, "groupUsage", false), "name");
      }
    }).distinct();
    // calculate the set of groups that have usage in the model formula: 
    // remove each column that is not labeled with the counts group 
    return ListSequence.fromList(SModelOperations.getRoots(SNodeOperations.getModel(_context.getNode()), "org.campagnelab.metar.tables.structure.ColumnGroupContainer")).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return SLinkOperations.getTargets(it, "groups", true);
      }
    }).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return ColumnGroup_Behavior.call_uses_8031339867721231487(it);
      }
    }).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode use) {
        return Sequence.fromIterable(groupUsageNames).contains(SPropertyOperations.getString(use, "name"));
      }
    }).distinct();
  }

  private static boolean eq_x583g4_a0a0a0a0a0a0a0a0a0a0a1a71(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }

  private static boolean neq_x583g4_a0a0a0a0a0a0a0a0a0c0cb(Object a, Object b) {
    return !((a != null ? a.equals(b) : a == b));
  }
}
