CREATE DATABASE [MiniStore]
GO

USE [MiniStore]
GO
/****** Object:  Table [dbo].[CaLamViec]    Script Date: 25/04/2022 10:17:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CaLamViec](
	[maCa] [nchar](50) NOT NULL,
	[tenCa] [nvarchar](50) NOT NULL,
	[thoiGian] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_CaLamViec] PRIMARY KEY CLUSTERED 
(
	[maCa] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChucVu]    Script Date: 25/04/2022 10:17:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChucVu](
	[maCV] [nchar](50) NOT NULL,
	[tenCV] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_ChucVu] PRIMARY KEY CLUSTERED 
(
	[maCV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CTHD]    Script Date: 25/04/2022 10:17:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTHD](
	[maHD] [nchar](50) NOT NULL,
	[maMH] [nchar](50) NOT NULL,
	[soLuong] [int] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CTPN]    Script Date: 25/04/2022 10:17:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTPN](
	[maPhieuNhap] [nchar](50) NOT NULL,
	[maMH] [nchar](50) NOT NULL,
	[soLuong] [int] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 25/04/2022 10:17:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[maHD] [nchar](50) NOT NULL,
	[maNV] [nchar](50) NOT NULL,
	[maKH] [nchar](50) NOT NULL,
	[maGiamGia] [nchar](50) NOT NULL,
	[tongHoaDon] [float] NOT NULL,
	[ngayBan] [datetime] NOT NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[maHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 25/04/2022 10:17:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[maKH] [nchar](50) NOT NULL,
	[tenKH] [nvarchar](50) NOT NULL,
	[SDT] [nchar](30) NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[maKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiMatHang]    Script Date: 25/04/2022 10:17:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiMatHang](
	[maLMH] [nchar](50) NOT NULL,
	[tenLMH] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_LoaiMatHang] PRIMARY KEY CLUSTERED 
(
	[maLMH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MatHang]    Script Date: 25/04/2022 10:17:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MatHang](
	[maMH] [nchar](50) NOT NULL,
	[maLMH] [nchar](50) NOT NULL,
	[tenMatHang] [nvarchar](50) NOT NULL,
	[thanhTien] [float] NOT NULL,
	[soLuong] [int] NOT NULL,
 CONSTRAINT [PK_MatHang] PRIMARY KEY CLUSTERED 
(
	[maMH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 25/04/2022 10:17:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[maNCC] [nchar](50) NOT NULL,
	[tenNCC] [nchar](50) NOT NULL,
	[SDT] [nchar](30) NOT NULL,
 CONSTRAINT [PK_NhaCungCap] PRIMARY KEY CLUSTERED 
(
	[maNCC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 25/04/2022 10:17:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[maNV] [nchar](50) NOT NULL,
	[maCV] [nchar](50) NOT NULL,
	[maCa] [nchar](50) NOT NULL,
	[tenNV] [nvarchar](50) NOT NULL,
	[cmnd] [nvarchar](50) NOT NULL,
	[sdt] [nvarchar](50) NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[maNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuGiamGia]    Script Date: 25/04/2022 10:17:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuGiamGia](
	[maGiamGia] [nchar](50) NOT NULL,
	[tenGiamGia] [nvarchar](50) NOT NULL,
	[noiDung] [nvarchar](50) NOT NULL,
	[tileGiam] [float] NOT NULL,
 CONSTRAINT [PK_PhieuGiamGia] PRIMARY KEY CLUSTERED 
(
	[maGiamGia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuNhapHang]    Script Date: 25/04/2022 10:17:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuNhapHang](
	[maPhieuNhap] [nchar](50) NOT NULL,
	[maNCC] [nchar](50) NOT NULL,
	[ngayNhap] [date] NOT NULL,
 CONSTRAINT [PK_PhieuNhap] PRIMARY KEY CLUSTERED 
(
	[maPhieuNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[CaLamViec] ([maCa], [tenCa], [thoiGian]) VALUES (N'FU1', N'Full Sáng', N'6:00-14:00')
INSERT [dbo].[CaLamViec] ([maCa], [tenCa], [thoiGian]) VALUES (N'FU2', N'Full Chiều', N'14:00-22:00')
INSERT [dbo].[CaLamViec] ([maCa], [tenCa], [thoiGian]) VALUES (N'PA1', N'Parttime Sáng', N'8:00-14:00')
INSERT [dbo].[CaLamViec] ([maCa], [tenCa], [thoiGian]) VALUES (N'PA2', N'Partime Chiều', N'16:00-22:00')
GO
INSERT [dbo].[ChucVu] ([maCV], [tenCV]) VALUES (N'BV', N'Bảo vệ')
INSERT [dbo].[ChucVu] ([maCV], [tenCV]) VALUES (N'NV', N'Nhân viên')
INSERT [dbo].[ChucVu] ([maCV], [tenCV]) VALUES (N'QL', N'Quản lý')
GO
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH001', N'Lê Như Tâm', N'0937698412')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH002', N'Huỳnh Đức Hoa', N'0849494948')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH003', N'Trần Tuấn', N'0896156165')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH004', N'Trần Vũ Luân', N'0986256262')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH005', N'James Mark', N'0933444567')
GO
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'CAN', N'Thực phẩm đóng hộp')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'DRINK', N'Nước giải khát')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'DRYFOOD', N'Thực phẩm khô')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'FRUIT', N'Trái cây')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'HOUSEHOLD', N'Đồ gia dụng')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'MILK', N'Sữa')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'SNACK', N'Đồ ăn vặt')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'STUDIES', N'Văn phòng phẩm')
GO
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'CAN01', N'CAN', N'Thịt hộp sốt cà', 25000, 20)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'CAN02', N'CAN', N'Thịt hộp bò hầm', 25000, 20)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI01', N'DRINK', N'Pepsi', 10000, 500)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI02', N'DRINK', N'CocaCola', 10000, 500)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'HOH01', N'HOUSEHOLD', N'CloseUp lửa băng', 12000, 20)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'MIL01', N'MILK', N'Vinamilk', 6000, 96)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'MIL02', N'MILK', N'TH True Milk', 10000, 96)
GO
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'AGGA', N'AGONGA', N'0453245312')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'DA', N'Đông Á', N'0909090909')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'KON', N'Konosuba', N'0342354252')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'SEGGG', N'SHIELDHERO', N'0969696969                    ')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'VLEG', N'VietLEO', N'0931244325')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'VNG', N'Đông Lào', N'0975624372')
GO
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [cmnd], [sdt]) VALUES (N'NV01', N'QL', N'FU2', N'Trần Nguyên Lộc', N'07916596997', N'0936446546')
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [cmnd], [sdt]) VALUES (N'NV02', N'NV', N'FU1', N'Võ Đăng Quang', N'07964156165', N'0934464886')
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [cmnd], [sdt]) VALUES (N'NV03', N'NV', N'FU2', N'Nguyễn Văn Tấn Quân', N'07925516133', N'0946131122')
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [cmnd], [sdt]) VALUES (N'NV04', N'NV', N'PA1', N'Nguyễn Thanh Thảo', N'07921113216', N'0996562332')
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [cmnd], [sdt]) VALUES (N'NV05', N'BV', N'FU1', N'Nguyễn Văn Công', N'07962256262', N'0944566632')
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [cmnd], [sdt]) VALUES (N'NV06', N'BV', N'FU2', N'Đặng Văn Mến', N'07923151561', N'0836564921')
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [cmnd], [sdt]) VALUES (N'NV7', N'NV', N'PA2', N'Lê Minh Thư', N'07961556332', N'0834568326')
GO
INSERT [dbo].[PhieuGiamGia] ([maGiamGia], [tenGiamGia], [noiDung], [tileGiam]) VALUES (N'BIG10P', N'Giảm 10%', N'Giảm 10% trên tổng hoá đơn', 0.1)
INSERT [dbo].[PhieuGiamGia] ([maGiamGia], [tenGiamGia], [noiDung], [tileGiam]) VALUES (N'BIG15P', N'Giảm 15%', N'Giảm 15% trên tổng hoá đơn', 0.15)
INSERT [dbo].[PhieuGiamGia] ([maGiamGia], [tenGiamGia], [noiDung], [tileGiam]) VALUES (N'SHOCK20P', N'Giảm 20%', N'Giảm 20% trên tổng hoá đơn', 0.2)
INSERT [dbo].[PhieuGiamGia] ([maGiamGia], [tenGiamGia], [noiDung], [tileGiam]) VALUES (N'SHOCK5P', N'Giảm 5%', N'Giảm 5% trên tổng hoá đơn', 0.05)
GO
ALTER TABLE [dbo].[CTHD]  WITH CHECK ADD  CONSTRAINT [FK_CTHD_HoaDon] FOREIGN KEY([maHD])
REFERENCES [dbo].[HoaDon] ([maHD])
GO
ALTER TABLE [dbo].[CTHD] CHECK CONSTRAINT [FK_CTHD_HoaDon]
GO
ALTER TABLE [dbo].[CTHD]  WITH CHECK ADD  CONSTRAINT [FK_CTHD_MatHang] FOREIGN KEY([maMH])
REFERENCES [dbo].[MatHang] ([maMH])
GO
ALTER TABLE [dbo].[CTHD] CHECK CONSTRAINT [FK_CTHD_MatHang]
GO
ALTER TABLE [dbo].[CTPN]  WITH CHECK ADD  CONSTRAINT [FK_CTPN_MatHang] FOREIGN KEY([maMH])
REFERENCES [dbo].[MatHang] ([maMH])
GO
ALTER TABLE [dbo].[CTPN] CHECK CONSTRAINT [FK_CTPN_MatHang]
GO
ALTER TABLE [dbo].[CTPN]  WITH CHECK ADD  CONSTRAINT [FK_CTPN_PhieuNhapHang] FOREIGN KEY([maPhieuNhap])
REFERENCES [dbo].[PhieuNhapHang] ([maPhieuNhap])
GO
ALTER TABLE [dbo].[CTPN] CHECK CONSTRAINT [FK_CTPN_PhieuNhapHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([maKH])
REFERENCES [dbo].[KhachHang] ([maKH])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_PhieuGiamGia] FOREIGN KEY([maGiamGia])
REFERENCES [dbo].[PhieuGiamGia] ([maGiamGia])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_PhieuGiamGia]
GO
ALTER TABLE [dbo].[MatHang]  WITH CHECK ADD  CONSTRAINT [FK_MatHang_LoaiMatHang] FOREIGN KEY([maLMH])
REFERENCES [dbo].[LoaiMatHang] ([maLMH])
GO
ALTER TABLE [dbo].[MatHang] CHECK CONSTRAINT [FK_MatHang_LoaiMatHang]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_CaLamViec] FOREIGN KEY([maCa])
REFERENCES [dbo].[CaLamViec] ([maCa])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_CaLamViec]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_ChucVu] FOREIGN KEY([maCV])
REFERENCES [dbo].[ChucVu] ([maCV])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_ChucVu]
GO
ALTER TABLE [dbo].[PhieuNhapHang]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhapHang_NhaCungCap] FOREIGN KEY([maNCC])
REFERENCES [dbo].[NhaCungCap] ([maNCC])
GO
ALTER TABLE [dbo].[PhieuNhapHang] CHECK CONSTRAINT [FK_PhieuNhapHang_NhaCungCap]
GO
