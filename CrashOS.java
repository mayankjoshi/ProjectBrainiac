/**
* This code will crash JVM as well as the Os/VM with it. 
Make sure to have tools.jar in classpath.
**/
public class CrashOS { 
  public static void main(String... args) throws Exception {
      com.sun.tools.attach.VirtualMachine.attach("-1"); 
    } 
  } 
