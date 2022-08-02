package com.ctjsoft.turbo4s.util

import java.util.UUID
import com.fasterxml.uuid.Generators
import com.fasterxml.uuid.EthernetAddress
import com.fasterxml.uuid.impl.TimeBasedGenerator

trait IdGenerator:
  def getNextId: String

class StrongUuidGenerator extends IdGenerator:
  import StrongUuidGenerator.timeBasedGenerator
  def getNextId: String = timeBasedGenerator.generate().toString()

object StrongUuidGenerator:
  private val timeBasedGenerator: TimeBasedGenerator =
    Generators.timeBasedGenerator(EthernetAddress.fromInterface())
