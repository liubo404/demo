package com.ctjsoft.turbo4s.common

object Constants:
  val DEFAULT_TIMEOUT = 3000
  val ELEMENTLIST = "flowElementList"
  val NODE_INFO_FORMAT = "nodeKey={0}, nodeName={1}, nodeType={2}"
  val NODE_INSTANCE_FORMAT = "nodeKey={0}, nodeName={1}, nodeInstanceId={2}"
  val MODEL_DEFINITION_ERROR_MSG_FORMAT =
    "message={0}, elementName={1}, elementKey={2}"

  object ELEMENT_PROPERTIES:
    val NAME = "name"
    val CONDITION = "conditionsequenceflow"
    val DEFAULT_CONDITION = "defaultConditions"
    val HOOK_INFO_IDS = "hookInfoIds"
