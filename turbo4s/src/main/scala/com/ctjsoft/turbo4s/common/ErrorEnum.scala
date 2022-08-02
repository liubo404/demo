package com.ctjsoft.turbo4s.common

enum ErrorEnum(errNo: Int, errMsg: String):
  case SUCCESS extends ErrorEnum(1000, "Success")
  case REENTRANT_WARNING extends ErrorEnum(1001, "Reentrant warning")
  case COMMIT_SUSPEND extends ErrorEnum(1002, "Commit task suspend")
  case ROLLBACK_SUSPEND extends ErrorEnum(1003, "Rollback task suspend")
  case PARAM_INVALID extends ErrorEnum(2001, "Invalid param")
  case DEFINITION_INSERT_INVALID
      extends ErrorEnum(3001, "Definition insert failed")
  case DEFINITION_UPDATE_INVALID
      extends ErrorEnum(3002, "Definition update failed")
  case FLOW_NOT_EXIST extends ErrorEnum(3101, "Flow not exist")
  case FLOW_NOT_EDITING extends ErrorEnum(3102, "Flow not editing status")
  case MODEL_EMPTY extends ErrorEnum(3201, "Empty model")
  case START_NODE_INVALID
      extends ErrorEnum(3202, "Zero or more than one start node")
  case ELEMENT_KEY_NOT_UNIQUE extends ErrorEnum(3203, "Element key not unique")
  case END_NODE_INVALID extends ErrorEnum(3204, "No end node")
  case MODEL_NOT_UNICOM extends ErrorEnum(3205, "Not unicom")
  case SEQUENCE_BELONG_TO_MULTI_PAIR_NODE
      extends ErrorEnum(3206, "Sequence belong to multi pair node")
  case RING_WRONG extends ErrorEnum(3207, "Ring wrong")
  case GATEWAY_NO_OUTGOING extends ErrorEnum(3208, "Gateway no outgoing")
  case EMPTY_SEQUENCE_OUTGOING
      extends ErrorEnum(3209, "Empty sequence outgoing")
  case TOO_MANY_DEFAULT_SEQUENCE
      extends ErrorEnum(3210, "Too many default sequence")
  case MODEL_UNKNOWN_ELEMENT_KEY extends ErrorEnum(3211, "Unknown element key")
  case ELEMENT_TOO_MUCH_INCOMING extends ErrorEnum(3212, "Too many incoming")
  case ELEMENT_TOO_MUCH_OUTGOING extends ErrorEnum(3213, "Too many outgoing")
  case ELEMENT_LACK_INCOMING extends ErrorEnum(3214, "Element lack incoming")
  case ELEMENT_LACK_OUTGOING extends ErrorEnum(3215, "Element lack outgoing")
  case COMMIT_FAILED extends ErrorEnum(4001, "Commit task failed")
  case ROLLBACK_FAILED extends ErrorEnum(4002, "Rollback task failed")
  case COMMIT_REJECTRD
      extends ErrorEnum(4003, "Commit rejected  flow is terminate")
  case ROLLBACK_REJECTRD
      extends ErrorEnum(
        4004,
        "Rollback rejected  non-running flowInstance to rollback"
      )
  case NO_NODE_TO_ROLLBACK extends ErrorEnum(4005, "No node to rollback")
  case NO_USER_TASK_TO_ROLLBACK
      extends ErrorEnum(4006, "No userTask to rollback")
  case GET_FLOW_DEPLOYMENT_FAILED
      extends ErrorEnum(4007, "Get flowDeployment failed")
  case GET_FLOW_INSTANCE_FAILED
      extends ErrorEnum(4008, "Get flowInstance failed")
  case GET_NODE_FAILED extends ErrorEnum(4009, "Get current node failed")
  case GET_NODE_INSTANCE_FAILED
      extends ErrorEnum(4010, "Get nodeInstance failed")
  case GET_INSTANCE_DATA_FAILED
      extends ErrorEnum(4011, "Get instanceData failed")
  case GET_HOOK_CONFIG_FAILED extends ErrorEnum(4012, "Get hook config failed")
  case GET_OUTGOING_FAILED extends ErrorEnum(4013, "Get outgoing failed")
  case UNSUPPORTED_ELEMENT_TYPE
      extends ErrorEnum(4014, "Unsupported element type")
  case MISSING_DATA extends ErrorEnum(4015, "Miss data")
  case SAVE_FLOW_INSTANCE_FAILED
      extends ErrorEnum(4016, "Save flowInstance failed")
  case SAVE_INSTANCE_DATA_FAILED
      extends ErrorEnum(4017, "Save instanceData failed")
  case GROOVY_CALCULATE_FAILED
      extends ErrorEnum(4018, "Groovy calculate failed")
  case SYSTEM_ERROR extends ErrorEnum(5000, "System error")
  case FAILED extends ErrorEnum(5001, "Failed")
