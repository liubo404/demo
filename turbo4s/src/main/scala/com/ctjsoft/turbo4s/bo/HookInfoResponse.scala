package com.ctjsoft.turbo4s.bo

case class HookInfoResponse(
    val status: Int,
    val error: String,
    val detailMessage: String,
    val data: Map[String, AnyRef]
)
