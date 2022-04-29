/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.mini_store_manager_form;

/**
 *
 * @author edgar
 */
public class BanHangGUI extends javax.swing.JPanel {

    /**
     * Creates new form BanHangGUI
     */
    public BanHangGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTimKiem = new javax.swing.JPanel();
        lbTenMatHang = new javax.swing.JLabel();
        lbLoaiMatHang = new javax.swing.JLabel();
        txtTenMatHang = new javax.swing.JTextField();
        cboxLoaiMatHang = new javax.swing.JComboBox<>();
        btnLamMoi = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        spMatHang = new javax.swing.JScrollPane();
        pnMatHang = new javax.swing.JPanel();
        pnGioHang = new javax.swing.JPanel();
        spGioHang = new javax.swing.JScrollPane();
        tbGioHang = new javax.swing.JTable();
        btnXoaMH = new javax.swing.JButton();
        btnGiamMH = new javax.swing.JButton();
        btnTangMH = new javax.swing.JButton();
        pnXulyGiohang = new javax.swing.JPanel();
        lbNVLapHD = new javax.swing.JLabel();
        lbNVLapHD_Res = new javax.swing.JLabel();
        lbNgayLap = new javax.swing.JLabel();
        lbSoLuong = new javax.swing.JLabel();
        lbTongHoaDon = new javax.swing.JLabel();
        lbMaGiamGia = new javax.swing.JLabel();
        txtNgayLap = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtTongHoaDon = new javax.swing.JTextField();
        cboxMaGiamGia = new javax.swing.JComboBox<>();
        btnHuyHoaDon = new javax.swing.JButton();
        btnLaphoaDon = new javax.swing.JButton();
        btnDanhSachHoaDon = new javax.swing.JButton();

        pnTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lí danh mục mặt hàng ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbTenMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTenMatHang.setText("Tên mặt hàng: ");

        lbLoaiMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbLoaiMatHang.setText("Loại mặt hàng:");

        txtTenMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        cboxLoaiMatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.setFocusable(false);
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.setFocusable(false);
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTimKiemLayout = new javax.swing.GroupLayout(pnTimKiem);
        pnTimKiem.setLayout(pnTimKiemLayout);
        pnTimKiemLayout.setHorizontalGroup(
            pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTenMatHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenMatHang, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lbLoaiMatHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxLoaiMatHang, 0, 166, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLamMoi)
                .addContainerGap())
        );
        pnTimKiemLayout.setVerticalGroup(
            pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenMatHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTenMatHang)
                    .addComponent(lbLoaiMatHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboxLoaiMatHang)
                    .addComponent(btnLamMoi)
                    .addComponent(btnTimKiem))
                .addContainerGap())
        );

        spMatHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh mục mặt hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        pnMatHang.setLayout(new java.awt.GridLayout(1, 0));
        spMatHang.setViewportView(pnMatHang);

        pnGioHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giỏ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        spGioHang.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spGioHang.setViewportView(tbGioHang);

        btnXoaMH.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnXoaMH.setText("Xoá mặt hàng");
        btnXoaMH.setFocusable(false);
        btnXoaMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaMHActionPerformed(evt);
            }
        });

        btnGiamMH.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnGiamMH.setText("Giảm số lượng");
        btnGiamMH.setFocusable(false);
        btnGiamMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiamMHActionPerformed(evt);
            }
        });

        btnTangMH.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTangMH.setText("Tăng số lượng");
        btnTangMH.setFocusable(false);
        btnTangMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTangMHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnGioHangLayout = new javax.swing.GroupLayout(pnGioHang);
        pnGioHang.setLayout(pnGioHangLayout);
        pnGioHangLayout.setHorizontalGroup(
            pnGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(spGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
            .addGroup(pnGioHangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTangMH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGiamMH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoaMH)
                .addContainerGap())
        );
        pnGioHangLayout.setVerticalGroup(
            pnGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGioHangLayout.createSequentialGroup()
                .addComponent(spGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaMH)
                    .addComponent(btnGiamMH)
                    .addComponent(btnTangMH))
                .addContainerGap())
        );

        pnXulyGiohang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Xử lý giỏ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbNVLapHD.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbNVLapHD.setText("Nhân viên lập hoá đơn: ");

        lbNVLapHD_Res.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNVLapHD_Res.setText("Admin");

        lbNgayLap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbNgayLap.setText("Ngày lập:");

        lbSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbSoLuong.setText("Số lượng:");

        lbTongHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTongHoaDon.setText("Tổng hoá đơn: ");

        lbMaGiamGia.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMaGiamGia.setText("Mã giảm giá:");

        txtNgayLap.setEditable(false);
        txtNgayLap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtSoLuong.setEditable(false);
        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtTongHoaDon.setEditable(false);
        txtTongHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        cboxMaGiamGia.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnHuyHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnHuyHoaDon.setIcon(new javax.swing.ImageIcon("D:\\Workspace\\Mini-Store-Manager\\resource\\icon\\Actions-edit-delete-icon-16.png")); // NOI18N
        btnHuyHoaDon.setText("Huỷ hoá đơn");
        btnHuyHoaDon.setFocusable(false);
        btnHuyHoaDon.setPreferredSize(new java.awt.Dimension(130, 24));
        btnHuyHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyHoaDonActionPerformed(evt);
            }
        });

        btnLaphoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnLaphoaDon.setIcon(new javax.swing.ImageIcon("D:\\Workspace\\Mini-Store-Manager\\resource\\icon\\icons8-paid-bill-16 (1).png")); // NOI18N
        btnLaphoaDon.setText("Lập hoá đơn");
        btnLaphoaDon.setFocusable(false);
        btnLaphoaDon.setPreferredSize(new java.awt.Dimension(130, 24));
        btnLaphoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaphoaDonActionPerformed(evt);
            }
        });

        btnDanhSachHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnDanhSachHoaDon.setIcon(new javax.swing.ImageIcon("D:\\Workspace\\Mini-Store-Manager\\resource\\icon\\icons8_bill_16px_1.png")); // NOI18N
        btnDanhSachHoaDon.setText("Danh sách hoá đơn");
        btnDanhSachHoaDon.setFocusable(false);
        btnDanhSachHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnXulyGiohangLayout = new javax.swing.GroupLayout(pnXulyGiohang);
        pnXulyGiohang.setLayout(pnXulyGiohangLayout);
        pnXulyGiohangLayout.setHorizontalGroup(
            pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnXulyGiohangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnXulyGiohangLayout.createSequentialGroup()
                        .addComponent(lbNVLapHD)
                        .addGap(18, 18, 18)
                        .addComponent(lbNVLapHD_Res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnXulyGiohangLayout.createSequentialGroup()
                        .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTongHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(lbMaGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNgayLap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnXulyGiohangLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTongHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgayLap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnXulyGiohangLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cboxMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnXulyGiohangLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDanhSachHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnXulyGiohangLayout.createSequentialGroup()
                                .addComponent(btnHuyHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLaphoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnXulyGiohangLayout.setVerticalGroup(
            pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnXulyGiohangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNVLapHD)
                    .addComponent(lbNVLapHD_Res))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNgayLap)
                    .addComponent(txtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSoLuong)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTongHoaDon)
                    .addComponent(txtTongHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMaGiamGia)
                    .addComponent(cboxMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnXulyGiohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuyHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLaphoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDanhSachHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spMatHang)
                    .addComponent(pnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnXulyGiohang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spMatHang))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnXulyGiohang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyHoaDonActionPerformed

    private void btnLaphoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaphoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLaphoaDonActionPerformed

    private void btnDanhSachHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDanhSachHoaDonActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnGiamMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiamMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGiamMHActionPerformed

    private void btnXoaMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaMHActionPerformed

    private void btnTangMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTangMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTangMHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDanhSachHoaDon;
    private javax.swing.JButton btnGiamMH;
    private javax.swing.JButton btnHuyHoaDon;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLaphoaDon;
    private javax.swing.JButton btnTangMH;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoaMH;
    private javax.swing.JComboBox<String> cboxLoaiMatHang;
    private javax.swing.JComboBox<String> cboxMaGiamGia;
    private javax.swing.JLabel lbLoaiMatHang;
    private javax.swing.JLabel lbMaGiamGia;
    private javax.swing.JLabel lbNVLapHD;
    private javax.swing.JLabel lbNVLapHD_Res;
    private javax.swing.JLabel lbNgayLap;
    private javax.swing.JLabel lbSoLuong;
    private javax.swing.JLabel lbTenMatHang;
    private javax.swing.JLabel lbTongHoaDon;
    private javax.swing.JPanel pnGioHang;
    private javax.swing.JPanel pnMatHang;
    private javax.swing.JPanel pnTimKiem;
    private javax.swing.JPanel pnXulyGiohang;
    private javax.swing.JScrollPane spGioHang;
    private javax.swing.JScrollPane spMatHang;
    private javax.swing.JTable tbGioHang;
    private javax.swing.JTextField txtNgayLap;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenMatHang;
    private javax.swing.JTextField txtTongHoaDon;
    // End of variables declaration//GEN-END:variables
}
