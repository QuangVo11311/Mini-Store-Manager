package GUI;

import BUS.*;
import DTO.HoaDonDTO;
import DTO.KhachHangDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class PanelKhachHangGUI extends javax.swing.JPanel {
    private static MainFormGUI parentForm;
    private DefaultTableModel modelTable_KH;
    private DefaultTableModel modelTable_HD;

    /**
     * Creates new form PanelKhachHangGUI
     */
    public PanelKhachHangGUI() {
        initComponents();
        initTableKhachHang();
        initTableDonHang();
    }

    public void initTableKhachHang() {
        ArrayList<KhachHangDTO> listKH = new KhachHangBUS().getData();
        String[] columnNames = new String[]{"Mã KH", "Tên KH", "Số điện thoại"};
        modelTable_KH = new DefaultTableModel();
        modelTable_KH.setColumnIdentifiers(columnNames);

        try {
            loadTableKH(listKH); // gọi lại hàm load table khách hàng để load lại table
        } catch (Exception ex) {
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(this, ex.getMessage(), "Error !");
        }
    }

    public void initTableDonHang() {
        String[] columnNames = new String[]{"Mã HD", "Mã NV", "Mã KH", "Mã giảm giá", "Tổng hoá đơn (VNĐ)", "Ngày bán"};
        modelTable_HD = new DefaultTableModel();
        modelTable_HD.setColumnIdentifiers(columnNames);
        tbLichSuGiaoDich.setModel(modelTable_HD);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        pnThongTinKhachHang = new javax.swing.JPanel();
        lbMaKhachHang = new javax.swing.JLabel();
        lbTenKhachHang = new javax.swing.JLabel();
        lbSoDienThoai = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        txtTenKhachHang = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXemCTHD = new javax.swing.JButton();
        spDanhSachKhachHang = new javax.swing.JScrollPane();
        tbDanhSachKhachHang = new javax.swing.JTable();
        spLichSuGiaoDich = new javax.swing.JScrollPane();
        tbLichSuGiaoDich = new javax.swing.JTable();

        pnThongTinKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbMaKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMaKhachHang.setText("Mã khách hàng: ");

        lbTenKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTenKhachHang.setText("Tên khách hàng");

        lbSoDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbSoDienThoai.setText("Số điện thoại:");

        txtMaKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtTenKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtSoDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
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

        btnXemCTHD.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnXemCTHD.setText("CTHĐ");
        btnXemCTHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemCTHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnThongTinKhachHangLayout = new javax.swing.GroupLayout(pnThongTinKhachHang);
        pnThongTinKhachHang.setLayout(pnThongTinKhachHangLayout);
        pnThongTinKhachHangLayout.setHorizontalGroup(
                pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnThongTinKhachHangLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnThongTinKhachHangLayout.createSequentialGroup()
                                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(lbTenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbMaKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtSoDienThoai)
                                                        .addComponent(txtMaKhachHang)
                                                        .addComponent(txtTenKhachHang)))
                                        .addGroup(pnThongTinKhachHangLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnLamMoi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnTimKiem)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnXemCTHD)))
                                .addContainerGap())
        );
        pnThongTinKhachHangLayout.setVerticalGroup(
                pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnThongTinKhachHangLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbMaKhachHang)
                                        .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbTenKhachHang)
                                        .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbSoDienThoai)
                                        .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnXemCTHD)
                                        .addComponent(btnLamMoi)
                                        .addComponent(btnThem)
                                        .addComponent(btnXoa)
                                        .addComponent(btnSua)
                                        .addComponent(btnTimKiem))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spDanhSachKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
        spDanhSachKhachHang.setViewportView(tbDanhSachKhachHang);

        spLichSuGiaoDich.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lịch sử giao dịch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
        spLichSuGiaoDich.setViewportView(tbLichSuGiaoDich);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(spDanhSachKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                                        .addComponent(pnThongTinKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spLichSuGiaoDich, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(spLichSuGiaoDich, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pnThongTinKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spDanhSachKhachHang)))
                                .addContainerGap())
        );
    }// </editor-fold>


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
            _DataValidator.validateEmpty(txtMaKhachHang, sb, "Vui lòng nhập mã khách hàng");
            _DataValidator.validateEmpty(txtTenKhachHang, sb, "Vui lòng nhập tên khách hàng");
            _DataValidator.validateEmpty(txtSoDienThoai, sb, "Vui lòng nhập số điện thoại");
            if(sb.length() > 0) {
                _MessageDialogHelper.showErrorDialog(parentForm, String.valueOf(sb), "Vui lòng kiểm tra lại");
            } else {
                if(_MessageDialogHelper.showConfirmDialog(parentForm,
                        "Bạn có muốn thêm mới đối tượng này không", "Thêm đối tượng") == JOptionPane.YES_OPTION) {
                    KhachHangDTO khachHangDTO = new KhachHangDTO();
                    khachHangDTO.setMaKH(txtMaKhachHang.getText());
                    khachHangDTO.setTenKH(txtTenKhachHang.getText());
                    khachHangDTO.setSdt(txtSoDienThoai.getText());

                    KhachHangBUS khachHangBUS = new KhachHangBUS();
                    if(khachHangBUS.insertItem(khachHangDTO)) {
                        refreshData(); // làm mới lại dữ liệu trên form
                        _MessageDialogHelper.showMessageDialog(parentForm, "Tạo mới đối tượng thành công !", "Success Query Data");
                    } else {
                        _MessageDialogHelper.showErrorDialog(parentForm, "Tạo mới đối tượng thất bại !", "Failure Query Data");
                    }
                }
            }
        } catch (Exception ex) {
            // trong trường hợp CSDL đã có dữ liệu của đối tượng
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(parentForm, "Đối tượng đã tồn tại trong CSDL!", "Thêm đối tượng thất bại ");
        }
    }

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {
        KhachHangDTO khachHangDTO = tbDanhSachKhachHangMouseListener();
        if(khachHangDTO != null) {
            StringBuilder sb = new StringBuilder();
            try {
                _DataValidator.validateEmpty(txtMaKhachHang, sb, "Vui lòng nhập mã khách hàng");
                _DataValidator.validateEmpty(txtTenKhachHang, sb, "Vui lòng nhập tên khách hàng");
                _DataValidator.validateEmpty(txtSoDienThoai, sb, "Vui lòng nhập số điện thoại");
                if(sb.length() > 0) {
                    _MessageDialogHelper.showErrorDialog(parentForm, String.valueOf(sb), "Vui lòng kiểm tra lại");
                } else {
                    if(_MessageDialogHelper.showConfirmDialog(parentForm,
                            "Bạn có xoá đối tượng này không", "Xoá đối tượng") == JOptionPane.YES_OPTION) {
                        KhachHangBUS khachHangBUS = new KhachHangBUS();
                        if(khachHangBUS.deleteItem(khachHangDTO)) {
                            refreshData(); // làm mới lại dữ liệu trên form
                            _MessageDialogHelper.showMessageDialog(parentForm, "Xoá đối tượng thành công !", "Success Query Data");
                        } else {
                            _MessageDialogHelper.showErrorDialog(parentForm, "Xoá đối tượng thất bại !", "Failure Query Data");
                        }
                    }
                }
            } catch (Exception ex) {
                // trong trường hợp CSDL đã có dữ liệu của đối tượng
                ex.printStackTrace();
                _MessageDialogHelper.showErrorDialog(parentForm,
                        "Đối tượng không tồn tại trong CSDL!", "Xoá đối tượng thất bại ");
            }
        }
    }

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder sb = new StringBuilder();
        try {
            _DataValidator.validateEmpty(txtMaKhachHang, sb, "Vui lòng nhập mã khách hàng");
            _DataValidator.validateEmpty(txtTenKhachHang, sb, "Vui lòng nhập tên khách hàng");
            _DataValidator.validateEmpty(txtSoDienThoai, sb, "Vui lòng nhập số điện thoại");
            if(sb.length() > 0) {
                _MessageDialogHelper.showErrorDialog(parentForm, String.valueOf(sb), "Vui lòng kiểm tra lại");
            } else {
                if(_MessageDialogHelper.showConfirmDialog(parentForm,
                        "Bạn có muốn thay đổi thông tin đối tượng này không", "Sửa thông tin đối tượng") == JOptionPane.YES_OPTION) {
                    KhachHangDTO khachHangDTO = new KhachHangDTO();
                    khachHangDTO.setMaKH(txtMaKhachHang.getText());
                    khachHangDTO.setTenKH(txtTenKhachHang.getText());
                    khachHangDTO.setSdt(txtSoDienThoai.getText());

                    KhachHangBUS khachHangBUS = new KhachHangBUS();
                    if(khachHangBUS.updateItem(khachHangDTO)) {
                        refreshData(); // làm mới lại dữ liệu trên form
                        _MessageDialogHelper.showMessageDialog(parentForm,
                                "Sửa thông tin đối tượng thành công !", "Success Query Data");
                    } else {
                        _MessageDialogHelper.showErrorDialog(parentForm,
                                "Sửa thông tin đối tượng thất bại !", "Failure Query Data");
                    }
                }
            }
        } catch (Exception ex) {
            // trong trường hợp CSDL đã có dữ liệu của đối tượng
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(parentForm, "Đối tượng chưa tồn tại trong CSDL!", "Sửa đối tượng thất bại ");
        }
    }

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {
        refreshData();

        // set Background
        txtMaKhachHang.setBackground(Color.WHITE);
        txtTenKhachHang.setBackground(Color.WHITE);
        txtSoDienThoai.setBackground(Color.WHITE);

        // set Foreground
        txtMaKhachHang.setForeground(Color.BLACK);
        txtTenKhachHang.setForeground(Color.BLACK);
        txtSoDienThoai.setForeground(Color.BLACK);
    }

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {
        new DialogTimKiemGUI(new Frame(), true).setVisible(true); // mở form tìm kiếm
        KhachHangDTO khachHangDTO = _SaveData.khachHangTimThay;
        if(khachHangDTO != null) {
            ArrayList<HoaDonDTO> listHoaDon = new HoaDonBUS().fillData(khachHangDTO.getMaKH());
            ArrayList<KhachHangDTO> listKH = new ArrayList<>(); // tạo mới danh sách khách hàng
            listKH.add(khachHangDTO); // add khách hàng vừa tìm được vào danh sách

            loadTableKH(listKH); // khởi tạo lại table khách hàng
            loadHoaDon(listHoaDon); // load lại lịch sử mua hàng của khách hàng được chọn

            // load các thông tin của khách hàng lên text field
            txtMaKhachHang.setText(khachHangDTO.getMaKH());
            txtTenKhachHang.setText(khachHangDTO.getTenKH());
            txtSoDienThoai.setText(khachHangDTO.getSdt());

            _SaveData.saveID = ""; // refresh lại saveID trong local
        }
    }

    //===================================================================================================//
    private KhachHangDTO tbDanhSachKhachHangMouseListener() {
        try {
            int selectedRow = tbDanhSachKhachHang.getSelectedRow();
            String idKH = String.valueOf(tbDanhSachKhachHang.getValueAt(selectedRow, 0));
            KhachHangDTO khachHangDTO = new KhachHangBUS().getItemById(idKH);

            // load thông tin lên field
            txtMaKhachHang.setText(khachHangDTO.getMaKH());
            txtTenKhachHang.setText(khachHangDTO.getTenKH());
            txtSoDienThoai.setText(khachHangDTO.getSdt());

            // load lịch sử mua sắm lên tb
            ArrayList<HoaDonDTO> listHoaDon = new HoaDonBUS().fillData(idKH);
            loadHoaDon(listHoaDon); // gọi lại hàm load Hoá đơn để load lại lịch sử mua hàng

            return new KhachHangBUS().getItemById(idKH); // trả về khách hàng được nhấn vào
        } catch (Exception ex) {
            _MessageDialogHelper.showErrorDialog(this,
                    "Vui lòng chọn một dòng trong lịch sử giao dịch!", "Yêu cầu chọn dữ liệu");
            return null;
        }
    }

    private HoaDonDTO tbLichSuGiaoDichMouseListener() {
        try {
            int selectedRow = tbLichSuGiaoDich.getSelectedRow();
            String idHD = String.valueOf(tbLichSuGiaoDich.getValueAt(selectedRow, 0));
            return new HoaDonBUS().getItemBymMaHD(idHD);
        } catch (Exception ex) {
            _MessageDialogHelper.showErrorDialog(this,
                    "Vui lòng chọn một dòng trong lịch sử giao dịch!", "Yêu cầu chọn dữ liệu");
            return null;
        }
    }

    private void loadHoaDon(ArrayList<HoaDonDTO> listHoaDon) {
        modelTable_HD.setRowCount(0);
        tbLichSuGiaoDich.setFont(new Font("Segoe UI", 0, 12));
        tbLichSuGiaoDich.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
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
        tbLichSuGiaoDich.setDefaultEditor(Object.class, null);
        tbLichSuGiaoDich.setModel(modelTable_HD);
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

    private void loadTableKH(ArrayList<KhachHangDTO> listItem) {
        modelTable_KH.setRowCount(0);
        tbDanhSachKhachHang.setFont(new Font("Segoe UI", 0, 12));
        tbDanhSachKhachHang.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        for (KhachHangDTO item : listItem) {
            modelTable_KH.addRow(new Object[]{
                    item.getMaKH(),
                    item.getTenKH(),
                    item.getSdt()
            });
        }
        tbDanhSachKhachHang.setDefaultEditor(Object.class, null);
        tbDanhSachKhachHang.setModel(modelTable_KH);
        tbDanhSachKhachHang.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                tbDanhSachKhachHangMouseListener();
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    private void refreshData() {
        txtMaKhachHang.setText(""); // refresh form mã khách hàng
        txtTenKhachHang.setText(""); // refresh form tên khách hàng
        txtSoDienThoai.setText(""); // refresh form số điện thoại
        tbDanhSachKhachHang.clearSelection(); // refresh selected danh sách khách hàng

        ArrayList<KhachHangDTO> listKH = new KhachHangBUS().getData();
        loadTableKH(listKH); // load lại khách hàng

        ArrayList<HoaDonDTO> listHoaDon = new ArrayList<>();
        loadHoaDon(listHoaDon); // load lại hoá đơn
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXemCTHD;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel lbMaKhachHang;
    private javax.swing.JLabel lbSoDienThoai;
    private javax.swing.JLabel lbTenKhachHang;
    private javax.swing.JPanel pnThongTinKhachHang;
    private javax.swing.JScrollPane spDanhSachKhachHang;
    private javax.swing.JScrollPane spLichSuGiaoDich;
    private javax.swing.JTable tbDanhSachKhachHang;
    private javax.swing.JTable tbLichSuGiaoDich;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenKhachHang;
    // End of variables declaration
}
