package com.ctjsoft.turbo4s.entity

case class FlowDefinitionPO(
    flowModuleId: String,
    flowName: String,
    flowKey: String,
    flowModel: String,
    status: Int,
    flowFormId: String
)
