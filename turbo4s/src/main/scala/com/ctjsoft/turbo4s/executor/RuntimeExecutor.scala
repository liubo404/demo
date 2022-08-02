package com.ctjsoft.turbo4s.executor

import com.ctjsoft.turbo4s.common.RuntimeContext
import com.ctjsoft.turbo4s.util.StrongUuidGenerator

abstract class RuntimeExecutor:
  import RuntimeExecutor.ig
  def getId: String = ig.getNextId
  def execute(runtimeContext: RuntimeContext): Unit
  def commit(runtimeContext: RuntimeContext): Unit
  def rollback(runtimeContext: RuntimeContext): Unit
  def isCompleted(runtimeContext: RuntimeContext): Boolean
  def getExecuteExecutor(runtimeContext: RuntimeContext): RuntimeExecutor
  def getRollbackExecutor(runtimeContext: RuntimeContext): RuntimeExecutor

object RuntimeExecutor:
  private val ig = new StrongUuidGenerator
