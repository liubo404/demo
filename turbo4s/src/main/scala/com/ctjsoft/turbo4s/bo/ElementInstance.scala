package com.ctjsoft.turbo4s.bo

import com.google.common.base.MoreObjects

class ElementInstance(
    val modelKey: String,
    val modelName: String,
    val properties: Map[String, AnyRef],
    val status: Int
):
  override def toString(): String = MoreObjects
    .toStringHelper(this)
    .add("modelKey", modelKey)
    .add("modelName", modelName)
    .add("properties", properties)
    .add("status", status)
    .toString()

object ElementInstance:
  def apply: ElementInstance = ElementInstance(null, null, null, 0)
  def apply(modelKey: String, status: Int): ElementInstance =
    ElementInstance(modelKey, null, null, status)
  def apply(
      modelKey: String,
      modelName: String,
      properties: Map[String, AnyRef],
      status: Int
  ): ElementInstance =
    new ElementInstance(modelKey, modelName, properties, status)
