<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:d402cd0f-3941-40e1-9a39-7e2532fd9976(org.campagnelab.metar.variance.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="4" />
    <devkit ref="2677cb18-f558-4e33-bc38-a5139cee06dc(jetbrains.mps.devkit.language-design)" />
  </languages>
  <imports>
    <import index="ppvh" ref="r:7d9df0bf-9eee-4b78-9a3d-b5848869947e(org.campagnelab.metar.variance.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1186403751766" name="jetbrains.mps.lang.editor.structure.FontStyleStyleClassItem" flags="ln" index="Vb9p2" />
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ng" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073389882823" name="jetbrains.mps.lang.editor.structure.CellModel_RefNode" flags="sg" stub="730538219795960754" index="3F1sOY" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="4mOaJR2RLWZ">
    <ref role="1XX52x" to="ppvh:3BiNpr5ETVF" resolve="VarianceSelection" />
    <node concept="3EZMnI" id="4mOaJR2RLX1" role="2wV5jI">
      <node concept="3F0ifn" id="4mOaJR2RLXb" role="3EZMnx">
        <property role="3F0ifm" value="keep largest variance" />
      </node>
      <node concept="3F0ifn" id="4mOaJR2RM06" role="3EZMnx">
        <property role="3F0ifm" value="percentile=" />
        <node concept="Vb9p2" id="4mOaJR2RM2t" role="3F10Kt" />
      </node>
      <node concept="3F0A7n" id="4mOaJR2RM0z" role="3EZMnx">
        <ref role="1NtTu8" to="ppvh:4mOaJR2RLZQ" resolve="percentile" />
      </node>
      <node concept="3F1sOY" id="4mOaJR2RLZ4" role="3EZMnx">
        <ref role="1NtTu8" to="ppvh:3R5AwWRZly3" resolve="table" />
      </node>
      <node concept="3F0ifn" id="4mOaJR2RLZl" role="3EZMnx">
        <property role="3F0ifm" value="-&gt;" />
      </node>
      <node concept="3F1sOY" id="4mOaJR2RLZE" role="3EZMnx">
        <ref role="1NtTu8" to="ppvh:3BiNpr5MCmK" resolve="destination" />
      </node>
      <node concept="l2Vlx" id="4mOaJR2RLX4" role="2iSdaV" />
    </node>
  </node>
</model>

