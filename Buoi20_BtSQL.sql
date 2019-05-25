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
insert into SACH(ten, tacgia, nxb, soluong) values ("Toan", "Nguyen Minh Tri", "MXB Giao duc", 20);

insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values("Tran Thuy Huong", "AT14", "AT", '2018-01-20');
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values("Tran Viet Tu", "AT15", "AT", '2018-01-20');
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values("Tran Nguyet Chi", "CT2A", "CT", '2018-01-30');
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values("Nguyen Anh Ha", "DT1B", "DT", '2018-02-20');
insert into DOCGIA(ten, khoa, khoahoc, thoihanthe) values("Van Tran Ngoc Linh", "CT2C", "CT", '2018-01-20');

insert into PHIEUMUON(masach, sothe, ngaymuon, ngaytra, ghichu) values(1, 1, str_to_date('01/01/2018', '%d/%m/%Y'), str_to_date('10/01/2018', '%d/%m/%Y'), "Da muon");
insert into PHIEUMUON(masach, sothe, ngaymuon, ngaytra, ghichu) values(1, 2, str_to_date('04/01/2018', '%d/%m/%Y'), str_to_date('15/01/2018', '%d/%m/%Y'), "Da muon");
insert into PHIEUMUON(masach, sothe, ngaymuon, ngaytra, ghichu) values(2, 3, str_to_date('12/01/2018', '%d/%m/%Y'), str_to_date('12/01/2018', '%d/%m/%Y'), "Lam rach");
insert into PHIEUMUON(masach, sothe, ngaymuon, ngaytra, ghichu) values(4, 4, str_to_date('01/01/2018', '%d/%m/%Y'), str_to_date('11/01/2018', '%d/%m/%Y'), "Da muon");
insert into PHIEUMUON(masach, sothe, ngaymuon, ngaytra, ghichu) values(5, 5, str_to_date('21/01/2018', '%d/%m/%Y'), str_to_date('31/01/2018', '%d/%m/%Y'), "Da muon");
#Hiển thị tên, khoa của các độc giả và sắp xếp theo khoa
select sothe, ten, khoa from DOCGIA order by khoa asc;
##############
#Sắp xếp bảng SACH theo tên, số lượng giảm dần
select * from SACH order by ten, soluong desc;

SELECT sothe FROM phieumuon where MASACH='5' and NGAYMUON='2018/01/01';
#Hiển thị sách được mượn nhiều nhất
select phieumuon.masach, sach.ten, count(phieumuon.masach) as 'Solanmuon' from qlythuvien.phieumuon
join qlythuvien.sach on phieumuon.masach = sach.masach
group by masach
order by Solanmuon desc
limit 1;
#Tìm những đọc giả mượn sách 'Toan' vào ngày 01/01/2018
select d.ten from phieumuon p 
join sach s on s.masach = p.masach
join docgia d on d.sothe = p.sothe
where s.ten = "Toan" and p.ngaymuon = '2018-01-01';
# Hiên thị tên, số thẻ, tên sách tất cả các độc giả mượn sách trong tháng 1/2018
select d.sothe, d.ten, s.ten from phieumuon p
join sach s on s.masach = p.masach
join docgia d on d.sothe = p.sothe
where p.ngaymuon between '2018-01-01' and '2018-01-31';
# Danh sách các sách không ai mượn
select s.* from sach s
where s.masach not in (select masach from phieumuon);
# Cho biết đọc giả tên 'Hieu' mượn sách bao nhiêu lần
select count(*) as 'Soluong' from phieumuon p
join docgia d on d.sothe = p.sothe
where d.ten = "Tran Thuy Huong";
# Danh sách tên, số thẻ các đọc giả chưa trả sách
select d.* from phieumuon p
join docgia d on d.sothe = p.sothe
where p.ngaytra is null