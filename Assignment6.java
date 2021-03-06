//  Name: Jared Adamson
//  Description: The Assignment 6 class creates a Tabbed Pane with
//               two tabs, one for Account creation and one for
//               Account transfer. 

import javax.swing.*;
import java.util.*;

public class Assignment6 extends JApplet
 {

   private int APPLET_WIDTH = 500, APPLET_HEIGHT = 200;

   private JTabbedPane tPane;
   private CreatePanel createPanel;
   private TransferPanel transferPanel;
   private Vector accountList;

   //The method init initializes the Applet with a Pane with two tabs
   public void init()
    {
     //list of accounts to be used in every panel
     accountList = new Vector();

     //register panel uses the list of accounts
     transferPanel = new TransferPanel(accountList);

     createPanel = new CreatePanel(accountList, transferPanel);

     //create a tabbed pane with two tabs
     tPane = new JTabbedPane();
     tPane.addTab("Account creation", createPanel);
     tPane.addTab("Account transfer", transferPanel);

     getContentPane().add(tPane);
     setSize (APPLET_WIDTH, APPLET_HEIGHT); //set Applet size
    }
}
