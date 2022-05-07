package BUS;


import DAO.ChiTietPhieuNhapDAO;
import DTO.ChiTietPhieuNhapDTO;

import java.util.ArrayList;

public class ChiTietPhieuNhapBUS {
    private ArrayList<ChiTietPhieuNhapDTO> listPhieuNhapMua;

    public ChiTietPhieuNhapBUS() {
        try {
            listPhieuNhapMua = new ChiTietPhieuNhapDAO().getData(); // lấy dữ liệu từ Database thông qua DAO
        } catch (Exception ex) {
            System.out.printf("Đã xảy ra lỗi: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
    }

    // lấy đối tượng thông qua mã hoá đơn
    public ArrayList<ChiTietPhieuNhapDTO> getListItemByMaHD(String maPhieuNhap) {
        ArrayList<ChiTietPhieuNhapDTO> list = new ArrayList<>();
        for (ChiTietPhieuNhapDTO item : listPhieuNhapMua) {
            if (item.getMaPhieuNhap().equals(maPhieuNhap)) {
                list.add(item);
            }
        }
        return list;
    }

    public ArrayList<ChiTietPhieuNhapDTO> getData() {
        // lấy dữ liệu
        return listPhieuNhapMua;
    }

    public void printData() {
        for (ChiTietPhieuNhapDTO chiTietPhieuNhapDTO : listPhieuNhapMua) {
            System.out.println(chiTietPhieuNhapDTO.toString()); // in ra terminal
        }
    }

    public int tinhTonhSLBan(String maPhieuNhap) {
        int soLuong = 0;
        for(ChiTietPhieuNhapDTO item : listPhieuNhapMua) {
            if(item.getMaPhieuNhap().equals(maPhieuNhap)) {
                soLuong += item.getSoLuong();
            }
        }

        return soLuong;
    }

    public float tinhTongThanhTien(String maMH, float thanhTien) {
        float tongTien = 0;
        for(ChiTietPhieuNhapDTO item : listPhieuNhapMua) {
            if(item.getMaPhieuNhap().equals(maMH)) {
                tongTien += thanhTien * item.getSoLuong();
            }
        }
        return tongTien;
    }


    // =================================================================================== //
    // thực hiện hàm insert
    public boolean insertItem(ChiTietPhieuNhapDTO chiTietPhieuNhapDTO) throws Exception {
        if (chiTietPhieuNhapDTO != null) {
            ChiTietPhieuNhapDAO chiTietPhieuNhapDAO = new ChiTietPhieuNhapDAO();
            return  chiTietPhieuNhapDAO.insertItem(chiTietPhieuNhapDTO);
        }
        return false;
    }
}
