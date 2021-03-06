package de.kontext_e.jqassistant.plugin.excel.store.descriptor;

import java.util.List;

import com.buschmais.jqassistant.plugin.common.api.model.FileDescriptor;
import com.buschmais.jqassistant.plugin.common.api.model.NamedDescriptor;
import com.buschmais.xo.neo4j.api.annotation.Relation;

public interface ExcelFileDescriptor extends ExcelDescriptor, NamedDescriptor, FileDescriptor {

  @Relation("HAS_SHEET")
  List<ExcelSheetDescriptor> getSheets();
}
