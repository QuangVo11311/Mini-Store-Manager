package GUI;

import BUS.*;
import DTO.ChiTietHoaDonDTO;
import DTO.HoaDonDTO;
import DTO.MatHangDTO;

import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Objects;

public class PanelHoaDonGUI extends javax.swing.JPanel {
    private static MainFormGUI parentForm;
    private DefaultTableModel modelTable_HD;
    private DefaultTableModel modelTable_CTHD;

    /**
     * Creates new form PanelHoaDonGUI2
     */
    public PanelHoaDonGUI() {
        initComponents();
        initListHoaDon();
        initListCTHD();
    }

    public void initListHoaDon() {
        String[] columnNames = new String[]{"Mã HD", "Mã NV", "Mã KH", "Mã giảm giá", "Tổng hoá đơn (VNĐ)", "Ngày bán"};
        modelTable_HD = new DefaultTableModel();
        modelTable_HD.setColumnIdentifiers(columnNames);

        tbDanhSachHoaDon.setFont(new Font("Segoe UI", 0, 12));
        tbDanhSachHoaDon.setModel(modelTable_HD);
        loadHoaDon(new HoaDonBUS().getData()); // gọi lại hàm load table nhân viên để load lại table
        tbDanhSachHoaDon.setDefaultEditor(Object.class, null);
        tbDanhSachHoaDon.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                tbDanhSachHoaDonMouseListener();
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public void initListCTHD() {
        String[] columnNames = new String[]{"Mã SP", "Tên SP", "Số lượng", "Thành tiền (VNĐ)"};
        modelTable_CTHD = new DefaultTableModel();
        modelTable_CTHD.setColumnIdentifiers(columnNames);

        tbChiTietHoaDon.setFont(new Font("Segoe UI", 0, 12));
        tbChiTietHoaDon.setModel(modelTable_CTHD);
        tbChiTietHoaDon.setDefaultEditor(Object.class, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
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
        btnTimKiemHD = new javax.swing.JButton();
        btnInHoaDon = new javax.swing.JButton();
        btnTimKiemNVBan = new javax.swing.JButton();
        btnTimKiemKHMua = new javax.swing.JButton();
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

        txtMaHoaDon.setEditable(false);
        txtMaHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtMaGiamGia.setEditable(false);
        txtMaGiamGia.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtTenNhanVien.setEditable(false);
        txtTenNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtTenKhachHang.setEditable(false);
        txtTenKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtNgayBan.setEditable(false);
        txtNgayBan.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

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
        btnTimKiemHD.setToolTipText("Tìm kiếm hoá đơn thông qua mã hoá đơn.");
        btnTimKiemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemHDActionPerformed(evt);
            }
        });

        btnInHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnInHoaDon.setText("In hoá đơn");
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        btnTimKiemNVBan.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTimKiemNVBan.setText("Tìm kiếm NV bán");
        btnTimKiemNVBan.setToolTipText("Tìm kiếm hoá đơn thông qua mã hoá đơn.");
        btnTimKiemNVBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemNVBanActionPerformed(evt);
            }
        });

        btnTimKiemKHMua.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTimKiemKHMua.setText("Tìm kiếm KH mua");
        btnTimKiemKHMua.setToolTipText("Tìm kiếm hoá đơn thông qua mã hoá đơn.");
        btnTimKiemKHMua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemKHMuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnThongTinHoaDonLayout = new javax.swing.GroupLayout(pnThongTinHoaDon);
        pnThongTinHoaDon.setLayout(pnThongTinHoaDonLayout);
        pnThongTinHoaDonLayout.setHorizontalGroup(
                pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnThongTinHoaDonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbTenNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addComponent(lbMaGiamGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbMaHoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbNgayBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbTenKhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtMaGiamGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                        .addComponent(txtTenKhachHang, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTenNhanVien, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNgayBan, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMaHoaDon))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btnTimKiemHD, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                                .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnInHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(btnTimKiemKHMua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                        .addComponent(btnTimKiemNVBan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                        .addComponent(lbMaGiamGia)
                                        .addComponent(btnTimKiemNVBan))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbTenNhanVien)
                                        .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTimKiemKHMua))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbTenKhachHang)
                                        .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTimKiemHD))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnThongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbNgayBan)
                                        .addComponent(txtNgayBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnLamMoi))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spDanhSachHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hoá đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
        spDanhSachHoaDon.setViewportView(tbDanhSachHoaDon);

        spChiTietHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết hoá đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
        spChiTietHoaDon.setViewportView(tbChiTietHoaDon);

        pnThanhToan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thanh toán", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N

        lbTongHoaDonBanDau.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTongHoaDonBanDau.setText("Tổng hoá đơn ban đầu");

        lbChietKhau.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbChietKhau.setText("Chiết khấu:");

        lbTongTienHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbTongTienHoaDon.setText("Tổng tiền hoá đơn:");

        txtTongHoaDonBanDau.setEditable(false);
        txtTongHoaDonBanDau.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtChietKhau.setEditable(false);
        txtChietKhau.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtTongTienHoaDon.setEditable(false);
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pnThongTinHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spDanhSachHoaDon))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(spChiTietHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
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
    }// </editor-fold>

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {
        txtMaHoaDon.setText("");
        txtMaGiamGia.setText("");
        txtTenKhachHang.setText("");
        txtTenNhanVien.setText("");
        txtNgayBan.setText("");
        txtTongHoaDonBanDau.setText("");
        txtChietKhau.setText("");
        txtTongTienHoaDon.setText("");

        loadHoaDon(new HoaDonBUS().getData());
        loadChiTietHoaDon(new ArrayList<>());
    }

    private void btnTimKiemHDActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnTimKiemKHMuaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnTimKiemNVBanActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    //===================================================================================================//
    private void tbDanhSachHoaDonMouseListener() {
        int selectedRow = tbDanhSachHoaDon.getSelectedRow();
        String idHD = String.valueOf(tbDanhSachHoaDon.getValueAt(selectedRow, 0));
        HoaDonDTO hoaDonDTO= new HoaDonBUS().getItemBymMaHD(idHD);

        if(hoaDonDTO != null) {
            ArrayList<ChiTietHoaDonDTO> listCTHD = new ChiTietHoaDonBUS().getListItemByMaHD(hoaDonDTO.getMaHD());

            loadForm(hoaDonDTO); // load thông tin lên field
            loadChiTietHoaDon(listCTHD); // load chi tiết hoá đơn lên filed
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

    private void loadChiTietHoaDon(ArrayList<ChiTietHoaDonDTO> listCTHD){
        if(listCTHD != null) {
            modelTable_CTHD.setRowCount(0);
            for (MatHangDTO item : handleLoadCTHD(listCTHD)) {
                modelTable_CTHD.addRow(new Object[]{
                        item.getMaMH(),
                        item.getTenMH(),
                        item.soLuong_hientai,
                        item.thanhTien_hientai,
                });
            }
            resetValueMatHangDTO();
        }
    }

    private void loadForm(HoaDonDTO hoaDonDTO) {
        txtMaHoaDon.setText(hoaDonDTO.getMaHD());
        txtMaGiamGia.setText(hoaDonDTO.getMaGiamGia());
        txtTenKhachHang.setText(new KhachHangBUS().getItemById(hoaDonDTO.getMaKH()).getTenKH());
        txtTenNhanVien.setText(new NhanVienBUS().getItemByID(hoaDonDTO.getMaNV()).getTenNV());
        txtNgayBan.setText(hoaDonDTO.getNgayBan());

        // tính toán tiền
        float tileGiam = (float) new PhieuGiamGiaBUS().getItemById(hoaDonDTO.getMaGiamGia()).getTiLeGiam();
        float tongTienBanDau = tinhTongTienBanDau(hoaDonDTO.getTongHoaDon(), tileGiam);
        float ChietKhau = tongTienBanDau - hoaDonDTO.getTongHoaDon();

        txtTongHoaDonBanDau.setText(String.format("%.2f VNĐ", tongTienBanDau));
        txtChietKhau.setText(String.format("%.2f VNĐ", ChietKhau));
        txtTongTienHoaDon.setText(String.format("%.2f VNĐ", hoaDonDTO.getTongHoaDon()));
    }

    private float tinhTongTienBanDau(float thanhTien, float tileGiam) {
        return thanhTien/(1-tileGiam);
    }

    // hàm load lại giỏ hàng của hoá đơn đã mua
    public ArrayList<MatHangDTO> handleLoadCTHD(ArrayList<ChiTietHoaDonDTO> listCTHD) {
        ArrayList<MatHangDTO> gioHang = new ArrayList<>();
        for (ChiTietHoaDonDTO item : listCTHD) {
            MatHangDTO matHangDTO = new MatHangDTO();
            matHangDTO.setMaMH(item.getMaMH());
            matHangDTO.setTenMH(Objects.requireNonNull(MatHangBUS.getItemByID(item.getMaMH())).getTenMH());
            matHangDTO.soLuong_hientai = handleSoLuongHienTai(item);
            matHangDTO.thanhTien_hientai = handleThanhTienHienTai(item);
            gioHang.add(matHangDTO);
        }
        return gioHang;
    }

    // trả vêf số lượng mặt hàng đã mua của mặt hàng đó
    private int handleSoLuongHienTai(ChiTietHoaDonDTO item) {
        return item.getSoLuong();
    }

    // xử lí thành tiền hiện tại của hoá đơn đã mua * số lượng
    private float handleThanhTienHienTai(ChiTietHoaDonDTO item) {
        MatHangDTO matHangDTO = MatHangBUS.getItemByID(item.getMaMH());
        if (matHangDTO != null) {
            return handleSoLuongHienTai(item) * matHangDTO.getThanhTien();
        }
        return 0;
    }

    // reset lại số lượng và thành tiền của từng mặt hàng
    private void resetValueMatHangDTO() {
        ArrayList<MatHangDTO> listMatHang = new MatHangBUS().getData();
        for (MatHangDTO item : listMatHang) {
            item.soLuong_hientai = 0;
            item.thanhTien_hientai = 0;
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnInHoaDon;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnTimKiemHD;
    private javax.swing.JButton btnTimKiemKHMua;
    private javax.swing.JButton btnTimKiemNVBan;
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
    // End of variables declaration
}
