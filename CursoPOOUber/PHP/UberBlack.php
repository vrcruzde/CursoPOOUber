<?php
require_once('car.php');
class UberBlack extends Car{
 public $typeCarAccepted;
 public $seatmaterial;

 public function __constructor($license, $driver
        $typeCarAccepted,$seatmaterial){
            parent::__constructor($license,$driver);
            $this->typeCareAccepted =$typeCarAccepted;
            $this->seatmaterial = $seatmaterial;
    }
}

?>