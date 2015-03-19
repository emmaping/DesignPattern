/********************************************************************
 * File Name:    ExportTxtFileOperate.java
 *
 * Date Created: 2015年3月18日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package factorymethod.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class ExportTxtFileOperate extends ExportOperate
{

  @Override
  protected ExportFileApi factoryMethod()
  {
    // TODO Auto-generated method stub
    return new ExportTxtFile();
  }
}
