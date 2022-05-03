/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.mini_store_manager_form;

/**
 *
 * @author edgar
 */
public class PanelHoaDonGUI extends javax.swing.JPanel {

    /**
     * Creates new form PanelHoaDonGUI2
     */
    public PanelHoaDonGUI() {
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

        pnThongTinHoaDon = new javax.swing.JPanel();
        lbMaHoaDon = new javax.swing.JLabel();
        lbMaGiamGia = new javax.swing.JLabel();
        lbTenNhanVien = new javax.swing.JLabel();
        lbTenKhachHang = new javax.swing.JLabel();
        lbNgayBan = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JTextField();
        txtMaGiamGia = new javax.swing.JTextField();
        txtTenNhanVien = new javax.swing.JTextField();
        txtTenKhachHang = new javax.swing.JTextField();
        txtNgayBan = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        btnTimKiemNV = new javax.swing.JButton();
        btnInHoaDon = new javax.swing.JButton();
        spDanhSachHoaDon = new javax.swing.JScrollPane();
        tbDanhSachHoaDon = new javax.swing.JTable();
        spChiTietHoaDon = new javax.swing.JScrollPane();
        tbChiTietHoaDon = new javax.swing.JTable();
        pnThanhToan = new javax.swing.JPanel();
        lbTongHoaDonBanDau = new javax.swing.JLabel();
        lbChietKhau = new javax.swing.JLabel();
        lbTongTienHoaDon = new javax.swing.JLabel();
        txtTongHoaDonBanDau = new javax.swing.JTextField();
        txtChietKhau = new javax.swing.JTextField();
        txtTongTienHoaDon = new javax.swing.JTextField();

        pnThongTinHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hoá đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbMaHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMaHoaDon.setText("Mã hoá đơn:");

        lbMaGiamGia.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMaGiamGia.setText("Mã giảm giá:");

        lbTenNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTenNhanVien.setText("Tên nhân viên:");

        lbTenKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTenKhachHang.setText("Tên khách hàng:");

        lbNgayBan.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbNgayBan.setText("Ngày bán:");

        txtMaHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtMaHoaDon.setEnabled(false);

        txtMaGiamGia.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtMaGiamGia.setEnabled(false);

        txtTenNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtTenNhanVien.setEnabled(false);

        txtTenKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtTenKhachHang.setEnabled(false);

        txtNgayBan.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtNgayBan.setEnabled(false);

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.setToolTipText("Làm mới lại form");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnTimKiemNV.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTimKiemNV.setText("Tìm kiếm hoá đơn");
        btnTimKiemNV.setToolTipText("Tìm kiếm hoá đơn thông qua mã hoá đơn.");
        btnTimKiemNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemNVActionPerformed(evt);
            }
        });

        btnInHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnInHoaDon.setText("In hoá đơn");
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnThongTinHoaDonLayout = new javax.swing.GroupLayout(pnThongTinHoaDon);
        pnThongTinHoaDon.setLayout(pnThongTinHoaDonLayout);
        pnThongTinHoaDonLayout.setHorizontalGroup(
            pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbTenKhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(lbTenNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMaGiamGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMaHoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNgayBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaGiamGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenNhanVien, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayBan, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaHoaDon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTimKiemNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnThongTinHoaDonLayout.setVerticalGroup(
            pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinHoaDonLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaHoaDon)
                    .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInHoaDon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMaGiamGia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenNhanVien)
                    .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenKhachHang)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemNV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNgayBan)
                    .addComponent(txtNgayBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spDanhSachHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hoá đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        tbDanhSachHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        spDanhSachHoaDon.setViewportView(tbDanhSachHoaDon);

        spChiTietHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết hoá đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        tbChiTietHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        spChiTietHoaDon.setViewportView(tbChiTietHoaDon);

        pnThanhToan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thanh toán", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbTongHoaDonBanDau.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTongHoaDonBanDau.setText("Tổng hoá đơn ban đầu");

        lbChietKhau.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbChietKhau.setText("Chiết khấu:");

        lbTongTienHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTongTienHoaDon.setText("Tổng tiền hoá đơn:");

        txtTongHoaDonBanDau.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtChietKhau.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtTongTienHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        javax.swing.GroupLayout pnThanhToanLayout = new javax.swing.GroupLayout(pnThanhToan);
        pnThanhToan.setLayout(pnThanhToanLayout);
        pnThanhToanLayout.setHorizontalGroup(
            pnThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThanhToanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTongHoaDonBanDau, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbTongTienHoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addComponent(lbChietKhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTongTienHoaDon)
                    .addComponent(txtChietKhau, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTongHoaDonBanDau, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        pnThanhToanLayout.setVerticalGroup(
            pnThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThanhToanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTongHoaDonBanDau)
                    .addComponent(txtTongHoaDonBanDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbChietKhau)
                    .addComponent(txtChietKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTongTienHoaDon)
                    .addComponent(txtTongTienHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spDanhSachHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnThongTinHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spChiTietHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                    .addComponent(pnThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnThongTinHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spDanhSachHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spChiTietHoaDon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnTimKiemNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemNVActionPerformed

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInHoaDonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInHoaDon;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnTimKiemNV;
    private javax.swing.JLabel lbChietKhau;
    private javax.swing.JLabel lbMaGiamGia;
    private javax.swing.JLabel lbMaHoaDon;
    private javax.swing.JLabel lbNgayBan;
    private javax.swing.JLabel lbTenKhachHang;
    private javax.swing.JLabel lbTenNhanVien;
    private javax.swing.JLabel lbTongHoaDonBanDau;
    private javax.swing.JLabel lbTongTienHoaDon;
    private javax.swing.JPanel pnThanhToan;
    private javax.swing.JPanel pnThongTinHoaDon;
    private javax.swing.JScrollPane spChiTietHoaDon;
    private javax.swing.JScrollPane spDanhSachHoaDon;
    private javax.swing.JTable tbChiTietHoaDon;
    private javax.swing.JTable tbDanhSachHoaDon;
    private javax.swing.JTextField txtChietKhau;
    private javax.swing.JTextField txtMaGiamGia;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtNgayBan;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTenNhanVien;
    private javax.swing.JTextField txtTongHoaDonBanDau;
    private javax.swing.JTextField txtTongTienHoaDon;
    // End of variables declaration//GEN-END:variables
}
