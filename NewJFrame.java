
public class NewJFrame extends javax.swing.JFrame {

   

    
    public NewJFrame() {
      
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        title = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        firstName1 = new javax.swing.JLabel();
        profession = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        phoneNo = new javax.swing.JLabel();
        TfirstName = new javax.swing.JTextField();
        TlastName = new javax.swing.JTextField();
        Tprofession = new javax.swing.JTextField();
        Temail = new javax.swing.JTextField();
        Tphone = new javax.swing.JTextField();
        title1 = new javax.swing.JLabel();
        highSchool = new javax.swing.JLabel();
        seniorschool = new javax.swing.JLabel();
        degree1 = new javax.swing.JLabel();
        college1 = new javax.swing.JLabel();
        degree2 = new javax.swing.JLabel();
        college2 = new javax.swing.JLabel();
        THighSchool = new javax.swing.JTextField();
        TSeniorSchool = new javax.swing.JTextField();
        Tdegree1 = new javax.swing.JTextField();
        Tcollege1 = new javax.swing.JTextField();
        Tdegree2 = new javax.swing.JTextField();
        Tcollege2 = new javax.swing.JTextField();
        title2 = new javax.swing.JLabel();
        skill1 = new javax.swing.JLabel();
        skill2 = new javax.swing.JLabel();
        skill3 = new javax.swing.JLabel();
        Tskill1 = new javax.swing.JTextField();
        Tskill2 = new javax.swing.JTextField();
        Tskill3 = new javax.swing.JTextField();
        title3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tsummary = new javax.swing.JTextArea();
        title4 = new javax.swing.JLabel();
        language1 = new javax.swing.JLabel();
        Tlanguage1 = new javax.swing.JComboBox<>();
        language2 = new javax.swing.JLabel();
        Tlanguage2 = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 232, 182));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 243, 202));

        jLayeredPane1.setBackground(new java.awt.Color(242, 228, 182));
        jLayeredPane1.setForeground(new java.awt.Color(246, 247, 215));
        jLayeredPane1.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLayeredPane1.setOpaque(true);

        title.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("EDUCATION");

        lastName.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        lastName.setText("Last Name");

        firstName1.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        firstName1.setText("First Name");

        profession.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        profession.setText("Profession");

        email.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        email.setText("Email");

        phoneNo.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        phoneNo.setText("Phone No.");

        title1.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("ONLINE RESUME BUILDER");

        highSchool.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        highSchool.setText("High School Name");

        seniorschool.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        seniorschool.setText("Senior School ");

        degree1.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        degree1.setText("UG Degree");

        college1.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        college1.setText("College Name");

        degree2.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        degree2.setText("PG Degree");

        college2.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        college2.setText("College Name");

        title2.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("Skills");

        skill1.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        skill1.setText("Skill1");

        skill2.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        skill2.setText("Skill2");

        skill3.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        skill3.setText("Skill3");

        title3.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        title3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title3.setText("Summary");

        Tsummary.setColumns(20);
        Tsummary.setRows(5);
        jScrollPane1.setViewportView(Tsummary);

        title4.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        title4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title4.setText("Languages");

        language1.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        language1.setText("Language1");

        Tlanguage1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "English", "Hindi", "French", "German", "Chinese", "Korean", "Japanese", "Urdu", "Portugal", " " }));

        language2.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        language2.setText("Language2");

        Tlanguage2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "English", "Hindi", "French", "German", "Chinese", "Korean", "Japanese", "Urdu", "Portugal", " " }));

        submitButton.setBackground(new java.awt.Color(108, 41, 58));
        submitButton.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Create Resume");
        submitButton.setOpaque(true);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(108, 41, 58));
        clearButton.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.setOpaque(true);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(title, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lastName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(firstName1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(profession, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(phoneNo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TfirstName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TlastName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Tprofession, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Temail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Tphone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(title1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(highSchool, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(seniorschool, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(degree1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(college1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(degree2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(college2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(THighSchool, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TSeniorSchool, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Tdegree1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Tcollege1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Tdegree2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Tcollege2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(title2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(skill1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(skill2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(skill3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Tskill1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Tskill2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Tskill3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(title3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(title4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(language1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Tlanguage1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(language2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Tlanguage2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(submitButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(clearButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                    .addComponent(firstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TfirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                    .addComponent(profession, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Tprofession, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TlastName, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneNo))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Tphone, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Temail, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(seniorschool, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TSeniorSchool))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(highSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(THighSchool))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(degree1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Tdegree1))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(college1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Tcollege1))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(degree2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Tdegree2))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(college2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Tcollege2)))
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(title3, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(skill3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(skill2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(skill1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tskill1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tskill2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tskill3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(title4, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(72, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(language2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Tlanguage2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(language1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Tlanguage1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92))))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(firstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(TfirstName)
                            .addGap(7, 7, 7)))
                    .addComponent(title2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TlastName)
                    .addComponent(skill1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tskill1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profession, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tprofession)
                    .addComponent(skill2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tskill2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(skill3)
                        .addComponent(Tskill3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Temail)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNo)
                    .addComponent(Tphone))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title)
                    .addComponent(title3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(highSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(THighSchool))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seniorschool, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TSeniorSchool))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(degree1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tdegree1)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(college1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tcollege1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(degree2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tdegree2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(college2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tcollege2))
                        .addGap(98, 98, 98)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(175, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(title4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(language1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tlanguage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(language2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tlanguage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(title1)
                    .addContainerGap(778, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
       TfirstName.setText("");
       TlastName.setText("");
       Tphone.setText("");
       Temail.setText("");
       Tprofession.setText("");
       THighSchool.setText("");
       TSeniorSchool.setText("");
       Tcollege1.setText("");
       Tdegree1.setText("");
       Tcollege2.setText("");
       Tdegree2.setText("");
       Tsummary.setText("");
       Tskill1.setText("");
       Tskill2.setText("");
       Tskill3.setText("");
       Tlanguage1.setSelectedItem("None");
        Tlanguage2.setSelectedItem("None");
         
    }//GEN-LAST:event_clearButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        String firstName = TfirstName.getText();
        String lastName = TlastName.getText();
        String email = Temail.getText();
        String profession = Tprofession.getText();
        String phone = Tphone.getText();
        String skill1 = Tskill1.getText();
        String skill2 = Tskill1.getText();
        String skill3 = Tskill1.getText();
        String highSchool = THighSchool.getText();
        String seniorSchool = TSeniorSchool.getText();
        String college1 = Tcollege1.getText();
        String college2 = Tcollege2.getText();
        String degree1 = Tdegree1.getText();
        String degree2 = Tdegree2.getText();
        String summary = Tsummary.getText();
        String language1 =(String) Tlanguage1.getSelectedItem();
        String language2 =(String) Tlanguage2.getSelectedItem();
        Details d = new Details();
        d.getDetails(firstName, lastName, email, profession, phone, skill1, skill2, skill3, highSchool, seniorSchool, college1, college2, degree1, degree2, summary, language1, language2);
       d.createConnection();
       Created c = new Created();
       c.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_submitButtonActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField THighSchool;
    private javax.swing.JTextField TSeniorSchool;
    private javax.swing.JTextField Tcollege1;
    private javax.swing.JTextField Tcollege2;
    private javax.swing.JTextField Tdegree1;
    private javax.swing.JTextField Tdegree2;
    private javax.swing.JTextField Temail;
    private javax.swing.JTextField TfirstName;
    private javax.swing.JComboBox<String> Tlanguage1;
    private javax.swing.JComboBox<String> Tlanguage2;
    private javax.swing.JTextField TlastName;
    private javax.swing.JTextField Tphone;
    private javax.swing.JTextField Tprofession;
    private javax.swing.JTextField Tskill1;
    private javax.swing.JTextField Tskill2;
    private javax.swing.JTextField Tskill3;
    private javax.swing.JTextArea Tsummary;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel college1;
    private javax.swing.JLabel college2;
    private javax.swing.JLabel degree1;
    private javax.swing.JLabel degree2;
    private javax.swing.JLabel email;
    private javax.swing.JLabel firstName1;
    private javax.swing.JLabel highSchool;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel language1;
    private javax.swing.JLabel language2;
    private javax.swing.JLabel lastName;
    private javax.swing.JLabel phoneNo;
    private javax.swing.JLabel profession;
    private javax.swing.JLabel seniorschool;
    private javax.swing.JLabel skill1;
    private javax.swing.JLabel skill2;
    private javax.swing.JLabel skill3;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    // End of variables declaration//GEN-END:variables
}
