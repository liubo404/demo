package com.ctjsoft.turbo4s.util

object RegexUtil:
  val dashedStringPattern = "^[^_]+".r

  /** Return beginning string before underscore
    * @param nodeKeyDashed
    *   abcdef_1231adfs11
    * @return
    *   abcdef
    */
  def extractOriginalNodeKey(nodeKeyDashed: String): Option[String] =
    dashedStringPattern.findFirstIn(nodeKeyDashed)
