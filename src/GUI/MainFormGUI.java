package GUI;

import BUS.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URI;

public class MainFormGUI extends javax.swing.JFrame {
    private PanelBanHangGUI banHangGUI;

    public MainFormGUI() {
        initComponents();
        initForm();
    }

    public void initForm() {
        // Bán hàng form
        banHangGUI = new PanelBanHangGUI();
        String pathBanHang = "resource\\icon\\icons8_bill_16px.png";
        tPane_Main.addTab("Quản lí bán hàng", new ImageIcon(pathBanHang), banHangGUI, "Quản lí bán hàng");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        plToolBar = new javax.swing.JPanel();
        tBar_Main = new javax.swing.JToolBar();
        tBar_Logout = new javax.swing.JButton();
        tBar_Separator1 = new javax.swing.JToolBar.Separator();
        tBar_BanHang = new javax.swing.JButton();
        tBar_HoaDon = new javax.swing.JButton();
        tBar_NhanVien = new javax.swing.JButton();
        tBar_KhachHang = new javax.swing.JButton();
        tBar_MatHang = new javax.swing.JButton();
        tBar_PhieuNhap = new javax.swing.JButton();
        tBar_Separator2 = new javax.swing.JToolBar.Separator();
        tBar_Intro = new javax.swing.JButton();
        tBar_Contact = new javax.swing.JButton();
        tPane_Main = new javax.swing.JTabbedPane();
        mnuBar_Main = new javax.swing.JMenuBar();
        mnuSystem = new javax.swing.JMenu();
        mnuSystem_Logout = new javax.swing.JMenuItem();
        mnuSystem_Separator = new javax.swing.JPopupMenu.Separator();
        mnuSystem_Exit = new javax.swing.JMenuItem();
        mnuManage = new javax.swing.JMenu();
        mnuManage_BanHang = new javax.swing.JMenuItem();
        mnuManage_HoaDon = new javax.swing.JMenuItem();
        mnuManage_NhanVien = new javax.swing.JMenuItem();
        mnuManage_MatHang = new javax.swing.JMenuItem();
        mnuManage_KhachHang = new javax.swing.JMenuItem();
        mnuManage_PhieuNhap = new javax.swing.JMenuItem();
        mnuHelper = new javax.swing.JMenu();
        mnuHelper_Intro = new javax.swing.JMenuItem();
        mnuHelper_Separator = new javax.swing.JPopupMenu.Separator();
        mnuHelper_Contact = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm quản lí sinh viên v1.2");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tBar_Main.setFloatable(false);

        plToolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tBar_Logout.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tBar_Logout.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8_Logout_32px_1.png")); // NOI18N
        tBar_Logout.setText("Đăng xuất");
        tBar_Logout.setFocusable(false);
        tBar_Logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tBar_Logout.setMaximumSize(new java.awt.Dimension(75, 60));
        tBar_Logout.setMinimumSize(new java.awt.Dimension(75, 60));
        tBar_Logout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tBar_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBar_LogoutActionPerformed(evt);
            }
        });
        tBar_Main.add(tBar_Logout);
        tBar_Main.add(tBar_Separator1);

        tBar_BanHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tBar_BanHang.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8_bill_32px.png")); // NOI18N
        tBar_BanHang.setText("Bán Hàng");
        tBar_BanHang.setFocusable(false);
        tBar_BanHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tBar_BanHang.setMaximumSize(new java.awt.Dimension(75, 60));
        tBar_BanHang.setMinimumSize(new java.awt.Dimension(75, 60));
        tBar_BanHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tBar_BanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBar_BanHangActionPerformed(evt);
            }
        });
        tBar_Main.add(tBar_BanHang);

        tBar_HoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tBar_HoaDon.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8_bill_32px_1.png")); // NOI18N
        tBar_HoaDon.setText("Hoá đơn");
        tBar_HoaDon.setFocusable(false);
        tBar_HoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tBar_HoaDon.setMaximumSize(new java.awt.Dimension(75, 60));
        tBar_HoaDon.setMinimumSize(new java.awt.Dimension(75, 60));
        tBar_HoaDon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tBar_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBar_HoaDonActionPerformed(evt);
            }
        });
        tBar_Main.add(tBar_HoaDon);

        tBar_NhanVien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tBar_NhanVien.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8-staff-32.png")); // NOI18N
        tBar_NhanVien.setText("Nhân viên");
        tBar_NhanVien.setFocusable(false);
        tBar_NhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tBar_NhanVien.setMaximumSize(new java.awt.Dimension(75, 60));
        tBar_NhanVien.setMinimumSize(new java.awt.Dimension(75, 60));
        tBar_NhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tBar_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBar_NhanVienActionPerformed(evt);
            }
        });
        tBar_Main.add(tBar_NhanVien);

        tBar_KhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tBar_KhachHang.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8-customer-32.png")); // NOI18N
        tBar_KhachHang.setText("Khách hàng");
        tBar_KhachHang.setFocusable(false);
        tBar_KhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tBar_KhachHang.setMaximumSize(new java.awt.Dimension(75, 60));
        tBar_KhachHang.setMinimumSize(new java.awt.Dimension(75, 60));
        tBar_KhachHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tBar_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBar_KhachHangActionPerformed(evt);
            }
        });
        tBar_Main.add(tBar_KhachHang);

        tBar_MatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tBar_MatHang.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8-goods-32.png")); // NOI18N
        tBar_MatHang.setText("Mặt hàng");
        tBar_MatHang.setFocusable(false);
        tBar_MatHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tBar_MatHang.setMaximumSize(new java.awt.Dimension(75, 60));
        tBar_MatHang.setMinimumSize(new java.awt.Dimension(75, 60));
        tBar_MatHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tBar_MatHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBar_MatHangActionPerformed(evt);
            }
        });
        tBar_Main.add(tBar_MatHang);

        tBar_PhieuNhap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tBar_PhieuNhap.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8-paid-bill-32 (1).png")); // NOI18N
        tBar_PhieuNhap.setText("Phiếu nhập");
        tBar_PhieuNhap.setFocusable(false);
        tBar_PhieuNhap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tBar_PhieuNhap.setMaximumSize(new java.awt.Dimension(75, 60));
        tBar_PhieuNhap.setMinimumSize(new java.awt.Dimension(75, 60));
        tBar_PhieuNhap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tBar_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBar_PhieuNhapActionPerformed(evt);
            }
        });
        tBar_Main.add(tBar_PhieuNhap);
        tBar_Main.add(tBar_Separator2);

        tBar_Intro.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tBar_Intro.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8-mention-32.png")); // NOI18N
        tBar_Intro.setText("GIới thiệu");
        tBar_Intro.setFocusable(false);
        tBar_Intro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tBar_Intro.setMaximumSize(new java.awt.Dimension(75, 60));
        tBar_Intro.setMinimumSize(new java.awt.Dimension(75, 60));
        tBar_Intro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tBar_Intro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBar_IntroActionPerformed(evt);
            }
        });
        tBar_Main.add(tBar_Intro);

        tBar_Contact.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tBar_Contact.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8-contact-32.png")); // NOI18N
        tBar_Contact.setText("Liên hệ");
        tBar_Contact.setFocusable(false);
        tBar_Contact.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tBar_Contact.setMaximumSize(new java.awt.Dimension(75, 60));
        tBar_Contact.setMinimumSize(new java.awt.Dimension(75, 60));
        tBar_Contact.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tBar_Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBar_ContactActionPerformed(evt);
            }
        });
        tBar_Main.add(tBar_Contact);

        javax.swing.GroupLayout plToolBarLayout = new javax.swing.GroupLayout(plToolBar);
        plToolBar.setLayout(plToolBarLayout);
        plToolBarLayout.setHorizontalGroup(
                plToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(plToolBarLayout.createSequentialGroup()
                                .addComponent(tBar_Main, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
                                .addContainerGap())
        );
        plToolBarLayout.setVerticalGroup(
                plToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tBar_Main, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        mnuSystem.setText("Hệ thống");

        mnuSystem_Logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuSystem_Logout.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        mnuSystem_Logout.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8_Logout_16px.png")); // NOI18N
        mnuSystem_Logout.setText("Đăng xuất");
        mnuSystem_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSystem_LogoutActionPerformed(evt);
            }
        });
        mnuSystem.add(mnuSystem_Logout);
        mnuSystem.add(mnuSystem_Separator);

        mnuSystem_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuSystem_Exit.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        mnuSystem_Exit.setIcon(new javax.swing.ImageIcon("resource\\icon\\Actions-edit-delete-icon-16.png")); // NOI18N
        mnuSystem_Exit.setText("Thoát");
        mnuSystem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSystem_ExitActionPerformed(evt);
            }
        });
        mnuSystem.add(mnuSystem_Exit);

        mnuBar_Main.add(mnuSystem);

        mnuManage.setText("Quản lí");

        mnuManage_BanHang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuManage_BanHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        mnuManage_BanHang.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8_bill_16px.png")); // NOI18N
        mnuManage_BanHang.setText("Quản lý bán hàng");
        mnuManage_BanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManage_BanHangActionPerformed(evt);
            }
        });
        mnuManage.add(mnuManage_BanHang);

        mnuManage_HoaDon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuManage_HoaDon.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        mnuManage_HoaDon.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8_bill_16px_1.png")); // NOI18N
        mnuManage_HoaDon.setText("Quản lý hoá đơn");
        mnuManage_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManage_HoaDonActionPerformed(evt);
            }
        });
        mnuManage.add(mnuManage_HoaDon);

        mnuManage_NhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuManage_NhanVien.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        mnuManage_NhanVien.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8-staff-16.png")); // NOI18N
        mnuManage_NhanVien.setText("Quản lý nhân viên");
        mnuManage_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManage_NhanVienActionPerformed(evt);
            }
        });
        mnuManage.add(mnuManage_NhanVien);

        mnuManage_MatHang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuManage_MatHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        mnuManage_MatHang.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8-goods-16.png")); // NOI18N
        mnuManage_MatHang.setText("Quản lý mặt hàng");
        mnuManage_MatHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManage_MatHangActionPerformed(evt);
            }
        });
        mnuManage.add(mnuManage_MatHang);

        mnuManage_KhachHang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuManage_KhachHang.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        mnuManage_KhachHang.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8-customer-16.png")); // NOI18N
        mnuManage_KhachHang.setText("Quản lý khách hàng");
        mnuManage_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManage_KhachHangActionPerformed(evt);
            }
        });
        mnuManage.add(mnuManage_KhachHang);

        mnuManage_PhieuNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuManage_PhieuNhap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        mnuManage_PhieuNhap.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8-paid-bill-16 (1).png")); // NOI18N
        mnuManage_PhieuNhap.setText("Quản lý phiếu nhập");
        mnuManage_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManage_PhieuNhapActionPerformed(evt);
            }
        });
        mnuManage.add(mnuManage_PhieuNhap);

        mnuBar_Main.add(mnuManage);

        mnuHelper.setText("Trợ giúp");

        mnuHelper_Intro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuHelper_Intro.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        mnuHelper_Intro.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8_mention_16px.png")); // NOI18N
        mnuHelper_Intro.setText("Giới thiệu");
        mnuHelper_Intro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHelper_IntroActionPerformed(evt);
            }
        });
        mnuHelper.add(mnuHelper_Intro);
        mnuHelper.add(mnuHelper_Separator);

        mnuHelper_Contact.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuHelper_Contact.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        mnuHelper_Contact.setIcon(new javax.swing.ImageIcon("resource\\icon\\icons8_contact_16px.png")); // NOI18N
        mnuHelper_Contact.setText("Liên hệ");
        mnuHelper_Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHelper_ContactActionPerformed(evt);
            }
        });
        mnuHelper.add(mnuHelper_Contact);

        mnuBar_Main.add(mnuHelper);

        setJMenuBar(mnuBar_Main);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(plToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tPane_Main)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(plToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tPane_Main, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    // mnu
    private void mnuSystem_ExitActionPerformed(java.awt.event.ActionEvent evt) {
        if (_MessageDialogHelper.showConfirmDialog(this, "Bạn có muốn thoát khỏi chương trình hay không",
                "Thoát chương trình") == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void mnuSystem_LogoutActionPerformed(java.awt.event.ActionEvent evt) {
        if (_MessageDialogHelper.showConfirmDialog(this, "Bạn có muốn đăng xuất hay không",
                "Đăng xuất") == JOptionPane.YES_OPTION) {
            this.dispose(); // đóng form hiện tại lại
            new DialogLoginGUI(new Frame(), true).setVisible(true);
        }
    }

    private void mnuHelper_ContactActionPerformed(java.awt.event.ActionEvent evt) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(URI.create("https://github.com/EdgarIgnite16/Mini-Store-Manager"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void mnuHelper_IntroActionPerformed(java.awt.event.ActionEvent evt) {
        DialogAboutUSGUI aboutUSDialogGUI = new DialogAboutUSGUI(this, true);
        aboutUSDialogGUI.setVisible(true);
    }

    private void mnuManage_BanHangActionPerformed(ActionEvent evt) {
        tPane_Main.setSelectedComponent(banHangGUI);
    }

    private void mnuManage_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void mnuManage_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void mnuManage_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void mnuManage_MatHangActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void mnuManage_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // tbar
    private void tBar_LogoutActionPerformed(java.awt.event.ActionEvent evt) {
        if (_MessageDialogHelper.showConfirmDialog(this, "Bạn có muốn đăng xuất hay không",
                "Đăng xuất") == JOptionPane.YES_OPTION) {
            this.dispose(); // đóng form hiện tại lại
            new DialogLoginGUI(new Frame(), true).setVisible(true);
        }
    }

    private void tBar_IntroActionPerformed(java.awt.event.ActionEvent evt) {
        DialogAboutUSGUI aboutUSDialogGUI = new DialogAboutUSGUI(this, true);
        aboutUSDialogGUI.setVisible(true);
    }

    private void tBar_ContactActionPerformed(java.awt.event.ActionEvent evt) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(URI.create("https://github.com/EdgarIgnite16/Mini-Store-Manager"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void tBar_BanHangActionPerformed(ActionEvent evt) {
        tPane_Main.setSelectedComponent(banHangGUI);
    }

    private void tBar_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void tBar_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {
        CaLamViecBUS caLamViecBUS = new CaLamViecBUS();
        ChucVuBUS chucVuBUS = new ChucVuBUS();
        LoaiMatHangBUS loaiMatHangBUS = new LoaiMatHangBUS();
        NhaCungCapBUS nhaCungCapBUS = new NhaCungCapBUS();
        PhieuGiamGiaBUS phieuGiamGiaBUS = new PhieuGiamGiaBUS();

        caLamViecBUS.printData();
        chucVuBUS.printData();
        loaiMatHangBUS.printData();
        nhaCungCapBUS.printData();
        phieuGiamGiaBUS.printData();
    }

    private void tBar_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void tBar_MatHangActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void tBar_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify
    private javax.swing.JMenuBar mnuBar_Main;
    private javax.swing.JMenu mnuHelper;
    private javax.swing.JMenuItem mnuHelper_Contact;
    private javax.swing.JMenuItem mnuHelper_Intro;
    private javax.swing.JPopupMenu.Separator mnuHelper_Separator;
    private javax.swing.JMenu mnuManage;
    private javax.swing.JMenuItem mnuManage_BanHang;
    private javax.swing.JMenuItem mnuManage_HoaDon;
    private javax.swing.JMenuItem mnuManage_KhachHang;
    private javax.swing.JMenuItem mnuManage_MatHang;
    private javax.swing.JMenuItem mnuManage_NhanVien;
    private javax.swing.JMenuItem mnuManage_PhieuNhap;
    private javax.swing.JMenu mnuSystem;
    private javax.swing.JMenuItem mnuSystem_Exit;
    private javax.swing.JMenuItem mnuSystem_Logout;
    private javax.swing.JPopupMenu.Separator mnuSystem_Separator;
    private javax.swing.JPanel plToolBar;
    private javax.swing.JButton tBar_BanHang;
    private javax.swing.JButton tBar_Contact;
    private javax.swing.JButton tBar_HoaDon;
    private javax.swing.JButton tBar_Intro;
    private javax.swing.JButton tBar_KhachHang;
    private javax.swing.JButton tBar_Logout;
    private javax.swing.JToolBar tBar_Main;
    private javax.swing.JButton tBar_MatHang;
    private javax.swing.JButton tBar_NhanVien;
    private javax.swing.JButton tBar_PhieuNhap;
    private javax.swing.JToolBar.Separator tBar_Separator1;
    private javax.swing.JToolBar.Separator tBar_Separator2;
    private javax.swing.JTabbedPane tPane_Main;
    // End of variables declaration
}
