#Tạo database
drop database if exists QLYTHUVIEN;
create database QLYTHUVIEN;
use QLYTHUVIEN;
#Tạo các bảng theo yêu cầu
drop table if exists SACH;
create table SACH(
	masach int not null primary key auto_increment,
    ten varchar(300),
    tacgia varchar(300),
    nxb varchar(300),
    soluong int
);
drop table if exists DOCGIA;
create table DOCGIA(
	sothe int not null primary key auto_increment,
    ten varchar(300) not null,
    khoa varchar(300),
    khoahoc varchar(300),
    thoihanthe date
);
drop table if exists PHIEUMUON;
create table PHIEUMUON(
	masach int not null auto_increment,
    sothe int not null,
    ngaymuon date,
    ngaytra date,
    ghichu varchar(500),
    constraint primary key (masach, sothe),
    foreign key (masach) references SACH(masach),
    foreign key (sothe) references DOCGIA(sothe)
);
# Nhập dữ liệu cho từng bảng
insert into SACH(ten, tacgia, nxb, soluong) values ("Chi Dau", "Ngo Tat To", "MXB Giao duc", 20);
insert into SACH(ten, tacgia, nxb, soluong) values ("Lao Hac", "Nam Cao", "MXB Giao duc", 30);
insert into SACH(ten, tacgia, nxb, soluong) values ("Dong Chi", "Chinh Huu", "MXB Giao duc", 20);
insert into SACH(ten, tacgia, nxb, soluong) values ("Dac Nhan Tam", "Dale Carnegie", "MXB Tuoi tre", 40);
insert into SACH(ten, tacgia, nxb, soluong) values ("Toan 10", "Nguyen Minh Tri", "MXB Giao duc", 20);

insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values("Tran Thuy Huong", "AT14", "AT", '2018-01-20');
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values("Tran Viet Tu", "AT15", "AT", '2018-01-20');
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values("Tran Nguyet Chi", "CT2A", "CT", '2018-01-30');
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values("Nguyen Anh Ha", "DT1B", "DT", '2018-02-20');
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values("Van Tran Ngoc Linh", "CT2C", "CT", '2018-01-20');

insert into PHIEUMUON(masach, sothe, ngaymuon, ngaytra, ghichu) values(1, 1, '2018-01-01', '2018-01-10', "Da muon");
insert into PHIEUMUON(masach, sothe, ngaymuon, ngaytra, ghichu) values(2, 2, '2018-01-04', '2018-01-15', "Da muon");
insert into PHIEUMUON(masach, sothe, ngaymuon, ngaytra, ghichu) values(3, 3, '2018-01-12', '2018-01-22', "Lam rach");
insert into PHIEUMUON(masach, sothe, ngaymuon, ngaytra, ghichu) values(4, 4, '2018-01-01', '2018-01-11', "Da muon");
insert into PHIEUMUON(masach, sothe, ngaymuon, ngaytra, ghichu) values(5, 5, '2018-01-21', '2018-01-31', "Da muon");
#Hiển thị tên, khoa của các độc giả và sắp xếp theo khoa
select sothe, ten, khoa from DOCGIA order by khoa asc
#Tìm những đọc giả mượn sách 'Toan' vào ngày 01/01/2018
# Hiên thị tên, số thẻ, tên sách tất cả các độc giả mượn sách trong tháng 1/2018
# Danh sách các sách không ai mượn
# Cho biết đọc giả tên 'Hieu' mượn sách bao nhiêu lần