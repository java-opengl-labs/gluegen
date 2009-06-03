/* !---- DO NOT EDIT: This file autogenerated by com\sun\gluegen\JavaEmitter.java on Tue May 27 02:37:55 PDT 2008 ----! */

package com.sun.gluegen.runtime;

import com.sun.gluegen.runtime.*;

public class WindowsDynamicLinkerImpl implements DynamicLinker
{


  /** Interface to C language function: <br> <code> BOOL FreeLibrary(HANDLE hLibModule); </code>    */
  private static native int FreeLibrary(long hLibModule);

  /** Interface to C language function: <br> <code> DWORD GetLastError(void); </code>    */
  private static native int GetLastError();

  /** Interface to C language function: <br> <code> PROC GetProcAddressA(HANDLE hModule, LPCSTR lpProcName); </code>    */
  private static native long GetProcAddressA(long hModule, java.lang.String lpProcName);

  /** Interface to C language function: <br> <code> HANDLE LoadLibraryW(LPCWSTR lpLibFileName); </code>    */
  private static native long LoadLibraryW(java.lang.String lpLibFileName);


  // --- Begin CustomJavaCode .cfg declarations
  public long openLibraryLocal(String libraryName) {
    // How does that work under Windows ?
    return LoadLibraryW(libraryName);
  }
  
  public long openLibraryGlobal(String libraryName) {
    return LoadLibraryW(libraryName);
  }
  
  public long lookupSymbol(long libraryHandle, String symbolName) {
    return GetProcAddressA(libraryHandle, symbolName);
  }
  
  public void closeLibrary(long libraryHandle) {
    FreeLibrary(libraryHandle);
  }
  // ---- End CustomJavaCode .cfg declarations

} // end of class WindowsDynamicLinkerImpl
