#include <jni.h>
#include <android/log.h>

JNIEXPORT void JNICALL
Java_com_howard_mylibrary_MyLib_nativeTest(JNIEnv *env, jobject instance) {
    __android_log_print(ANDROID_LOG_VERBOSE, "test", "hello");
}