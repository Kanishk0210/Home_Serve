-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 24, 2019 at 07:58 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.1.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `home_serve`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `adminId` int(5) NOT NULL,
  `adminName` varchar(20) DEFAULT NULL,
  `adminEmail` varchar(30) DEFAULT NULL,
  `adminPass` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`adminId`, `adminName`, `adminEmail`, `adminPass`) VALUES
(1, 'admin', 'a@a.a', 'a');

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `bId` int(5) NOT NULL,
  `cId` int(5) DEFAULT NULL,
  `serviceProviderId` int(5) DEFAULT NULL,
  `serviceId` int(5) DEFAULT NULL,
  `service_name` varchar(100) NOT NULL,
  `bookingTime` varchar(20) DEFAULT NULL,
  `bookingDuration` varchar(10) NOT NULL,
  `bookingDate` varchar(200) DEFAULT NULL,
  `price` int(10) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `location` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`bId`, `cId`, `serviceProviderId`, `serviceId`, `service_name`, `bookingTime`, `bookingDuration`, `bookingDate`, `price`, `remark`, `status`, `location`) VALUES
(1, 3, 1, 2, 'car wash', '14:20', '1 hr', '+Monday+Tuesday', 300, '', 'Accept', 'chetak'),
(2, 1, 1, 2, 'car wash', '11:00', '1 hr', '+Monday+Tuesday', 300, '', 'Accept', 'kasturba'),
(3, 3, 1, 3, 'repairing', '15:00', '30 Min', '+Monday+Tuesday+Wednesday', 50, '', 'Reject', 'kansk'),
(4, 1, 1, 2, 'car wash', '10:00', '1 hr', '+Monday+Tuesday', 300, '', 'Accept', 'mmm'),
(5, 1, 1, 2, 'car wash', '10:00', '1 hr', '+Monday+Tuesday', 300, '', 'Requested', 'jhk'),
(6, 1, 1, 3, 'repairing', '10:00', '30 Min', '+Monday+Tuesday+Wednesday', 50, '', 'Reject', 'sdads'),
(7, 1, 1, 3, 'repairing', '11:00', '30 Min', '+Monday+Tuesday+Wednesday', 50, '', 'Accept', 'sfgs'),
(8, 4, 1, 3, 'repairing', '14:00', '30 Min', '+Monday+Tuesday+Wednesday', 50, '', 'Accept', 'chetak'),
(9, 1, 1, 2, 'car wash', '', '1 hr', '+Monday+Tuesday', 300, '', 'Accept', ''),
(10, 1, 1, 2, 'car wash', '00:00', '1 hr', '+Monday+Tuesday', 300, '', 'Accept', 'Bhopal'),
(11, 1, 1, 2, 'car wash', '12:22', '1 hr', '+Monday+Tuesday', 300, '', 'Requested', 'MP Nagar');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `cId` int(5) NOT NULL,
  `category` varchar(20) DEFAULT NULL,
  `categoryDesc` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`cId`, `category`, `categoryDesc`) VALUES
(1, 'Cars and Vehicles', 'Car  washing etc'),
(2, 'Electric and Gedgets', 'Fan repairing etc'),
(3, 'Real Estate', 'Bulding material etc'),
(4, 'Sports and Games', 'Repairing etx'),
(5, 'Furniture', 'Furniture Repairing'),
(6, 'kfdlka', 'dafd');

-- --------------------------------------------------------

--
-- Table structure for table `complaint`
--

