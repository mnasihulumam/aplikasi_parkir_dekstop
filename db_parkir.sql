-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 26 Des 2019 pada 01.24
-- Versi server: 10.4.8-MariaDB
-- Versi PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_parkir`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblogin`
--

CREATE TABLE `tblogin` (
  `usernama` varchar(30) NOT NULL,
  `password` varchar(40) CHARACTER SET latin1 COLLATE latin1_bin NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tblogin`
--

INSERT INTO `tblogin` (`usernama`, `password`, `name`) VALUES
('coba', '123', 'cobain'),
('tes', '123', 'testing');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_parkir`
--

CREATE TABLE `tb_parkir` (
  `no_tiket` int(15) NOT NULL,
  `no_pol` varchar(15) NOT NULL,
  `jenis` enum('Mobil','Motor') NOT NULL,
  `tgl_masuk` date NOT NULL,
  `tgl_keluar` date DEFAULT NULL,
  `jam_masuk` time NOT NULL,
  `jam_keluar` time DEFAULT NULL,
  `biaya` int(15) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_parkir`
--

INSERT INTO `tb_parkir` (`no_tiket`, `no_pol`, `jenis`, `tgl_masuk`, `tgl_keluar`, `jam_masuk`, `jam_keluar`, `biaya`) VALUES
(1, 'E1234A', 'Motor', '2019-12-26', '2019-12-26', '05:40:55', '05:41:15', 2000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tblogin`
--
ALTER TABLE `tblogin`
  ADD PRIMARY KEY (`usernama`);

--
-- Indeks untuk tabel `tb_parkir`
--
ALTER TABLE `tb_parkir`
  ADD PRIMARY KEY (`no_tiket`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_parkir`
--
ALTER TABLE `tb_parkir`
  MODIFY `no_tiket` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
