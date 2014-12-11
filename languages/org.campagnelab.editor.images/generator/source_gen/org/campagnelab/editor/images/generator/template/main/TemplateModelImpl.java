package org.campagnelab.editor.images.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.runtime.TemplateModel;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateMappingConfiguration;
import jetbrains.mps.generator.runtime.TemplateSwitchMapping;
import jetbrains.mps.generator.runtime.TemplateModule;
import org.jetbrains.mps.openapi.model.SModelReference;
import jetbrains.mps.generator.runtime.TemplateUtil;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.generator.runtime.TemplateDeclaration;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.model.SNodeId;
import jetbrains.mps.smodel.SNodePointer;

@Generated
public class TemplateModelImpl implements TemplateModel {
  private final Collection<TemplateMappingConfiguration> mappings;
  private final Collection<TemplateSwitchMapping> switches;
  private final TemplateModule templateModule;
  private final SModelReference model;

  public TemplateModelImpl(TemplateModule module) {
    mappings = TemplateUtil.<TemplateMappingConfiguration>asCollection(new Mappingmain(this));
    switches = TemplateUtil.<TemplateSwitchMapping>asCollection();
    templateModule = module;
    model = PersistenceFacade.getInstance().createModelReference("r:4d30284c-d4f6-4b68-8efd-29ee046f3381(org.campagnelab.editor.images.generator.template.main@generator)");
  }

  public String getLongName() {
    return "org.campagnelab.editor.images.generator.template.main";
  }

  public SModelReference getSModelReference() {
    return model;
  }

  public Collection<TemplateMappingConfiguration> getConfigurations() {
    return mappings;
  }

  public Collection<TemplateSwitchMapping> getSwitches() {
    return switches;
  }

  public TemplateDeclaration loadTemplate(SNodeReference template, Object... arguments) {
    if (!(model.equals(template.getModelReference()))) {
      return null;
    }
    SNodeId id = ((SNodePointer) template).getNodeId();
    if (id instanceof jetbrains.mps.smodel.SNodeId.Regular) {
      long idValue = ((jetbrains.mps.smodel.SNodeId.Regular) id).getId();
      if (idValue == 5058245606295170996L) {
        if (arguments.length != 0) {
          // TODO report `wrong arguments count` 
          return null;
        }
        return new Templatereduce__RefreshableImage();
      }
    }
    return null;
  }

  public TemplateModule getModule() {
    return templateModule;
  }
}
