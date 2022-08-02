package com.ctjsoft.turbo4s.bo

class FlowBasicInfo(
    val flowDeployId: String,
    val flowModuleId: String,
    val tenant: String,
    val caller: String
)

class FlowInfo(
    val flowModel: String,
    override val flowDeployId: String,
    override val flowModuleId: String,
    override val tenant: String,
    override val caller: String
) extends FlowBasicInfo(flowDeployId, flowModuleId, tenant, caller)
