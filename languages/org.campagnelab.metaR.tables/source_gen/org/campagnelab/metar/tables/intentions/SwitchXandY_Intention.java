package org.campagnelab.metar.tables.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.intentions.IntentionType;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collections;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public class SwitchXandY_Intention implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public SwitchXandY_Intention() {
  }

  public String getConcept() {
    return "org.campagnelab.metar.tables.structure.FitXByY";
  }

  public String getPresentation() {
    return "SwitchXandY";
  }

  public String getPersistentStateKey() {
    return "org.campagnelab.metar.tables.intentions.SwitchXandY_Intention";
  }

  public String getLanguageFqName() {
    return "org.campagnelab.metar.tables";
  }

  public IntentionType getType() {
    return IntentionType.NORMAL;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }

  public SNodeReference getIntentionNodeReference() {
    return new SNodePointer("r:597299e2-456c-40ec-87e4-c5fdcfc8d153(org.campagnelab.metar.tables.intentions)", "7671316391456468736");
  }

  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new SwitchXandY_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }

  public class IntentionImplementation implements IntentionExecutable {
    public IntentionImplementation() {
    }

    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Exchange X and Y";
    }

    public void execute(final SNode node, final EditorContext editorContext) {
      SNode tmp = SNodeOperations.detachNode(SLinkOperations.getTarget(node, "x", true));
      SLinkOperations.setTarget(node, "x", SNodeOperations.detachNode(SLinkOperations.getTarget(node, "y", true)), true);
      SLinkOperations.setTarget(node, "y", tmp, true);
      if ((SLinkOperations.getTarget(node, "style", false) != null)) {
        String tmpLabel = SPropertyOperations.getString(SLinkOperations.getTarget(node, "style", false), "xLabel");
        SPropertyOperations.set(SLinkOperations.getTarget(node, "style", false), "xLabel", SPropertyOperations.getString(SLinkOperations.getTarget(node, "style", false), "yLabel"));
        SPropertyOperations.set(SLinkOperations.getTarget(node, "style", false), "yLabel", tmpLabel);
      }
    }

    public IntentionDescriptor getDescriptor() {
      return SwitchXandY_Intention.this;
    }
  }
}