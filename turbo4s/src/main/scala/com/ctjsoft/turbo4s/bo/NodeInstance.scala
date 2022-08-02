package com.ctjsoft.turbo4s.bo

import java.time.LocalDateTime

class NodeInstance(
    val nodeInstanceId: String,
    val createTime: LocalDateTime,
    val modifyTime: LocalDateTime,
    override val modelKey: String,
    override val modelName: String,
    override val properties: Map[String, AnyRef],
    override val status: Int
) extends ElementInstance(modelKey, modelName, properties, status)
