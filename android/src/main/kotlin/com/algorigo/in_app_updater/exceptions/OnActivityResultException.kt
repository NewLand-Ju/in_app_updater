package com.algorigo.in_app_updater.exceptions

const val IMMEDIATE_UPDATE_CANCELED_EXCEPTION_CODE = 5901
const val IMMEDIATE_UPDATE_CANCELED_EXCEPTION_MESSAGE = "Immediate update canceled"

const val IMMEDIATE_UPDATE_FAILED_EXCEPTION_CODE = 5902
const val IMMEDIATE_UPDATE_FAILED_EXCEPTION_MESSAGE = "Immediate update failed"

const val FLEXIBLE_UPDATE_CANCELED_EXCEPTION_CODE = 5903
const val FLEXIBLE_UPDATE_CANCELED_EXCEPTION_MESSAGE = "Flexible update canceled"

const val FLEXIBLE_UPDATE_FAILED_EXCEPTION_CODE = 5904
const val FLEXIBLE_UPDATE_FAILED_EXCEPTION_MESSAGE = "Flexible update failed"

enum class OnActivityResultException(
  val code: Int,
  val message: String
) {

  IMMEDIATE_UPDATE_CANCELED_EXCEPTION(IMMEDIATE_UPDATE_CANCELED_EXCEPTION_CODE, IMMEDIATE_UPDATE_CANCELED_EXCEPTION_MESSAGE),
  IMMEDIATE_UPDATE_FAILED_EXCEPTION(IMMEDIATE_UPDATE_FAILED_EXCEPTION_CODE, IMMEDIATE_UPDATE_FAILED_EXCEPTION_MESSAGE),

  FLEXIBLE_UPDATE_CANCELED_EXCEPTION(FLEXIBLE_UPDATE_CANCELED_EXCEPTION_CODE, FLEXIBLE_UPDATE_CANCELED_EXCEPTION_MESSAGE),
  FLEXIBLE_UPDATE_FAILED_EXCEPTION(FLEXIBLE_UPDATE_FAILED_EXCEPTION_CODE, FLEXIBLE_UPDATE_FAILED_EXCEPTION_MESSAGE);
}
