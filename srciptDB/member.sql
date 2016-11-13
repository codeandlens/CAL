/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  chivas
 * Created: Nov 13, 2016
 */

-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2016 at 08:11 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

-- สร้าง DB ชื่อ caldb
-- Database: `caldb`
--

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(500) DEFAULT NULL,
  `sername` varchar(500) DEFAULT NULL,
  `nickname` varchar(30) DEFAULT NULL,
  `email` varchar(150) DEFAULT NULL,
  `password` varchar(100) NOT NULL,
  `address` varchar(500) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`id`, `name`, `sername`, `nickname`, `email`, `password`, `address`, `tel`) VALUES
(1, 'chivas', 'regal', 'codeandlens', 'woottipong221@gmail.com', '', '90/460', '0984935174'),
(2, 'woottipong', 'saowayong', 'chivas regal', 'chivas-21_@hotmail.com', '5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5', '90/460 ซ.16 อยู่เจริญ3 ม.6 ต.ลาดสวาย อ.ลำลูกกา จ.ปทุมธานี 12150', '0984935174'),
(3, 'woottipong', 'saowayong', 'chivas regal', 'user@codestar.work', '2f24eb91b1e337ff48f3157c023508e495b0cde7e891e87a58585317d9f44738', '90/460 ซ.16 อยู่เจริญ3 ม.6 ต.ลาดสวาย อ.ลำลูกกา จ.ปทุมธานี 12150', '0984935000'),
(4, 'woottipong', 'saowayong', 'codelens', 'woottipong221@gmail.com', 'de758b92c1b76c46adff0d6c3ce349fa24d3f5de8bdb070d59365a05b9d40222', '90/460 ซ.16 อยู่เจริญ3 ม.6 ต.ลาดสวาย อ.ลำลูกกา จ.ปทุมธานี 12150', '0984935174'),
(5, 'woottipong2', 'saowayong2', 'chivas regal2', 'woottipong221@gmail.com2', 'de758b92c1b76c46adff0d6c3ce349fa24d3f5de8bdb070d59365a05b9d40222', '90/460 ซ.16 อยู่เจริญ3 ม.6 ต.ลาดสวาย อ.ลำลูกกา จ.ปทุมธานี 12150', '0984935174'),
(8, 'woottiponga', 'saowayongg', 'chivas regal2a', 'chivas-21_@hotmail.comfff', 'a9ddd7537b48b64e159d8cece19834e6870a27dfd3589a149833f71d3b0c77e6', '90/460 ซ.16 อยู่เจริญ3 ม.6 ต.ลาดสวาย อ.ลำลูกกา จ.ปทุมธานี 12150', '0984935174'),
(9, 'woottipong', 'saowayong', 'chivas regal2', 'chivas-21_@hotmail.comfff', '028a42e6a02c0c77481be187862d5bbca1e3a75316a1b2704d6af7a061ee49b6', '90/460 ซ.16 อยู่เจริญ3 ม.6 ต.ลาดสวาย อ.ลำลูกกา จ.ปทุมธานี 12150', '0984935174'),
(10, 'woottipong789', 'saowayong798', 'chivas regal789', 'chivas-21_@hotmail.com789', '4c2430754b351338bdf63f860c757484cf02187bc0617cdeb1bd4509f91c8c57', '90/460 ซ.16 อยู่เจริญ3 ม.6 ต.ลาดสวาย อ.ลำลูกกา จ.ปทุมธานี 12150', '0984935174'),
(11, 'aaaaa', 'sssss', 'chivas regal', 'chivas-21_@hotmail.com', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', '90/460 ซ.16 อยู่เจริญ3 ม.6 ต.ลาดสวาย อ.ลำลูกกา จ.ปทุมธานี 12150', '0984935174'),
(13, 'test', 'sertest', 'test test', 'test@gmail.com', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4', '90/460 ซ.16 อยู่เจริญ3 ม.6 ต.ลาดสวาย อ.ลำลูกกา จ.ปทุมธานี 12150', '0984935174');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `member`
--
ALTER TABLE `member`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
