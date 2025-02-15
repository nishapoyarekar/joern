package io.joern.kotlin2cpg.types

object TypeConstants {
  val any                               = "ANY"
  val classLiteralReplacementMethodName = "getClass"
  val initPrefix                        = io.joern.x2cpg.Defines.ConstructorMethodName
  val kotlinFunctionXPrefix             = "kotlin.Function"
  val kotlinSuspendFunctionXPrefix      = "kotlin.coroutines.SuspendFunction"
  val kotlinAlsoPrefix                  = "kotlin.also"
  val kotlinApplyPrefix                 = "kotlin.apply"
  val kotlinLetPrefix                   = "kotlin.let"
  val kotlinRunPrefix                   = "kotlin.run"
  val kotlinTakeIfPrefix                = "kotlin.takeIf"
  val kotlinTakeUnlessPrefix            = "kotlin.takeUnless"
  val scopeFunctionItParameterName      = "it"
  val scopeFunctionThisParameterName    = "this"
  val kotlinUnit                        = "kotlin.Unit"
  val javaLangBoolean                   = "boolean"
  val javaLangClass                     = "java.lang.Class"
  val javaLangObject                    = "java.lang.Object"
  val javaLangString                    = "java.lang.String"
  val kotlin                            = "kotlin"
  val tType                             = "T"
  val void                              = "void"
}
