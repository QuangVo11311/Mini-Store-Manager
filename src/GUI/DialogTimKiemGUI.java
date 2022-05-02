package GUI;

import BUS.*;
import DTO.HoaDonDTO;
import DTO.KhachHangDTO;
import DTO.NhanVienDTO;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class DialogTimKiemGUI extends javax.swing.JDialog {
    private String key;

    /**
     * Creates new form SoLuongXoaDialogGUI
     */
    public DialogTimKiemGUI(java.awt.Frame parent, boolean modal, String key) {
        super(parent, modal);
        this.key = key;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        lbID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnXacNhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tìm kiếm");

        pnMain.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Nhập mã để tìm đối tượng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbID.setText("Nhập mã:");

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtID.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                txtIDDocumentListener(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                txtIDDocumentListener(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                txtIDDocumentListener(e);
            }
        });

        btnXacNhan.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.setFocusable(false);
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
                pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnMainLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMainLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        pnMainLayout.setVerticalGroup(
                pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnMainLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbID)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(btnXacNhan)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {
        if(!txtID.getText().equals("")) {
            // trường hợp là tìm kiếm Khách hàng
            if(this.key.equals("NV")) {
                NhanVienDTO nhanVienDTO = new NhanVienBUS().getItemByID(txtID.getText());
                if(nhanVienDTO != null) {
                    _SaveData.nhanVienTimThay = nhanVienDTO;
                    this.dispose();
                } else {
                    _SaveData.nhanVienTimThay = null;
                    _MessageDialogHelper.showErrorDialog(this,
                            "Không tìm thấy nhân viên cần tìm!", "Không tìm thấy đối tượng");
                }
            }

            // trường hợp là tìm kiếm Khách hàng
            if(this.key.equals("KH")) {
                KhachHangDTO khachHangDTO = new KhachHangBUS().getItemById(txtID.getText());
                if(khachHangDTO != null) {
                    _SaveData.khachHangTimThay = khachHangDTO;
                    this.dispose();
                } else {
                    _SaveData.khachHangTimThay = null;
                    _MessageDialogHelper.showErrorDialog(this,
                            "Không tìm thấy khách hàng cần tìm!", "Không tìm thấy đối tượng");
                }
            }

            // trường hợp là tìm kiếm Hoá đơn
            if(this.key.equals("HD")) {
                HoaDonDTO hoaDonDTO = new HoaDonBUS().getItemBymMaHD(txtID.getText());
                if(hoaDonDTO != null) {
                    _SaveData.hoaDonTimThay = hoaDonDTO;
                    this.dispose();
                } else {
                    _SaveData.hoaDonTimThay = null;
                    _MessageDialogHelper.showErrorDialog(this,
                            "Không tìm thấy hoá đơn cần tìm!", "Không tìm thấy đối tượng");
                }
            }

        } else {
            _MessageDialogHelper.showErrorDialog(this,
                    "Bạn cần nhập mã đối tượng vào ô tìm kiếm để tìm kiếm đối tượng", "Lỗi tìm kiếm");
        }
    }

    private void txtIDDocumentListener(DocumentEvent e) {
        btnXacNhan.setEnabled(!txtID.getText().isEmpty());
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel lbID;
    private javax.swing.JPanel pnMain;
    private javax.swing.JTextField txtID;
    // End of variables declaration
}
