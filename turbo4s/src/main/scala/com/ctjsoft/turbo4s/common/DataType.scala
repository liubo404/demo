package com.ctjsoft.turbo4s.common

enum DataType(dataType: Int, name: String):
  case T_STRING extends DataType(1, "string")
  case T_INTEGER extends DataType(2, "integer")
  case T_LONG extends DataType(3, "long")
  case T_DOUBLE extends DataType(4, "double")
  case T_LIST extends DataType(5, "list")
