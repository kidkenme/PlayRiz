
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author Firos
 */
public class Userspace extends javax.swing.JFrame {

    public Userspace() {
        initComponents();
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        usernamelabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SPOTIFY");

        back.setBackground(new java.awt.Color(51, 51, 0));
        back.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        back.setForeground(new java.awt.Color(51, 0, 255));
        back.setText("🔙");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Your Playlists");

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(102, 255, 102));
        jButton1.setText("CREATE/INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setForeground(new java.awt.Color(102, 255, 102));
        jButton7.setText("DELETE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        usernamelabel.setBackground(new java.awt.Color(0, 0, 0));
        usernamelabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernamelabel.setForeground(new java.awt.Color(0, 255, 51));
        usernamelabel.setText("jLabel3");

        jLabel3.setBackground(new java.awt.Color(255, 255, 0));
        jLabel3.setFont(new java.awt.Font("SimSun-ExtB", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 204));
        jLabel3.setText("WELCOME");

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setForeground(new java.awt.Color(0, 255, 51));
        jButton8.setText("UPDATE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addComponent(usernamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(28, 28, 28)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addContainerGap(412, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(usernamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void usernamelabelText(String username)
   {
       usernamelabel.setText(username);
   }
    public void setButtonText2(String text,String desc) {
        jButton2.setText(text);
    }
    public void setButtonText3(String text,String desc) {
        jButton3.setText(text);
    }
    public void setButtonText4(String text,String desc) {
        jButton4.setText(text);
    }
    public void setButtonText5(String text,String desc) {
        jButton5.setText(text);
    }
    public void setButtonText6(String text,String desc) {
        jButton6.setText(text);
    }
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       MusicUI login=new MusicUI();
       login.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       SongsUI s=new SongsUI();
       
       String text=jButton2.getText();
      s.setPlaylistnameAndGetUsername(text,usernamelabel.getText());
        System.out.println("text on button: "+text);
       s.setVisible(true);
       setVisible(false);
       try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/music", "root", "password");
    
    String sql = "SELECT s.song_name FROM song s JOIN playlist_song ps ON ps.song_id = s.song_id JOIN playlist p ON p.playlist_id = ps.playlist_id WHERE p.playlist_name = ?";
PreparedStatement stmt = con.prepareStatement(sql);
stmt.setString(1, text);
ResultSet rs = stmt.executeQuery();
    s.setVisible(true);
    setVisible(false);
    int index=0;
    while(rs.next())
    {
        String songname=rs.getString("song_name");
        System.out.println(" songs  :"+songname);
        switch(index)
            {
                case 0:s.setButtonText2(songname,text);
                    break;
                case 1:s.setButtonText3(songname,text);
                       break;
                case 2:s.setButtonText4(songname,text);
                        break;
                case 3:s.setButtonText5(songname,text);
                        break;
                case 4:s.setButtonText6(songname,text);
                        break;
            }
            index++;
    }
con.close(); 
      } catch (Exception e) {
          System.out.println(e);
} 
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SongsUI s=new SongsUI();
       String text=jButton3.getText();
       s.setPlaylistnameAndGetUsername(text,usernamelabel.getText());
        System.out.println("text on button: "+text);
       s.setVisible(true);
       setVisible(false);
       try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/music", "root", "password");
    
    String sql = "SELECT s.song_name FROM song s JOIN playlist_song ps ON ps.song_id = s.song_id JOIN playlist p ON p.playlist_id = ps.playlist_id WHERE p.playlist_name =      ?";
PreparedStatement stmt = con.prepareStatement(sql);
stmt.setString(1, text);
ResultSet rs = stmt.executeQuery();
    s.setVisible(true);
    setVisible(false);
    int index=0;
    while(rs.next())
    {
        String songname=rs.getString("song_name");
        System.out.println(" songs  :"+songname);
        switch(index)
            {
                case 0:s.setButtonText2(songname,text);
                    break;
                case 1:s.setButtonText3(songname,text);
                       break;
                case 2:s.setButtonText4(songname,text);
                        break;
                case 3:s.setButtonText5(songname,text);
                        break;
                case 4:s.setButtonText6(songname,text);
                        break;
            }
            index++;
    }
con.close(); 
      } catch (Exception e) {
          System.out.println(e);
} 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SongsUI s=new SongsUI();
       String text=jButton4.getText();
       s.setPlaylistnameAndGetUsername(text,usernamelabel.getText());
        System.out.println("text on button: "+text);
       s.setVisible(true);
       setVisible(false);
       try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/music", "root", "password");
    
    String sql = "SELECT s.song_name FROM song s JOIN playlist_song ps ON ps.song_id = s.song_id JOIN playlist p ON p.playlist_id = ps.playlist_id WHERE p.playlist_name = ?";
PreparedStatement stmt = con.prepareStatement(sql);
stmt.setString(1, text);
ResultSet rs = stmt.executeQuery();
    s.setVisible(true);
    setVisible(false);
    int index=0;
    while(rs.next())
    {
        String songname=rs.getString("song_name");
        System.out.println(" songs  :"+songname);
        switch(index)
            {
                case 0:s.setButtonText2(songname,text);
                    break;
                case 1:s.setButtonText3(songname,text);
                       break;
                case 2:s.setButtonText4(songname,text);
                        break;
                case 3:s.setButtonText5(songname,text);
                        break;
                case 4:s.setButtonText6(songname,text);
                        break;
            }
            index++;
    }
con.close(); 
      } catch (Exception e) {
          System.out.println(e);
} 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       SongsUI s=new SongsUI();
       String text=jButton5.getText();
       s.setPlaylistnameAndGetUsername(text,usernamelabel.getText());
        System.out.println("text on button: "+text);
       s.setVisible(true);
       setVisible(false);
       try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/music", "root", "password");
    
