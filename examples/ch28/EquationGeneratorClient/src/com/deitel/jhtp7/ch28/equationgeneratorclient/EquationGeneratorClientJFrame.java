// Fig. 28.23: EquationGeneratorClientJFrame.java
// Math tutoring program using web services to generate equations
package com.deteil.howtoprogram.examples.ch28.EquationGeneratorClient.src.com.deitel.jhtp7.ch28.equationgeneratorclient;

import javax.swing.JOptionPane;

public class EquationGeneratorClientJFrame extends javax.swing.JFrame
{
   private EquationGeneratorService service; // used to obtain proxy
   private EquationGenerator proxy; // used to access the web service
   private Equation equation; // represents an equation
   private int answer; // the user's answer to the question
   private String operation = "+"; // mathematical operation +, - or *
   private int difficulty = 1; // 1, 2 or 3 digits in each number
   
   // no-argument constructor
   public EquationGeneratorClientJFrame()
   {
      initComponents();
      
      try
      { 
         // create the objects for accessing the EquationGenerator service
         service = new EquationGeneratorService();
         proxy = service.getEquationGeneratorPort();
      } // end try
      catch ( Exception ex )
      {
         ex.printStackTrace();
      } // end catch
   } // end no-argument constructors
   
   // The initComponents method is autogenerated by Netbeans and is called
   // from the constructor to initialize the GUI. This method is not shown
   // here to save space. Open BlackjackGameJFrame.java in this 
   // example's folder to view the complete generated code (lines 37-155).
   // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
   private void initComponents()
   {
      operationJLabel = new javax.swing.JLabel();
      operationJComboBox = new javax.swing.JComboBox();
      levelJLabel = new javax.swing.JLabel();
      levelJComboBox = new javax.swing.JComboBox();
      generateJButton = new javax.swing.JButton();
      questionJLabel = new javax.swing.JLabel();
      answerJLabel = new javax.swing.JLabel();
      equationJLabel = new javax.swing.JLabel();
      answerJTextField = new javax.swing.JTextField();
      checkAnswerJButton = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Math Tutor");
      operationJLabel.setText("Choose operation:");

      operationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Addition", "Subtraction", "Multiplication" }));
      operationJComboBox.addItemListener(new java.awt.event.ItemListener()
      {
         public void itemStateChanged(java.awt.event.ItemEvent evt)
         {
            operationJComboBoxItemStateChanged(evt);
         }
      });

      levelJLabel.setText("Choose level:");

      levelJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "One-digit numbers", "Two-digit numbers", "Three-digit numbers" }));
      levelJComboBox.addItemListener(new java.awt.event.ItemListener()
      {
         public void itemStateChanged(java.awt.event.ItemEvent evt)
         {
            levelJComboBoxItemStateChanged(evt);
         }
      });

      generateJButton.setText("Generate Equation");
      generateJButton.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            generateJButtonActionPerformed(evt);
         }
      });

      questionJLabel.setText("Question:");

      answerJLabel.setText("Answer:");

      equationJLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
      equationJLabel.setText(" ");

      checkAnswerJButton.setText("Check Answer");
      checkAnswerJButton.setEnabled(false);
      checkAnswerJButton.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            checkAnswerJButtonActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(checkAnswerJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
               .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(generateJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(operationJLabel)
                        .addComponent(levelJLabel))
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(operationJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(levelJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
               .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(questionJLabel)
                     .addComponent(equationJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(7, 7, 7)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(answerJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                     .addComponent(answerJLabel))))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(operationJLabel)
               .addComponent(operationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(levelJLabel)
               .addComponent(levelJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(generateJButton)
            .addGap(25, 25, 25)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(questionJLabel)
               .addComponent(answerJLabel))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(equationJLabel)
               .addComponent(answerJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(checkAnswerJButton)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      pack();
   }// </editor-fold>//GEN-END:initComponents

   // obtains the difficulty level selected by the user
   private void levelJComboBoxItemStateChanged(//GEN-FIRST:event_levelJComboBoxItemStateChanged
      java.awt.event.ItemEvent evt )
   {//GEN-HEADEREND:event_levelJComboBoxItemStateChanged
      // indices start at 0, so add 1 to get the difficulty level
      difficulty = levelJComboBox.getSelectedIndex() + 1;
   }//GEN-LAST:event_levelJComboBoxItemStateChanged

   // obtains the mathematical operation selected by the user
   private void operationJComboBoxItemStateChanged(//GEN-FIRST:event_operationJComboBoxItemStateChanged
      java.awt.event.ItemEvent evt )
   {//GEN-HEADEREND:event_operationJComboBoxItemStateChanged
      String item = ( String ) operationJComboBox.getSelectedItem();
      
      if ( item.equals( "Addition" ) )
         operation = "+"; // user selected addition
      else if ( item.equals( "Subtraction" ) )
         operation = "-"; // user selected subtraction
      else 
         operation = "*"; // user selected multiplication
   }//GEN-LAST:event_operationJComboBoxItemStateChanged

   // checks the user's answer
   private void checkAnswerJButtonActionPerformed(//GEN-FIRST:event_checkAnswerJButtonActionPerformed
      java.awt.event.ActionEvent evt )
   {//GEN-HEADEREND:event_checkAnswerJButtonActionPerformed
      if ( answerJTextField.getText().equals( "" ) )
      {
         JOptionPane.showMessageDialog( 
            this, "Please enter your answer." );
      } // end if
      
      int userAnswer = Integer.parseInt( answerJTextField.getText() );
      
      if ( userAnswer == answer )
      {
         equationJLabel.setText( "" );
         answerJTextField.setText( "" );
         checkAnswerJButton.setEnabled( false );
         JOptionPane.showMessageDialog( this, "Correct! Good Job!",
             "Correct", JOptionPane.PLAIN_MESSAGE );
      } // end if
      else
      {
         JOptionPane.showMessageDialog( this, "Incorrect. Try again.",
            "Incorrect", JOptionPane.PLAIN_MESSAGE );
      } // end else
   }//GEN-LAST:event_checkAnswerJButtonActionPerformed

   // generates a new Equation based on user's selections
   private void generateJButtonActionPerformed(//GEN-FIRST:event_generateJButtonActionPerformed
      java.awt.event.ActionEvent evt )
   {//GEN-HEADEREND:event_generateJButtonActionPerformed
      try
      {
         equation = proxy.generateEquation( operation, difficulty );
         answer = equation.getReturnValue();
         equationJLabel.setText( equation.getLeftHandSide() + " =" );
         checkAnswerJButton.setEnabled( true );
      } // end try
      catch ( Exception e )
      {
         e.printStackTrace();
      } // end catch      
   }//GEN-LAST:event_generateJButtonActionPerformed
   
   // begins program execution
   public static void main( String args[] )
   {
      java.awt.EventQueue.invokeLater(
         new Runnable()
         {
            public void run()
            {
               new EquationGeneratorClientJFrame().setVisible( true );
            } // end method run
         } // end anonymous inner class
      ); // end call to java.awt.EventQueue.invokeLater
   } // end method main
   
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel answerJLabel;
   private javax.swing.JTextField answerJTextField;
   private javax.swing.JButton checkAnswerJButton;
   private javax.swing.JLabel equationJLabel;
   private javax.swing.JButton generateJButton;
   private javax.swing.JComboBox levelJComboBox;
   private javax.swing.JLabel levelJLabel;
   private javax.swing.JComboBox operationJComboBox;
   private javax.swing.JLabel operationJLabel;
   private javax.swing.JLabel questionJLabel;
   // End of variables declaration//GEN-END:variables
} // end class EquationGeneratorClientJFrame


/**************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/


