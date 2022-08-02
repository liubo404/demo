package com.ctjsoft.turbo4s.bo

case class FlowInstanceBO(
    val flowInstanceId: String,
    val flowDeployId: String,
    val status: Int,
    val flowModel: String
)
