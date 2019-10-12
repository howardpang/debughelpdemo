#include <jni.h>
#include <android/log.h>

JNIEXPORT jstring JNICALL
Java_com_howard_mylibrary_MyLib_getNativeString(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "Hello from JNI");
}