CREATE TABLE `complaint` (
  `serviceProviderId` int(5) DEFAULT NULL,
  `cId` int(5) DEFAULT NULL,
  `remark` varchar(30) DEFAULT NULL,
  `status` varchar(30) DEFAULT NULL,
  `date` varchar(20) DEFAULT NULL,
  `bookingId` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cupoun`
--

CREATE TABLE `cupoun` (
  `cId` int(5) DEFAULT NULL,
  `cCode` varchar(10) DEFAULT NULL,
  `Discount` int(10) DEFAULT NULL,
  `category` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cId` int(5) NOT NULL,
  `cName` varchar(20) DEFAULT NULL,
  `cPass` varchar(20) DEFAULT NULL,
  `cEmail` varchar(30) DEFAULT NULL,
  `cContact` int(12) DEFAULT NULL,
  `cAddress` varchar(50) DEFAULT NULL,
  `nearestLocation` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cId`, `cName`, `cPass`, `cEmail`, `cContact`, `cAddress`, `nearestLocation`) VALUES
(1, 'kanishk', 'kanu', 'kanishkchoudhary022@gmail.com', 5656, 'hkhk', NULL),
(2, 'kanu', 'kanu', 'jj@gmail.com', 554646, 'kkh', NULL),
(3, 'kk', 'kk', 'kk@gmail.com', 546464, 'gdfgsf', NULL),
(4, 'aditya', 'aa', 'aa@gmail.com', 6545546, 'dfadfadf', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `services`
--

CREATE TABLE `services` (
  `serviceProviderId` int(5) DEFAULT NULL,
  `serviceId` int(5) NOT NULL,
  `category` varchar(20) DEFAULT NULL,
  `serviceName` varchar(30) DEFAULT NULL,
  `serviceDescription` varchar(50) DEFAULT NULL,
  `serviceCharges` int(30) DEFAULT NULL,
  `availableDate` varchar(200) DEFAULT NULL,
  `availableStime` varchar(10) DEFAULT NULL,
  `availableEtime` varchar(10) NOT NULL,
  `ServiceDuration` varchar(10) NOT NULL,
  `location` varchar(20) DEFAULT NULL,
  `photo` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `services`
--

INSERT INTO `services` (`serviceProviderId`, `serviceId`, `category`, `serviceName`, `serviceDescription`, `serviceCharges`, `availableDate`, `availableStime`, `availableEtime`, `ServiceDuration`, `location`, `photo`) VALUES
(1, 1, 'Cars and Vehicles', 'car wash', 'washing', 300, '+Monday+Tuesday', '10:00', '17:00', '1 hr', 'mp nagar', 'jd2.jpg'),
(1, 2, 'Cars and Vehicles', 'car wash', 'washing', 300, '+Monday+Tuesday', '10:00', '17:00', '1 hr', 'mp nagar', 'jd2.jpg'),
(1, 3, 'Electric and Gedgets', 'repairing', 'fan ', 50, '+Monday+Tuesday+Wednesday', '09:00', '17:00', '30 Min', 'mo nagar', 'jd.JPG');

-- --------------------------------------------------------

--
-- Table structure for table `service_provider`
--

CREATE TABLE `service_provider` (
  `dateOfReg` varchar(100) DEFAULT NULL,
  `serviceProviderId` int(5) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `pass` varchar(20) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `adhar_id` int(12) DEFAULT NULL,
  `id_proof` varchar(20) DEFAULT NULL,
  `gst_no` varchar(20) DEFAULT NULL,
  `shop_name` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `photo` varchar(200) DEFAULT NULL,
  `phone` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `service_provider`
--

INSERT INTO `service_provider` (`dateOfReg`, `serviceProviderId`, `name`, `pass`, `address`, `adhar_id`, `id_proof`, `gst_no`, `shop_name`, `email`, `photo`, `phone`) VALUES
('Mon Jul 15 22:38:51 IST 2019', 1, 'kanishk', '', 'mp nagar', 22222, 'kanishk choudhary', '6666e66t555', 'carCare', 'kanishkchoudhary02@gmail.com', 'jd2.jpg', 'jd2.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`adminId`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`bId`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`cId`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cId`);

--
-- Indexes for table `services`
--
ALTER TABLE `services`
  ADD PRIMARY KEY (`serviceId`),
  ADD KEY `serviceProviderId` (`serviceProviderId`);

--
-- Indexes for table `service_provider`
--
ALTER TABLE `service_provider`
  ADD PRIMARY KEY (`serviceProviderId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `adminId` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `bId` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `cId` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `cId` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `services`
--
ALTER TABLE `services`
  MODIFY `serviceId` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `service_provider`
--
ALTER TABLE `service_provider`
  MODIFY `serviceProviderId` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `services`
--
ALTER TABLE `services`
  ADD CONSTRAINT `services_ibfk_1` FOREIGN KEY (`serviceProviderId`) REFERENCES `service_provider` (`serviceProviderId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