    String sql = "SELECT s.song_name FROM song s JOIN playlist_song ps ON ps.song_id = s.song_id JOIN playlist p ON p.playlist_id = ps.playlist_id WHERE p.playlist_name = ?";
PreparedStatement stmt = con.prepareStatement(sql);
stmt.setString(1, text);
ResultSet rs = stmt.executeQuery();
    s.setVisible(true);
    setVisible(false);
    int index=0;
    while(rs.next())
    {
        String songname=rs.getString("song_name");
        System.out.println(" songs  :"+songname);
        switch(index)
            {
                case 0:s.setButtonText2(songname,text);
                    break;
                case 1:s.setButtonText3(songname,text);
                       break;
                case 2:s.setButtonText4(songname,text);
                        break;
                case 3:s.setButtonText5(songname,text);
                        break;
                case 4:s.setButtonText6(songname,text);
                        break;
            }
            index++;
    }
con.close(); 
      } catch (Exception e) {
          System.out.println(e);
} 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       SongsUI s=new SongsUI();
       String text=jButton6.getText();
       s.setPlaylistnameAndGetUsername(text,usernamelabel.getText());
        System.out.println("text on button: "+text);
       s.setVisible(true);
       setVisible(false);
       try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/music", "root", "password");
    
    String sql = "SELECT s.song_name FROM song s JOIN playlist_song ps ON ps.song_id = s.song_id JOIN playlist p ON p.playlist_id = ps.playlist_id WHERE p.playlist_name = ?";
PreparedStatement stmt = con.prepareStatement(sql);
stmt.setString(1, text);
ResultSet rs = stmt.executeQuery();
    s.setVisible(true);
    setVisible(false);
    int index=0;
    while(rs.next())
    {
        String songname=rs.getString("song_name");
        System.out.println(" songs  :"+songname);
        switch(index)
            {
                case 0:s.setButtonText2(songname,text);
                    break;
                case 1:s.setButtonText3(songname,text);
                       break;
                case 2:s.setButtonText4(songname,text);
                        break;
                case 3:s.setButtonText5(songname,text);
                        break;
                case 4:s.setButtonText6(songname,text);
                        break;
            }
            index++;
    }
con.close(); 
      } catch (Exception e) {
          System.out.println(e);
} 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CreatePlaylist c=new CreatePlaylist();
        c.setUsername(usernamelabel.getText());
        c.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            DeletePlaylists d=new DeletePlaylists();
            d.setUsername(usernamelabel.getText());
            d.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Userspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Userspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Userspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Userspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Userspace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JLabel usernamelabel;
    // End of variables declaration//GEN-END:variables
}