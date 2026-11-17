
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CGPAFrame extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CGPAFrame.class.getName());

    public CGPAFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        courseInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        creditInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        markInput = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course", "Credit", "Marks", "Grade", "Point"
            }
        ));
        jScrollPane1.setViewportView(table);

        courseInput.addActionListener(this::courseInputActionPerformed);

        jLabel1.setText("Course");

        jLabel2.setText("Credit");

        creditInput.setMinimumSize(new java.awt.Dimension(70, 22));
        creditInput.setPreferredSize(new java.awt.Dimension(70, 22));

        jLabel3.setText("Marks");

        markInput.setMinimumSize(new java.awt.Dimension(100, 22));
        markInput.setPreferredSize(new java.awt.Dimension(70, 22));
        markInput.addActionListener(this::markInputActionPerformed);

        addBtn.setText("Submit Button");
        addBtn.addActionListener(this::addBtnActionPerformed);

        jLabel4.setText("Totall credits: ");

        jLabel5.setText("CGPA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(courseInput, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(creditInput, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(markInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addBtn)
                                .addGap(17, 17, 17))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(courseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creditInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(markInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void courseInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseInputActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_courseInputActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        if (courseInput.getText().equals("")
                || creditInput.getText().equals("")
                || markInput.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Please Enter all data!");

        } else {

            try {

                String course = courseInput.getText();
                double credit = Double.parseDouble(creditInput.getText());
                double marks = Double.parseDouble(markInput.getText());

                String grade;
                double point;


                if (marks >= 80 && marks <= 100) {
                    grade = "A+";
                    point = 4.00;
                } else if (marks >= 75) {
                    grade = "A";
                    point = 3.75;
                } else if (marks >= 70) {
                    grade = "A-";
                    point = 3.50;
                } else if (marks >= 65) {
                    grade = "B+";
                    point = 3.25;
                } else if (marks >= 60) {
                    grade = "B";
                    point = 3.00;
                } else if (marks >= 55) {
                    grade = "B-";
                    point = 2.75;
                } else if (marks >= 50) {
                    grade = "C+";
                    point = 2.50;
                } else if (marks >= 45) {
                    grade = "C";
                    point = 2.25;
                } else if (marks >= 40) {
                    grade = "D";
                    point = 2.00;
                } else if (marks >= 0) {
                    grade = "F";
                    point = 0.00;
                } else {
                    JOptionPane.showMessageDialog(this, "Marks cannot be negative!");
                    return;
                }


                String data[] = {
                    course,
                    String.valueOf(credit),
                    String.valueOf(marks),
                    grade,
                    String.valueOf(point)
                };

                DefaultTableModel tableModel
                        = (DefaultTableModel) table.getModel();

                tableModel.addRow(data);
                
                calculateCGPA();

                JOptionPane.showMessageDialog(this, "Add data successfully...");


                courseInput.setText("");
                creditInput.setText("");
                markInput.setText("");

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(
                        this,
                        "Credit and Marks must be numbers!"
                );
            }
        }

    }//GEN-LAST:event_addBtnActionPerformed

    public void calculateCGPA() {

        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        double totalCredits = 0;
        double totalPoints = 0;

        for (int i = 0; i < tableModel.getRowCount(); i++) {

            double credit = Double.parseDouble(
                    tableModel.getValueAt(i, 1).toString()
            );

            double point = Double.parseDouble(
                    tableModel.getValueAt(i, 4).toString()
            );

            totalCredits += credit;
            totalPoints += credit * point;
        }

        double cgpa = 0;

        if (totalCredits > 0) {
            cgpa = totalPoints / totalCredits;
        }

        jLabel4.setText("Total Credits: " + totalCredits);
        jLabel5.setText("CGPA: " + String.format("%.2f", cgpa));
    }

    private void markInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markInputActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new CGPAFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField courseInput;
    private javax.swing.JTextField creditInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField markInput;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
