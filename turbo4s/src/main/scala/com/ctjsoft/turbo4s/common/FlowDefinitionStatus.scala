package com.ctjsoft.turbo4s.common

object FlowDefinitionStatus:
  val DEFAULT = 0 // 数据库默认值
  val INIT = 1 // 流程创建, 初始化
  val EDITING = 2 // 编辑中
  val DISABLED = 3 // 已下线, 暂未使用
