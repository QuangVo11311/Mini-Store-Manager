package GUI;

import BUS.*;
import DTO.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class PanelNhanVienGUI extends javax.swing.JPanel {
    private static MainFormGUI parentForm;
    private DefaultTableModel modelTable_NV;
    private DefaultTableModel modelTable_HD;
    private DefaultComboBoxModel modelCB_CaLamViec;
    private DefaultComboBoxModel modelCB_ChucVu;

    /**
     * Creates new form PanelNhanVienGUI
     */
    public PanelNhanVienGUI() {
        initComponents();
        initCaLamViec();
        initChucVU();
        initTableKhachHang();
        initTableDonHang();
    }

    public void initCaLamViec() {
        modelCB_CaLamViec = new DefaultComboBoxModel();
        modelCB_CaLamViec.addElement("---");
        ArrayList<CaLamViecDTO> listCaLamViec = new CaLamViecBUS().getData();
        for (CaLamViecDTO item : listCaLamViec) {
            modelCB_CaLamViec.addElement(item.getTenCa());
        }
        cbCaLamViec.setModel(modelCB_CaLamViec);
    }

    public void initChucVU() {
        modelCB_ChucVu = new DefaultComboBoxModel();
        modelCB_ChucVu.addElement("---");
        ArrayList<ChucVuDTO> listChucVu = new ChucVuBUS().getData();
        for (ChucVuDTO item : listChucVu) {
            modelCB_ChucVu.addElement(item.getTenCV());
        }
        cbChucVu.setModel(modelCB_ChucVu);
    }

    public void initTableKhachHang() {
        String[] columnNames = new String[]{"Mã KH", "Mã CV", "Mã ca", "Tên KH", "CMND", "Số điện thoại"};
        modelTable_NV = new DefaultTableModel();
        modelTable_NV.setColumnIdentifiers(columnNames);

        try {
            tbDanhSachNhanVien.setFont(new Font("Segoe UI", 0, 12));
            tbDanhSachNhanVien.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            tbDanhSachNhanVien.setModel(modelTable_NV);
            loadTableNV(new NhanVienBUS().getData()); // gọi lại hàm load table nhân viên để load lại table
            tbDanhSachNhanVien.setDefaultEditor(Object.class, null);
            tbDanhSachNhanVien.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    tbDanhSachNhanVienListener();
                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(this, ex.getMessage(), "Error !");
        }
    }

    public void initTableDonHang() {
        String[] columnNames = new String[]{"Mã HD", "Mã NV", "Mã KH", "Mã giảm giá", "Tổng hoá đơn (VNĐ)", "Ngày bán"};
        modelTable_HD = new DefaultTableModel();
        modelTable_HD.setColumnIdentifiers(columnNames);

        tbLichSuGiaoDich.setFont(new Font("Segoe UI", 0, 12));
        tbLichSuGiaoDich.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbLichSuGiaoDich.setModel(modelTable_HD);
        tbLichSuGiaoDich.setDefaultEditor(Object.class, null);
        tbLichSuGiaoDich.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                tbLichSuGiaoDichMouseListener();
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        pnThongTinNhanVien = new javax.swing.JPanel();
        lbMaNhanVien = new javax.swing.JLabel();
        lbTenNhanVien = new javax.swing.JLabel();
        lbSoDienThoai = new javax.swing.JLabel();
        lbCMND = new javax.swing.JLabel();
        lbChucVu = new javax.swing.JLabel();
        lbCaLamViec = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        txtTenNhanVien = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        cbChucVu = new javax.swing.JComboBox<>();
        cbCaLamViec = new javax.swing.JComboBox<>();
        btnLamMoi = new javax.swing.JButton();
        btnTimKiemHD = new javax.swing.JButton();
        btnTimKiemNV = new javax.swing.JButton();
        btnXemCTHD = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        spDanhSachNhanVien = new javax.swing.JScrollPane();
        tbDanhSachNhanVien = new javax.swing.JTable();
        spLichSuGiaoDich = new javax.swing.JScrollPane();
        tbLichSuGiaoDich = new javax.swing.JTable();

        pnThongTinNhanVien.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbMaNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMaNhanVien.setText("Mã nhân viên:");

        lbTenNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTenNhanVien.setText("Tên nhân viên:");

        lbSoDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbSoDienThoai.setText("Số điện thoại:");

        lbCMND.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbCMND.setText("Chứng minh nhân dân:");

        lbChucVu.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbChucVu.setText("Chức Vụ:");

        lbCaLamViec.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbCaLamViec.setText("Ca Làm Việc:");

        txtMaNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtTenNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtSoDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtCMND.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        cbChucVu.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        cbCaLamViec.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.setToolTipText("Làm mới lại form");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnTimKiemHD.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTimKiemHD.setText("Tìm kiếm hoá đơn");
        btnTimKiemHD.setToolTipText("Tìm kiếm khách hàng thông qua mã khách hàng.");
        btnTimKiemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemHDActionPerformed(evt);
            }
        });

        btnTimKiemNV.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTimKiemNV.setText("Tìm Kiếm Nhân Viên");
        btnTimKiemNV.setToolTipText("Tìm kiếm hoá đơn thông qua mã hoá đơn.");
        btnTimKiemNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemNVActionPerformed(evt);
            }
        });

        btnXemCTHD.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnXemCTHD.setText("Chi tiết hoá đơn");
        btnXemCTHD.setToolTipText("show chi tiết hoá đơn của hoá đơn đã chọn.");
        btnXemCTHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemCTHDActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnThongTinNhanVienLayout = new javax.swing.GroupLayout(pnThongTinNhanVien);
        pnThongTinNhanVien.setLayout(pnThongTinNhanVienLayout);
        pnThongTinNhanVienLayout.setHorizontalGroup(
                pnThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnThongTinNhanVienLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnThongTinNhanVienLayout.createSequentialGroup()
                                                .addComponent(lbChucVu)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbCaLamViec)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbCaLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnThongTinNhanVienLayout.createSequentialGroup()
                                                .addGroup(pnThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lbSoDienThoai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbTenNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbMaNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbCMND, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(pnThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtTenNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                                        .addComponent(txtSoDienThoai, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtCMND, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtMaNhanVien))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(pnThongTinNhanVienLayout.createSequentialGroup()
                                                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnTimKiemNV)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnTimKiemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnXemCTHD, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        pnThongTinNhanVienLayout.setVerticalGroup(
                pnThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnThongTinNhanVienLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(pnThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbMaNhanVien)
                                        .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThem))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnXoa)
                                        .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbTenNhanVien))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSua)
                                        .addComponent(lbSoDienThoai)
                                        .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbCMND)
                                        .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbChucVu)
                                        .addComponent(lbCaLamViec)
                                        .addComponent(cbCaLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnLamMoi)
                                        .addComponent(btnTimKiemNV)
                                        .addComponent(btnTimKiemHD)
                                        .addComponent(btnXemCTHD))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spDanhSachNhanVien.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
        spDanhSachNhanVien.setViewportView(tbDanhSachNhanVien);

        spLichSuGiaoDich.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lịch sử giao dịch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
        spLichSuGiaoDich.setViewportView(tbLichSuGiaoDich);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(spDanhSachNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pnThongTinNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spLichSuGiaoDich, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(spLichSuGiaoDich)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pnThongTinNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spDanhSachNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)))
                                .addContainerGap())
        );
    }// </editor-fold>

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {
        refreshData();
    }

    private void btnTimKiemHDActionPerformed(java.awt.event.ActionEvent evt) {
        NhanVienDTO nhanVienDTO = tbDanhSachNhanVienListener();
        if (nhanVienDTO != null) {
            new DialogTimKiemGUI(new Frame(), true,"NV").setVisible(true); // mở form tìm kiếm
            HoaDonDTO hoaDonDTO = _SaveData.hoaDonTimThay;
            if(hoaDonDTO != null) {
                ArrayList<HoaDonDTO> listHD = new ArrayList<>(); // tạo mới danh sách hoá đơn
                listHD.add(hoaDonDTO); // add hoá đơn vừa tìm được vào danh sách
                loadHoaDon(listHD); // load lại lịch sử mua hàng của khách hàng được chọn

                // reset lại data tìm kiếm trong local
                _SaveData.hoaDonTimThay = null;
            }
        }
    }

    private void btnTimKiemNVActionPerformed(java.awt.event.ActionEvent evt) {
        new DialogTimKiemGUI(new Frame(), true,"NV").setVisible(true); // mở form tìm kiếm
        NhanVienDTO nhanVienDTO = _SaveData.nhanVienTimThay;
        if(nhanVienDTO != null) {
            ArrayList<HoaDonDTO> listHoaDon = new HoaDonBUS().fillData(nhanVienDTO.getMaNV(), "NV");
            ArrayList<NhanVienDTO> listNV = new ArrayList<>(); // tạo mới danh sách khách hàng
            listNV.add(nhanVienDTO); // add khách hàng vừa tìm được vào danh sách

            loadTableNV(listNV); // khởi tạo lại table khách hàng
            loadHoaDon(listHoaDon); // load lại lịch sử mua hàng của khách hàng được chọn

            // load các thông tin của khách hàng lên text field
            txtMaNhanVien.setText(nhanVienDTO.getMaNV());
            txtTenNhanVien.setText(nhanVienDTO.getTenNV());
            txtSoDienThoai.setText(nhanVienDTO.getSdt());
            txtCMND.setText(nhanVienDTO.getCmnd());
            cbChucVu.setSelectedItem(new ChucVuBUS().getItemByID(nhanVienDTO.getMaCV()).getTenCV());
            cbCaLamViec.setSelectedItem(new CaLamViecBUS().getItemByID(nhanVienDTO.getMaCa()).getTenCa());

            // reset lại data tìm kiếm trong local
            _SaveData.nhanVienTimThay = null;
        }
    }

    private void btnXemCTHDActionPerformed(java.awt.event.ActionEvent evt) {
        HoaDonDTO hoaDonDTO = tbLichSuGiaoDichMouseListener();
        if(hoaDonDTO != null) {
            // gọi form chi tiết hoá đơn để xuất ra hoá đơn
            new DialogChiTietHoaDonGUI(new Frame(), true, hoaDonDTO).setVisible(true);
        }
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder sb = new StringBuilder();
        try {
            CaLamViecDTO caLamViecDTO = new CaLamViecBUS().getItemByName((String) cbCaLamViec.getSelectedItem());
            ChucVuDTO chucVuDTO = new ChucVuBUS().getItemByName((String) cbChucVu.getSelectedItem());

            _DataValidator.validateEmpty(txtMaNhanVien, sb, "Vui lòng nhập mã nhân viên");
            _DataValidator.validateEmpty(txtTenNhanVien, sb, "Vui lòng nhập tên nhân viên");
            _DataValidator.validateEmpty(txtSoDienThoai, sb, "Vui lòng nhập số điện thoại");
            _DataValidator.validateEmpty(txtCMND, sb, "Vui lòng nhập số CMND");

            if(caLamViecDTO == null) {
                sb.append("Vui lòng chọn ca làm việc!\n");
            }

            if(chucVuDTO == null) {
                sb.append("Vui lòng chọn chức vụ!\n");
            }

            if(sb.length() > 0) {
                _MessageDialogHelper.showErrorDialog(parentForm, String.valueOf(sb), "Vui lòng kiểm tra lại");
            } else {
                if(_MessageDialogHelper.showConfirmDialog(parentForm,
                        "Bạn có muốn thêm mới đối tượng này không", "Thêm đối tượng") == JOptionPane.YES_OPTION) {
                    NhanVienDTO nhanVienDTO = new NhanVienDTO();
                    nhanVienDTO.setMaNV(txtMaNhanVien.getText());
                    nhanVienDTO.setTenNV(txtTenNhanVien.getText());
                    nhanVienDTO.setSdt(txtSoDienThoai.getText());
                    nhanVienDTO.setCmnd(txtCMND.getText());

                    if(caLamViecDTO != null && chucVuDTO != null) {
                        nhanVienDTO.setMaCa(caLamViecDTO.getMaCa());
                        nhanVienDTO.setMaCV(chucVuDTO.getMaCV());
                    }

                    NhanVienBUS nhanVienBUS = new NhanVienBUS();
                    if(nhanVienBUS.insertItem(nhanVienDTO)) {
                        refreshData(); // làm mới lại dữ liệu trên form
                        _MessageDialogHelper.showMessageDialog(parentForm, "Thêm đối tượng thành công!", "Thêm thành công");
                    } else {
                        _MessageDialogHelper.showErrorDialog(parentForm, "Đối tượng đã tồn tại trong CSDL!", "Thêm thất bại");
                    }
                }
            }
        } catch (Exception ex) {
            // trong trường hợp CSDL đã có dữ liệu của đối tượng
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(parentForm, "Thêm đối tượng thất bại!", "Failure Query Data");
        }
    }

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {
        NhanVienDTO nhanVienDTO = tbDanhSachNhanVienListener();
        if(nhanVienDTO != null) {
            StringBuilder sb = new StringBuilder();
            try {
                CaLamViecDTO caLamViecDTO = new CaLamViecBUS().getItemByName((String) cbCaLamViec.getSelectedItem());
                ChucVuDTO chucVuDTO = new ChucVuBUS().getItemByName((String) cbChucVu.getSelectedItem());

                _DataValidator.validateEmpty(txtMaNhanVien, sb, "Vui lòng nhập mã nhân viên");
                _DataValidator.validateEmpty(txtTenNhanVien, sb, "Vui lòng nhập tên nhân viên");
                _DataValidator.validateEmpty(txtSoDienThoai, sb, "Vui lòng nhập số điện thoại");
                _DataValidator.validateEmpty(txtCMND, sb, "Vui lòng nhập số CMND");

                if(caLamViecDTO == null) {
                    sb.append("Vui lòng chọn ca làm việc!\n");
                }

                if(chucVuDTO == null) {
                    sb.append("Vui lòng chọn chức vụ!\n");
                }

                if(sb.length() > 0) {
                    _MessageDialogHelper.showErrorDialog(parentForm, String.valueOf(sb), "Vui lòng kiểm tra lại");
                } else {
                    if(_MessageDialogHelper.showConfirmDialog(parentForm,
                            "Bạn có xoá đối tượng này không", "Xoá đối tượng") == JOptionPane.YES_OPTION) {
                        NhanVienBUS nhanVienBUS = new NhanVienBUS();
                        if(nhanVienBUS.deleteItem(nhanVienDTO)) {
                            refreshData(); // làm mới lại dữ liệu trên form
                            _MessageDialogHelper.showMessageDialog(parentForm, "Xoá đối tượng thành công!", "Xoá thành công");
                        } else {
                            _MessageDialogHelper.showErrorDialog(parentForm, "Xoá đối tượng thất bại!", "Xoá thất bại");
                        }
                    }
                }
            } catch (Exception ex) {
                // trong trường hợp CSDL đã có dữ liệu của đối tượng
                ex.printStackTrace();
                _MessageDialogHelper.showErrorDialog(parentForm, "Xoá đối tượng thất bại!", "Failure Query Data");
            }
        }
    }

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder sb = new StringBuilder();
        try {
            CaLamViecDTO caLamViecDTO = new CaLamViecBUS().getItemByName((String) cbCaLamViec.getSelectedItem());
            ChucVuDTO chucVuDTO = new ChucVuBUS().getItemByName((String) cbChucVu.getSelectedItem());

            _DataValidator.validateEmpty(txtMaNhanVien, sb, "Vui lòng nhập mã nhân viên");
            _DataValidator.validateEmpty(txtTenNhanVien, sb, "Vui lòng nhập tên nhân viên");
            _DataValidator.validateEmpty(txtSoDienThoai, sb, "Vui lòng nhập số điện thoại");
            _DataValidator.validateEmpty(txtCMND, sb, "Vui lòng nhập số CMND");

            if(caLamViecDTO == null) {
                sb.append("Vui lòng chọn ca làm việc!\n");
            }

            if(chucVuDTO == null) {
                sb.append("Vui lòng chọn chức vụ!\n");
            }

            if(sb.length() > 0) {
                _MessageDialogHelper.showErrorDialog(parentForm, String.valueOf(sb), "Vui lòng kiểm tra lại");
            } else {
                if(_MessageDialogHelper.showConfirmDialog(parentForm,
                        "Bạn có muốn thay đổi thông tin đối tượng này không", "Sửa thông tin đối tượng") == JOptionPane.YES_OPTION) {
                    NhanVienDTO nhanVienDTO = new NhanVienDTO();
                    nhanVienDTO.setMaNV(txtMaNhanVien.getText());
                    nhanVienDTO.setTenNV(txtTenNhanVien.getText());
                    nhanVienDTO.setSdt(txtSoDienThoai.getText());
                    nhanVienDTO.setCmnd(txtCMND.getText());

                    if(caLamViecDTO != null && chucVuDTO != null) {
                        nhanVienDTO.setMaCa(caLamViecDTO.getMaCa());
                        nhanVienDTO.setMaCV(chucVuDTO.getMaCV());
                    }

                    NhanVienBUS nhanVienBUS = new NhanVienBUS();
                    if(nhanVienBUS.updateItem(nhanVienDTO)) {
                        refreshData();  // làm mới lại dữ liệu trên form
                        _MessageDialogHelper.showMessageDialog(parentForm,
                                "Sửa thông tin đối tượng thành công!", "Sửa thành công");
                    } else {
                        _MessageDialogHelper.showErrorDialog(parentForm,
                                "Sửa thông tin đối tượng thất bại!", "Sửa thất bại");
                    }
                }
            }
        } catch (Exception ex) {
            // trong trường hợp CSDL đã có dữ liệu của đối tượng
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(parentForm, "Sửa đối tượng thất bại!", "Failure Query Data");
        }
    }


    //===================================================================================================//
    private NhanVienDTO tbDanhSachNhanVienListener() {
        try {
            int selectedRow = tbDanhSachNhanVien.getSelectedRow();
            String idNV = String.valueOf(tbDanhSachNhanVien.getValueAt(selectedRow, 0));
            NhanVienDTO nhanVienDTO = new NhanVienBUS().getItemByID(idNV);

            System.out.println(nhanVienDTO.toString());

            // load thông tin lên field
            txtMaNhanVien.setText(nhanVienDTO.getMaNV());
            txtTenNhanVien.setText(nhanVienDTO.getTenNV());
            txtSoDienThoai.setText(nhanVienDTO.getSdt());
            txtCMND.setText(nhanVienDTO.getCmnd());
            cbChucVu.setSelectedItem(new ChucVuBUS().getItemByID(nhanVienDTO.getMaCV()).getTenCV());
            cbCaLamViec.setSelectedItem(new CaLamViecBUS().getItemByID(nhanVienDTO.getMaCa()).getTenCa());

            // load lịch sử mua sắm lên tb
            loadHoaDon(new HoaDonBUS().fillData(idNV, "NV")); // load lại lịch sử mua hàng
            return nhanVienDTO; // trả về khách hàng được nhấn vào
        } catch (Exception ex) {
            _MessageDialogHelper.showErrorDialog(parentForm,
                    "Vui lòng chọn một dòng trong danh sách khách hàng!", "Yêu cầu chọn dữ liệu");
            return null;
        }
    }

    private HoaDonDTO tbLichSuGiaoDichMouseListener() {
        try {
            int selectedRow = tbLichSuGiaoDich.getSelectedRow();
            String idHD = String.valueOf(tbLichSuGiaoDich.getValueAt(selectedRow, 0));
            return new HoaDonBUS().getItemBymMaHD(idHD);
        } catch (Exception ex) {
            _MessageDialogHelper.showErrorDialog( parentForm,
                    "Vui lòng chọn một dòng trong lịch sử giao dịch!", "Yêu cầu chọn dữ liệu");
            return null;
        }
    }

    private void loadHoaDon(ArrayList<HoaDonDTO> listHoaDon) {
        modelTable_HD.setRowCount(0);
        for (HoaDonDTO item : listHoaDon) {
            modelTable_HD.addRow(new Object[]{
                    item.getMaHD(),
                    item.getMaNV(),
                    item.getMaKH(),
                    item.getMaGiamGia(),
                    item.getTongHoaDon(),
                    item.getNgayBan()
            });
        }
    }

    private void loadTableNV(ArrayList<NhanVienDTO> listNhanVien) {
        modelTable_NV.setRowCount(0);
        for (NhanVienDTO item : listNhanVien) {
            modelTable_NV.addRow(new Object[]{
                    item.getMaNV(),
                    item.getMaCV(),
                    item.getMaCa(),
                    item.getTenNV(),
                    item.getCmnd(),
                    item.getSdt()
            });
        }
    }

    // tạo mới lại data
    private void refreshData() {
        txtMaNhanVien.setText(""); // refresh form mã nhân viên
        txtTenNhanVien.setText(""); // refresh form tên nhân viên
        txtSoDienThoai.setText(""); // refresh form số điện thoại
        txtCMND.setText(""); // refresh form số cmnd
        cbCaLamViec.setSelectedIndex(0);
        cbChucVu.setSelectedIndex(0);
        tbDanhSachNhanVien.clearSelection(); // refresh selected danh sách khách hàng

        // set Background
        txtMaNhanVien.setBackground(Color.WHITE);
        txtTenNhanVien.setBackground(Color.WHITE);
        txtSoDienThoai.setBackground(Color.WHITE);
        txtCMND.setBackground(Color.WHITE);


        // set Foreground
        txtMaNhanVien.setForeground(Color.BLACK);
        txtTenNhanVien.setForeground(Color.BLACK);
        txtSoDienThoai.setForeground(Color.BLACK);
        txtCMND.setForeground(Color.BLACK);

        loadTableNV(new NhanVienBUS().getData()); // load lại khách hàng
        loadHoaDon(new ArrayList<>()); // load lại hoá đơn
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiemHD;
    private javax.swing.JButton btnTimKiemNV;
    private javax.swing.JButton btnXemCTHD;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbCaLamViec;
    private javax.swing.JComboBox<String> cbChucVu;
    private javax.swing.JLabel lbCMND;
    private javax.swing.JLabel lbCaLamViec;
    private javax.swing.JLabel lbChucVu;
    private javax.swing.JLabel lbMaNhanVien;
    private javax.swing.JLabel lbSoDienThoai;
    private javax.swing.JLabel lbTenNhanVien;
    private javax.swing.JPanel pnThongTinNhanVien;
    private javax.swing.JScrollPane spDanhSachNhanVien;
    private javax.swing.JScrollPane spLichSuGiaoDich;
    private javax.swing.JTable tbDanhSachNhanVien;
    private javax.swing.JTable tbLichSuGiaoDich;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenNhanVien;
    // End of variables declaration
}
