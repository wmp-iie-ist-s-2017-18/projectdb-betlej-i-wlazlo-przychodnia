-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 07 Cze 2019, 01:26
-- Wersja serwera: 10.3.15-MariaDB
-- Wersja PHP: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `przychodniadane`
--

DELIMITER $$
--
-- Procedury
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `add_lek` (IN `specjalizacja` TEXT, IN `imie` TEXT, IN `nazwisko` TEXT, IN `PESEL` VARCHAR(11), IN `nr_telefonu` INT(20))  NO SQL
BEGIN
INSERT INTO lekarze(specjalizacja, imie, nazwisko, PESEL, nr_telefonu)
VALUES (specjalizacja, imie, nazwisko, PESEL, nr_telefonu);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `add_pac` (IN `imie` TEXT, IN `nazwisko` TEXT, IN `pesel` VARCHAR(11), IN `nr_telefonu` INT(20))  NO SQL
BEGIN
INSERT INTO przychodnia(imie, nazwisko, pesel, nr_telefonu)
VALUES (imie, nazwisko, pesel, nr_telefonu);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `licz` ()  NO SQL
BEGIN
SELECT COUNT('id') FROM wizyta;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Update_prz` (IN `p_id` INT(11), IN `p_imie` TEXT, IN `p_nazwisko` TEXT, IN `p_pesel` VARCHAR(11), IN `nr_tel` INT(20))  NO SQL
BEGIN
UPDATE przychodnia
SET
imie = p_imie, nazwisko = p_nazwisko, pesel = p_pesel, nr_telefonu = nr_tel WHERE id_pacjenta = p_id;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `lekarze`
--

CREATE TABLE `lekarze` (
  `id_lekarza` int(11) NOT NULL,
  `specjalizacja` text COLLATE utf8_polish_ci NOT NULL,
  `imie` text COLLATE utf8_polish_ci NOT NULL,
  `nazwisko` text COLLATE utf8_polish_ci NOT NULL,
  `PESEL` varchar(11) COLLATE utf8_polish_ci NOT NULL,
  `nr_telefonu` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;

--
-- Zrzut danych tabeli `lekarze`
--

INSERT INTO `lekarze` (`id_lekarza`, `specjalizacja`, `imie`, `nazwisko`, `PESEL`, `nr_telefonu`) VALUES
(1, 'Chirurg', 'Pawel', 'Zielinski', '79101376489', 435345789),
(2, 'Psycholog', 'Tadeusz', 'Ziemba', '64091054821', 472920572),
(3, 'Neurolog', 'Ryszard', 'Matuszek', '66091856482', 234456574),
(5, 'Dermatolog', 'Ma?gorzata', 'Ficek', '67091247584', 444555666),
(6, 'Onkolog', 'Kamil', 'Kowalski', '71040466739', 439376038),
(7, 'Ortopeda', 'Stefan', 'zak', '68070112007', 345346547),
(8, 'Kardiolog', 'Dionizy', 'Piotrkowski', '77093056377', 246675825),
(10, 'Okulista', 'Magdalena', 'Marczewska', '97112102070', 111222333),
(11, 'Nekrolog', 'Magdalena', 'Haha', '97112102077', 660156573),
(19, 'Kardiochirurg', 'Gabriela', 'Mazowiecka', '69020215762', 658395738),
(20, 'aaa', 'aaa', 'aaa', '123456', 123),
(22, 'DASD', 'DASAS', 'ASDAS', '111', 111),
(23, 'PRACA', 'IMIE', 'NAZWISKO', '123', 456),
(25, 'QWE', 'RTY', 'UIO', '456', 456);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `przychodnia`
--

CREATE TABLE `przychodnia` (
  `id_pacjenta` int(11) NOT NULL,
  `imie` text COLLATE utf8_polish_ci NOT NULL,
  `nazwisko` text COLLATE utf8_polish_ci NOT NULL,
  `pesel` varchar(11) COLLATE utf8_polish_ci NOT NULL,
  `nr_telefonu` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;

--
-- Zrzut danych tabeli `przychodnia`
--

INSERT INTO `przychodnia` (`id_pacjenta`, `imie`, `nazwisko`, `pesel`, `nr_telefonu`) VALUES
(1, 'adasda', 'asdasd', '1654689', 489489),
(2, 'Jakub', 'Nowak', '88062864829', 888999777),
(3, 'Stanislaw', 'Wyszczański', '78123076849', 458547843),
(4, 'Wieslawa', 'Marczewski', '65031478368', 678567345),
(5, 'Malgorzata', 'Dworak', '67081956472', 431145556),
(6, 'Karol', 'Kojder', '96112964781', 237796654),
(7, 'Michal', 'Duda', '96092457821', 435885447),
(8, 'marysia', 'jolka', '99120307020', 249687698),
(9, 'Magdalena', 'Czerwonka', '91112256386', 435897997),
(10, 'Kacper', 'Nowakowski', '67010145703', 546967579),
(11, 'Stanislaw', 'Konieczny', '77090846283', 456809878),
(12, 'Aleksandra', 'Portas', '72041465820', 457867856),
(13, 'Zofia', 'Małek', '66070289578', 546675867),
(14, 'Maria', 'Rubin', '51112067490', 55986805),
(15, 'Zenon', 'Morawski', '60012112401', 78765433),
(16, 'Przemyslaw', 'Kaminski', '69052547299', 46482374),
(17, 'Anna', 'Polanska', '84011247690', 255367477),
(18, 'Martyna', 'Klin', '97050956488', 563974128),
(19, 'janek', 'asd', '98102002010', 666888555),
(20, 'jacek', 'placek', '97112102070', 888999666),
(21, 'Krzysztof', 'mak', '88040422122', 788988366),
(23, 'milaaaaaa', 'mostowiak', '97842100989', 888555999),
(24, 'marek', 'kacper piotr', '9784210888', 555555555),
(27, 'Marek', '2344234234', '2222', 2255),
(28, 'marek', 'naa', '878787', 77778887);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `wizyta`
--

CREATE TABLE `wizyta` (
  `id` int(11) NOT NULL,
  `id_lekarza` int(11) NOT NULL,
  `id_pacjenta` int(11) NOT NULL,
  `Data` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;

--
-- Zrzut danych tabeli `wizyta`
--

INSERT INTO `wizyta` (`id`, `id_lekarza`, `id_pacjenta`, `Data`) VALUES
(1, 1, 1, '2019-12-17'),
(2, 2, 4, '2019-05-09'),
(3, 5, 7, '2019-06-13'),
(4, 6, 7, '2019-12-14'),
(6, 1, 2, '2019-12-17'),
(7, 2, 3, '2019-06-21'),
(8, 6, 5, '2019-12-17'),
(9, 1, 10, '2019-12-17'),
(10, 1, 7, '2020-06-12'),
(12, 7, 15, '2020-06-12'),
(13, 5, 7, '2020-06-19'),
(14, 1, 7, '2019-06-13');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `lekarze`
--
ALTER TABLE `lekarze`
  ADD PRIMARY KEY (`id_lekarza`),
  ADD UNIQUE KEY `PESEL` (`PESEL`);

--
-- Indeksy dla tabeli `przychodnia`
--
ALTER TABLE `przychodnia`
  ADD PRIMARY KEY (`id_pacjenta`),
  ADD UNIQUE KEY `id_pacjenta` (`id_pacjenta`,`pesel`);

--
-- Indeksy dla tabeli `wizyta`
--
ALTER TABLE `wizyta`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `id_lekarza` (`id_lekarza`),
  ADD KEY `id_pacjenta` (`id_pacjenta`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT dla tabeli `lekarze`
--
ALTER TABLE `lekarze`
  MODIFY `id_lekarza` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT dla tabeli `przychodnia`
--
ALTER TABLE `przychodnia`
  MODIFY `id_pacjenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT dla tabeli `wizyta`
--
ALTER TABLE `wizyta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Ograniczenia dla zrzutów tabel
--

--
-- Ograniczenia dla tabeli `wizyta`
--
ALTER TABLE `wizyta`
  ADD CONSTRAINT `wizyta_ibfk_1` FOREIGN KEY (`id_lekarza`) REFERENCES `lekarze` (`id_lekarza`),
  ADD CONSTRAINT `wizyta_ibfk_2` FOREIGN KEY (`id_pacjenta`) REFERENCES `przychodnia` (`id_pacjenta`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
