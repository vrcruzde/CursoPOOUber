<?php

require_once("car.php");
require_once("UberX.php");
require_once("account.php");

$UberX = new UberX("GHT12G", new account("FLOR GUZMAN","124456"), "MAZDA", "CX30")
$UberX->printDataCar();

$UberPool = new UberPool("IKJ23E", new account("SELIMO CERON","8451236"), "KIA", "SENIK")
$UberX->printDataCar();
?>