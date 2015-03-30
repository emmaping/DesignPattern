/********************************************************************
 * File Name:    GigaMainBoard.java
 *
 * Date Created: 2015年3月25日
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package command.designpattern.com;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class GigaMainBoard implements MainBoardApi
{

  public void open()
  {
    System.out.println("Giga main board is working");

  }

  public void reset()
  {
    System.out.println("Giga main board is resetting");

  }

}
