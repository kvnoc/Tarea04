<?php

namespace App\Model;

class Mesa
{
    public $material = "";

    public $altura = "";
  
    public $color = "";

    public $funcion= "";

    public function __construct($mat, $alt, $col, $fun)
    {
        $this->establecerMaterial($mat);
        $this->establecerAltura($alt);
        $this->establecerColor($col);
        $this->establecerFuncion($fun);
    }

    public function obtenerColor()
    {
        return $this->color;
    }

    public function establecerColor($col)
    {
        $this->color = $col;
    }

    public function obtenerAltura()
    {
        return $this->altura;
    }

    public function establecerAltura($alt)
    {
        $this->altura = $alt;
    }

    public function obtenerMaterial()
    {
        return $this->material;
    }

    public function establecerMaterial($mat)
    {
        $this->material = $mat;
    }

    public function obtenerFuncion()
    {
        return $this->funcion;
    }

    public function establecerFuncion($fun)
    {
        $this->funcion = $fun;
    }
}