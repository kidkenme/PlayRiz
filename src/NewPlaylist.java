
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


public class NewPlaylist extends javax.swing.JFrame {
private JLabel playlistcurrent;
    /**
     * Creates new form NewPlaylist
     */
    public NewPlaylist() {
        initComponents();
        playlistcurrent=new JLabel();
        playlistcurrent.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        songname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        singername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        genre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        currentplaylist = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("SONG NAME");

        singername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 102));
        jLabel2.setText("SINGER");

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 255, 51));
        jLabel3.setText("GENRE");

        jLabel4.setBackground(new java.awt.Color(0, 51, 51));
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("SONG & SINGER DETAILS");

        currentplaylist.setBackground(new java.awt.Color(0, 0, 0));
        currentplaylist.setForeground(new java.awt.Color(0, 204, 51));
        currentplaylist.setText("jLabel5");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 255, 0));
        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jButton1)
                        .addGap(68, 68, 68)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(songname, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(singername, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(currentplaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(currentplaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(songname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(singername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(225, 225, 225))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String currentPlaylist;
    public void getPlaylistName(String playlist_name)
{
    playlistcurrent.setText(playlist_name);
    //currentplaylist.setText(playlist_name);
    System.out.println("playlist current in newplaylist.java "+playlistcurrent.getText());
    System.out.println("Playlist name is is is : "+playlist_name);
    currentplaylist.setText(playlist_name);
    //System.out.println("Current playlist label value is is is : "+currentplaylist.getText());
}
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

currentPlaylist=playlistcurrent.getText();
  // System.out.println("Current playlist name jButton1 ie submit button is "+playlistcurrent.getText());
        try {
            int singerId = 0;
    Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/music", "root", "password");
    con.setAutoCommit(false); // disable auto-commit to handle multiple statements in a single transaction

    // check if the singer already exists in the singer table
    String singer_id_query = "SELECT singer_id FROM singer WHERE singer_name = ?";
PreparedStatement singer_id_stmt = con.prepareStatement(singer_id_query);
singer_id_stmt.setString(1, singername.getText());
ResultSet singer_id_rs = singer_id_stmt.executeQuery();
if (singer_id_rs.next()) {
    singerId = singer_id_rs.getInt("singer_id");
} else {
        // the singer doesn't exist, insert it into the singer table
    String insertSql = "INSERT INTO singer (singer_name) VALUES (?)";
    PreparedStatement insertStmt = con.prepareStatement(insertSql);
    insertStmt.setString(1, singername.getText());
    insertStmt.executeUpdate();
    //Retrieve the generated singer_id
    singer_id_stmt = con.prepareStatement(singer_id_query);
    singer_id_stmt.setString(1, singername.getText());
    singer_id_rs = singer_id_stmt.executeQuery();
    if (singer_id_rs.next()) {
    singerId = singer_id_rs.getInt("singer_id");
    } else {
    System.out.println("Failed to retrieve generated singer_id");
    }
}
    // insert the new song into the song table
    String insertSongSql = "INSERT INTO song (song_name, genre, singer_id) VALUES (?,?,?)";
    PreparedStatement insertSongStmt = con.prepareStatement(insertSongSql, PreparedStatement.RETURN_GENERATED_KEYS);

    insertSongStmt.setString(1, songname.getText());
    insertSongStmt.setString(2,genre.getText());
    insertSongStmt.setInt(3,singerId);
    insertSongStmt.executeUpdate();
    ResultSet generatedKeys = insertSongStmt.getGeneratedKeys();
    int songId=0;
    if (generatedKeys.next()) {
        songId = generatedKeys.getInt(1);
    } else {
        System.out.println("Failed to retrieve generated song_id");
    }
        // add the new song to the user's playlist
    String insertMapSql = "INSERT INTO playlist_song (playlist_id, song_id) SELECT playlist_id, ? FROM playlist WHERE playlist_name = ? AND not exists (SELECT 1 FROM playlist_song WHERE playlist_id = (SELECT playlist_id FROM playlist WHERE playlist_name = ?) and song_id = ?)";
    PreparedStatement insertMapStmt = con.prepareStatement(insertMapSql);
    insertMapStmt.setInt(1, songId);
    insertMapStmt.setString(2, playlistcurrent.getText());
    insertMapStmt.setString(3, playlistcurrent.getText());
    insertMapStmt.setInt(4,songId);
    insertMapStmt.executeUpdate();
    con.commit(); // commit the transaction
    System.out.println("Current playlist: "+playlistcurrent);
    System.out.println("Inserted into song as well as playlist Successfully");

    //jButton1.enable(false);
    con.setAutoCommit(true);
   // setVisible(false);
    
}catch (Exception e) {
    System.out.println(e);
   // con.setAutoCommit(true); 
}
    

//        try{
//             Class.forName("com.mysql.cj.jdbc.Driver");
//    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/music", "root", "root123");
//    String sql="INSERT INTO song (song_name, genre, singer_id) SELECT ?,?,singer_id FROM singer WHERE singer_name = ?";
//    PreparedStatement stmt = con.prepareStatement(sql);
//    stmt.setString(1,songname.getText());
//    stmt.setString(2,genre.getText());
//    stmt.setString(3,singername.getText());
//    stmt.executeUpdate();
//            System.out.println("Inserted Successfully");
//            SongsUI s=new SongsUI();
//            s.setVisible(true);
//            setVisible(false);
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SongsUI s=new SongsUI();
       String text=currentplaylist.getText();
        System.out.println("current playlist on ok button: "+text);
       s.setVisible(true);
       setVisible(false);
       try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/music", "root", "root123");
    
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPlaylist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentplaylist;
    private javax.swing.JTextField genre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField singername;
    private javax.swing.JTextField songname;
    // End of variables declaration//GEN-END:variables
}
