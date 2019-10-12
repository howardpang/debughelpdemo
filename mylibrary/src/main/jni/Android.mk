LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_CPP_EXTENSION := .cc .cpp

LOCAL_C_INCLUDES := ${LOCAL_PATH} \

LOCAL_SRC_FILES :=  test.c \

LOCAL_MODULE := mylib
LOCAL_LDLIBS += -llog

include $(BUILD_SHARED_LIBRARY)

