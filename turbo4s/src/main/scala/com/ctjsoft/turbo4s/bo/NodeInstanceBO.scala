package com.ctjsoft.turbo4s.bo

case class NodeInstanceBO(
    val id: Long,
    val nodeInstanceId: String,
    val nodeKey: String,
    val sourceNodeInstanceId: String,
    val sourceNodeKey: String,
    val instanceDataId: String,
    val status: Int
)
