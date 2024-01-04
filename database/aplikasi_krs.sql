-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Jan 2024 pada 22.04
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 7.3.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aplikasi_krs`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `krs`
--

CREATE TABLE `krs` (
  `id_matkul` varchar(20) NOT NULL,
  `mata_kuliah` varchar(50) NOT NULL,
  `sks` varchar(50) NOT NULL,
  `kelas` varchar(30) NOT NULL,
  `jurusan` varchar(30) NOT NULL,
  `semester` varchar(20) NOT NULL,
  `dosen` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `krs`
--

INSERT INTO `krs` (`id_matkul`, `mata_kuliah`, `sks`, `kelas`, `jurusan`, `semester`, `dosen`) VALUES
('001', 'Bahasa Inggris', '3', 'Reguler', 'Teknik Informatika', '2', 'Salma, S.Pd'),
('003', 'Bahasa Indonesia', '2', 'Reguler', 'Teknik Sipil', '2', 'Salman, S.Pd');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `npm` varchar(25) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `kelas` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(50) NOT NULL,
  `jurusan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `mahasiswa`
--

INSERT INTO `mahasiswa` (`npm`, `nama`, `alamat`, `kelas`, `jenis_kelamin`, `jurusan`) VALUES
('2110010173', 'Ahyana Adelia', 'Banjarbaru', 'Reguler', 'Perempuan', 'Teknik Industri'),
('2110010175', 'Anisa', 'Kandangan', 'Reguler', 'Perempuan', 'Teknik Informatika'),
('2110010172', 'Fadli', 'Banjarmasin Utara', 'Reguler', 'Laki-laki', 'Sistem Informasi'),
('2110010174', 'Dini', 'Kandangan', 'Reguler', 'Laki-laki', 'Sistem Informasi');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mata_kuliah`
--

CREATE TABLE `mata_kuliah` (
  `id` varchar(10) NOT NULL,
  `mata_kuliah` varchar(30) NOT NULL,
  `semester` varchar(10) NOT NULL,
  `dosen` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `mata_kuliah`
--

INSERT INTO `mata_kuliah` (`id`, `mata_kuliah`, `semester`, `dosen`) VALUES
('001', 'Algoritma', '3', 'Ihsanul, S.Kom'),
('002', 'Statistika', '5', 'Ani, S.Kom');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `krs`
--
ALTER TABLE `krs`
  ADD PRIMARY KEY (`id_matkul`);

--
-- Indeks untuk tabel `mata_kuliah`
--
ALTER TABLE `mata_kuliah`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
