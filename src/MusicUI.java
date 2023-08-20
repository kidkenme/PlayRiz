import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class MusicUI extends javax.swing.JFrame {

    public MusicUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        USERNAME = new javax.swing.JTextField();
        PASSWORD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LoginSubmit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("ENTER USERNAME");

        USERNAME.setText(" ");

        PASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASSWORDActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setText("ENTER PASSWORD");

        LoginSubmit.setBackground(new java.awt.Color(0, 255, 204));
        LoginSubmit.setText("SUBMIT");
        LoginSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginSubmitActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 153, 153));
        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("LOGIN ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addGap(36, 36, 36))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(USERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginSubmit))
                        .addGap(72, 72, 72))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(243, 243, 243))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(459, 459, 459))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(USERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(56, 56, 56)
                .addComponent(LoginSubmit)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginSubmitActionPerformed
        try
        {
            String username=USERNAME.getText();
            String password=PASSWORD.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/music", "root", "password");
            String sql = "SELECT * FROM login WHERE username = ? AND password = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int user_id = rs.getInt("user_id");
               String usernamedb=rs.getString("username");
                System.out.println("User id "+user_id);

                String sql1 = "SELECT COUNT(playlist_id) FROM playlist WHERE user_id = ?";
                PreparedStatement stmt1=con.prepareStatement(sql1);
                stmt1.setInt(1,user_id);
                ResultSet rs1=stmt1.executeQuery();

                String sql2="SELECT playlist_name,description FROM playlist WHERE user_id = ?";
                PreparedStatement stmt2 = con.prepareStatement(sql2);
                stmt2.setInt(1,user_id);
                ResultSet rs2=stmt2.executeQuery();
                int playlist_count=0;
                if(rs1.next())
                {
                    playlist_count=rs1.getInt(1);
                }
                Userspace u = new Userspace();
                System.out.println("Playlist count for this user is "+playlist_count);
                System.out.println("Username and password were found in the database");
                int index=0;
                while(rs2.next())
                {   
                    String playlist_name=rs2.getString("Playlist_name");
                    String description=rs2.getString("description");
                    System.out.println("playlist name: "+playlist_name);
                    switch(index)
                    {
                        case 0:u.setButtonText2(playlist_name,description);
                                break;
                        case 1:u.setButtonText3(playlist_name,description);
                                break;
                        case 2:u.setButtonText4(playlist_name,description);
                                break;
                        case 3:u.setButtonText5(playlist_name,description);
                                break;
                        case 4:u.setButtonText6(playlist_name,description);
                                break;
                    }
                    index++;
                }
                u.usernamelabelText(usernamedb);
                u.setVisible(true);
                jLabel3.setText("Connection Successful");
                setVisible(false);
            } else {
                // The username and password were not found
                jLabel3.setText("Access Denied");
                USERNAME.setText("");
                PASSWORD.setText("");
                jLabel3.setText("Try again");
            }
            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_LoginSubmitActionPerformed

    private void PASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASSWORDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PASSWORDActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginSubmit;
    private javax.swing.JTextField PASSWORD;
    private javax.swing.JTextField USERNAME;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
