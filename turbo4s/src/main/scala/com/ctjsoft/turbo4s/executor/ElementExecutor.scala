package com.ctjsoft.turbo4s.executor

import com.ctjsoft.turbo4s.common.RuntimeContext

class ElementExecutor extends RuntimeExecutor:
  def execute(runtimeContext: RuntimeContext): Unit = ???
  def commit(runtimeContext: RuntimeContext): Unit = ???
  def rollback(runtimeContext: RuntimeContext): Unit = ???
  def isCompleted(runtimeContext: RuntimeContext): Boolean = ???
  def getExecuteExecutor(runtimeContext: RuntimeContext): RuntimeExecutor = ???
  def getRollbackExecutor(runtimeContext: RuntimeContext): RuntimeExecutor = ???
